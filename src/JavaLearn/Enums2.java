package JavaLearn;

class Enums2 {

    public static void main(String[] args) {

        Player1 player1 = new Player1(Difficulty.EASY);
        Player1 player2 = new Player1(Difficulty.MEDIUM);
        Player1 player3 = new Player1(Difficulty.HARD);
    }
}

enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

class Player1 {
    Player1(Difficulty diff){
        //your code goes here
        switch(diff) {
            case EASY:
                System.out.println("You have 3000 bullets");
                break;
            case MEDIUM:
                System.out.println("You have 2000 bullets");
                break;
            case HARD:
                System.out.println("You have 1000 bullets");
                break;

        }
    }
}