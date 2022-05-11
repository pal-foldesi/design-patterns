package creational.abstract_factory;

import creational.abstract_factory.factory.ClothingFactory;
import creational.abstract_factory.factory.GothClothingFactory;
import creational.abstract_factory.factory.HipsterClothingFactory;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;

class AbstractFactoryTest {

    @Test
    void canUseGothClothingFactory() {
        ClothingFactory gothClothingFactory = new GothClothingFactory();
        assertDoesNotThrow(gothClothingFactory::createJacket);
    }

    @Test
    void canUseHipsterClothingFactory() {
        ClothingFactory hipsterClothingFactory = new HipsterClothingFactory();
        assertDoesNotThrow(hipsterClothingFactory::createPants);
    }
}
