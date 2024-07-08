package JavaFundamentalsOOP;

class Add {

    // Method overloading - same method name with different parameters
    int addNumber(int a, int b){
        return a + b;
    }
    int addNumber(int a, int b, int c){
        return  a + b + c;
    }
}

class Calculator extends Add{

    // Overriding the method to modify its behavior in the subclass
    @Override
    int addNumber(int a, int b){
        return a + b + 10;
    }
}

public class MethodOverLoading {

    public static void main(String[] args){

        Add sum1 = new Add();
        System.out.println(sum1.addNumber(5, 10));
        System.out.println(sum1.addNumber(7, 15, 20));
        System.out.println(sum1.addNumber(1, 11, 3));
        Calculator calc = new Calculator();
        System.out.println(calc.addNumber(8,5));
    }
}
