package de.hs.mannheim.tpe.mvg.testate.Testat2.optionen;

import java.util.ArrayList;

import de.hsma.imb2.ss17.tpel.testat2.portfolio.Aktie;
import de.hsma.imb2.ss17.tpel.testat2.portfolio.Vermoegensgegenstand;

public abstract class Option extends Vermoegensgegenstand {

	private final String GUELTIG_AB;
	private int dauer;
	/*private final Aktie AKTIE;*/
	private final long AUSUEBUNGSPREIS;
	

	public Option(String name, String kaufdatum, String gueltigAb, int dauer, double kaufpreis,
			double ausuebungspreis/*, Aktie aktie*/, int anzahl) {
		super(name, kaufdatum, kaufpreis, anzahl);
		this.GUELTIG_AB = gueltigAb;
		this.dauer = dauer;
		this.AUSUEBUNGSPREIS = (long) (ausuebungspreis * 100);
		/*this.AKTIE = aktie;*/
	}

	public String getGueltigAb() {
		return GUELTIG_AB;
	}

	public int getDauer() {
		return dauer;
	}
	
	public int setDauer(int neuerWert) {
		return dauer = neuerWert;
	}
	

	public long getAusuebungspreis() {
		return AUSUEBUNGSPREIS;
	}
	
	public double getAusueungspreisAsDouble() {
		return ((double) AUSUEBUNGSPREIS) / 100.00;
	}
/*
	public Aktie getAktie() {
		return AKTIE;
	}
	*/

	// Factory Method Pattern
	public static Option generiereOption(String name, String kaufdatum, String gueltigAb, int dauer, double kaufpreis, double ausuebungspreis,
			int anzahl/*, Aktie aktie*/) throws Exception {
		if (name.contains("Call")) {
			return new CallOption(name, kaufdatum, gueltigAb, dauer, kaufpreis, ausuebungspreis/*, aktie*/, anzahl);
		} else if (name.contains("Put"))  {
			return new PutOption(name, kaufdatum, gueltigAb, dauer, kaufpreis, ausuebungspreis/*, aktie*/, anzahl);
		} else {
			throw new Exception("Instanziieren von Operation nicht möglich: Name falsch eingegeben");
		}
	}
	
	public abstract void ausueben(ArrayList<Vermoegensgegenstand> portfolio, int anzahl) throws Exception;
	
	

}

