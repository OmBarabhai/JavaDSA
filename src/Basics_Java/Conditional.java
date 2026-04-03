package Basics_Java;

import java.util.Scanner;

public class Conditional {

    public static void main(String[] args) {
//
        Scanner sc = new Scanner(System.in);
//
//        // 1️⃣ Simple if
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//
//        if (num > 0) {
//            System.out.println("Number is positive");
//        }
//
//        // 2️⃣ if-else
//        if (num % 2 == 0) {
//            System.out.println("Even number");
//        } else {
//            System.out.println("Odd number");
//        }
//
//        // 3️⃣ if-else-if ladder
//        System.out.print("Enter your marks: ");
//        int marks = sc.nextInt();
//
//        if (marks >= 90) {
//            System.out.println("Grade A");
//        } else if (marks >= 75) {
//            System.out.println("Grade B");
//        } else if (marks >= 50) {
//            System.out.println("Grade C");
//        } else {
//            System.out.println("Fail");
//        }
//
//        // 4️⃣ Nested if
//        System.out.print("Enter your age: ");
//        int age = sc.nextInt();
//
//        if (age >= 18) {
//            if (age >= 60) {
//                System.out.println("Senior Citizen");
//            } else {
//                System.out.println("Adult");
//            }
//        } else {
//            System.out.println("Minor");
//        }
//
//        // 5️⃣ Switch case
//        System.out.print("Enter day number (1-7): ");
//        int day = sc.nextInt();
//
//        switch (day) {
//            case 1: System.out.println("Monday"); break;
//            case 2: System.out.println("Tuesday"); break;
//            case 3: System.out.println("Wednesday"); break;
//            case 4: System.out.println("Thursday"); break;
//            case 5: System.out.println("Friday"); break;
//            case 6: System.out.println("Saturday"); break;
//            case 7: System.out.println("Sunday"); break;
//            default: System.out.println("Invalid day");
//        }
//
//        // 6️⃣ Ternary Operator
//        System.out.print("Enter another number: ");
//        int x = sc.nextInt();
//
//        String result = (x > 0) ? "Positive" : "Negative or Zero";
//        System.out.println(result);
//
//        // 7️⃣ Fix for nextLine issue
//        sc.nextLine(); // clear buffer
//        System.out.print("Enter your name: ");
//        String name = sc.nextLine();
//
//        if (name instanceof String) {
//            System.out.println("name is a String type");
//        }else {
//            System.out.println("name is a Not String type");
//
//        }
//
//        // 8️⃣ Nested condition (gender + age)
//        int ageOfPerson = 22;
//        char gender = 'M';
//
//        if (gender == 'M') {
//            System.out.println("Person is Male");
//            if (ageOfPerson > 18) {
//                System.out.println("Person is Male and eligible for vote");
//            } else {
//                System.out.println("Person is Male and NOT eligible for vote");
//            }
//        } else {
//            System.out.println("Person is Not Male");
//            if (ageOfPerson > 18) {
//                System.out.println("Person is Not Male and eligible for vote");
//            } else {
//                System.out.println("Person is Not Male and NOT eligible for vote");
//            }
//        }
//
//        sc.close();
//        int age = sc.nextInt();
//        char gender = sc.next().charAt(0);
//        if(age >= 18){
//            if(gender == 'F') {
//                System.out.println("She is Eligbile for Vote");
//            }else if(gender == 'M'){
//                System.out.println("he is Eligbile for Vote");
//            }
//        }
//        else{
//            if(gender == 'F') {
//                System.out.println("She is Not Eligbile for Vote");
//            }else if(gender == 'M'){
//                System.out.println("he is Not Eligbile for Vote");
//            }
//        }
        int Math = sc.nextInt();
        int English = sc.nextInt();
        int Biology = sc.nextInt();
        int Chemistry = sc.nextInt();
        int Physics = sc.nextInt();
        int total =Math+English+Biology+Chemistry+Physics;
        double percentage =(total/500.0)*100;
        System.out.println("Total Percentage is :" + percentage+"%");



    }
}