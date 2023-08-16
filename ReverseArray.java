public class ReverseArray {

    public static void reverse(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int temp = array[i];
            array[i] = array[length - i - 1];
            array[length - i - 1] = temp;
        }

        for(int num:array){
            System.out.println(num);
        }
    }

    public static void main(String[] args) {
        int array [] = {12,54,67,99,02,87,45,32,21,200};
        for(int i=0; i<array.length;i++){
            System.out.println(array[i]);
        }
        reverse(array);
        // for(int i=0; i<array.length;i++){
        //     System.out.println(array[i]);
        // }
    }
    
}
