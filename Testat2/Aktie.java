package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Aktie extends Vermoegensgegenstand
{
    private int anzahl;
    //TODO ausgabe als double / für Euro ausgeben
    private long kurs1;
    private long kurs2;
    //TODO Gewinn berechnen kurs2 - kurs1 nach einem Jahr
    private long gewinn = 0;


    public Aktie(String name, String kaufdatum, long kaufpreis, int anzahl, long kurs1, long kurs2)
    {
        super(name, kaufdatum, kaufpreis);
        this.anzahl = anzahl;
        this.kurs1 = kurs1;
        this.kurs2 = kurs2;
    }



    public double toEuro()
    {
        //TODO Testen! umwandlung von long in euro
        // wenn gewinn negativ wird automatisch + * - zu -
        long gewinn = getKAUFPREIS() - (berechneKursDiff() * anzahl + getKAUFPREIS());
        if (gewinn < 0)
            gewinn *= (-1);
        return  super.round(gewinn, 2);
    }

    /**
     * Gibt den Gewinn nach einem Jahr aus in Euro
     */
    public void KursNachEinemJahr()
    {
        System.out.println("1 Jahr später");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            System.out.println("hoppla Bitch");
        }

        long tempGewinn = berechneKursDiff();
        System.out.println(toEuro());
    }

    /**
     *
     * @return berechnet ob der Kurs gestiegen oder gefallen
     */
    private long berechneKursDiff()
    {
        long diff = this.kurs2 - this.kurs1;
        return diff;
    }

    /**
     *
     * @return gibt immer den aktuellen Wert aller Aktien dieses Typs wieder
     */
    public double getAktuellerWert()
    {
        long wert = kurs1*getKAUFPREIS()*getAnzahl();
        return round(wert, 2);
    }












    public double getKurs2()
    {
        return kurs2;
    }

    public void setKurs2(long kurs2)
    {
        this.kurs2 = kurs2;
    }

    public void setAnzahl(int anzahl)
    {
        this.anzahl = anzahl;
    }

    public int getAnzahl()
    {
        return anzahl;
    }

    public long getKurs1()
    {
        return kurs1;
    }

    public long getGewinn()
    {
        return gewinn;
    }


    public void setKurs1(long kurs)
    {
        this.kurs1 = kurs;
    }


}
