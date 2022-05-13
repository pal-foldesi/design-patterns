package structural.facade;

public interface DatabaseConnector {
    default String connect() {
        return "Connecting to database...";
    }
}
