package de.hs.mannheim.tpe.mvg.testate.Testat2.optionen;

import java.util.ArrayList;

import de.hsma.imb2.ss17.tpel.testat2.portfolio.Aktie;
import de.hsma.imb2.ss17.tpel.testat2.portfolio.Portfolio;
import de.hsma.imb2.ss17.tpel.testat2.portfolio.Vermoegensgegenstand;

public class PutOption extends Option {

	protected PutOption(String name, String kaufdatum, String gueltigAb, int dauer, double kaufpreis,
			double ausuebungspreis/*, Aktie aktie*/, int anzahl) {
		super(name, kaufdatum, gueltigAb, dauer, kaufpreis, ausuebungspreis/*, aktie*/, anzahl);
	}

	public void ausueben(ArrayList<Vermoegensgegenstand> portfolio, int anzahl) {
//		portfolio.remove(getAktie());
//		portfolio.remove(this);
	}
	
	@Override
	public String toString() {
//		return "  Option	" + getName() + "	"
//				+ "" + getAnzahl() + "		" + getKaufpreisAsDouble();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Option			%s			%s			%s", getName(), getAnzahl(), getKaufpreis()));
		return sb.toString();
	}

}
