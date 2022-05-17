package behaviourial.template_method;

abstract class Dancer {
    public static final String CONCATENATOR = " | ";

    public String dailyRoutine() {
        return warmUp() + CONCATENATOR + dance() + CONCATENATOR + relax();
    }

    private String warmUp() {
        return "Stretching limbs...";
    }

    abstract String dance();

    private String relax() {
        return "Stretching limbs, doing yoga, doing breathing exercises...";
    }
}
