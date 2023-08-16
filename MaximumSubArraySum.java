public class MaximumSubArraySum {

//brute force method.
    public static void maxSum(int[] arr){
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        for(int i=0;i<arr.length;i++){

            for(int j=i;j<arr.length;j++){
                currentSum=0;

                for(int k=i;k<=j;k++){
                    currentSum+=arr[k];
                }
                maxSum = currentSum>maxSum?currentSum:maxSum;
            }
        }
        System.out.println("Final sum :"+maxSum);
    }

    public static void main(String[] args) {
        int [] array = {2,4,6,8,10};
        maxSum(array);
    }
}
