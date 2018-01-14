import java.util.Scanner;

public class Attractie {

//	public static void main (String [] args) {
	Attractie botsauto = new Attractie();	
	
		int attractieNr;
		String attractieNaam;
		double attractiePrijs;
		int aantalKaartjes;
		double omzet;
		
		Attractie(int attractieNr, String attractieNaam){
		 
			this.attractieNr = attractieNr;
			this.attractieNaam = attractieNaam;
			this.attractiePrijs = attractiePrijs;
			this.aantalKaartjes = aantalKaartjes;
			this.omzet = attractiePrijs * aantalKaartjes;
		
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
		
			attractie.draaien(botsauto);
		
	/*	Scanner sc = new Scanner(System.in);
		for (int j = 0; j < 10; j++) {
		int i = sc.nextInt();
			(i);}
	*/	
		}	
	
	}
}
class botsauto extends Attractie{
	botsauto(int attractieNr, String attractieNaam) {
		super(attractieNr, attractieNaam);
		// TODO Auto-generated constructor stub
	}
	void draaien() {
		super(1, "Botsauto's");
		System.out.println("Botsauto's draaien");
}
class spin{
	
}
class spiegelpaleis{
	
}
class spookhuis{
	
}
class hawaii{
	
}
class ladderklimmen{
	
}
