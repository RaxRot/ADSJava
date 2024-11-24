import java.util.NoSuchElementException;

public class MyQueue {
    private int[] queue;  // Массив для хранения элементов очереди
    private int front;    // Индекс первого элемента в очереди
    private int rear;     // Индекс последнего элемента в очереди
    private int size;     // Количество элементов в очереди
    private int capacity; // Вместимость очереди

    public MyQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;  // rear указывает на последний элемент
        this.size = 0;
    }

    // Добавление элемента в очередь
    public void enqueue(int data) {
        if (size == capacity) {  // Проверка на переполнение
            resize();
        }

        // Инкремент rear и добавление элемента
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;
    }

    // Удаление элемента из очереди-
    public int dequeue() {
        if (size == 0) {  // Проверка на пустую очередь
            throw new NoSuchElementException("Queue is empty");
        }

        int data = queue[front];
        front = (front + 1) % capacity;  // Переход к следующему элементу
        size--;
        return data;
    }

    // Получение первого элемента в очереди без удаления
    public int peek() {
        if (size == 0) {  // Проверка на пустую очередь
            throw new NoSuchElementException("Queue is empty");
        }
        return queue[front];
    }

    // Метод для увеличения размера массива очереди
    private void resize() {
        int[] newQueue = new int[capacity * 2];  // Удваиваем размер
        int j = 0;

        // Копируем элементы из старого массива в новый
        for (int i = front; i < capacity; i++) {
            newQueue[j++] = queue[i];
        }
        for (int i = 0; i < front; i++) {
            newQueue[j++] = queue[i];
        }

        // Обновляем указатели
        front = 0;
        rear = size - 1;
        capacity *= 2;
        queue = newQueue;  // Переназначаем ссылку на новый массив
    }

    // Метод для отображения всех элементов в очереди
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.print(queue[(front + i) % capacity] + " ");
        }
        System.out.println();
    }

    // Проверка, пуста ли очередь
    public boolean isEmpty() {
        return size == 0;
    }

    // Проверка, полна ли очередь
    public boolean isFull() {
        return size == capacity;
    }
}