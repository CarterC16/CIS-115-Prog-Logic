import java.util.Scanner;

public class Main {

  public static void ketchup() {
    // show the user choose of ketchup on their Hot Dog
    System.out.println("You have choosen ketchup");
  }

  public static void mustard() {
    // show the user choose of mustard on their Hot Dog
    System.out.println("You have choosen mustard");
  }

  public static void BBQsauce() {
    // show the user choose of BBQsauce on their Hot Dog
    System.out.println("You have choosen BBQsauce");
  }

    public static void ALL() {
    // show the user choose of all on their Hot Dog
    System.out.println("You have choosen all three sauces");
  }

  public static void main(String[] args) {
    // this program is an ATM Simulator
    // you can add money, withdraw, and check your balance
    System.out.println("Welcome to the Dog House");
    System.out.println("--------------------");
    System.out.println("1. ketchup");
    System.out.println("2. mustard");
    System.out.println("3. BBQsauce");
    System.out.println("4. ALL");
    System.out.println("5. Exit");

    // ask user to input menuChoice
    Scanner keyboard = new Scanner(System.in);
    int menuChoice = keyboard.nextInt();

    if (menuChoice == 1) 
    {
      ketchup();
    }
    else if (menuChoice == 2) 
    {
      mustard();
    }
    else if (menuChoice == 3)
    {
      BBQsauce();
    }
    else if (menuChoice == 4)
    {
      ALL(); BBQsauce(); ketchup(); mustard();
    }
    else if (menuChoice == 5) 
    {
      System.out.println("End program");
    }

  }
}
