public class Q11 {
    public static void main(String[] args) {
      isMultiple ( 5,10);
        System.out.println( isMultiple(5,10));
    }

    public static boolean isMultiple(long n,long m) {
        if(n % n==0)
            return  true;
        else
            return  false;

    }
}
