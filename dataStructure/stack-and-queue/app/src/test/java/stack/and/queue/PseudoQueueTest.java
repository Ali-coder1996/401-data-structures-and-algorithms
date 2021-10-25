package stack.and.queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class PseudoQueueTest {
    @Test public void testPsedoQueueEnqueueMethod(){
        PseudoQueue pseudoQueue =new PseudoQueue();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(2);

        assertEquals("front -> { 5 } -> { 4 } -> { 3 } -> { 2 } -> Null",pseudoQueue.toString());
    }
    @Test public void testPsedoQueueDequeueMethod(){
        PseudoQueue pseudoQueue =new PseudoQueue();
        pseudoQueue.enqueue(5);
        pseudoQueue.enqueue(4);
        pseudoQueue.enqueue(3);
        pseudoQueue.enqueue(2);

        pseudoQueue.dequeue();
        assertEquals("front -> { 5 } -> { 4 } -> { 3 } -> Null",pseudoQueue.toString());
    }

}
