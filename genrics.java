package Lab;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Genrics {
	private static double calculateSum(List<Number> list) {
	        double sum = 0;
	        for (Number num : list) {
	            sum += num.doubleValue();
	        }
	        return sum;
	    }

	private static void sortList(List<Number> list) {
	        Collections.sort(list, (n1, n2) -> Double.compare(n1.doubleValue(), n2.doubleValue()));
	    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Number> numberList = new ArrayList<>();

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Accept and add integers");
            System.out.println("2. Accept and add doubles");
            System.out.println("3. Calculate sum");
            System.out.println("4. Sort");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter integers (0 to stop): ");
                    int num;
                    while ((num = scanner.nextInt()) != 0) {
                        numberList.add(num);
                    }
                    break;
                case 2:
                    System.out.print("Enter doubles (0 to stop): ");
                    double dbl;
                    while ((dbl = scanner.nextDouble()) != 0) {
                        numberList.add(dbl);
                    }
                    break;
                case 3:
                    if (!numberList.isEmpty()) {
                        double sum = calculateSum(numberList);
                        System.out.println("Sum: " + sum);
                    } else {
                        System.out.println("List is empty. Please add numbers first.");
                    }
                    break;
                case 4:
                    if (!numberList.isEmpty()) {
                        sortList(numberList);
                        System.out.println("Sorted list: " + numberList);
                    } else {
                        System.out.println("List is empty. Please add numbers first.");
                    }
                    break;
                case 5:
                    scanner.close();
                    System.out.println("Exiting the program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
