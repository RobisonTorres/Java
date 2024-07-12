package BasicChallenges;

public class TrafficLights {

    /*This function that takes a string as an argument representing the current
    state of the light and returns a string representing the state the light should change to.
     */
    public static String updateLight(String current) {

        if (current == "Green") {
           return "Yellow";
        } else if (current == "Yellow") {
            return "Red";
        } else {
            return "Green";
        }
    }
    public static void main(String[] args){

        System.out.println(updateLight("Red"));
    }
}