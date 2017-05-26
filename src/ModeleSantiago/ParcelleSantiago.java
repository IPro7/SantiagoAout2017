package ModeleSantiago;

public class ParcelleSantiago {
	
	int idParcelle;
	int coordXParcelle;
	int coordYParcelle;
	
	public ParcelleSantiago(int idParcelle, int coordXParcelle, int coordYParcelle) {
		super();
		this.idParcelle = idParcelle;
		this.coordXParcelle = coordXParcelle;
		this.coordYParcelle = coordYParcelle;
	}

	public int getIdParcelle() {
		return idParcelle;
	}

	public void setIdParcelle(int idParcelle) {
		this.idParcelle = idParcelle;
	}

	public int getCoordXParcelle() {
		return coordXParcelle;
	}

	public void setCoordXParcelle(int coordXParcelle) {
		this.coordXParcelle = coordXParcelle;
	}

	public int getCoordYParcelle() {
		return coordYParcelle;
	}

	public void setCoordYParcelle(int coordYParcelle) {
		this.coordYParcelle = coordYParcelle;
	}
	
	
	
	

}
