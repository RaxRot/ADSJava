package MyCircularSinglyLinkedList;

public class MyCircularLinkedList {
    private Node head;

    public void insertAtEnd(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
            node.setNext(head);  // Устанавливаем, чтобы узел указывал на голову
        } else {
            Node temp = head;
            while (temp.getNext() != head) {  // Проходим до последнего узла
                temp = temp.getNext();
            }
            temp.setNext(node);
            node.setNext(head);  // Новый узел указывает на голову
        }
    }

    public void insertAtStart(int data) {
        Node node = new Node();
        node.setData(data);

        if (head == null) {
            head = node;
            node.setNext(head);  // Устанавливаем, чтобы узел указывал на голову
        } else {
            Node temp = head;
            while (temp.getNext() != head) {  // Проходим до последнего узла
                temp = temp.getNext();
            }
            node.setNext(head);
            temp.setNext(node);  // Последний узел указывает на новый узел
            head = node;  // Обновляем head на новый узел
        }
    }

    public void insertAt(int index, int data) {
        if (index == 0) {
            insertAtStart(data);
        } else {
            Node node = new Node();
            node.setData(data);
            Node temp = head;

            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
                if (temp == head) {  // Проверка на выход за пределы
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
            }
            node.setNext(temp.getNext());
            temp.setNext(node);
        }
    }

    public void deleteAt(int index) {
        if (head == null) {
            throw new IndexOutOfBoundsException("List is empty");
        }

        if (index == 0) {
            if (head.getNext() == head) {  // Если в списке только один узел
                head = null;
            } else {
                Node temp = head;
                while (temp.getNext() != head) {  // Проходим до последнего узла
                    temp = temp.getNext();
                }
                head = head.getNext();  // Обновляем head на следующий узел
                temp.setNext(head);     // Последний узел указывает на новый head
            }
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.getNext();
                if (temp.getNext() == head) {  // Проверка на выход за пределы
                    throw new IndexOutOfBoundsException("Index out of bounds");
                }
            }
            temp.setNext(temp.getNext().getNext());
        }
    }

    public int size() {
        if (head == null) return 0;

        int count = 1;
        Node temp = head;
        while (temp.getNext() != head) {
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void show() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.println(temp.getData());
            temp = temp.getNext();
        } while (temp != head);  // Продолжаем, пока не вернемся к head
    }
}