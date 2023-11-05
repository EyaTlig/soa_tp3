package Java;

import java.util.ArrayList;
import java.util.List;
public class BanqueService {
	Compte c=new Compte(1234,5023,"21/12/2014");
	List<Compte> comptes = new ArrayList<Compte>();
	public double conversion(double montant) {
		return montant=montant*3;
	}
	public Compte getCompte() {
        return c;
    }

    public List<Compte> getComptes() {
        return comptes;
    }
	public static void main(String[]args) {
		BanqueService bs=new BanqueService();
		System.out.println("la  somme apres la conversion est:" +bs.conversion(2500));
		Compte c1=new Compte(1598,264,"29/8/2000");
		Compte c2=new Compte(4687,4300.97,"20/2/2015");
        System.out.println("Info sur le compte c1: " + c1.getCode() + " " + c1.getSolde() + " " + c1.getDateCreation());
        System.out.println("Info sur le compte c2 : " + c2.getCode() + " " + c2.getSolde() + " " + c2.getDateCreation());

        List<Compte> comptes = bs.getComptes();
        comptes.add(new Compte(1246, 1475, "11/4/2022"));
        comptes.add(new Compte(3649, 1400.8, "13/9/2014"));
        comptes.add(new Compte(7958, 250, "6/9/2088"));

        System.out.println("Liste des comptes : ");
        for (Compte c : comptes) {
            System.out.println(c.getCode() + " " + c.getSolde() + " " + c.getDateCreation());
        }
    }
		
	}