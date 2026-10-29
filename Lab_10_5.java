import java.util.Scanner;

public class Lab_10_5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] nums = {4, 5, 6, 7, 0, 1, 2};

        System.out.print("Enter target: ");
        int target = sc.nextInt();

        int index = -1;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] == target) {
                index = i;
                break;
            }

        }

        System.out.println("Output: " + index);
    }
}