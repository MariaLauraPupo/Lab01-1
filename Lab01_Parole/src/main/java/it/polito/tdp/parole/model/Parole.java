package it.polito.tdp.parole.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Parole {
	public List<String> parole;
		
	public Parole() {
		//TODO
		parole=new ArrayList<String>();
	}
	
	public void addParola(String p) {
		//TODO
		parole.add(p);
	}
	
	public List<String> getElenco() {
		//TODO
		ArrayList<String> listaOrdinata=new ArrayList<String>(parole);
		Collections.sort(listaOrdinata);
		return listaOrdinata;
	}
	
	public void reset() {
		// TODO
	ArrayList<String> listaVuota=new ArrayList<String>(parole);
	/*for(String p:parole) {
		if(p!=null) {
			parole.remove(p);
		}
	}*/
		parole.removeAll(listaVuota);
	}
	public void cancellaParola(String p) {
		parole.remove(p);
	}

}
