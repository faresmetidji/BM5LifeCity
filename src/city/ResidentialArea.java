package city;

import city.Districts;

public class ResidentialArea implements Districts{
//Attributes ---------------------------------------------------------------------------------
	private String nameDsitrict;
	private String typeDistrict;
	private int numbResidents;
	private int numbResidentsMax;
	private int dimX= 4, dimY= 4;
	private Case map[][];
	

//Constructor of Class -----------------------------------------------------------------------
	
	public ResidentialArea(String nameDsitrict, String typeDistrict, int numbResidents, int numbResidentsMax) {
		this.nameDsitrict = nameDsitrict;
		this.typeDistrict = typeDistrict;
		this.numbResidents = numbResidents;
		this.numbResidentsMax = numbResidentsMax;
	}
//Function of class
	public void initDistrict() {
		for (int i=0; i<dimX;i++) {
			for(int j=0; j<dimY;j++) {
				//Districts d = new District(); //attente du constructeur d'un district
				Districts d = null ;
				map[i][j]=d; 					
			}
		}	
	}
//Constructors of attributes -----------------------------------------------------------------
	
	public int getNumbResidents() {
		return numbResidents;
	}
	public void setNumbResidents(int numbResidents) {
		this.numbResidents = numbResidents;
	}
	public int getNumbResidentsMax() {
		return numbResidentsMax;
	}
	public void setNumbResidentsMax(int numbResidentsMax) {
		this.numbResidentsMax = numbResidentsMax;
	}
	
	public String getNameDsitrict() {
		return nameDsitrict;
	}
	public void setNameDsitrict(String nameDsitrict) {
		this.nameDsitrict = nameDsitrict;
	}
	
	public String getTypeDistrict() {
		return typeDistrict;
	}
	public void setTypeDistrict(String numbResidentsMax) {
		this.typeDistrict = typeDistrict;
	}
	
}

