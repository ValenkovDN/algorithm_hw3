import java.util.Comparator;

/**
 * Связный список
 */
public class LinkedList<T> {
    /**
     * Указатель на первф элемент связного списка
     */
    private Node head;

    private Node tail;


    /**
     * Узел связного списка
     */
    public class Node{

        /**
         * Указатель на следующий элемент связного списка
         */
        public Node next;

        /**
         * Значение
         */
        public T value;
    }


    // Проверка на то, пустая ли голова
    public boolean isEmpty() {
        return head == null;
    }






    /**
     * добавление нового элемента в начало списка
     * @param value значение
     */
    public void addFirst(T value){
        Node node = new Node();
        node.value = value;
        if(head != null) {
            node.next = head;
        }
        head = node;
    }

    /**
     * Удаление первого элемента из списка
     */
    public void removeFirst(){
        if(head != null){
            head = head.next;
        }
    }


    /**
     * поиск элемента в списке по значению
     * @param value элемент
     * @return
     */
    public Node contains(T value){
        Node node = head;
        while (node != null){
            if(node.value.equals(value))
                return  node;
            node = node.next;
        }
        return  null;
    }

    /**
     * сортировка связного списка
     * @param comparator
     */
    public void sort(Comparator<T> comparator){
        Node node = head;
        while (node != null){
            Node minValueNode = node;
            Node node2 = node.next;
            while (node2 != null){
                if(comparator.compare(minValueNode.value, node2.value) > 0){
                    minValueNode = node2;
                }
                node2 = node2.next;
            }
            if (minValueNode != node){
                T buf = minValueNode.value;
                minValueNode.value = node.value;
                node.value = buf;
            }
            node = node.next;
        }
    }


    /**
     * Разворот списка
     */
    public void reverse() {
        if (!isEmpty() && head.next != null) {
            tail = head;
            Node current = head.next;
            head.next = null;
            while (current != null) {
                Node next = current.next;
                current.next = head;
                head = current;
                current = next;
            }
        }
    }









    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node node = head;
        while (node != null){
            stringBuilder.append(node.value);
            stringBuilder.append('\n');
            node = node.next;
        }
        return stringBuilder.toString();
    }
}
