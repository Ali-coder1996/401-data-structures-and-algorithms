package stack.and.queue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {
    @Test public void enQueue(){
        Queue queue=new Queue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertEquals(0,queue.front.value);
        assertEquals(4,queue.rear.value);
    }
    @Test public void deQueue(){
        Queue queue=new Queue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        //deQueue
        queue.deQueue();
        assertEquals(1,queue.front.value);
        assertEquals(4,queue.getSize());
        assertEquals(1,queue.deQueue());
    }
    @Test public void peek(){
        Queue queue=new Queue();
        queue.enqueue(0);
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        assertEquals(0,queue.peek());
    }
    @Test public void isEmpty(){
        Queue queue=new Queue();

        //queue is empty
        assertTrue(queue.isEmpty());

        queue.enqueue(5);
        //queue is not empty
        assertFalse(queue.isEmpty());
    }
    @Test public void testToString(){
        Queue queue=new Queue();
        queue.enqueue(5);
        queue.enqueue(53);

        assertEquals("front -> { 5 } -> { 53 } -> Null",queue.toString());
    }
}
