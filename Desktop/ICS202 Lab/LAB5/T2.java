public class T2 {
    public static void main(String[] args) {
        // testing
        System.out.println(GCD(45,100));
    }
    public static int GCD(int n , int m){
        if(m == 0)
            return n;
        else {
            return GCD(m,n%m);
        }
    }
}
