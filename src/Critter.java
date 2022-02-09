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

    public void win() {
        hasWon = true;
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
        try {
            for (int i = 1; i < 6; i++) {
                System.out.println("Zzz...");
                Thread.sleep(1000);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
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
            fitnessLevel--;
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
            if (fitnessLevel > 10) {
                System.out.println(Name + " is the peak form of fitness and athleticism." +
                        " Meanwhile, you can fitness dick in your mouth.");
                win();
            }
        }
    }
}
