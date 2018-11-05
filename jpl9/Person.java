package no.hvl.dat100.jpl9;

public abstract class Person {
	
	private String etternamn;
	private String fornamn;
	private long foedselsnummer;
	
	public Person() {
		etternamn = " ";
		fornamn = " ";		
		foedselsnummer = 0;
	}

	public Person(String etternamn, String fornamn, long fodselsnummer) {
		// TODO
		this.etternamn = etternamn;
		this.fornamn = fornamn;
		foedselsnummer = fodselsnummer;
		//throw new RuntimeException("Person constructor not implemented");
	}

	public String getEtternamn() {
		// TODO
		return etternamn;
		//throw new RuntimeException("getEtternamn not implemented");
	}

	public void setEtternamn(String etternamn) {
		// TODO
		this.etternamn = etternamn;
		//throw new RuntimeException("setEtternamn not implemented");
	}

	public String getFornamn() {
		// TODO
		return fornamn;
		//throw new RuntimeException("getFornamn not implemented");
	}

	public void setFornamn(String fornamn) {
		// TODO
		this.fornamn = fornamn;
		//throw new RuntimeException("setFornamn not implemented");
	}

	public void setFodselsnummer(long fodselsnummer) {
		// TODO
		foedselsnummer = fodselsnummer;
		//throw new RuntimeException("setFodselsnummer not implemented");
	}

	public long getFodselsnummer() {
		// TODO
		return foedselsnummer;
		//throw new RuntimeException("getFodselsnummer not implemented");
	}

	public boolean erLik(Person person) {
		// TODO
		if ( foedselsnummer == person.getFodselsnummer()) {
			return true;
		}else {
			return false;
		}
		//throw new RuntimeException("erLik not implemented");
	}

	public boolean erKvinne() {
		// TODO
		boolean sannhet = false;
		String e = String.valueOf(foedselsnummer);
		char c = e.charAt(e.length()-3);
		char[] partall = {'0', '2', '4', '6', '8'};
		for(int i = 0; i < partall.length; i++) {
			if(c == partall[i]) {
				sannhet = true;
			}
		}
		return sannhet;
		//throw new RuntimeException("erKvinne not implemented");
	}

	public boolean erMann() {
		// TODO
		if(!erKvinne()) { //Dersom det tredje siste sifferet i fødselsnummeret		  
			return true;  //ikkje er et partall er det et oddetall.
		}else {
			return false;
		}
		//throw new RuntimeException("erMann not implemented");
	}

	@Override
	public String toString() {
		// TODO
		return foedselsnummer + "\n" + etternamn  + "\n" + fornamn + "\n";
		//throw new RuntimeException("toString not implemented");
	}
}
