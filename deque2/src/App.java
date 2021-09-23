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
        dq.insertLeft(71);
        dq.insertRight(13);
        dq.removeLeft();
        dq.removeLeft();
        // dq.removeRight();
        // dq.removeRight();
        dq.display();
        System.out.println(dq.peekFront());
        System.out.println(dq.peekRear());
        
        
    }
    
}
