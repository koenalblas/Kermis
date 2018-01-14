import java.util.Scanner;

public class Attractie {

	static int attractieNr;
	static String attractieNaam;
	double attractiePrijs;
	int aantalKaartjes;
	double omzet;

	Attractie(int attractieNr, String attractieNaam) {

		this.attractieNr = attractieNr;
		this.attractieNaam = attractieNaam;
		this.attractiePrijs = attractiePrijs;
		this.aantalKaartjes = aantalKaartjes;
		this.omzet = attractiePrijs * aantalKaartjes;

	}

	public static void main (String [] args) 
		{
		Attractie botsauto = new Attractie(attractieNr, attractieNaam);
		
		}

	public int getAttractieNr() {
		return this.attractieNr;
	}

	public String getAttractieNaam() {
		return this.attractieNaam;
	}

	public double getAttractiePrijs() {
		return this.attractiePrijs;
	}

	public int getAantalKaartjes() {
		return this.aantalKaartjes;
	}

	public double getOmzet() {
		return this.omzet;
	}
	
}

class BotsAutos extends Attractie {
	BotsAutos() {
		super(1, "Botsauto's");

		System.out.println("Botsauto's draaien");
	}

	class spin {

	}

	class spiegelpaleis {

	}

	class spookhuis {

	}

	class hawaii {

	}

	class ladderklimmen {

	}
}
