import java.util.Scanner;

public class main extends secondary{
    /*this is where i've declared the public variable which I will be using
    to write my program successfully.*/
    private int count0;
    private int num1;
    private int num2;
    private int num3;
    private Scanner read = new Scanner(System.in);

    //this is the main module which is executed when the program is ran
    public static void main(String []args){
        Scanner mainsc = new Scanner(System.in);
        main jump = new main();
        jump.start();
        System.out.println("Please enter a number");
        int integer = mainsc.nextInt();
        jump.increment(integer,4,5);
        jump.alteration();
    }

    //this method is executed after the increment method.
    private void alteration() {

    }

    //start module which is then used to jump to another class in the directory
    private void start(){
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

