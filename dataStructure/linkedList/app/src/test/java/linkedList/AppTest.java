/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void testInsertionMethod(){
        LinkedList linkedList = new LinkedList();
        assertEquals(null,linkedList.head,"Test The initial value of the head of linked list without insert value");

        linkedList.insert(1);
        assertEquals(1,linkedList.head.value,"Test The initial value of the head of linked list after insert value");

        linkedList.insert(2);
        assertEquals(2,linkedList.head.value,"Test The initial value of the head of linked list after add 2 value");
    }
    @Test public void testIncludeMethod() {
        LinkedList linkedList = new LinkedList();
        linkedList.insert(1);
        linkedList.insert(2);

        assertTrue(linkedList.include(2));
        assertFalse(linkedList.include(5));
    }
    @Test public void testToString() {
        LinkedList linkedList = new LinkedList();
        assertEquals("Null",linkedList.toString());

        linkedList.insert(1);
        linkedList.insert(2);
        linkedList.insert(0);

        assertEquals("{ 0 } -> { 2 } -> { 1 } -> Null",linkedList.toString());
    }
    @Test public void testAppend(){
        LinkedList linkedList =new LinkedList();
        assertEquals("Null",linkedList.toString());

        linkedList.append(1);
        linkedList.append(2);
        linkedList.append(3);
        linkedList.append(4);
        linkedList.append(5);

        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> Null",linkedList.toString());
    }
    @Test public void testInsertAfter(){
        LinkedList linkedList =new LinkedList();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        linkedList.insertAfter(3,31);

        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 31 } -> Null",linkedList.toString());
    }
    @Test public void testInsertBefore(){
        LinkedList linkedList =new LinkedList();

        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);

        linkedList.insertBefore(3,29);

        assertEquals("{ 1 } -> { 2 } -> { 29 } -> { 3 } -> Null",linkedList.toString());

        //add before the head
        LinkedList linkedList1 =new LinkedList();

        linkedList1.insert(2);
        linkedList1.insert(1);
        linkedList1.insert(0);

        linkedList1.insertBefore(0,29);

        assertEquals("{ 29 } -> { 0 } -> { 1 } -> { 2 } -> Null",linkedList1.toString());
    }
    @Test public void testDeleteByKey(){
        LinkedList linkedList =new LinkedList();
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insert(0);

        linkedList.deleteNodeByKey(3);

        assertEquals("{ 0 } -> { 1 } -> { 2 } -> { 4 } -> Null",linkedList.toString());
    }
    @Test public void testKthFromEnd(){
        //test Where k is greater than the length of the linked list
        LinkedList linkedList =new LinkedList();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
        linkedList.insert(0);

        assertEquals("the k is greater that the length of the LinkedList",linkedList.kthFromEnd(7));

        //test Where k and the length of the list are the same

        LinkedList linkedList1 =new LinkedList();
        linkedList1.insert(5);
        linkedList1.insert(4);
        linkedList1.insert(3);

        assertEquals("the k is equal to the length of the LinedList you should provided number less than the length of linkedlist ",linkedList1.kthFromEnd(3));

        //test Where k is not a positive integer
        LinkedList linkedList2 =new LinkedList();
        linkedList2.insert(9);
        linkedList2.insert(5);
        linkedList2.insert(52);

        assertEquals("The number of k should be positive",linkedList2.kthFromEnd(-1));

        //test Where the linked list is of a size 1
        LinkedList linkedList3 =new LinkedList();
        linkedList3.insert(77);

        assertEquals(77,linkedList3.kthFromEnd(0));
    }
    @Test public void testFindMiddle(){
        LinkedList linkedList =new LinkedList();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.append(8);
        linkedList.append(2);
        linkedList.insertBefore(2,77);

        assertEquals(8,linkedList.printMiddle());
    }
    @Test public void testGetSizeOfTheLinkedList(){
        LinkedList linkedList =new LinkedList();
        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.append(8);
        linkedList.append(2);
        linkedList.insertBefore(2,77);

        assertEquals(5,linkedList.getCount());
    }
    @Test public void testZipMethod(){
        LinkedList linkedList1 =new LinkedList();
        linkedList1.append(1);
        linkedList1.append(3);
        linkedList1.append(5);
        linkedList1.append(7);
        linkedList1.append(9);

        LinkedList linkedList2 =new LinkedList();
        linkedList2.append(2);
        linkedList2.append(4);
        linkedList2.append(6);
        linkedList2.append(8);
        linkedList2.append(10);


        assertEquals("{ 1 } -> { 2 } -> { 3 } -> { 4 } -> { 5 } -> { 6 } -> { 7 } -> { 8 } -> { 9 } -> { 10 } -> Null", linkedList1.zipLists(linkedList1,linkedList2));
    }
}
