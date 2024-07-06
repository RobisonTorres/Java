package JavaFundamentalsOOP;

public class TestFree {


    public static void main(String[] args) {
        int maxValue = Integer.MAX_VALUE;
        int overflow = maxValue + 1;

        String name = new String("Bob");
        String name1 = new String("Bob");
        //String nickname = new String("Rob");

        System.out.println(name == name1);
        System.out.println(name.equals(name1));
    }
}
