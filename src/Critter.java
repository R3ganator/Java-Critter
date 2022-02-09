import java.util.Objects;

public class Critter {
    private boolean isAlive;
    private int foodLevel;
    private int tiredness;
    private int fitnessLevel;

    private boolean hasWon;
    public final String Name;

    public Critter(String name) {
        hasWon = false;
        isAlive = true;
        foodLevel = 5;
        tiredness = 0;
        if (Objects.equals(name, "Brad")) {
            fitnessLevel = 5;
        }
        else {
            fitnessLevel = 0;
        }
        Name = name;
    }

    public boolean hasWon() {
        return hasWon;
    }

    public boolean isAlive() {
        return isAlive;
    }

    private void die() {
        isAlive = false;
    }
    
    public void sleep() {
        System.out.println(Name + " sleeps.");
        tiredness = 0;
        foodLevel -= 3;
        if (foodLevel <= 0) {
            System.out.println(Name + " starves to death.");
            die();
        }
    }

    public void feed() {
        if (isAlive) {
            System.out.println(Name + " eats.");
            foodLevel++;
            tiredness++;
            if (foodLevel > 10) {
                System.out.println(Name + " over ate.");
                die();
            }
            else if (tiredness > 5) {
                System.out.println(Name + " is sleepy from so much food.");
                sleep();
            }
        }
    }

    public void workOut() {
        if (isAlive) {
            System.out.println(Name + " works out.");
            fitnessLevel++;
            tiredness--;
            foodLevel -= 2;
        }
    }
}
