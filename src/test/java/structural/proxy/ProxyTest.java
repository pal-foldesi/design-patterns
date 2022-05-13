package structural.proxy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class ProxyTest {

    private final Vault vault = new RestrictedVault();

    @Test
    void emperorPalpatineCannotAccessTheVault() {
        assertThrows(SecurityException.class, () -> vault.access("Emperor Palpatine"));
    }

    @Test
    void vanDammeCanAccessTheVault() {
        assertDoesNotThrow(() -> {
            vault.access("Jean-Claude Van Damme");
        });
    }
}
