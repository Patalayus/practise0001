import java.util.Scanner;

public class main extends secondary{
    /*this is where i've declared the public variable which I will be using
    to write my program successfully.*/
    public int count0;
    public int num1;
    public int num2;
    public int num3;
    public Scanner read = new Scanner(System.in);

    //this is the main module which is executed when the program is ran
    public static void main(String []args){
        main jump = new main();
        jump.start();
    }

    //start module which is then used to jump to another class in the directory
    public void start(){
        secondary jump2 = new secondary();
        for(int i = 0; i < 3; i++) {
            if (count0 == 0) {
                System.out.println("Please give your first number");
                num1 = read.nextInt();
                count0++;
            } else if(count0 == 1){
                System.out.println("Please give your second number");
                num2 = read.nextInt();
                count0++;
            } else if(count0 == 2){
                System.out.println("Please give your third number");
                num3 = read.nextInt();
                count0++;
                jump2.secondary(num1, num2, num3);
            }

        }
    }

}
