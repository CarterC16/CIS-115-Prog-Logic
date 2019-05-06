import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);

    // customerName program
    String customerName;
    System.out.println("Welcome to the Good Burger home of the Good Burger please type name customer? ");
    //customerName = keyboard.next();
    customerName = keyboard.nextLine();
    //System.out.println("Comeback Agian to the Good Burger, " + customerName);


    //meal cost
    // get the cost of the meal

    double mealCost = 0;
    System.out.println("How much did your meal cost: ");
    mealCost = keyboard.nextInt();
    //System.out.println("Your meal costed: "+ mealCost);

    // give a tip
    double tipPct = 0;
    double tenPercent = (double) 10 / 1000;
    // 10%
    System.out.println("Please enter how much the meal costed to give a tip: ");
    tipPct = keyboard.nextDouble();
    tipPct = tipPct * tenPercent;


    // tax time 
    double taxCost = 0;
    double fivePercent = (double) 5/ 1000;
    System.out.println("Please enter how much the meal costed to for tax: ");
    taxCost = keyboard.nextDouble();
    taxCost = taxCost * fivePercent;
    /*
    //total ampunt 
    double finalCost = 0;
    finalCost = keyboard.nextDouble();
    finalCost =  mealCost + tipPct +  taxCost;
*/

    System.out.println("Your meal costed: "+ mealCost);

    System.out.println("Tax is: " + taxCost);

    System.out.println("Tip is: " + tipPct);

    System.out.println("type any letter/number and then  hit enter to continue");

        //total ampunt 
    double finalCost = 0;
    finalCost = keyboard.nextDouble();
    finalCost =  mealCost + tipPct +  taxCost;

    System.out.println("The total of everything is: "+ finalCost);

    System.out.println("Thank you and comeback Agian to the Good Burger, " + customerName);
    

  }
}
