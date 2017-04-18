package de.hs.mannheim.tpe.mvg.testate.Testat2;

import java.util.ArrayList;

import de.hsma.imb2.ss17.tpel.testat2.optionen.CallOption;
import de.hsma.imb2.ss17.tpel.testat2.optionen.Option;
import de.hsma.imb2.ss17.tpel.testat2.optionen.PutOption;

public class Main {

	public static void main(String[] args) throws Exception {

		Portfolio p1 = erstellePortfolio1();
		System.out.println("Portfolio 1");
		System.out.println(p1.toString());
		System.out.println(p1.getGesamtinvestition());

		Portfolio p2 = erstellePortfolio2();
		System.out.println("Portfolio 2");
		System.out.println(p2.toString());

	}

	public static Portfolio erstellePortfolio1() throws Exception {
		Portfolio ptmp = new Portfolio();

		// BASF Aktie
		ptmp.hinzufuegen(new Aktie("BASF", "11.02.17", 61.02, 61.27, 1000));

		// MAN Aktie
		ptmp.hinzufuegen(new Aktie("MAN", "12.03.17", 89.25, 88.24, 240));

		// Indexfond Dax
		ArrayList<Aktie> aLDax = new ArrayList<>();
		aLDax.add(new Aktie("Münchner Rück", "15.06.16", 102.10, 111.10, 1));
		aLDax.add(new Aktie("BASF", "22.11.15", 61.02, 61.27, 1));
		aLDax.add(new Aktie("MAN", "01.02.16", 89.25, 88.24, 1));
		aLDax.add(new Aktie("Siemens", "05.02.17", 97.33, 96.78, 1));
		aLDax.add(new Aktie("Daimler", "06.02.17", 50.20, 49.93, 1));
		aLDax.add(new Aktie("BMW", "17.03.17", 61.40, 58.67, 1));
		aLDax.add(new Aktie("Volkswagen", "25.04.15", 101.46, 115.50, 1));
		Aktienfond afDax = new Aktienfond("DAX", "25.03.17", 581.49, aLDax, 300);
		ptmp.hinzufuegen(afDax);

		// Villa
		ptmp.hinzufuegen(new Immobilie("Villa", "15.06.16", 1000000.0, 20, 1000000.0));

		// Festgeld Sparkasse
		ptmp.hinzufuegen(new Festgeld("Sparkasse", "15.02.17", 100000.0, 2.0, 3, 1));

		// Call BASF Option
		ptmp.hinzufuegen(Option.generiereOption("Call BASF", "17.12.16", "17.12.16", 300, 5.00, 60.0, 10000));

		// Call MAN Option
		ptmp.hinzufuegen(Option.generiereOption("Call MAN", "17.12.16", "17.12.16", 325, 1.0, 88.0, 5000));

		// Put MAN Option
		ptmp.hinzufuegen(Option.generiereOption("Put MAN", "17.12.16", "17.12.16", 325, 2.0, 88.0, 5000));

		// Put Daimler Option
		ptmp.hinzufuegen(Option.generiereOption("Put Daimler", "18.01.17", "18.01.17", 322, 3.0, 47.0, 5000));

		return ptmp;
	}

	public static Portfolio erstellePortfolio2() {
		Portfolio ptmp = new Portfolio();

		// BASF Aktie
		ptmp.hinzufuegen(new Aktie("BASF", "21.02.17", 61.02, 61.27, 2000));

		// MAN Aktie
		ptmp.hinzufuegen(new Aktie("MAN", "18.11.15", 89.25, 88.24, 240));

		// Siemens Aktie
		ptmp.hinzufuegen(new Aktie("Siemens", "14.09.16", 97.10, 69.78, 400));

		// VW Aktie
		ptmp.hinzufuegen(new Aktie("VW", "01.09.16", 11.32, 155.5, 600));

		// Indexfond Dax
		ArrayList<Aktie> aLDax = new ArrayList<>();
		aLDax.add(new Aktie("Münchner Rück", "15.06.16", 102.10, 111.10, 1));
		aLDax.add(new Aktie("BASF", "22.11.15", 61.02, 61.27, 1));
		aLDax.add(new Aktie("MAN", "01.02.16", 89.25, 88.24, 1));
		aLDax.add(new Aktie("Siemens", "05.02.17", 97.33, 96.78, 1));
		aLDax.add(new Aktie("Daimler", "06.02.17", 50.20, 49.93, 1));
		aLDax.add(new Aktie("BMW", "17.03.17", 61.40, 58.67, 1));
		aLDax.add(new Aktie("Volkswagen", "25.04.15", 101.46, 115.50, 1));
		Aktienfond afDax = new Aktienfond("DAX", "25.03.17", 581.49, aLDax, 500);
		ptmp.hinzufuegen(afDax);

		// Autofond
		ArrayList<Aktie> aLAuto = new ArrayList<>();
		aLAuto.add(new Aktie("Daimler", "06.02.17", 50.20, 49.93, 4));
		aLAuto.add(new Aktie("BMW", "17.03.17", 61.40, 58.67, 3));
		aLAuto.add(new Aktie("Volkswagen", "25.04.15", 101.46, 115.50, 5));
		Aktienfond afAuto = new Aktienfond("Automobil", "25.03.17", 950.0, aLAuto, 200);
		ptmp.hinzufuegen(afAuto);

		// Schatzbrief
		ptmp.hinzufuegen(new Rentenpapier("Bundes", "15.05.16", 50000.0, 1.5, 10, 1));
		
		// Sparkasse Mannheim
		ptmp.hinzufuegen(new Festgeld("Sparkasse", "15.06.16", 80000.0, 2.0, 3, 1));
		
		return ptmp;
	}

}

