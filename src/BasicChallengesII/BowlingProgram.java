package BasicChallengesII;
import java.util.*;

class Bowling {
    HashMap<String, Integer> players;
    Bowling() {
        players = new HashMap<String, Integer>();
    }
    public void addPlayer(String name, int p) {
        players.put(name, p);
    }
    //your code goes here
    public void getWinner(){
        HashMap<String, Integer> winnerPlayers = new HashMap<>();
        winnerPlayers.put("start", 0);

    Iterator<Map.Entry<String, Integer>> new_Iterator = players.entrySet().iterator();

    while(new_Iterator.hasNext()){

        Map.Entry<String, Integer> new_Map = new_Iterator.next();
        // Displaying HashMap
        Object firstKey = winnerPlayers.keySet().toArray()[0];
        if (new_Map.getValue() > winnerPlayers.get(firstKey)){
            winnerPlayers.clear();
            winnerPlayers.put(new_Map.getKey(), new_Map.getValue());
            }
        }
    System.out.println(winnerPlayers.keySet().toArray()[0]);
    }
}

public class BowlingProgram {
    public static void main(String[ ] args) {
        Bowling game = new Bowling();
        Scanner sc = new Scanner(System.in);

        for(int i=0;i<3;i++) {
            String input = sc.nextLine();
            String[] values = input.split(" ");
            String name = values[0];
            int points = Integer.parseInt(values[1]);
            game.addPlayer(name, points);
        }
        game.getWinner();
    }
}