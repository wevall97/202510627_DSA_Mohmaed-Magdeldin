
// My roll number: 202510627

import  java.util.*;
public class Restaurant_bill {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String name;
        int age=1;
        double price=100;
        double num_drink=1;
        boolean check;
        int rat=3;
        double tip=5.0;
        double descount=0;

        System.out.print("Enter your name: ");
        name=input.nextLine();
        System.out.print("Enter your age: ");
        age=input.nextInt();
        System.out.print("Enter the price of the meal: ");
        price=input.nextDouble();
        System.out.print("Enter the number of the drinks : ");
        num_drink=input.nextDouble();
        System.out.print("Are you a studant? (true or false): ");
        check=input.nextBoolean();
        System.out.print("Enter your rat: ");
        rat=input.nextInt();


        if (rat<1 || rat>5) {
            System.out.println("You must inter a rat between(1-5)");
        }
        else{
            num_drink=15.50*num_drink;
            double total=num_drink+price;
            if (check) {
                descount=(10*total)/100;
                total=total-descount;
            }
            if (!check && age>=60) {
                descount=(5*total)/100;
                total=total-descount;
            }

            if (rat == 4 || rat == 5){
                tip=(10*tip)/100;
            }
            System.out.println("\n\n");
            System.out.println("Customer: "+name);
            System.out.println("Meal: $"+price);
            System.out.println("Drinks: $"+num_drink);
            System.out.println("Discount: $"+descount);
            System.out.println("Tip: $"+tip);
            System.out.println("Whole amount: $"+total);
        }
        input.close();
}
}