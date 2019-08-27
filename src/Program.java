import hjelpeklasser.*;

public class Program
{
    public static void main(String ... args)      // hovedprogram
    {
        int[] a = tabell.randPerm(20);              // en tilfeldig tabell
        for (int k : a) System.out.print(k + " ");  // skriver ut a

        int m = tabell.maks(a);   // finner posisjonen til største verdi

        System.out.println("\nStørste verdi ligger på plass " + m);

        tabell.skrivln(a, 5, 10); //med linjeskift
        tabell.skrivln(a);                //med linjeskift
        tabell.skriv(a, 5, 10);   //uten linjeskift
        tabell.skriv(a);                  //uten linjeskift

        System.out.println();
        System.out.println();

        //tabell.maks(a, -2,5);         OK!
        //tabell.maks(a, 15, 23);       OK!
        //tabell.maks(a, 15, 10);       OK!
        //tabell.maks(a, 11, 11);       OK!



    } // main

} // class Program
