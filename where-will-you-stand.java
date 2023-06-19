import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPeople = scanner.nextInt();
        int minPeopleInFront = scanner.nextInt();
        int maxPeopleBehind = scanner.nextInt();

        int numPositions = 0;

        for (int i = 1; i <= totalPeople; i++) {
            int peopleInFront = i - 1;
            int peopleBehind = totalPeople - i;

            if (peopleInFront >= minPeopleInFront && peopleBehind <= maxPeopleBehind) {
                numPositions++;
            }
        }

        System.out.println(numPositions);

        scanner.close();
    }
}
