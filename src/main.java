import java.util.Scanner;
public class main extends secondary{
    public int count0;
    public Double num1;
    public Double num2;
    public Double num3;
    Scanner read = new Scanner(System.in);
    public main jump2 = new jump2();
    //this is where i've declared the public variable which I will be using
    //to write my program successfully.

    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        main jump = new jump();
        int count0 = 0;
        jump.start();
        }
        //this is the main module which is executed when the program is ran


    private void pass(Double w, Double x, Double y) {

    }

    public void start(){
        main jump2 = new jump2();
        for(int i = 0; i < 3; i++) {
            if (count0 == 0) {
                System.out.println("Please give your first number");
                num1 = read.nextDouble();
                count0++;
            } else if(count0 == 1){
                System.out.println("Please give your second number");
                num2 = read.nextDouble();
                count0++;
            } else if(count0 == 2){
                System.out.println("Please give your third number");
                num3 = read.nextDouble();
                count0++;
                jump2.secondary(num1, num2, num3);
            }

        }
    }

}
