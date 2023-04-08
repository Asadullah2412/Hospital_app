import java.util.Scanner;

public class Hospital {

    public static void main(String[] args) {

        System.out.println("--------------------------------------------------------\n\n");
        System.out.println("-----------------Welcome to Hospital--------------------\n\n");

        String name;
        int mobile_number;
        int age;
        double height;
        double weight;
        String result;
        double bmi;

        Scanner user_Name = new Scanner(System.in);
        System.out.print(" Name >>> ");
        name = user_Name.nextLine();

        Scanner user_Moblie_Number = new Scanner(System.in);
        System.out.print(" Mobile Number >>> ");
        mobile_number = user_Moblie_Number.nextInt();

        Scanner user_age = new Scanner(System.in);
        System.out.print(" Age >>> ");
        age = user_age.nextInt();

        Scanner user_height = new Scanner(System.in);
        System.out.print(" Height (M) >>> ");
        height = user_height.nextDouble();

        Scanner user_weight = new Scanner(System.in);
        System.out.print(" Weight (KG) >>> ");
        weight = user_weight.nextDouble();

        bmi = weight / (height * height);
        result = "";

        if (bmi < 18.5) {
            result = " UNDER WEIGHT ";
        }
        if (18.5 < bmi & bmi < 24.9) {
            result = " NORMAL WEIGHT ";
        }
        if (25 < bmi & bmi < 29.9) {
            result = " OVER WEIGHT ";
        }
        if (30 < bmi) {
            result = " OBESITY ";
        }

        System.out.println("\n\n Your calculated BMI is  >>> " + bmi);
        System.out.println("\n" + result);
        System.out.println(" Thank you for visiting us ");
        System.out.println("\n\n" + name + " " + mobile_number + " " + age);

        user_Name.close();
        user_Moblie_Number.close();
        user_age.close();
        user_height.close();
        user_weight.close();

    }
}
// Underweight = <18.5
// Normal weight = 18.5–24.9
// Overweight = 25–29.9
// Obesity = BMI of 30 or greater