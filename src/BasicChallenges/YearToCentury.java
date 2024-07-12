package BasicChallenges;

public class YearToCentury {

    // This function convert a year into a century.
    public static int yearToCentury(double year) {

        return (int) Math.ceil(year/100);
    }
    public static void main(String[] args) {

        System.out.println("Century - " + yearToCentury(2022));
    }
}
