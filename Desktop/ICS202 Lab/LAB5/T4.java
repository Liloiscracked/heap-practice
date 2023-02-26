public class T4 {
    public static void main(String[] args) {
        System.out.println(findPalindrome("MOMOM"));
    }
    public static boolean findPalindrome(String word){//Helper method jsut for design
        return findPalindrome(word.toCharArray(),0,word.length()-1);
    }
    public static boolean findPalindrome(char[] word, int begining, int end){ // convert the word into char list and then compare as shown in code
        if(begining == end){
            return true;
        }
        if(String.valueOf(word[begining]).equals(String.valueOf(word[end]))){
            return findPalindrome(word,begining+1,end-1);
        }
        else
            return false;
    }
}
