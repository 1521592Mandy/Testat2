package de.hs.mannheim.tpe.mvg.testate.Testat2;

import java.util.ArrayList;

import de.hsma.imb2.ss17.tpel.testat2.optionen.Option;

public class Portfolio implements Hinzufuegen {

	private ArrayList<Vermoegensgegenstand> portfolio = new ArrayList<Vermoegensgegenstand>();

	@Override
	public String toString() {
		// String alleVermoegensgegenstaende = new String();
		// int tmp = 0;
		// for (Vermoegensgegenstand i : portfolio) {
		// alleVermoegensgegenstaende = alleVermoegensgegenstaende +
		// i.toString();
		// tmp++;
		// if (portfolio.size() != tmp) {
		// alleVermoegensgegenstaende = alleVermoegensgegenstaende + "\n";
		// }
		// }
		//
		// return
		// "____________________________________________________________\n Art
		// Name Anzahl StÃ¼ckpreis \n"
		// + "____________________________________________________________" +
		// "\n" + alleVermoegensgegenstaende
		// + "\n____________________________________________________________";

		StringBuilder sb = new StringBuilder();
		sb.append(String.format(
				"________________________________________________________________________________________________%n"
				+ "	Typ			Name			Anzahl			Stückpreis	%n________________________________________________________________________________________________%n"));
		portfolio.stream().forEach(a -> sb.append(a).append('\n'));
		sb.append(String.format("%n________________________________________________________________________________________________%n"));
		return sb.toString();
	}

	public void hinzufuegen(Vermoegensgegenstand vermoegensgegenstand) {
		portfolio.add(vermoegensgegenstand);
	}

	public void optionAusueben(Option option, int anzahl) throws Exception {
		if (portfolio.contains(option)) {
			option.ausueben(portfolio, anzahl);
		}
	}

	public double getGesamtinvestition() {
		long gesamtinvestition = 0;
		for (Vermoegensgegenstand i : portfolio) {
			gesamtinvestition += (i.getKaufpreis() * i.getAnzahl());
		}
		return ((double) gesamtinvestition) / 100.00;
	}
	
	public double getZeitwert() {
		long gesamtzeitwert = 0;
		for (Vermoegensgegenstand i : portfolio) {
			gesamtzeitwert += (i.getKurs * i.getAnzahl());
		}
		return ((double) gesamtzeitwert) / 100.00;
	}

}
