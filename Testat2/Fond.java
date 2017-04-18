package de.hs.mannheim.tpe.mvg.testate.Testat2;

public abstract class Fond extends Vermoegensgegenstand implements Handelbar, Hinzufuegen {

	private long kurs;

	public Fond(String name, String kaufdatum, double kaufpreis, int anzahl) {
		super(name, kaufdatum, kaufpreis, anzahl);
		
	}
	
	public long getKurs() {
		return kurs;
	}
	
	public double getKursAsDouble() {
		return ((double) kurs) / 100.00;
	}

	public void setKurs(long neuerKurs) {
		kurs = neuerKurs;
	}

}
