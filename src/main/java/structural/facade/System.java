package structural.facade;

public class System {
    private final ConfigurationValidator validator = new ConfigurationValidator() {
    };
    private final DatabaseConnector connector = new DatabaseConnector() {
    };
    private final DiagnosticsRunner runner = new DiagnosticsRunner() {
    };

    public String prime() {
        return validator.validate() + "\n" + connector.connect() + "\n" + runner.run();
    }
}
