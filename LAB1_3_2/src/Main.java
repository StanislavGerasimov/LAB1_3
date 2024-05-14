public class Main {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Додавання студентів до бінарного дерева
        tree.addStudent(new Student("Петров", "Іван", 3, 12345, "спорт"));
        tree.addStudent(new Student("Сидорова", "Олена", 2, 23456, "спорт"));
        tree.addStudent(new Student("Іванов", "Петро", 4, 34567, "спорт"));
        tree.addStudent(new Student("Коваленко", "Марія", 1, 45678, "спорт"));

        // Виведення вмісту бінарного дерева у табличному вигляді
        System.out.println("Вміст бінарного дерева:");
        tree.printTree();

        // Знаходження та виведення студентів 2 курсу, які займаються спортом
        System.out.println("\nСтуденти 2 курсу, які займаються спортом:");
        tree.findSecondYearSportStudents();
    }
}