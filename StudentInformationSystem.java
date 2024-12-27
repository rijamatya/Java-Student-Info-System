package basic;
import java.util.Scanner;
public class StudentInformationSystem {
    public static void main(String[] args) {
        System.out.println("Hello World! ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name: ");
        String name = scanner.nextLine();
        System.out.println("Age: ");
        int age = scanner.nextInt();
        System.out.println("Gender: ");
        String gender = scanner.next();
        System.out.println("English: ");
        int english = scanner.nextInt();
        System.out.println("Maths: ");
        int maths = scanner.nextInt();
        System.out.println("Social: ");
        int social = scanner.nextInt();
        int total = english+maths+social;
        double avg=total/3;
        scanner.close();
        System.out.println("Total Marks: "+ total);
        System.out.println("Average Marks: "+ avg);
        if (avg<40) {
            System.out.println("Result : Fail!");
        }
        else{
            System.out.println("Result : Pass!");
        }
        if (avg>=90){
            System.out.println("Grade: A+");
        }
        else if (avg>=80 && avg<90){
            System.out.println("Grade: A");
        }
        else if (avg>=70 && avg<80){
            System.out.println("Grade: B+");
        }
        else if (avg>=60 && avg<70){
            System.out.println("Grade: B");
        }
        else if (avg>=50 && avg<60){
            System.out.println("Grade: C+");
        }
        else if (avg>=40 && avg<50){
            System.out.println("Grade: C");
        }
        else {
            System.out.println("Grade: F");
        }





    }
}
