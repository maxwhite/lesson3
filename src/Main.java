public class Main {
    public static void main(String[] args) {

        int operand1 = 1;
        int operand2 = 2;

        int sum = operand2 + operand1;
        int subtraction = operand2 - operand1;
        int multiplication = operand2 * operand1;
        double division = (double) operand1 / (double) operand2;

        System.out.println("Operand1 = " + operand1 + "\n" + "Operand2 = " + operand2 + "\n");
        System.out.println("Sum = " + sum);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);

    }
}
