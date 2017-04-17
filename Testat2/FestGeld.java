package de.hs.mannheim.tpe.mvg.testate.Testat2;

public class FestGeld extends VermoegensGegenstand {

	private final long BETRAG;
	private final long ZINSSATZ;
	private long laufzeit;
	private static long anzahl;
	private long wert;

	public FestGeld(String name, long kaufpreis, String kaufdatum, long betrag, long zinssatz, long laufzeit,
			long wert) {
		super(name, kaufpreis, kaufdatum);
		BETRAG = betrag;
		ZINSSATZ = zinssatz;
		this.laufzeit = laufzeit;
		this.wert = wert;
	}

	public long berehneEndwert() {
		return (long) (BETRAG * Math.pow(((1+(ZINSSATZ/100))), laufzeit));
	}

}

