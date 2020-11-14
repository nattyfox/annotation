import javax.print.DocFlavor.STRING;
import java.util.*;

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
public class Sort{
    public void bubbleSort(Huluwa[] arrry){
        for(int i = arrry.length - 1;i > 0;i--){
            int currentMax = arrry[i].rank;
            int currentMaxIndex = i;
            for(int j = 0;j < i - 1;j++){
                if(arrry[j].rank > currentMax){
                    currentMax = arrry[j];
                    currentMaxIndex = j;
                }
            }
            if(currentMaxIndex != i){
                //arrry[currentMaxIndex].rank = arrry[i].rank;
                //arrry[i].rank = currentMax; 
                System.out.println(arrry[i].name+":"+i+"->"+currentMaxIndex);
                System.out.println(arrry[currentMaxIndex].name+":"+currentMaxIndex+"->"+i);
                arrry[i].exchangePosition(arrry[currentMax]);
            }
        }
        for(int i = 0;i < arrry.length;i++){
            arrry[i].countOff();
        }
    }
    public void binarySearchSort(Huluwa[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i].rank;
            String tenmName = arr[i].name;
            int low = 0, high = i - 1;
            int mid = -1;
            while (low <= high) {            
                mid = low + (high - low) / 2;            
                if (arr[mid].rank > temp) {               
                    high = mid - 1;            
                } 
                else {               
                    low = mid + 1;            
                }        
            }        
            for(int j = i - 1; j >= low; j--) {            
                //arr[j + 1].rank = arr[j].rank;
                int current = j + 1;  
                arr[j + 1].exchangePosition(arr[j]);
                System.out.println(arr[j].name + ":" + j + "->" + current);
            }        
            arr[low].rank = temp; 
            arr[low].name = tempName;   
            System.out.println(arr[i].name+":" + i + "->" + low);
        }
        for(int i = 0;i < arr.length;i++){
            arr[i].sayColor();
        }
    }
}
public class Demon{
    public static void main(String[] args){
        Huluwa[] huLuXiongDI = new Huluwa[7];
        Random  r = new Random();
        List<Integer> list = new ArrayList<Integer>();
        int i;
        for(int j = 0;j < 7;j++){
            i = r.nextInt(7) + 1;
            if(!list.contains(i)){
                list.add(i);
                huLuXiongDI[j].rank = i;
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
            }
        }
        Sort manage = new Sort();
        manage.bubbleSort(huLuXiongDI);
        manage.binarySearchSort(huLuXiongDI);
    }
}