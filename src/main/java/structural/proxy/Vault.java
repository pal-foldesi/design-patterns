package structural.proxy;

import java.util.List;

public interface Vault {
    List<String> access(String user);
}
