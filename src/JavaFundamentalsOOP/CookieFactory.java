package JavaFundamentalsOOP;

// The CookieCutter class represents the analogy's cookie cutter.
class CookieCutter {

    // Common shape for all cookies made using this cutter.
    String shape;

    // Constructor to initialize the shape of the cookie cutter.
    public CookieCutter(String shape) {
        this.shape = shape;
    }

    // Method to create a new cookie with the specified flavor
    // using this cutter's shape.
    public Cookie makeCookie(String flavor) {
        return new Cookie(this.shape, flavor);
    }
}

// The Cookie class represents the cookies made using the cookie cutter.
class Cookie {

    // Every cookie will have a shape and a flavor.
    String shape;
    String flavor;

    // Constructor to initialize the shape and flavor of the cookie.
    public Cookie(String shape, String flavor) {
        this.shape = shape;
        this.flavor = flavor;
    }

    // Method to describe the cookie.
    public void describe() {
        System.out.println("This is a " + flavor + " flavored " + shape + " cookie.");
    }
}

public class CookieFactory {

    public static void main(String[] args) {

        // Creating a heart-shaped cookie cutter.
        CookieCutter heartShapedCutter = new CookieCutter("heart");

        // Using the heart-shaped cutter to create cookies with different flavors.
        Cookie chocoHeartCookie = heartShapedCutter.makeCookie("chocolate");
        Cookie vanillaHeartCookie = heartShapedCutter.makeCookie("vanilla");

        // Describing the cookies.
        chocoHeartCookie.describe();
        vanillaHeartCookie.describe();
    }
}

