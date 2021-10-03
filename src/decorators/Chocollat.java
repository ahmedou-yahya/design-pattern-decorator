package decorators;

import boissons.Boisson;

public class Chocollat extends DecorateurIngredient{


    public Chocollat(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double count() {
        return 0.8+boisson.count();
    }

    @Override
    public String getDescription() {
        return boisson.getDescrption()+ "Au chocollat";
    }
}
