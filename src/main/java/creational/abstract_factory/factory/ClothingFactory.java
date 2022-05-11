package creational.abstract_factory.factory;

import creational.abstract_factory.product.Jacket;
import creational.abstract_factory.product.Pants;

public interface ClothingFactory {
    Pants createPants();

    Jacket createJacket();
}
