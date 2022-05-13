package structural.facade;

public interface ConfigurationValidator {
    default String validate() {
        return "Validating configuration...";
    }
}
