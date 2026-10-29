import java.util.Scanner;

public class Lab_10_3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = new int[4];

        // Input
        for(int i = 0; i < arr.length; i++){
            arr[i] = sc.nextInt();
        }

        // Display array
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }

        System.out.println();

        // Find maximum
        int max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        // Find second maximum
        int second_max = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > second_max && arr[i] != max){
                second_max = arr[i];
            }
        }

        // Find minimum
        int min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        // Find second minimum
        int second_min = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < second_min && arr[i] != min){
                second_min = arr[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Second Maximum = " + second_max);
        System.out.println("Minimum = " + min);
        System.out.println("Second Minimum = " + second_min);
    }
}