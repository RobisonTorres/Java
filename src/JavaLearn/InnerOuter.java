package JavaLearn;

class OuterClass {
        int x = 10;
    class InnerClass {
        int y = 5;
    }
}
    /* To access the inner class, create an object of the outer class,
    and then create an object of the inner class:
     */
    public class InnerOuter {
        public static void main(String[] args) {
            OuterClass myOuter = new OuterClass();
            OuterClass.InnerClass myInner = myOuter.new InnerClass();
            System.out.println(myInner.y + myOuter.x);
        }
    }
