public class Huluwa{
    int rank;
    String name;
    String color;
    Huluwa(int r,String n){
        rank = r;
        name = n;
    }
    void exchangePosition(Huluwa h){
        int tempRank = rank;
        String tempName = name;
        rank = h.rank;
        name = h.name;
        h.rank = tempRank;
        h.name = tempName;
    }
    void countOff(){
        System.out.println(name);
    }
    void sayColor(){
        System.out.println(color);
    }
}

