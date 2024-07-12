package JavaLearn;

class Polymorphism2 {
    public static void main(String[] args) {

        Vehicle1 vehicle = new Vehicle1();
        Vehicle1 electric = new ElectricVehicle();
        Vehicle1 hybrid = new HybridVehicle();

        //calls
        vehicle.start();
        vehicle.resource();
        electric.start();
        electric.resource();
        hybrid.start();
        hybrid.resource();
    }
}
class Vehicle1 {
    public void start(){
        System.out.println("Starting");
    }
    public void resource(){
        System.out.println("I use petrol");
    }
}

class ElectricVehicle extends Vehicle1 {
    public void resource(){
        System.out.println("I use electricity");
    }
    /*reimplement resource() method
    to output "I use electricity"*/

}

class HybridVehicle extends Vehicle1 {
    public void resource() {
        System.out.println("I use both petrol and electricity");
    /*reimplement resource() method
    to output "I use both petrol and electricity"*/
    }
}