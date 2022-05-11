package creational.abstract_factory.factory;

import creational.abstract_factory.product.GothJacket;
import creational.abstract_factory.product.GothPants;
import creational.abstract_factory.product.Jacket;
import creational.abstract_factory.product.Pants;

public class GothClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new GothPants();
    }

    @Override
    public Jacket createJacket() {
        return new GothJacket();
    }
}
