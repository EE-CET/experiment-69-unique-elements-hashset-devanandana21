import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        
        Set<Integer> numbers = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        
        for (int num : numbers) {
            System.out.print(num + " ");
        }
        
        scanner.close();
    }
}
