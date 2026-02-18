import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timeCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interest rate (in %): ");
        rate = scanner.nextDouble() / 100;

        System.out.print("Enter the # of times Compounded per years: ");
        timeCompounded = scanner.nextInt();

        System.out.print("Enter the # numbers of years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timeCompounded, timeCompounded * years);
        System.out.printf("The amount after %d is: %.2f", years, amount);


    }
}
