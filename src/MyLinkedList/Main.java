package MyLinkedList;

public class Main {
    public static void main(String[] args) {
        testMyLinkedList();
    }

    public static void testMyLinkedList(){
        LinkedList list = new LinkedList();
        list.insertAtTheBeginning(1);
        list.insertAtTheBeginning(2);

        list.insertAtTheEnd(10);

        list.insertAt(1,19);

        list.deleteAt(2);

        list.showData();
    }
}
