/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList =new LinkedList<>();
//        linkedList.insert(5);
        linkedList.insert(4);
        linkedList.insert(3);
        linkedList.insert(2);
        linkedList.insert(1);
//        linkedList.append(6);
//        linkedList.append(7);
//        linkedList.append(8);
//        linkedList.append(9);
//        linkedList.removeFirst();
//        linkedList.reverse();
        System.out.println(linkedList.printMiddle());
//        System.out.println(linkedList.getCount());
//        linkedList.insertBefore(2,29);
//        linkedList.insertAfter(5,55);
//        linkedList.deleteNodeByKey(55);
//        linkedList.deleteNodeByKey(0);
//        System.out.println(linkedList.include(5));
//        System.out.println(linkedList.toString());
//        System.out.println(linkedList.kthFromEnd(9));
//        System.out.println(linkedList.printMiddle());
//        System.out.println(linkedList.GetNth(9));

        //Zip to LinkedList
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


//        System.out.println(linkedList1.zipLists(linkedList1,linkedList2));
//        System.out.println(linkedList2.zipLists(linkedList2,linkedList1));

        linkedList.insert(1);
        linkedList.insert(0);
        linkedList.append(1);
        linkedList.append(0);
        boolean x= linkedList.isPalindrome();
        System.out.println(x);
        System.out.println(linkedList.toString());
    }
}
