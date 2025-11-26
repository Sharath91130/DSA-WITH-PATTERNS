package TwoPointer;

public class ContainerWithMostWater_11 {
    public static  int maxArea(int[] height) {



        int left=0;
        int right=height.length-1;

        int currentHeight=0;
        int result=0;

        while(left<right){

            currentHeight=Math.min(height[left],height[right]);
            result=Math.max(result,(right-left)*currentHeight);


            if(height[left]<height[right]){
                left+=1;
                while (height[left]<height[right]){
                    left+=1;
                }


            }
            else {
                right-=1;
                while (height[right]>height[left]){
                    right-=1;
                }
            }



        }



        return result;

    }

    public static void main(String[] args) {

        int [] arr={1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(arr));
    }
}
