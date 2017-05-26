package ModeleSantiago;

import java.util.*;




public class Plateau {
	
	int idPlateau;
	private List<ParcelleSantiago> listeDesParcelles;
	private List<FosseSantiago> listeDesFosses;
	
	
	public Plateau(int idPlateau, List<ParcelleSantiago> listeDesParcelles, List<FosseSantiago> listeDesFosses) {
		super();
		this.idPlateau = idPlateau;
		this.listeDesParcelles = listeDesParcelles;
		this.listeDesFosses = listeDesFosses;
	}


	public int getIdPlateau() {
		return idPlateau;
	}


	public void setIdPlateau(int idPlateau) {
		this.idPlateau = idPlateau;
	}


	public List<ParcelleSantiago> getListeDesParcelles() {
		return listeDesParcelles;
	}


	public void setListeDesParcelles(List<ParcelleSantiago> listeDesParcelles) {
		this.listeDesParcelles = listeDesParcelles;
	}


	public List<FosseSantiago> getListeDesFosses() {
		return listeDesFosses;
	}


	public void setListeDesFosses(List<FosseSantiago> listeDesFosses) {
		this.listeDesFosses = listeDesFosses;
	}
	
	
	
	
}



