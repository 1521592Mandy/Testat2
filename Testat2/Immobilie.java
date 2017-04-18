package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Immobilie extends Vermoegensgegenstand
{
    private int abschreibungsdauer;
    private short wert_post_Abschreibungsdauer;

    public Immobilie(String name, Date zeitpunkt, long kaufpreis, int abschreibungsdauer)
    {
        super(name, zeitpunkt, kaufpreis);
        this.abschreibungsdauer = abschreibungsdauer;
    }

    double linearer_Wertverlust()
    {
        double temp_Value = getKAUFPREIS();
        double kaufpreis_X = getKAUFPREIS() / abschreibungsdauer;
        for (int i = 1; i <= abschreibungsdauer; i++)
        {
            if (temp_Value != 0)
                temp_Value -= kaufpreis_X;
            else
                this.wert_post_Abschreibungsdauer = 0;
        }
        return this.wert_post_Abschreibungsdauer;
    }
}
