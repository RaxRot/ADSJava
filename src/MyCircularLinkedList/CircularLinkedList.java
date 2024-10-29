package MyCircularLinkedList;

public class CircularLinkedList {
    private Node head;

    public void insertAtTheEnd(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
            head.setNext(head);
        } else {
            Node temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(head);
        }
    }

    public void insertAtTheBeginning(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
            head.setNext(head);
        } else {
            Node temp = head;
            while (temp.getNext() != head) {
                temp = temp.getNext();
            }
            node.setNext(head);
            head = node;
            temp.setNext(head);
        }
    }

    public void insertAt(int index, int data) {


        if (index == 0) {
            insertAtTheBeginning(data);
            return;
        }

        Node node = new Node();
        node.setData(data);

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.getNext();
            if (temp == head) {
                System.out.println("Index out of bounds.");
                return;
            }
        }
        node.setNext(temp.getNext());
        temp.setNext(node);
    }

    public void deleteAt(int index) {
        if (index < 0 || head == null) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            if (head.getNext() == head) {
                head = null;
            } else {
                Node temp = head;
                while (temp.getNext() != head) {
                    temp = temp.getNext();
                }
                head = head.getNext();
                temp.setNext(head);
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
                if (temp.getNext() == head) {
                    System.out.println("Index out of bounds.");
                    return;
                }
            }
            temp.setNext(temp.getNext().getNext());
        }
    }

    public void showData() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node temp = head;
        do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        } while (temp != head); // Печатаем до возвращения в начало
    }
}