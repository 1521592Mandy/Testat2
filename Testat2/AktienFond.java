package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class AktienFond
{
    private List<Aktie> fonds = null;

    public Aktienfond(List<Aktie> fonds)
    {
        this.fonds = fonds;
    }

    void addAktie(Aktie aktie)
    {
        fonds.add(aktie);
    }

    void deleteAktie(String name, int anzahl)
    {
    }
