import boissons.Boisson;
import boissons.Espresso;
import decorators.Chocollat;
import decorators.Lait;

public class Test {

    public static void main(String[] args) {
        Boisson boisson = new Espresso();
        System.out.println(boisson.getDescrption());
        System.out.println(boisson.count());

        boisson = new Lait(boisson);
        System.out.println(boisson.getDescrption());
        System.out.println(boisson.count());

        boisson = new Chocollat(boisson);
        System.out.println(boisson.getDescrption());
        System.out.println(boisson.count());
    }
}
