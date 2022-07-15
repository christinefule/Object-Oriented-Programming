import java.util.Scanner;

public class PeraPadala {

    public static void main(String[] args) {
        String input;
        Scanner in = new Scanner(System.in);

        boolean repeat = true;

        // MAIN LOOP
        while (repeat) {
            System.out.println("\t\tWelcome to Express Money Exchange. Walang Palya Basta Kayo!\n");
            System.out.print("The available transactions are :\n");
            System.out.println("1) Peso to Euro\t\t2) Peso to Dollar\t\t3) Euro to Peso\t\t4) Dollar to Peso\n\n");
            System.out.print("Amount:  ");
            input = in.nextLine();
            if (input.matches("\\s*.\\s*\\s[ped]t[ped]")) {
                Exmoney c = new Exmoney(Amount(input), C1(input), C2(input));
                c.printRates();
                c.printConvertion();
                System.out.print("You will Receive: " + c.getCAmount() + " " + c.getCurrency2() + " only"
                        + "\n\nThank you for trusting this money changer! :)\n\n");
            }
        }
        in.close();
    }

    public static String reverseString(String str) {
        char ch[] = str.toCharArray();
        String rev = "";
        for (int a = ch.length - 1; a >= 0; a--) {
            rev += ch[a];
        }
        return rev;
    }

    public static double Amount(String input) {
        String a1 = "2.00";
        for (int a = 0; a < input.length(); a++) {
            if (input.charAt(a) == ' ') {
                a1 = input.substring(0, a - 1);
            }
        }
        double amount = Double.parseDouble(a1);
        return amount;
    }

    public static String C1(String input) {
        String c1 = reverseString(input);
        if (c1.charAt(2) == 'p')
            return "Peso";
        else if (c1.charAt(2) == 'd')
            return "Dollar";
        else if (c1.charAt(2) == 'e')
            return "Euro";
        return "";
    }

    public static String C2(String input) {
        String c1 = reverseString(input);
        if (c1.charAt(0) == 'p')
            return "Peso";
        else if (c1.charAt(0) == 'd')
            return "Dollar";
        else if (c1.charAt(0) == 'e')
            return "Euro";
        return "";
    }
}