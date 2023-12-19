import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Quanti numeri vuoi inserire?: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.println("Inserisci i numeri da sommare: ");
        for (int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        
        System.out.println("La somma dei numeri inseriti è: " + Somma(arr));
        
        scanner.close();
    }

    public static int Somma(int[] arr){
        int sum = 0;
        for(int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }

        return sum;

    }

}
