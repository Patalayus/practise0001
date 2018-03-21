import java.util.Scanner;
public class secondary {
    private secondary jump2 = new secondary();

    //secondary class with secondary module which numbers are passed into by jump object
    public void secondary(int w, int x, int y){
        int total = w *(x - y);
        int add = 0;
        for(int i = 0; i < 5; i++){
           add++;
           System.out.println(total * add);
        }
    }

    //incrememnt function which will work out what number the user has put into the program
    public void increment(int w, int x, int y) {
        Double component = 1.9;
        Double component1 = 2.5;
        int less = 0;int more = 0;int exactly = 0;
        for(int i = 0 ; i < w ; i++){
            if(w<=0){
                less--;
            }else if(w>=0){
                more++;
            }else{
                exactly++;
            }
            jump2.resolution(less, exactly, more);
        }
    }

    //this is where the output from the user's numbers will be made
    private void resolution(int l, int e, int m) {
        if(l==-3) {
            System.out.println("l = -3");
            if (e == 3) {
                System.out.println("e == 3");
                if (e == 2) {
                    System.out.println("e == 2");
                    if (e == 1) {
                        System.out.println("e == 1");
                        if (e == 0) {
                            System.out.println("e == 0");
                        }
                    }
                }
            }
            if (l == -2) {
                System.out.println("l = -2");
                if (m == 3) {
                    System.out.println("m == 3");
                    if (m == 2) {
                        System.out.println("m == 2");
                        if (m == 1) {
                            System.out.println("m == 1");
                            if (m == 0) {
                                System.out.println("m == 0");
                            }
                        }
                    }
                }
                if (l == -1) {
                    System.out.println("l = -1");
                    if (l == 0) {
                        System.out.println("l = 0");

                    }
                }
            }
        }else{
            jump2.error();
        }
    }

    //this is where errors are handled
    private void error() {
        System.out.println("ERROR: 101");
    }
}


