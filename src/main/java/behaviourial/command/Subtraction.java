package behaviourial.command;

public class Subtraction implements Command<Integer> {
    private final int operand1;
    private final int operand2;

    public Subtraction(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public Integer execute() {
        return operand1 - operand2;
    }
}
