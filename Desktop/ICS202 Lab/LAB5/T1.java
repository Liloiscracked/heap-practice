public class T1 {
    public static void main(String[] args) {
        // testing
        String[] fruits = {"lime","Apple", "Mango", "Banana", "Orange", "Peach","Watermelon"};
        String[] custom = {"Hoal", "fi","S","thasn","kkkkkkkk"};
        System.out.println(findSmallest(custom));
    }
    // method a
    public static String findSmallest(String[] array){
        return findSmallest(array,0);
    } // helper method just for design
    public static String findSmallest(String[] array, int index){
        String current = array[index];
        String min;
        if(index == array.length-1){
            return array[index];
        }
        else {
            if(current.length() <= array[index++].length()){
                min = current;
                String b = findSmallest(array,index++);
                if(min.length() <= b.length()){
                    return min;
                }
                else
                    return b;
            }
            return findSmallest(array,index++);
        }
    }// the actual method
    // method b
    public static String findLongest(String[] array){ // helper method just for design
        return findLongest(array,0);
    }
    public static String findLongest(String[] array, int index){// the actual method
        String current = array[index];
        String max;
        if(index == array.length-1){
            return array[index];
        }
        else {
            if(current.length() >= array[index++].length()){
                max = current;
                String b = findLongest(array,index++);
                if(max.length() <= b.length()){
                    return b;
                }
                else
                    return max;
            }
            return findLongest(array,index++);
        }
    }
}
