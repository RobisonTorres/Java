package JavaAdvancedOOP;

public class Calculator{

    public int add(int a, int b){
        return a+b;
    }

    public int subtraction(int a, int b){
        return a-b;
    }

    public static void main(String[] args){

        Calculator calc = new Calculator();
        int resultAdd = calc.add(5, 5);
        int resultSubtraction = calc.subtraction(5, 5);
        System.out.println("Addition Result: " + resultAdd);
        System.out.println("Subtraction Result: " + resultSubtraction);
    }
}
