package TwoPointer;

import java.util.Arrays;

public class TwoSumII_InputArrayIsSorted_167 {



    public static void main(String[] args) {
        int [] arr={-1,0};
        System.out.println(Arrays.toString(twoSum2(arr,-1)));
    }

    public static int[] twoSum2(int[] numbers, int target) {



        int left=0;

        int right=numbers.length-1;

        while(left<right){

            if(numbers[left]+numbers[right]==target){
                  return new int[]{left+1,right+1};
            }
            if(numbers[left]+numbers[right]<target){
                left++;

            }
            else {
                right--;
            }
        }
        return new int[]{-1,-1};
    }

}
