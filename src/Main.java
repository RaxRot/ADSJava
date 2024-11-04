import MyDoublyLinkedList.DoublyLinkedList;
import MySinglyLinkedList.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        //testSinglyLinkedList();
        testDoubleLinkedList();
    }

    public static void testSinglyLinkedList(){
        MyLinkedList list = new MyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);

        list.insertAtStart(0);
        list.insertAt(1,99);

        list.deleteAt(2);

        list.show();
    }

    public static void testDoubleLinkedList(){
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtStart(10);
        list.insertAt(1,99);

        list.show();


    }
}