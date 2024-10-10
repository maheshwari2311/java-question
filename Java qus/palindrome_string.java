public class palindrome_string {



    static  boolean  plaindrome(int i , String s) {

        if (i>= s.length()/2)return true;
        if (s.charAt(i)!= s.charAt(s.length() - i -1)) {
            return  false;
        }
        return plaindrome(i+1, s);

    }
    public static void main(String[] args) {
        String s  = "madam";
       System.out.println( plaindrome(0, s));

    }
}
