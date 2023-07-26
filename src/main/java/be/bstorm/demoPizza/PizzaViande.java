package be.bstorm.demoPizza;

public abstract class PizzaViande extends Pizza {

    private int nbViande;


    public PizzaViande(String nom, String pate, String sauce,int nbViande) {
        super(nom, pate, sauce);
        this.nbViande = nbViande;
        System.out.println("in PizzaViande");
    }

    @Override
    public double getPrix() {
        return super.getPrix() + nbViande;
    }

    @Override
    public void manger() {

    }
}
