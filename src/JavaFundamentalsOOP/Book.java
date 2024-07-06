package JavaFundamentalsOOP;

/*
Challenge 1: Basic – Create a Simple Class - "BookClass1"
1 - Design a class named Book with two attributes: title and author.
2 - Implement a method showBookInfo which prints the book's title and author.
3 - Instantiate the class and call the method to display a book's details.
*/

class BookClass1 {

    String title;
    String author;

    void showBookInfo1() {
        System.out.println("Book - " + title + "\n" + "Written by: " + author + '\n');
    }
}

/*
Challenge 2: Intermediate – Working with Default Constructors
1 - Using the Book class from Challenge 1, create a default constructor
that initializes the title and author to "Unknown".
2 - Instantiate the class without passing any arguments and use the
showBookInfo method. Verify that it displays "Unknown" for both title and author.
*/

class BookClass2 {

    String author;
    String title;

    // Default constructor initializing the attributes to "Unknown"
    BookClass2() {

        author = "Unknown";
        title = "Unknown";
    }

    void showBookInfo2() {
        System.out.println("Book - " + title + "\n" + "Written by: " + author + '\n');
    }
}

/*
Challenge 3: Intermediate – Introducing Parameterized Constructors
1 - Enhance the Book class to have a parameterized constructor that
accepts the title and author of the book.
2 - Instantiate the class by passing specific book details and then
use the showBookInfo method. Ensure it displays the passed details correctly.
*/

class BookClass3{

    String author;
    String title;

    // Parameterized constructor accepting title and author
    BookClass3(String a, String t){

        author = a;
        title = t;
    }

    void showBookInfo3() {
        System.out.println("Book - " + title + "\n" + "Written by: " + author + '\n');
    }
}

/*
Challenge 4: Advanced – Constructor Overloading
1 - In the Book class, add another parameterized constructor that
only accepts a title (the author is set to "Unknown").
2 - Create objects using both constructors to ensure overloading
works as expected.
*/

class BookClass4 {

    String author;
    String title;

    // Parameterized constructor accepting title and author
    BookClass4(String t){

        author = "Unknown";
        title = t;
    }

    // Overloading Constructor
    BookClass4(String a, String t){

        author = a;
        title = t;
    }

    void showBookInfo4(){
        System.out.println("Book - " + title + "\n" + "Written by: " + author + '\n');
    }
}

/*
Challenge 5: Expert – this Keyword in Action
1 - Modify the Book class so that the parameter names in the constructors
are the same as the class attributes.
2 - Utilize the "this" keyword to differentiate between instance variables
and constructor parameters.
3 - Instantiate the class and verify that attributes are still correctly initialized.
*/

class BookClass5 {

    String author;
    String title;

    BookClass5(String author, String title){

        this.author = author;
        this.title = title;
    }

    void showBookInfo5(){
        System.out.println("Book - " + title + "\n" + "Written by: " + author + '\n');
    }
}

public class Book {

    public static void main(String[] args){

        System.out.println("Challenge - 1");
        BookClass1 firstBook = new BookClass1();
        firstBook.author = "Tolkien";
        firstBook.title = "The Lord Of Rings";
        firstBook.showBookInfo1();

        System.out.println("Challenge - 2");
        BookClass2 secondBook = new BookClass2();
        secondBook.showBookInfo2();

        BookClass2 secondBook2 = new BookClass2();
        secondBook2.author = "S. Collins";
        secondBook2.title = "Hungry Games III";
        secondBook2.showBookInfo2();

        System.out.println("Challenge - 3");
        BookClass3 thirdBook = new BookClass3("Tolkien", "The Hobbit");
        thirdBook.showBookInfo3();

        System.out.println("Challenge - 4");
        BookClass4 fourthBook = new BookClass4("Suzanne Collins", "The Hungry Games");
        fourthBook.showBookInfo4();
        BookClass4 fourthBookII = new BookClass4("The Hungry Games II");
        fourthBookII.showBookInfo4();

        System.out.println("Challenge - 5");
        BookClass5 fifthBook = new BookClass5("Tolkien", "The Silmarillion");
        fifthBook.showBookInfo5();
    }
}
