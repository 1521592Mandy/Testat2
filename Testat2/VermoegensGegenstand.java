package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class VermoegensGegenstand
{
    private final String NAME;
    private final String KAUFDATUM;
    private final long KAUFPREIS;

    public Vermoegensgegenstand(String NAME, String KAUFDATUM, long KAUFPREIS)
    {
        this.NAME = NAME;
        this.KAUFDATUM = KAUFDATUM;
        this.KAUFPREIS = KAUFPREIS;
    }

    public double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public double toEuro()
    {
        return  round(getKAUFPREIS(), 2);
    }

    public String getNAME()
    {
        return NAME;
    }

    public String getKAUFDATUM()
    {
        return KAUFDATUM;
    }

    public long getKAUFPREIS()
    {
        return KAUFPREIS;
    }
}
