package decorators;

import boissons.Boisson;

public class Lait extends DecorateurIngredient{


    public Lait(Boisson boisson) {
        super(boisson);
    }

    @Override
    public double count() {
        return 1+boisson.count();
    }

    @Override
    public String getDescription() {
        return boisson.getDescrption()+ " Au lait";
    }
}
