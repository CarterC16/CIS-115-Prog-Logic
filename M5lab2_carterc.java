import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    /*
    // example 1
    // double a number 
    // setup Scanner
    Scanner keyboard = new Scanner(System.in);
    // variable to store number 
    int number;
    //ask  the user for the number
    System.out.println("please enter a number");
    number = keyboard.nextInt();
    // do math
    number = number * 2;
    // print the output
    System.out.println("The answer is:");
    System.out.println(number);
    */

    // example 2
    //Scanner keyboard = new Scanner(System.in);
    /*
    // take 10 percent
    double num;
    //double tenPercent = 10.0 / 100.0
    //double tenPercent = 0.10; // 10%
    double tenPercent = (double) 10 / 100;

    System.out.println("Enter a number to take 10% of");
    num = keyboard.nextDouble();
    num = num * tenPercent;
    System.out.println("10% is: " + num);
    */

    // greet by name
    /*
    String name;
    System.out.println("Hi, I'm a Java program");
    System.out.println("What's your name?");
    //name = keyboard.next();
    name = keyboard.nextLine();
    System.out.println("Nice to meet you, " + name);
    */

    Scanner keyboard = new Scanner(System.in);


    // gross pay
    // get the hours worked 
    double hoursWorked = 0;
    // get the hourly salary
    double salaryPerHour = 0;

    //ask for hour worked 
    System.out.println("how many hours have you worked:");
    hoursWorked = keyboard.nextDouble();
    //ask for hourly salary
    System.out.println("What is the hourly salary:");
    salaryPerHour = keyboard.nextDouble();

    // multiply them together to get gross pay
    double grossPay = hoursWorked * salaryPerHour;
    System.out.println("Your gross pay this week is:");
    System.out.println(grossPay);


  }
}