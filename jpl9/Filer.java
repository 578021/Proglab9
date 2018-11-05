package no.hvl.dat100.jpl9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Filer {

	private static String MAPPE = System.getProperty("user.dir") + "/src/no/hvl/dat100/jpl9/";

	private static String STUDENT = "STUDENT";
	private static String LAERER = "LAERER";

	public boolean skriv(PersonSamling samling, String filnavn) {
		boolean skrevet = true;
		PrintWriter writer = null;

		// TODO
		try {
			File fil = new File (MAPPE + filnavn);
			writer = new PrintWriter(MAPPE +filnavn);
			Person[] tab = samling.getSamling();
			writer.println(samling.getAntall());
			for (int i = 0; i < samling.getAntall(); i++) {
				writer.print(tab[i]);
			}
			return true;
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "Feil: fil ikke funnet");
			return false;
		}finally {
			writer.close();
		}
		/*Scanner leser = new Scanner(filnavn);
		if (leser.hasNextLine()) {
			leser.close();
			return skrevet;
		} else {
			skrevet = false;
		}
		leser.close();
		return skrevet;*/
		// throw new RuntimeException("skriv not implemented");

	}

	public PersonSamling les(String filnavn) {

		PersonSamling samling = null;
		Scanner leser = null;
		// TODO
		try {
		File fil = new File(MAPPE + filnavn);
		leser = new Scanner(fil);
		int antall = Integer.parseInt(leser.nextLine());
		samling = new PersonSamling(antall);
		while (leser.hasNextLine()) {
			String linje = leser.nextLine();
			
			if (linje.equals("STUDENT")) {
				long fodselsnummer = Long.valueOf(leser.nextLine());
				String etternavn = leser.nextLine();
				String fornavn = leser.nextLine();
				int studentnummer = Integer.valueOf(leser.nextLine());
				String klasse = leser.nextLine();
				
				samling.leggTil(new Student(etternavn, fornavn, fodselsnummer, studentnummer, klasse));
				
			} 
			
			else{
				long fodselsnummer = Long.valueOf(leser.nextLine());
				String etternavn = leser.nextLine();
				String fornavn = leser.nextLine();
				int maanedslonn = Integer.valueOf(leser.nextLine());
				int kontonummer = Integer.valueOf(leser.nextLine());
				
				samling.leggTil(new Laerer(etternavn, fornavn, fodselsnummer, maanedslonn, kontonummer));
				
			}
			
			//throw new RuntimeException("les not implemented");
		
		}
		
		//System.out.println(samling.getAntall());
		//System.out.println(samling.getSamling()[0]);
		leser.close();
		}
		
	catch (FileNotFoundException e) {
		JOptionPane.showMessageDialog(null, "Feil: fil ikke funnet");
	}finally {
		leser.close();
	}
		return samling;
	}
}
