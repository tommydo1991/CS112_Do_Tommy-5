public class DiceGame {
    private static final int maxScore = 100;
 
    private static final String computerName = "Computer";
 
    private int numberOfRolls;
    private int score;
    private int tempScore;
    private int dieRoll;
    private int playerNumber;
 
    private String name;
 
    public DiceGame(String name) {
        this.name = name;
        reset();
    }
 
    public void reset() {
        this.numberOfRolls = 0;
        this.score = 0;
        this.tempScore = 0;
        this.dieRoll = 0;
    }
 
    public int getPlayerNumber() {
        return playerNumber;
    }
 
    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }
 
    public int getDieRoll() {
        return dieRoll;
    }
 
    public void setDieRoll(int dieRoll) {
        this.dieRoll = dieRoll;
    }
 
    public int getNumberOfRolls() {
        return numberOfRolls;
    }
 
    public int getScore() {
        return score;
    }
 
    public int getTempScore() {
        return tempScore;
    }
 
    public String getName() {
        return name;
    }
 
    public static int getMaxScore() {
        return maxScore;
    }
 
    public static String getComputerName() {
        return computerName;
    }
 
    public boolean addTempScore(int count) {
        if (count == 1) {
            this.tempScore = 0;
            this.numberOfRolls = 0;
            return false;
        } else {
            this.tempScore += count;
            this.numberOfRolls++;
            return true;
        }
    }
 
    public void addScore() {
        this.score += this.tempScore;
        this.tempScore = 0;
        this.numberOfRolls = 0;
    }
 
    public boolean isWinner() {
        return (getScore() >= maxScore);
    }
 
    public boolean isComputerWinner() {
        return ((getScore() + getTempScore()) >= maxScore);
    }
 
    public boolean isComputer() {
        return (getName().equals(computerName));
    }
}

