package com.sapunka;

import java.util.Scanner;
//Modification of Student Mark Sheet
public class Main {

//Program to get student mark sheet and read letter grade Using array and Input Scanner
    public static void main(String[] args) {
//	create a scanner
        Scanner input = new Scanner(System.in);

//        Get number of students
        System.out.println("\n PLEASE SAPUNKS enter the number of STUDENTS that took the EXAMS: ");
        int numberOfStudents = input.nextInt();
        int[] scores = new int[numberOfStudents]; //Array scores
        int best = 0; // the best score
        String letter_grade; // The grade

//        Reade scores and find the best  score
        for (int i = 0; i < scores.length; i++){
            System.out.println("Please enter a score: ");
            scores[i] = input.nextInt();

            if (scores[i] > best)
                best = scores[i];
        }
//        Declare and initialize the output string
        StringBuilder output = new StringBuilder();

//        Assigning and displaying grades
        for (int i = 0; i < scores.length; i++){
            if (scores[i] >= 100)
               letter_grade = "A+ = DISTINCTION";
            else if (scores[i] >= 85)
                letter_grade = "A = FIRST DIVISION";
            else if (scores[i] >= 75)
                letter_grade = "B+ SECOND DIVISION UPPER";
            else if (scores[i] >= 65)
                letter_grade = "B = SECOND DIVISION";
            else if (scores[i] >= 55)
               letter_grade = "C+ = THIRD DIVISION UPPER";
            else if (scores[i] >= 45)
                letter_grade = "C = THIRD DIVISION";
            else if (scores[i] >= 40)
                letter_grade = "D = IS PASS";
            else
                letter_grade = "F = FAIL meaning Student should repeat the COURSE";

//           Displaying the mark sheet for various students
        output.append("Student ").append(i).append(" score is ").append(scores[i]).append(" and letter grade is ").append(letter_grade).append("\n");
        }

//        Display the result
        System.out.println("*****STUDENT MARK SHEET DETAILS********");
        System.out.println(output);
        System.out.println("END of sheet ..................");
    }
}
