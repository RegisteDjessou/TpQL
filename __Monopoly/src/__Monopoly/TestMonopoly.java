package __Monopoly;
import java.util.Scanner;
public class TestMonopoly {
	public static void main(String[] args) {

		 Partie partie =new Partie(3);
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Entrer le pseudo du joueur 1: ");
		 String userName = sc.nextLine();
		 Joueur joueur1 =new Joueur(userName);
		 
		 System.out.println("Entrer le pseudo du joueur 2: ");
		 userName = sc.nextLine();
		 Joueur joueur2 =new Joueur(userName);
		 
		 
		 partie.lancerPartie(joueur1, joueur2);
		 sc.close();
	}
}
