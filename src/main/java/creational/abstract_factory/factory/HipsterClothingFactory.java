package creational.abstract_factory.factory;

import creational.abstract_factory.product.HipsterJacket;
import creational.abstract_factory.product.HipsterPants;
import creational.abstract_factory.product.Jacket;
import creational.abstract_factory.product.Pants;

public class HipsterClothingFactory implements ClothingFactory {

    @Override
    public Pants createPants() {
        return new HipsterPants();
    }

    @Override
    public Jacket createJacket() {
        return new HipsterJacket();
    }
}
