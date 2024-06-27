package application;

import util.CurrencyConverter;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is de dollar price: ");
        double dollarPrice = sc.nextDouble();

        System.out.print("How many dollars will bought? ");
        double amount = sc.nextDouble();
        double result = CurrencyConverter.dollarToReal(amount, dollarPrice);

        System.out.printf("Amount to be paind in reais = %.2f%n", result);

        sc.close();
    }
}
