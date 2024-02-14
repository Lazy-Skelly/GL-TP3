package tp3;
import java.sql.Date;

public class programme {
	public static void main(String[] args) {
		Chef_Atelier c = new Chef_Atelier("the","engineer","bq","yes@gmail.com","b",99,new Date(0),new Date(0),statut.Actif);
		c.miseAJourExperience(Date.valueOf("2050-12-30"));
		System.out.println(c);
		System.out.println(c.sauthentifier1());
		Technicien t = new Technicien("the","spy","hmm@gmail.com","humble","daulphin",007, Specialite.Mecanique);
		System.out.println(t);
	}
}