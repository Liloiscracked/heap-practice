import java.util.Arrays;
public class BinaryHeap<T extends Comparable<T>> 
{
	private T[] array;
	private int size;
	private int capacity;
	
	public BinaryHeap(){
		this(50);
	}
	
    public BinaryHeap(int capacity)
    {
		this.capacity = capacity;
		size = 0;
      array = (T[]) new Comparable[this.capacity + 1];
    }
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size == 0;
	}
   
    public boolean isFull()
    {
        return size == array.length - 1;        
    }
    
    public BinaryHeap(T[] comparable) 
    {
    	this(comparable.length);
    	 
    	for(int i = 0; i < comparable.length; i++)
    	   array[i + 1] = comparable[i];
    	   
    	size = comparable.length;   
    	
    	buildHeapTopDown(); //part of  Task01
		//buildHeapBottomUp();
	}
	//Task1:
	private void buildHeapBottomUp()
	{
        // Task01
        for(int i = this.size/2 ; i>=1 ; i--){
            percolateDown(i);
        }
	}
	
	private void buildHeapTopDown()
	{
      // Task02
        for(int i = 2 ;i <= this.size;i++){
            if(this.array[i].compareTo(this.array[i/2]) < 0)
                percolateUp(i);
        }
   }	
	
	private void percolateDown(int index){
	    // Task01
        boolean done = false;
        while (!done && index * 2 <= size){
            index *= 2;
            if(index + 1 <= size && this.array[index+1].compareTo(this.array[index]) < 0)
                index += 1;
            if(this.array[index].compareTo(this.array[index/2]) <= 0){
                T temp = this.array[index];
                this.array[index] = this.array[index/2];
                this.array[index/2] = temp;
            }
            else
                done = true;
        }
  	}
	
	private void percolateUp(int index){
	   // Task01
        boolean done = false;
        while (!done && index !=1){
            if(this.array[index].compareTo(this.array[index/2]) <= 0){
                T temp = this.array[index];
                this.array[index] = this.array[index/2];
                this.array[index/2] = temp;
            }
            else
                done = true;
            index = index / 2;
        }
	}
	

	public void purge()
    {
        while(size > 0)                   
            array[size--] = null;     
    }

    public void enqueue(T comparable)
    {
        int index = ++size; 
        
        // percolate up via a hole
        while(index > 1 && array[index / 2].compareTo(comparable) > 0)
        {
            array[index] = array[index / 2];
            index = index / 2 ;
    	}

        array[index] = comparable;
    }

    public T findMin()           
    {
            return array[1];
    }

    public T  dequeueMin()
    {
        T  minItem = array[1];
        array[1] = array[size];                          
        size--; 
        percolateDown(1);
        return minItem;
    }
    
    public T[] heapSort() {
    	T[] x = (T[]) new Comparable[size];             
    	int total = size;  
    	for(int i = 0; i < total; i++) {
    		x[i] = dequeueMin();    		
    	}
    	return x;
    }
    public String toString(){
      if(size == 0)
        return "[ ]";
        
      String str = "[";
      int k;
      for(k = 1; k <= array.length - 2; k++)
        str += array[k] + ", ";
        
      str += array[k] + "]";
      
      return str;
    	
    }
}