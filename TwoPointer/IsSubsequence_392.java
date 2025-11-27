package TwoPointer;

class IsSubsequence_392 {
    public static boolean isSubsequence(String s, String t) {




        for(int i=0;i<s.length();i++){
            boolean ans=false;
            for(int j=i;j<t.length();j++){
                if(s.charAt(i)==t.charAt(j)){
                    ans=true;
                } else if (j==t.length()-1 || !ans) {
                      return false;
                }

            }
        }

        return true;
        
    }

    public static void main(String[] args) {
        System.out.println(isSubsequence1("abc","axcb"));
    }
    public static boolean isSubsequence1(String s, String t) {


                  int left=0;
                  int right=0;



                  while (left<s.length() && right<t.length()){

                       if(findIndex(t.substring(left,t.length()),s.charAt(left))==-1) return false;

                       left++;

                  }

        return true;

    }

    public static  int  findIndex(String s,char c){

        return s.indexOf(c);
    }
}