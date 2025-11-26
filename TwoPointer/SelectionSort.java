package TwoPointer;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int arr[]={3,15,10,2,4,10,1,10};

        System.out.println(findMin(arr,0,2));
             sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void  sort(int[] arr){




        int left=0;
        int right=arr.length-1;

        while(left<right){
           // System.out.println(left );

            int min = findMin(arr, left, right);

            swap(arr,left,min);

            System.out.println(min);

            left+=1;
            ;
        }



    }

    public static int findMin(int[] arr,int start,int end){
        int min=arr[start];

        int index=-1;

        for(int i=start;i<=end;i++){
            if(min>=arr[i]){
                min=arr[i];
                index=i;
            }
        }
        return index;
    }

    public static void swap(int [] arr,int start,int end){

        int temp=arr[start];
        arr[start]=arr[end];
        arr[end]=temp;

    }
}
