import java.util.*;

class OE3 {

    static void printArray(int[] numbers) {
        String display = Arrays.toString(numbers);
        System.out.println(display);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // creating of array
        System.out.print("How many size of an array : ");
        int size = in.nextInt();
        int numbers[] = new int[size];
        for (int x = 0; x < numbers.length; x++) {
            System.out.print("Value [" + x + "] = ");
            numbers[x] = in.nextInt();
        }
        System.out.println("\nThe Listed Array: ");
        printArray(numbers);

        // searching array
        bubbleSort(numbers);
        printArray(numbers);
        System.out.println("\nInput Search Array: ");
        int value = in.nextInt();
        System.out.println("SEARCHING...\n.\n.\n.");
        if (!binarySearch(numbers, value)) {
            System.out.println("\nOooopppsss. Sorry your input is not on the list.");
        } else {
            System.out.println("\nCongrats. The input is on the list.");
        }
        in.close();
    }// end of main method

    static void bubbleSort(int[] numbers) {
        System.out.println("\nSORTING IS NOW STARTING...");
        for (int i = 0; i < numbers.length; i++) {
            boolean flag = false;
            for (int j = 0; j < numbers.length - 1; j++) {
                // if the numbers is not in order
                if (numbers[j] > numbers[j + 1]) {
                    flag = true;
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
            if (!flag) {
                System.out.println("Sorting is Done! :D");
                return;
            }
        }
        System.out.print("Done sorting! :D");
    }// bubblesort method

    // BINARY SEARCH
    static boolean binarySearch(int[] numbers, int value) {
        int low = 0;
        int high = numbers.length - 1;

        while (high >= low) {
            int middle = (low + high) / 2;

            if (numbers[middle] == value) {
                return true;
            }
            if (numbers[middle] < value) {
                low = middle + 1;
            }
            if (numbers[middle] > value)
                high = middle - 1;
        } // end of while loop

        return false;
    }
}