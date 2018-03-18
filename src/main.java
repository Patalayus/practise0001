import java.util.Scanner;
public class main {
    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        main jump = new jump();
        int count = 0;
        for(i = 0; i < 3; i++) {
            if (count == 0) {
                System.out.println("Please give your first number");
                Double num1 = read.nextDouble();
                count++;
            } else if(count == 1){
                System.out.println("Please give your second number");
            }
        }
    }

    private void pass(Double w, Double x, Double y) {

    }
}
