package JavaFundamentalsOOP;

abstract class Vehicle {

    private String maker;
    private String model;

    public Vehicle(String maker, String model){
        this.maker = maker;
        this.model = model;
    }

    public abstract void start();

    public abstract void stop();

    public String getMaker(){
        return maker;
    }

    public String getModel(){
        return model;
    }
}

class Car extends Vehicle{

    public Car(String maker, String model){
        super(maker, model);
    }

    @Override
    public void start(){
        System.out.println("The car starts.");
    }

    @Override
    public void stop(){
        System.out.println("The car stops.");
    }
}

class Motorcycle extends Vehicle{

    public Motorcycle(String maker, String model){
        super(maker, model);
    }

    @Override
    public void start(){
        System.out.println("The motorcycle starts.");
    }

    @Override
    public void stop(){
        System.out.println("The motorcycle stops.");
    }
}

public class AbstractionExampleII {

    public static void main(String[] args){

        Car alphaCar = new Car("Toyota", "Camry");
        Motorcycle betaMotor = new Motorcycle("Honda", "CBR 1000");
        alphaCar.start();
        alphaCar.stop();
        System.out.println(alphaCar.getModel());
        System.out.println();
        betaMotor.start();
        betaMotor.stop();
        System.out.println(betaMotor.getMaker());
    }
}