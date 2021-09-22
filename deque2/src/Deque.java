

public class Deque {

    private
    int[] arr;
    int front;
    int rear;
    int nItems;
    int size;

    public Deque(int s) {
        size = s;
        arr = new int[size];
        rear = 0;
        front = -1;
        nItems = 0;
    }

    public boolean isEmpty() throws DequeException {
        
        return (front == -1);
        
        
        
       
    }

    public boolean isFull() {
        return ((front == 0 && rear == size-1)||
            front == rear+1);
    }

    public void insertLeft(int value) throws DequeException{
        if (isFull())
        {
            throw new DequeException("Queue is Full");
        }
  
        // If queue is initially empty
        if (front == -1)
        {
            
            front = 0;
            rear = 0;
            
        }
         
        // front is at first position of queue
        else if (front == 0)
            front = size - 1 ;
  
        else // decrement front end by '1'
            front = front-1;
  
        // insert current element into Deque
        arr[front] = value ;
        nItems++;

    }

    public void insertRight(int value) throws DequeException{
        
            if (isFull())
            {
                throw new DequeException("Queue is Full");
            }
      
            // If queue is initially empty
            if (front == -1)
            {
                front = 0;
                rear = 0;
            }
      
            // rear is at last position of queue
            else if (rear == size-1)
                rear = 0;
      
            // increment rear end by '1'
            else
                rear = rear+1;
             
            // insert current element into Deque
            arr[rear] = value ;
            nItems++;

    }
    
    public int removeLeft(){
        if(!isEmpty()){
            int temp = arr[front];
            front++;
            if(front == size -1)
                front = 0;
            nItems--;
            return temp;
        }
        else{
            return -1;
        }
        
    }
    public int peekFront(){
        if(isEmpty()){
            throw new DequeException("Deque is Empty");
        }
        else
            return arr[front];
    }

    public int peekRear(){
        if(isEmpty()){
            throw new DequeException("Deque is Empty");
        }
        else
         return arr[rear];    }

    public void display(){
        // int [] arr = Deque.toArray();
        for(int i = 0 ; i < nItems ; i++){
            System.out.println( arr[i] + " ");
        }
    }
}
