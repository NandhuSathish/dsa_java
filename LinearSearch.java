import java.util.*;
public class LinearSearch {
    public static int linearSearch(int arr [],int item){
        for(int i=0;i<arr.length;i++){
            if(arr[i]== item){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int marks [] = {20,34,43,11,67,88,05,12,42,60,99,73,54};
        int item= 200;
       int index = linearSearch(marks, item);
        if(index != -1){
            System.out.println("item found 🎺");
        }else{
            System.out.println("not found 😲");
        }
    }
}
