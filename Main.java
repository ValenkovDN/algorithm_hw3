public class Main {
    public static void main(String[] args) {
        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("Дима", 35));
        linkedList1.addFirst(new Employee("Саша", 35));
        linkedList1.addFirst(new Employee("Вася", 45));
        linkedList1.addFirst(new Employee("Коля", 33));
        linkedList1.addFirst(new Employee("Семен", 23));
        linkedList1.addFirst(new Employee("Вова", 56));
        linkedList1.addFirst(new Employee("Саша", 43));
        linkedList1.addFirst(new Employee("Дима", 28));

        System.out.println(linkedList1);
        linkedList1.sort(new EmployeeComporator(SortType.Ascending));
        System.out.println();
        System.out.println(linkedList1);
        System.out.println();
        linkedList1.reverse();
        System.out.println(linkedList1);
    }
}

