package tp3;

import java.util.Scanner;

public class Personne {
	protected String nom, prenom, email, login, password;
	public Personne() {
		this.nom = "";
		this.prenom = "";
		this.email = "";
		this.login = "";
		this.password = "";
	}
	
	
	public Personne(String nom, String prenom, String email, String login, String password) {
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.login = login;
		this.password = password;
	}


	@Override
	public String toString() {
		return "Personne [nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", login=" + login + ", password="
				+ password + "]";
	}
	
	public void afficher() { System.out.println(this);}

	public boolean sauthentifier1() {
		Scanner c = new Scanner(System.in);
		String l = c.nextLine();
		String m = c.nextLine();
		
		if(l.contentEquals(email) &&  m.contentEquals(password)) {			
			return true;
		}else {
			return sauthentifier2();
		}
	}
	
	public boolean sauthentifier2() {
		Scanner b = new Scanner(System.in);		
		for(int i=0;i<3;i++) {
			String l = b.next();
			String m = b.next();
			if(l.contentEquals(email) &&  m.contentEquals(password)) {
				b.close();
				return true;
			}
		}
		b.close();
		return false;
	}
}
