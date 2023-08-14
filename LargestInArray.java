public class LargestInArray {
    public static int largest(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest = arr[i];
            }
        }
        return largest;
    }
    public static void main(String[] args){
        int array [] = {12,54,67,99,02,87,45,32,21,200};
        System.out.println("Largest element in the [] : " + largest(array) );

    }
}
