package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class RentenPapier extends FestGeld implements Handelbar {

	private long kurs;
	private static int anzahl;

	public RentenPapier(String name, long kaufpreis, String kaufdatum, long betrag, long zinssatz, long laufzeit,
			long wert, long kurs) {
		super(name, kaufpreis, kaufdatum, betrag, zinssatz, laufzeit, wert);
		this.kurs = kurs;
	}

	public void setKurs(long neuerKurs){
		kurs = neuerKurs;
	}
}