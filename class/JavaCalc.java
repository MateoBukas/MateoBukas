// Calc with constraints 
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        String operator;
        int num1, num2, intresult;
        double number1, number2, result;
        double floatresult;
        String string1, string2, stringResult;

        // create an object of Scanner class
        Scanner input = new Scanner(System.in);

        // ask users to enter operator
        System.out.println("List of operations: add subtract multiply divide alphabetize\nEnter an operation:");
        operator = input.next();
        if (operator.toLowerCase().equals("add") || operator.toLowerCase().equals("subtract") ||
                operator.toLowerCase().equals("divide") || operator.toLowerCase().equals("multiply") ||
                operator.toLowerCase().equals("alphabetize")) {
            if (operator.equalsIgnoreCase("alphabetize")) {
                System.out.println("Enter two words:");
                string1 = input.next();
                string2 = input.next();
                if (string1.compareToIgnoreCase(string2) < 0) {
                    System.out.println("Answer: " + string1 + " comes before " + string2 + " alphabetically.");
                } else if (string1.compareToIgnoreCase(string2) > 0) {
                    System.out.println("Answer: " + string2 + " comes before " + string1 + " alphabetically.");
                } else {
                    System.out.println("Answer: Chicken or Egg.");
                }
            } else {
                // ask users to enter numbers
                if (operator.equalsIgnoreCase("add")) {
                    System.out.println("Enter two integers:");
                } else if (operator.equalsIgnoreCase("subtract")) {
                    System.out.println("Enter two integers:");
                } else if (operator.equalsIgnoreCase("divide")) {
                    System.out.println("Enter two doubles:");
                } else if (operator.equalsIgnoreCase("multiply")) {
                    System.out.println("Enter two doubles:");
                }

                try {
                    switch (operator) {
                        case "add":
                            num1 = input.nextInt();
                            num2 = input.nextInt();
                            intresult = num1 + num2;
                            System.out.println("Answer: " + intresult);
                            break;
                        case "subtract":
                            num1 = input.nextInt();
                            num2 = input.nextInt();
                            intresult = num1 - num2;
                            System.out.println("Answer: " + intresult);
                            break;
                        case "multiply":
                            number1 = input.nextDouble();
                            number2 = input.nextDouble();
                            result = number1 * number2;
                            System.out.println("Answer: " + result);
                            break;
                        case "divide":
                            number1 = input.nextDouble();
                            number2 = input.nextDouble();
                            floatresult = number1 / number2;
                            System.out.println("Answer: " + floatresult);
                            break;
                    }
                }
                catch (Exception e){
                    System.out.println("Invalid input entered. Terminating...");
                }

            }

        } else {
            System.out.println("Invalid input entered. Terminating...");
            // input.close();
        }
    }
}
