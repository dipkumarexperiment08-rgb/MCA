import java.util.Scanner;

public class CricketScoreboard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totrun = 0;
        System.out.print("Enter Over");
        int over=sc.nextInt();
        final int ball=6;
        int[][] run = new int[over][ball];
        for(int i=0;i<run.length;i++){
            for(int j=0;j<ball;j++){
                System.out.println("Enter run["+i+"]["+j+"]");
                run[i][j] =sc.nextInt();
                 totrun=totrun+run[i][j];
            }
        }
        System.out.println("Total run of india: "+totrun);
    }
}
