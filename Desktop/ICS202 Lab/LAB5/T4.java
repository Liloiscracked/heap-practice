public class T4 {
    public static void main(String[] args) {
        // testing
        System.out.println(findPalindrome("L"));
    }
    public static boolean findPalindrome(String word){//Helper method just for design
        return findPalindrome(word.toCharArray(),0,word.length()-1);
    }
    public static boolean findPalindrome(char[] word, int begining, int end){ // convert the word into char list and then compare as shown in code
        if(begining >= end){ // base case
            return true;
        }
        if(String.valueOf(word[begining]).equals(String.valueOf(word[end]))){ // continue doing the same thing recursively
            return findPalindrome(word,begining+1,end-1);
        }
        else // once there is a diffrence we return false
            return false;
    }

}
