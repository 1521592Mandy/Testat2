package de.hs.mannheim.tpe.mvg.testate.Testat2;

package de.hsmannheim.vermoegenswerte;

import java.util.Date;

public class FestGeld extends VermoegensGegenstand
{

    private long zinssatz;
    private int laufzeit_jahre;
    private double portfolio_wert = super.round(super.getKAUFPREIS(),2);
    private double end_betrag = Double.NaN;

    public Festgeld(String name, String zeitpunkt, long kaufpreis, long zinssatz, int laufzeit_jahre)
    {
        super(name, zeitpunkt, kaufpreis);
        this.zinssatz = zinssatz;
        this.laufzeit_jahre = laufzeit_jahre;
    }

    public double getEnd_betrag()
    {
        if (this.end_betrag != Double.NaN)
        {
            calculateEndbetrag();
            return this.end_betrag;
        } else
            return this.end_betrag;
    }

    private void calculateEndbetrag()
    {
        setEnd_betrag(Math.pow
                (super.getKAUFPREIS() * (1 + (zinssatz / 100)), laufzeit_jahre));
    }


    @Override
    public double toEuro()
    {
        return super.round(getEnd_betrag(), 2);
    }



    public void setEnd_betrag(double end_betrag)
    {
        this.end_betrag = end_betrag;
    }

    public double getPortfolio_wert()
    {
        return this.portfolio_wert;
    }
}
