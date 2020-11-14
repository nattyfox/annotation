import java.util.Random;


public class H {
    int r;
    int p;
    public H(){
        Random n = new Random();
        this.r = n.nextInt(7);
        this.p = n.nextInt(7); 
    }
    void setR(int r){
        this.r = r;
    }
    void setP(int p){
        this.p = p;
    }

    public static void main(String[] args) {
       H[] h = new H[7];
       for(int i = 0; i < 7; ++i){
           h[i] = new H();
       }
       System.out.println(h[1].r);
    }

}
