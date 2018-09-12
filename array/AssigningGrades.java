/**
 * The problem is to wrinte a program that reads student scores, gets the best score,
 * and then assigns grades based on the following scheme.
 * 
 *  Grade is A if score is >= best - 10;
 *  Grade is B if score is >= best - 20;
 *  Grade is C if score is >= best - 30;
 *  Grade is D if score is >= best - 40;
 *  Grade is F otherwise
 */

 import java.util.Scanner;

 class AssigningGrades {
     public static void main(String args[]) {
         Scanner scanner = new Scanner(System.in);
         int marks[], grades[], size, best;
         System.out.println("Enter number of students: ");
         size = scanner.nextInt();
         marks = new int[size];
         grades = new int[size];

         System.out.println("Enter their marsk");
         for(int i = 0; i < size; i++) {
             marks[i] = scanner.nextInt();
         }

         best = marks[0];

         for(int i = 1; i < size; i++) {
             if (marks[i] > best) {
                 best = marks[i];
             }
         }

         System.out.println("Best marks is: " + best);

         // print Grades
         for(int i = 0; i < size; i++) {
             int difference = best - marks[i];
             char grade = 'F';
             if (difference <= 10) {
                 grade = 'A';
             } else if (difference > 10 && difference <= 20) {
                 grade = 'B';
             } else if (difference > 20 && difference <= 30) {
                 grade = 'C';
             } else if (difference > 30 && difference <= 40) {
                 grade = 'D';
             }
             System.out.println("Mark: " + marks[i] + " Grade: " + grade);
         }
     }
 }
