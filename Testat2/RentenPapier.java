package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class RentenPapier extends FestGeld
{
    private double kurs;

    public Rentenpapier(String name, Date zeitpunkt, long kaufpreis, double betrag,
                        double zinssatz, int laufzeit_jahre, double portfolio_wert, double end_betrag, double kurs)
    {
        super(name, zeitpunkt, kaufpreis, betrag, zinssatz, laufzeit_jahre, portfolio_wert, end_betrag);
        this.kurs = kurs;
    }

    public double getKurs()
    {
        return kurs;
    }

    public void setKurs(double kurs)
    {
        this.kurs = kurs;
    }
}

