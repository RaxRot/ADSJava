package MyCircularLinkedList;

public class Main {
    public static void main(String[] args) {
        testCircularLinkedList();
    }
    public static void testCircularLinkedList(){
        CircularLinkedList list = new CircularLinkedList();
        list.insertAtTheBeginning(1);
        list.insertAtTheBeginning(2);

        list.insertAtTheEnd(56);

        list.insertAt(1,23);

        list.deleteAt(3);

        list.showData();
    }
}
