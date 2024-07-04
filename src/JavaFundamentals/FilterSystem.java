package JavaFundamentals;

public class FilterSystem {

    // Mock database entries
    private static final String[] DATABASE = {
            "Product A: Price $100, Category Electronics",
            "Product B: Price $50, Category Books",
            "Product C: Price $150, Category Electronics",
            "Product D: Price $30, Category Apparel",
            // ... more entries
    };

    public static void filterByPriceRange(int min, int max) {
        for (String entry : DATABASE) {
            // Extract price.
            int price = Integer.parseInt(entry.replaceAll("\\D+", ""));
            if (price >= min && price <= max) {
                System.out.println(entry);
            }
        }
    }
    public static void main(String[] args) {
        filterByPriceRange(50, 150);  // Filters entries with prices between $50 and $150
    }
}