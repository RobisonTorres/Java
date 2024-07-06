package JavaFundamentalsOOP;

public class CompareObjects {

    public static void main(String[] args) {

        /*For objects, the == operator delves deeper, determining if both references
        point to an identical memory location. It doesn't evaluate content equality.
        Instead, you'll use the equals() method for that purpose.*/
        String name = new String("Bob");
        String name1 = new String("Bob");
        //String nickname = new String("Rob");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
    }
}