package de.hs.mannheim.tpe.mvg.testate.Testat2;

import java.util.ArrayList;

public class Aktienfond extends Fond {

	private ArrayList<Aktie> aktien;

	public Aktienfond(String name, String kaufdatum, double kaufpreis, ArrayList<Aktie> aktien, int anzahl) {
		super(name, kaufdatum, kaufpreis, anzahl);
		this.aktien = aktien;
		setKurs();
	}

	public void setKurs() {
		long kurs = 0;
		for (Aktie i : aktien) {
			kurs += (i.getKurs() * i.getAnzahl());
		}
		setKurs(kurs);
	}

	// ENTFERNEN!!!
	public void hinzufuegen(Vermoegensgegenstand aktie) throws Exception {
		if (aktie instanceof Aktie) {
			hinzufuegen((Aktie) aktie);
		} else {
			throw new Exception("Typ falsch");
		}
	}

	// ENTFERNEN!!!
	private void hinzufuegen(Aktie aktie) {
		aktien.add(aktie);
	}

	public String toString() {
//		return "  Aktienfonds" + "	" + getName() + "		" + getAnzahl() + "		" + getKaufpreisAsDouble();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Aktienfonds		%s			%s			%s", getName(), getAnzahl(), getKaufpreisAsDouble()));
		return sb.toString();
	}

}

