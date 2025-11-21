package TwoPointer;

public class Test {
    public boolean repeatedSubstringPattern(String s) {

        if(s.length()%2!=0){
            return false;
        }

        String subString=findSubString(s);
         int left=0;
        int right=subString.length();

        while(left<=s.length()-subString.length()){
            System.out.println(left +" "+right);
            System.out.println((s.substring(left,right)));
            if(subString.equals(s.substring(left,right))){

                left+=subString.length();
                right+=subString.length();
            }
            else{
                return false;
            }
        }





            return true;
    }

    public static void main(String[] args) {
        Test test=new Test();
        String s="sharath";
        System.out.println(s.substring(1,5));
        System.out.println();
        System.out.println(findSubString("abcabcabcabc"));
        System.out.println(test.repeatedSubstringPattern("aba"));
    }

    public static String findSubString(String s){
        int left=0;
        int right=1;


        while(right<s.length()){


            if(s.charAt(left)==s.charAt(right)){

                return s.substring(left,right);
            }
            right++;
        }
        return "";
    }

}
