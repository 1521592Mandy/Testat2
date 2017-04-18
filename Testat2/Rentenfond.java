package de.hs.mannheim.tpe.mvg.testate.Testat2;

import java.util.ArrayList;

public class Rentenfond extends Fond {

	private ArrayList<Rentenpapier> rentenpapiere;

	public Rentenfond(String name, String kaufdatum, double kaufpreis, ArrayList<Rentenpapier> rentenpapiere,
			int anzahl) {
		super(name, kaufdatum, kaufpreis, anzahl);
		this.rentenpapiere = rentenpapiere;
		setKurs();
	}

	public void setKurs() {
		long kurs = 0;
		for (Rentenpapier i : rentenpapiere) {
			kurs += (i.getKurs() * i.getAnzahl());
		}
		setKurs(kurs);
	}

	// ENTFERNEN!!!
	public void hinzufuegen(Vermoegensgegenstand rentenpapier) throws Exception {
		if (rentenpapier instanceof Rentenpapier) {
			hinzufuegen((Rentenpapier) rentenpapier);
		} else {
			throw new Exception("Typ falsch");
		}
	}

	// ENTFERNEN!!!
	private void hinzufuegen(Rentenpapier rentenpapier) {
		rentenpapiere.add(rentenpapier);
	}

	public String toString() {
//		return "  Rentenfonds" + "	" + getName() + "		" + getAnzahl() + "		" + getKaufpreis();
		StringBuilder sb = new StringBuilder();
		sb.append(
				String.format("	Rentenfonds			%s			%s			%s", getName(), getAnzahl(), getKaufpreisAsDouble()));
		return sb.toString();
	}

}
