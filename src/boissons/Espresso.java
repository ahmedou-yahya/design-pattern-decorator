package boissons;

public class Espresso extends Boisson{

    public Espresso(){
        this.descrption="Espresso";
    }

    @Override
    public double count() {
        return 5;
    }
}
