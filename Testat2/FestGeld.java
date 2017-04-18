package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class Festgeld extends Vermoegensgegenstand {

	private final long ZINSSATZ;
	private long laufzeit;
	private long kurs;

	public Festgeld(String name, String kaufdatum, double betrag, double zinssatz, long laufzeit, int anzahl) {
		super(name, kaufdatum, betrag, anzahl);
		ZINSSATZ = (long) (zinssatz * 100);
		this.laufzeit = laufzeit;
		this.kurs = (long) (betrag * 100);
	}

	public long getZinssatz() {
		return ZINSSATZ;
	}
	
	public double getZinssatzAsDouble() {
		return ((double) ZINSSATZ) / 100.00;
	}

	public long getLaufzeit() {
		return laufzeit;
	}

	public long getKurs() {
		return kurs;
	}
	
	public double getKursAsDouble() {
		return ((double) kurs) / 100.00;
	}

	public void setKurs(long neuerKurs) {
		this.kurs = neuerKurs;
	}

	public long berehneEndwert() {
		return (long) (getKaufpreis() * Math.pow(((1 + (ZINSSATZ / 100))), laufzeit));
	}

	public String toString() {
//		return "  Festgeld" + "	" + getName() + "	" + getAnzahl() + "		" + getKaufpreisAsDouble();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Festgeld		%s		%s			%s", getName(), getAnzahl(), getKaufpreisAsDouble()));
		return sb.toString();
	}

}
