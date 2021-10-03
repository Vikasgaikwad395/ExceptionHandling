import java.util.InputMismatchException;
import java.util.Scanner;
public class Calc {

static int num1, num2;
static int memory;
static String operation;
static String menu = "\nChoose an operation:\n+ Add\n- Subtract\n* Multiply\n/ Divide\n^  Exit";
static boolean run = true;

public static void menu (String menu){
    System.out.println (menu);
};

public static void add (int num1, int num2) {
    System.out.println (num1 +num2);}

public static void subtract (int num1, int num2) {
    System.out.println (num1 - num2);           
};

public static void multiply (int num1, int num2) {
    System.out.println (num1 * num2);           
};

public static void divide (int num1, int num2) {
    if (num2 !=0) {
        System.out.println (num1/num2);}
    else{
        System.out.println ("Cannot divide by 0");
    };
};


public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);

    do{
        menu(menu);
        operation = scanner.next();

        try {
        switch (operation) {
            case "+":
                System.out.println ("Enter first number:");
                num1 = scanner.nextInt();
                System.out.println ("Please enter a valid number");
                System.out.println ("Enter second number:");
                num2 = scanner.nextInt();
                add (num1,num2);    
                break;
            case "-":
                System.out.println ("Enter first number:");
                num1 = scanner.nextInt();
                System.out.println ("Enter second number:");
                num2 = scanner.nextInt();
                subtract (num1, num2);
                break;
            case "*":
                System.out.println ("Enter first number:");
                num1 = scanner.nextInt();   
                System.out.println ("Enter second number:");
                num2 = scanner.nextInt();
                multiply (num1, num2);
                break;
            case "/":
                System.out.println ("Enter first number:");
                num1 = scanner.nextInt();
                System.out.println ("Enter second number:");
                num2 = scanner.nextInt();
                divide (num1, num2);
                break;
           
            case "Exit":
                System.out.println("You have exited the calculator");
                System.exit(0);
                run = false;
                break;
            default:
                System.out.println("Invalid");
            }
        }catch (InputMismatchException e) {

        }
    }while(run == true);
}
}

