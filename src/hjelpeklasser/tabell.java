package hjelpeklasser;

import java.util.*;

public class tabell { //samleklasse for tabellmetoder

    private tabell() {}     //privat standarkonstruktør - hindrer instansiering

    public static void bytt(int[] a, int i, int j)
    {
        int temp = a[i]; a[i] = a[j]; a[j] = temp;
    }

    public static int[] randPerm(int n)  // en effektiv versjon
    {
        Random r = new Random();         // en randomgenerator
        int[] a = new int[n];            // en tabell med plass til n tall

        Arrays.setAll(a, i -> i + 1);    // legger inn tallene 1, 2, . , n

        for (int k = n - 1; k > 0; k--)  // løkke som går n - 1 ganger
        {
            int i = r.nextInt(k+1);        // en tilfeldig tall fra 0 til k
            bytt(a,k,i);                   // bytter om
        }

        return a;                        // permutasjonen returneres
    }

    public static void randPerm(int[] a)  // stokker om a
    {
        Random r = new Random();     // en randomgenerator

        for (int k = a.length - 1; k > 0; k--)
        {
            int i = r.nextInt(k + 1);  // tilfeldig tall fra [0,k]
            bytt(a,k,i);
        }
    }

    //metode 2b
    public static int maks(int[] a, int fra, int til)
    {
        /*if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }*/

        if(a == null){
            throw new NullPointerException("tabellen a er null"); //sjekker om tabellen er null
        }

        fratilKontroll(a.length,fra,til);

        int m = fra;              // indeks til største verdi i a[fra:til>
        int maksverdi = a[fra];   // største verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++)
        {
            if (a[i] > maksverdi)
            {
                m = i;                // indeks til største verdi oppdateres
                maksverdi = a[m];     // største verdi oppdateres
            }
        }
        return m;  // posisjonen til største verdi i a[fra:til>
    }

    //metode 2c
    public static int maks(int[] a)  // bruker hele tabellen
    {
        return maks(a,0,a.length);     // kaller metoden over
    }


    //1.2.1
    //Oppgave 1
    public static int min(int[] a, int fra, int til){
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

        int m = fra;              // indeks til minste verdi i a[fra:til>
        int minverdi = a[fra];    // minste verdi i a[fra:til>

        for (int i = fra + 1; i < til; i++){
            if(a[i] < minverdi){
                m =i;                   //indeks til minste verdi oppdateres
                minverdi = a[m];        //minste verdi oppdateres
            }
        }
        return m;  //posisjonen til minste verdi i a [fra:til>
    }

    public static int min(int[] a) {       //bruker hele tabellen
        return min(a,0, a.length);
    }

    //1.2.2
    //Oppgave 1 gjort
    //Oppgave 2 gjort
    //Oppgave 3
    public static void bytt(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }

    //Oppgave 4
    public static void skriv(int[] a, int fra, int til) {
        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i != til - 1) {
                System.out.print(" ");
            }
        }
    }
    public static void skriv(int[] a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
            if(i !=a.length-1) {
                System.out.print(" ");
            }
        }
    }

    //Oppgave 5
    public static void skrivln(int[] a, int fra, int til) {
        fratilKontroll(a.length,fra,til);
        for (int i = fra; i < til; i++) {
            System.out.print(a[i]);
            if (i != til - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    public static void skrivln(int[] a){
        for (int i=0; i<a.length; i++){
            System.out.print(a[i]);
            if(i !=a.length-1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }

    //1.2.3
    public static void fratilKontroll(int tablengde, int fra, int til) {
        if (fra < 0)                                  // fra er negativ
            throw new ArrayIndexOutOfBoundsException
                    ("fra(" + fra + ") er negativ!");

        if (til > tablengde)                          // til er utenfor tabellen
            throw new ArrayIndexOutOfBoundsException
                    ("til(" + til + ") > tablengde(" + tablengde + ")");

        if (fra > til)                                // fra er større enn til
            throw new IllegalArgumentException
                    ("fra(" + fra + ") > til(" + til + ") - illegalt intervall!");

        if (fra == til)
            throw new NoSuchElementException
                    ("fra(" + fra + ") = til(" + til + ") - tomt tabellintervall!");
    }

    public static void vhKontroll(int tablengde, int v, int h) {
        if (v < 0)
            throw new ArrayIndexOutOfBoundsException("v(" + v + ") < 0");

        if (h >= tablengde)
            throw new ArrayIndexOutOfBoundsException
                    ("h(" + h + ") >= tablengde(" + tablengde + ")");

        if (v > h + 1)
            throw new IllegalArgumentException
                    ("v = " + v + ", h = " + h);
    }
    //Oppgave 1



}
