package day02;
import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Class Grade Analyzer System");

        System.out.println("How many students are in class?");
        int numberOfStudents = scanner.nextInt();

        int[] grades = new int[numberOfStudents];
        String[] names = new String[numberOfStudents];

        for(int i = 0; i < numberOfStudents; i++){
            System.out.print((i + 1) + "Name of Student:");
            names[i] = scanner.next();

            System.out.println((i + 1) + "Grade of Student:");
            grades[i] = scanner.nextInt();
        }

        System.out.println("Analyzes Report");

        //Calculating Algorithms

        int total = 0;
        int max = grades[0];
        int min = grades[0];
        String mostSuccessStudent = names[0];

        for (int i = 0; i < grades.length; i++){
            total += grades[i];


            //Max finding algorithm
            if(grades[i] > max){
                max = grades[i];
                mostSuccessStudent = names[i];
            }

            //Min finding algorithm

            if(grades[i] < min){
                min = grades[i];
            }
        }



        double avarage = (double) total / numberOfStudents;

        System.out.println("Class avarage: " + avarage);
        System.out.println("Highest Score: " + max);
        System.out.println("Lowest Score: " + min);

        for(int i = 0; i < grades.length; i++){
            if(grades[i] > avarage){
                System.out.println("name: " + names[i] + "\ngrade: " + grades[i]);
            }
        }

    scanner.close();
    }
}
