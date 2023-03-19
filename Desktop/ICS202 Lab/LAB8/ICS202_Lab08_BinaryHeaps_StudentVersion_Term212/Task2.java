import java.util.Arrays;

public class Task2 {
    public static void main(String[] args) {
        Patient[] patients = {new Patient("Ali", (int) (Math.random()*6),1),new Patient("Mohammad", (int) (Math.random()*6),2),new Patient("hossam", (int) (Math.random()*6),3),new Patient("omar", (int) (Math.random()*6),4), new Patient("faisal", (int) (Math.random()*6),5),new Patient("Ahmad", (int) (Math.random()*6),6),new Patient("waleed", (int) (Math.random()*6),7),new Patient("talal", (int) (Math.random()*6),8),new Patient("ziyad", (int) (Math.random()*6),9),new Patient("morad", (int) (Math.random()*6),10)};
        BinaryHeap<Patient> myheap = new BinaryHeap<>(patients);
        System.out.println("The original array is: \n"+ Arrays.toString(patients));
        System.out.println("The TREATMENT order of patients is: \n" + Arrays.toString(myheap.heapSort()));
    }
}
