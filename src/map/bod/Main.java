package map.bod;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
	    Scanner sc = new Scanner(System.in);
	    int cisla;
	    //v tomto prípade používame metódu hasNextX , kde X je požadovaný dátový typ. Táto metóda najskôr otestuje, či
        //je tento dátový typ k dispozícii na vstupe a ak áno, tak ho prečíta. Tým pádom nepotrebujeme výnimku. Ak za X
        //nedáme nič t.j. bude  len hasNext, testujeme, či je k dispozícii akýkoľvek dátový typ. Načítavanie skončí ak zadáme niečo,
        //čo nie je typom X (v našom prípade int). Načítava sa podobne ako v C, po najbližší prázdny znak (medzera, tab...)
        System.out.print("Zadaj cislo:");
	    while(sc.hasNextInt())
        {
            System.out.print("Zadaj cislo:");
            cisla=sc.nextInt();
        }

	    //v tomto prípade netestujeme popredu vstup, pokúsime sa ho hneď načítať. Ak sa to nepodarí, tak sa vyhodí výnimka
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

	    String veta;
        while(sc.hasNext())
        {
            System.out.print("Zadaj vetu:");
            veta=sc.next();
        }



    }
}
