public class WarmUp9 extends BaseClass {
    public static void main(String[] args) {
        int[] arr = new int[] {1, 2, 3};
        isTestPassed(sumAll(arr),6);
        int[] arr2 = new int[] {2, 7, 2};
        isTestPassed(sumAll(arr2),11);
    }
    public static int sumAll(int[] nums) {
        int sum=0;
        for(int num : nums){
            sum += num;
        }
        return sum;
    }
}
