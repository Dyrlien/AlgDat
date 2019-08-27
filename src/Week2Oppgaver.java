public class Week2Oppgaver {
    //metode 2b
    public static int maks(int[] a, int fra, int til)
    {
        if (fra < 0 || til > a.length || fra >= til)
        {
            throw new IllegalArgumentException("Illegalt intervall!");
        }

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

    //Oppgave 5
    //eks. på for each løkke
    //for(int etTall : tall){}

    //1.2.2
    //Oppgave 1



}
