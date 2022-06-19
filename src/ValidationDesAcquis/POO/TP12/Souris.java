package ValidationDesAcquis.POO.TP12;

public class Souris implements Cloneable {
    private int poids;
    private int age;
    private String couleur;
    private int esperanceVie;
    private boolean clonee;

    private static final int ESPERANCE_VIE_DEFAUT = 36;
    public Souris(int poids, String couleur, int age, int esperanceVie) {
        System.out.println("Une nouvelle souris !");
        this.poids = poids;
        this.couleur = couleur;
        this.age = age;
        this.esperanceVie = esperanceVie;
    }

    public Souris(int poids, String couleur){
        this(poids,couleur,0,ESPERANCE_VIE_DEFAUT);
    }

    public Souris(Souris souris){
        System.out.println("Clonage d'une souris !");
        this.poids = souris.poids;
        this.couleur = souris.couleur;
        this.age = souris.age;
        this.esperanceVie = (int)(4.0/5.0*souris.esperanceVie);
        this.clonee = true;
    }

    public int getPoids() {
        return poids;
    }

    public int getAge() {
        return age;
    }

    public String getCouleur() {
        return couleur;
    }

    public int getEsperanceVie() {
        return esperanceVie;
    }

    public boolean isClonee() {
        return clonee;
    }

    @Override
    public String toString() {
        var sb = new StringBuilder();
        sb.append(String.format("Une souris %s", this.couleur));
        if (this.clonee) {
            sb.append(", clonée,");
        }
        sb.append(String.format(" de %d mois et pesant %d grammes", this.age, this.poids));
        return sb.toString();
    }

    public void vieillir(){
        if (this.age < esperanceVie){
            this.age++;
        }
        if (age>esperanceVie/2 && clonee){
            couleur = "verte";
        }
    }

    public void evolue(){
        while (this.age<this.esperanceVie){
            vieillir();
        }
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Souris(this);
    }
}
