package JavaLearn;

public class Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 50, 30, 40};

        cars[0] = "Toshiba";  // To replace a value.
        System.out.println(cars[0]);

        System.out.println(cars.length);  // To show the length of an array.

        for (String brand : cars) {
            System.out.println(brand);  // To Loop through a list.
        }

        // Multidimensional Arrays.
        int[][] myNumbers = {{10, 20, 30, 40}, {5, 100, 15, 22}};
        System.out.println(myNumbers[0][1]);  // Output - 20

    }
}
