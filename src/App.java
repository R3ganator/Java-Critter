import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to call your critter?:");
        String name = scanner.nextLine();
        Critter critter = new Critter(name);

        while (critter.isAlive() && critter.) {
            System.out.println("What would you like Critter to do? (eat, sleep, work out)");
            String lineRead = scanner.nextLine();
            if (lineRead.equalsIgnoreCase("eat")) {
                critter.feed();
            }
            else if (lineRead.equalsIgnoreCase("sleep")) {
                critter.sleep();
            }
            else if (lineRead.equalsIgnoreCase("work out")) {
                critter.workOut();
            }
        }
        System.out.println(critter.Name + " has died.");
        scanner.close();
    }
}
