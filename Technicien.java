package tp3;

public class Technicien extends Personne {
	private int matricule;
	Specialite specialite;
	
	public Technicien() {
		super();
		this.matricule = 0;
		this.specialite = Specialite.Rien;
	}

	public Technicien(String nom, String prenom, String email, String login, String password, int matricule,
			Specialite specialite) {
		super(nom, prenom, email, login, password);
		this.matricule = matricule;
		this.specialite = specialite;
	}

	@Override
	public String toString() {
		return "Technicien [matricule=" + matricule + ", specialite=" + specialite + "," + super.toString()
				+ "]";
	}

	public void afficher() {System.out.println(this);}

}
