import java.util.Scanner;

public class main extends secondary{
    /*this is where i've declared the public variable which I will be using
    to write my program successfully.*/
    public int count0;
    public Double num1;
    public Double num2;
    public Double num3;
    public Scanner read = new Scanner(System.in);

    //this is the main module which is executed when the program is ran
    public static void main(String []args){
        main jump = new main();
        jump.start();
    }

    public void start(){
        secondary jump2 = new secondary();
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
