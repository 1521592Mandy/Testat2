package de.hs.mannheim.tpe.mvg.testate.Testat2;

import de.hs.mannheim.tpe.mvg.testate.Testat2.optionen.PortfolioPosition;

public abstract class VermoegensGegenstand extends PortfolioPosition {
	private final String NAME;
	private final long KAUFPREIS;
	private final String KAUFDATUM;

	public VermoegensGegenstand(String name, long kaufpreis, String kaufdatum) {
		this.NAME = name;
		this.KAUFPREIS = kaufpreis;
		this.KAUFDATUM = kaufdatum;
	}

	public String getNAME() {
		return NAME;
	}

	public long getKAUFPREIS() {
		return KAUFPREIS;
	}

	public String getKAUFDATUM() {
		return KAUFDATUM;
	}
	
	

}
