import java.io.*;
import java.util.*;

class IntegerList{
   private int[] list;
   private int elementIndex = 0;
    
    public IntegerList(int size){
        list = new int[size];
    } 
    public void add(int value){
        if(elementIndex<list.length){
            list[elementIndex] = value;
            elementIndex++;
        }
        else{
            System.out.println("can't add, list is full");
        }
    }
    public void tostring(){
        for(int i=0;i<list.length;i++){
            System.out.println(i+" : "+list[i]);
        }
    }
    
}



public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int capacity = Integer.parseInt(in.nextLine());
        IntegerList nums = new IntegerList(capacity);
        while(in.hasNextLine()){
            int num = Integer.parseInt(in.nextLine());
            nums.add(num);
        }
        nums.tostring();
    }
}
