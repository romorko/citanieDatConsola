package map.vstup.konzola;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);

	    //v tomto prípade používame metódu hasNextX , kde X je požadovaný dátový typ. Táto metóda najskôr otestuje, či
        //je tento dátový typ k dispozícii na vstupe a ak áno, tak ho prečíta. Tým pádom nepotrebujeme výnimku. Ak za X
        //nedáme nič t.j. bude  len hasNext, testujeme, či je k dispozícii akýkoľvek dátový typ. Načítavanie skončí ak zadáme niečo,
        //čo nie je typom X (v našom prípade int). Načítava sa podobne ako v C, po najbližší prázdny znak (medzera, tab...)
        int cisla;
        System.out.print("Zadaj cislo:");
	    while(sc.hasNextInt())
        {
            System.out.print("Zadaj cislo:");
            cisla=sc.nextInt();
        }

	    //v tomto prípade netestujeme popredu existenciu korektného vstupu, pokúsime sa ho hneď načítať. Ak sa to nepodarí, tak sa vyhodí výnimka
        //a končíme...
	    try
        {
            int cislo;
            while(true)
            {
                System.out.print("Zadaj cislo:");
                cislo=sc.nextInt();
            }
        }
	    catch (InputMismatchException e)
        {
            //koniec vstupu
        }

	    //pri načítavaní reťazcov si musíme uvedomiť, že ak zadáme viac slov, prečíta sa len prvé a druhé zostane v buffri
        //klávesnice. Preto je potrebné použiť sc.nextLine, ktorá zvyšok riadku zahodí. Príkaz sc.next() prečíta akýkoľvek vstup
        //ľubovoľného typu, preto na ukončenie načítavania musíme použiť nejaké dohodnuté slovo...
	    String veta;
        System.out.println("Zadavanie skoncis slovom: koniec");
        while(true)
        {
            System.out.print("Zadaj slovo:");
            veta=sc.next();
            sc.nextLine();
            if(veta.equals("koniec"))
            {
                break;
            }
        }

        //ak chceme načítať celý riadok, musím epoužiť metódu nextLine(). Na ukončenie tiež využijeme dohodnutý spôsob.
        String riadok;
        System.out.println("Zadavanie skoncis slovom: koniec");
        while(true)
        {
            System.out.print("Zadaj vetu:");
            riadok=sc.nextLine();
            if(riadok.equals("koniec"))
            {
                break;
            }
        }



    }
}
