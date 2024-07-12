package JavaLearn;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Throw2{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        /* Syntax
        try {
            some code
        } catch (ExceptionType1 e1) {
        Print catch block
        } catch (ExceptionType2 e2) {
        Print catch block
        } catch (ExceptionType3 e3) {
        Print catch block
        }
        */

        try {
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
	        /*
	        1. Error: division by zero
	        2. Error: wrong value type
	        */
            //your code goes here
            System.out.println(num1/ num2);

        } catch(InputMismatchException e1){
            System.out.println("Mistake: wrong value type");

        } catch(ArithmeticException e2) {
            System.out.println("Mistake: division by zero");

        }
    }
}