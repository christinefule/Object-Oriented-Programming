import java.util.Scanner;

public class receipt {
    public static String cost;

    // Misc methods
    public static void askUser() {
        System.out
                .println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~\n\tWelcome To SM San Pablo City Laguna ");
        System.out.println(
                "National Hwy, San Pablo City, 4000 Laguna\n~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("POS#: PC #3");
        System.out.println("Date: 5/27/2022\t\tTime: 11:48am");
    }

    public static void main(String[] args) {

        try (Scanner in = new Scanner(System.in)) {
            String ItemNo, program, cashiername, item;

            askUser();
            System.out.print("Cashier: ");
            cashiername = in.nextLine();
            System.out.print("Items: ");
            item = in.nextLine();
            System.out.print("No. of Item/s: ");
            program = in.nextLine();
            Smstore s1 = new Smstore(item, program);

            System.out.println(
                    "\n\n***********************************************\n\t\tCustomer Receipt\n*********************************************\n");
            System.out.println("Cashier's Name: " + s1.getCashierName());
            System.out.println("DEPARTMENT: " + s1.getDepartment());
            System.out.println("Purchase Items: " + s1.getPurchase());
            System.out.println("No. of Items: " + s1.getItemNo());
            System.out.print("Total Cost: ");
            cost = in.nextLine();
            System.out.println("=================================");
            System.out.print("Customer's Payment: ");
            program = in.nextLine();
            s1.setProgram(program);
            System.out.println("\nAmount Received: " + s1.getPurchase());
        }

        System.out.println("\nTHANK YOU FOR SHOPPING!\n");

    }
}