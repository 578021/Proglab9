package no.hvl.dat100.jpl9;

public class PersonSamling {
	private Person[] tab;
	private int antall;

	public PersonSamling() {
		// TODO
		tab = new Person[20];
		antall = 0;
		// throw new RuntimeException("PersonSamling() constructor not implemented");
	}

	public PersonSamling(int lengde) {
		// TODO
		tab = new Person[lengde];
		antall = 0;

		// throw new RuntimeException("PersonSamling() constructor not implemented");
	}

	public int getAntall() {
		// TODO
		return antall;
		}
		// throw new RuntimeException("getAntall not implemented");

	// DO NOT TOUCH - FOR TESTING PURPOSES ONLY
	public void setAntall(int antall) {
		this.antall = antall;
	}

	public Person[] getSamling() {
		// TODO
		return tab;
		//throw new RuntimeException("getSamling() not implemented");
	}

	public int finnPerson(Person p) {
		// TODO
		boolean funnet = false;
		int plass = 0;
		while(!funnet && plass < antall) {
			if (tab[plass].erLik(p)) {
				funnet = true;
				return plass;
			}else {
				plass++;
			}
		}
		return -1;
		//throw new RuntimeException("finnPerson not implemented");
	}

	public boolean finnes(Person p) {
		// TODO
		boolean finnes = false;
		int plass = 0;
		while(!finnes && plass < antall) {
			if(tab[plass].erLik(p)) {
				finnes = true;
			}else {
				plass++;
			}
		}
		return finnes;
		//throw new RuntimeException("finnes not implemented");
	}

	public boolean ledigPlass() {
		// TODO
		if(antall < tab.length) {
			return true;
		}else {
			return false;
		}
		//throw new RuntimeException("ledigPlass not implemented");
	}

	public boolean leggTil(Person p) {
		// TODO
		if(ledigPlass() && !finnes(p)) {
			tab[antall] = p;
			antall++;
			return true;
		}else {
			return false;
		}
		//throw new RuntimeException("leggTil not implemented");
	}

	public String toString() {
		// TODO
		 String s = antall + "\n";
		for(int i = 0; i < antall; i++ ) {
			s += tab[i].toString();
		}
		return s;
		//throw new RuntimeException("toString not implemented");
	}

	public void utvid() {

		// TODO
		Person[] sam = new Person[(antall * 2)];
		for(int i = 0; i < antall; i++) {
			sam[i] = tab[i];
		}
		tab = sam;
		//throw new RuntimeException("utvid not implemented");
	}

	public boolean leggTilUtvid(Person p) {

		// TODO
		boolean lagttil = false;
		if(leggTil(p)) {
			lagttil = true;
		}else {
			utvid();
			leggTil(p);
			lagttil = true;
		}
		
		return lagttil;
		//throw new RuntimeException("leggTilUtvid not implemented");
	}

	public boolean slett(Person p) {

		// TODO
		int posisjon = finnPerson(p);
		if(posisjon >= 0) {
			antall--;
			tab[posisjon] = tab[antall];
			tab[antall] = null;
			return true;
		}else {
			return false;
		}
		//throw new RuntimeException("slett not implemented");
	}
}