package basics.examples;

public class EvenOrOdd {
    public static void main(String[] args) {
        for (int number = 1; number <= 10; number++) {
            if (number % 2 == 0) {
                System.out.println(number + " is a Even Number.");
            } else {
                System.out.println(number + " is an Odd Number.");
            }
        }
    }
}
