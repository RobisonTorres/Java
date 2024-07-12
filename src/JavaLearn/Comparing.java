package JavaLearn;

class Animal4 {
    String name;
    Animal4 (String n) {
        name = n;
    }
}

class Equals {
    public static void main(String[ ] args) {
        Animal4 a1 = new Animal4("Robby");
        Animal4 a2 = new Animal4("Robby");
        System.out.println(a1 == a2);
    }
}
