import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        
        for (int i=0; i<=n; i++){
            arr[i]=scanner.nextInt();
        }

        

}
