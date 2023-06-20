import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int numRows, numCols, extraRows;
        numRows = scanner.nextInt();
        numCols = scanner.nextInt();
        extraRows = scanner.nextInt();
        
        int initialCells = numRows * numCols;
        int finalRows = numRows + extraRows;
        int finalCells = finalRows * numCols;
        
        System.out.println(finalCells);
        
        scanner.close();
    }
}
