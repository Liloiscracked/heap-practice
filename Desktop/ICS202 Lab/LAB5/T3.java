public class T3 {
    public static void main(String[] args) {
        System.out.println(putCommas(100000));
        System.out.println(putCommas(987031090));
    }
    public static String putCommas(int x){
        if(x/1000 == 0){
            return String.valueOf(x);
        }
        else {
            if(x%1000 <100){ // if the remainder is less than 100 for example 987031090 => 987,031,090
                return putCommas(x/1000) + "," + (x%1000)/100 + (x%100)/10 + (x%10);
            }else
                return putCommas(x/1000)+","+x%1000;
        }
    }
}