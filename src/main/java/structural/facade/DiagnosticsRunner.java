package structural.facade;

public interface DiagnosticsRunner {
    default String run() {
        return "Running diagnostics...";
    }
}
