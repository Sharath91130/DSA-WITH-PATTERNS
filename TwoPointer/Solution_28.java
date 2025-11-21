package TwoPointer;

class Solution_28 {
    public static int strStr(String haystack, String needle) {
         if(haystack.equals(needle)){
             return 0;
         }

        int left=0;
        int right=needle.length();


        while(left<=haystack.length()-needle.length()){

            System.out.println(haystack.substring(left,right));

            if(haystack.substring(left,right).equals(needle)){
                return left;
            }

            left+=1;
            right+=1;


        }

        return -1;
    }

    public static void main(String[] args) {
        //System.out.println(strStr("abc","c"));
        System.out.println(3%2);
    }
}