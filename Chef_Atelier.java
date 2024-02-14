package tp3;
import java.sql.Date;

public class Chef_Atelier extends Personne{
	private int nbExperience;
	private Date dateExperience, datePromotion;
	private statut stats; 
	
	public Chef_Atelier() {
		super();
		this.nbExperience = 0;
		this.dateExperience = new Date(0);
		this.datePromotion = new Date(0);
		stats = statut.Neant;
				
	}

	public Chef_Atelier(String nom, String prenom, String email, String login, String password, int nbExperience,
			Date dateExperience, Date datePromotion, statut stats) {
		super(nom, prenom, email, login, password);
		this.nbExperience = nbExperience;
		this.dateExperience = dateExperience;
		this.datePromotion = datePromotion;
		this.stats = stats;
	}

	
	
	@Override
	public String toString() {
		return "Chef_Atelier [nbExperience=" + nbExperience + ", dateExperience=" + dateExperience + ", datePromotion="
				+ datePromotion + ", stats=" + stats + "," + super.toString() + "]";
	}

	public void afficher() {System.out.println(this);}
	
	public int miseAJourExperience(Date dateExp){
		dateExperience = dateExp;
		return 0;
	}

}
