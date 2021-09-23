import java.util.*;

public class App {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  {
        Deque dq = new Deque(5);

        dq.insertLeft(11);
        dq.insertLeft(7);
        dq.insertRight(41);
        // dq.insertLeft(71);
        // dq.insertRight(13);
        // dq.insertRight(2);
        // dq.insertRight(3);
        // dq.insertRight(5);
        dq.removeLeft();

        // q.enqueue(12);
        // q.enqueue(13);
        // q.enqueue(34);
        // q.enqueue(45);
        // q.enqueue(11);
        // //q.dequeue();
        // q.enqueue(45);
        // System.out.println(dq.peekFront());
        // System.out.println(dq.peekRear());
        dq.display();
        
    }
    
}
