import java.util.Scanner;
public class secondary{
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
        secondary jump2 = new secondary();
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

    private void resolution(int l, int e, int m) {
        if(){

        }
    }
}


