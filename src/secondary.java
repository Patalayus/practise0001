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
}


