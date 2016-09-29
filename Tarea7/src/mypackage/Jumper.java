package mypackage;

public class Jumper implements Comparable<Jumper>{
    private String name;
    private int score;
    
    public Jumper (String name) {
        this.name = name;
        this.score = 0;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getScore() {
        return this.score;
    }
    
    public void setScore(int newScore) {
        this.score += newScore;
    }
    
    public String toString() {
        return this.name + " (" + this.score + ")";
    }
    
    
    public int compareTo(Jumper jumper) {
        if (jumper.getScore()>this.getScore()) {
            return 1;
        } else if (jumper.getScore()<this.getScore()) {
            return -1;
        } else {
            return 0;
        }
    }
}
