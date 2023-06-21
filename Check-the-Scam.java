import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C, D;
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        
        int sum = A + B + C + D;
        
        if (A > (sum - A) || B > (sum - B) || C > (sum - C) || D > (sum - D)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
        
        scanner.close();
    }
}
