package de.hs.mannheim.tpe.mvg.testate.Testat2;

public abstract class Vermoegensgegenstand {
	private final String NAME;
	private final long KAUFPREIS;
	private final String KAUFDATUM;
	private int anzahl;

	public Vermoegensgegenstand(String name, String kaufdatum, double kaufpreis, int anzahl) {
		this.NAME = name;
		this.KAUFDATUM = kaufdatum;
		this.KAUFPREIS = (long) (kaufpreis * 100);
		this.anzahl = anzahl;
	}

	public String getName() {
		return NAME;
	}

	public String getKaufdatum() {
		return KAUFDATUM;
	}
	
	public long getKaufpreis() {
		return KAUFPREIS;
	}
	
	public double getKaufpreisAsDouble() {
		return ((double) KAUFPREIS) / 100.00;
	}

	public int getAnzahl() {
		return anzahl;
	}

	public void setAnzahl(int anzahl) {
		this.anzahl = anzahl;
	}

	@Override
	public abstract String toString();

}
