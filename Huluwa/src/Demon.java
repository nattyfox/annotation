import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Demon{
    public static void main(String[] args){
        Huluwa[] huLuXiongDI = new Huluwa[7];
        Random  r = new Random();
        List<Integer> list = new ArrayList<Integer>();
        int i = 0, j = 0;
        int count = 0;
        while(count < 7){
            i = r.nextInt(7) + 1;
            if(!list.contains(i)){
                list.add(i);
                huLuXiongDI[j].rank = i;
                System.out.println(i);
                switch(i){
                    case 1:huLuXiongDI[j].color = "red";huLuXiongDI[j].name = "LaoDa";
                    case 2:huLuXiongDI[j].color = "orange";huLuXiongDI[j].name = "LaoEr";
                    case 3:huLuXiongDI[j].color = "yellow";huLuXiongDI[j].name = "LaoSan";
                    case 4:huLuXiongDI[j].color = "green";huLuXiongDI[j].name = "LaoSi";
                    case 5:huLuXiongDI[j].color = "black";huLuXiongDI[j].name = "LaoWu";
                    case 6:huLuXiongDI[j].color = "blue";huLuXiongDI[j].name = "LaoLiu";
                    case 7:huLuXiongDI[j].color = "purplr";huLuXiongDI[j].name = "LaoQi";
                    default:huLuXiongDI[j].color = "wrong";huLuXiongDI[j].name = "wrong";
                }
                //System.out.println(huLuXiongDI[j].rank);
                j++;
                count++;
            }
        }
        //Sort manage = new Sort();
        //manage.bubbleSort(huLuXiongDI);
        //manage.binarySearchSort(huLuXiongDI);
    }
}