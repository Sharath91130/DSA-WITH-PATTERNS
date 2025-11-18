package TwoPointer;

public class Reverse_StringII_541 {

    public static String reverseStr(String s, int k) {

        int i=0;
        int j=k;
        int m=k;
        int n=m+k;

        String ans="";

        while(j-s.length()!=k && j<s.length()){

            System.out.println(i +" "+ j);
            System.out.println(s.substring(i,j));
            ans+=reverse(s.substring(i,j));

            System.out.println("reverse string  of " +s.substring(i,j)+" "+ reverse(s.substring(i,j)));


            System.out.println("after reversing "+s.substring(m,n));



            i=j+k;
          //  ans+=s.substring(i+k,i-1);

            j=i+k;
            m=j+1;
            n=m+k;

        }
        ans+=s.substring(ans.length());
        return ans;
    }

    public static void main(String[] args) {
        System.out.println("ans "+Reverse_StringII_541.reverseStr("abcdefg",2));
    }
    public static String reverse(String s){

        String ans="";
        for(int i=s.length()-1;i>=0;i--){
            ans+=s.charAt(i);
        }
  return ans;

    }
}
