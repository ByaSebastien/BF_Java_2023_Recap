package be.bstorm.demoPizza;

public abstract class Pizza {

    private String nom;
    private String pate;
    private String sauce;

    public Pizza(String nom, String pate, String sauce) {
        setNom(nom);
        this.pate = pate;
        this.sauce = sauce;
        System.out.println("in Pizza");
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if(nom.equals("Haway")){
            throw new IllegalStateException("T'es pas bien toi!");
        }
        this.nom = nom;
    }

    public String getPate() {
        return pate;
    }

    public void setPate(String pate) {
        this.pate = pate;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public double getPrix() {
        return 8;
    }

    public abstract void manger();
}
