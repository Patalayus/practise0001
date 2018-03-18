import java.util.Scanner;
public class main extends secondary{
    public int count0;
    public Double num1;
    public Double num2;
    public Double num3;
    Scanner read = new Scanner(System.in);
    //this is where i've declared the public variable which I will be using
    //to write my program successfully.

    public static void main(String []args){
        Scanner read = new Scanner(System.in);
        main jump = new jump();
        int count0 = 0;
        jump.start();
        }


    private void pass(Double w, Double x, Double y) {

    }
    public void start(){
        for(int i = 0; i < 3; i++) {
            if (count0 == 0) {
                System.out.println("Please give your first number");
                num1 = read.nextDouble();
                count0++;
            } else if(count0 == 1){
                System.out.println("Please give your second number");
                Double num2 = read.nextDouble();
                count0++;
            } else if(count0 == 2){
                System.out.println("Please give your third number");
                Double num3 = read.nextDouble();
                count0++;
                jump.(num3);
            }

        }
    }

}
