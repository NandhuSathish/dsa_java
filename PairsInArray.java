public class PairsInArray {

    public static void printPairs(int arr[]){
        for(int i=0; i<arr.length;i++){
            for(int j=i+1; j<arr.length;j++){
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }

    }
    public static void main(String[] args) {
        int array [] = {2,4,6,8,10,12,14,16,18,20};
        printPairs(array);
    }
    
}

// time complexity O(n2)

// total pairs of n = n(n-1)/2
// Sum of n mumbers = n * (n + 1) / 2