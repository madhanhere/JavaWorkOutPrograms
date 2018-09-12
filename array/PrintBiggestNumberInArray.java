// The problem is to write a program that reads six integers, find the largest of them.
// and counts its occurences. Suppose that you entered 3, 5, 2, 5, 5, 5; the program
// finds that the largest is 5 and the occurrence count for 5 is 4

import java.util.Scanner;
class PrintBiggestNumberInArray {
    public static void main(String args[]) {
        int biggestNumber, size, count = 1;
        int numbers[];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter array size: ");
        size = scanner.nextInt();
        numbers = new int [size];
        System.out.println("Enter elements: ");
        for(int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }

        biggestNumber = numbers[0];
        // find biggest number
        for(int i = 1; i < size; i++) {
            if (biggestNumber < numbers[i]) {
                biggestNumber = numbers[i];
                count = 1;
            } else if (biggestNumber == numbers[i]) {
                ++count;
            }
        }

        System.out.println("Biggest number " + biggestNumber);
        System.out.println("It comes " + count + " time(s)");
    }
}
