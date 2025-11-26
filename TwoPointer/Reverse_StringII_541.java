package TwoPointer;

import java.util.Arrays;

public class Reverse_StringII_541 {

    public static String reverseStr(String s, int k) {
        if(s.length()==k){
            return reverse(s);
        }

        int i=0;
        int j=k;
        char[] charArray = s.toCharArray();

        String ans="";

        while(j-s.length()!=k && j<s.length()){
            System.out.println(i + " "+j);

                     int n=j-1;
                   for(int m=i;m<n;m++){


                       char temp=charArray[m];
                       charArray[m]=charArray[n];
                       charArray[n]=temp;
                       n--;

                   }

            System.out.println(Arrays.toString(charArray));
            i=j+k;
          //  ans+=s.substring(i+k,i-1);

            j=i+k;


        }

        return new String(charArray);
    }

    public static void main(String[] args) {

        String m="abcabcabcabc";

               String s=m+m;
        System.out.println(s.substring(1,s.length()-1));
        System.out.println(s.substring(1, s.length() - 1).contains(m));
    }
    public static String reverse(String s){

        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
  return ans;

    }
}
