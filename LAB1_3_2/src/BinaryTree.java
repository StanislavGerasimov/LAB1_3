public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Метод для додавання студента до бінарного дерева
    public void addStudent(Student student) {
        root = addRecursive(root, student);
    }

    private TreeNode addRecursive(TreeNode current, Student student) {
        if (current == null) {
            return new TreeNode(student);
        }

        if (student.getStudentID() < current.getStudent().getStudentID()) {
            current.setLeftChild(addRecursive(current.getLeftChild(), student));
        } else if (student.getStudentID() > current.getStudent().getStudentID()) {
            current.setRightChild(addRecursive(current.getRightChild(), student));
        } else {
            // Випадок, коли ключ вже існує
            System.out.println("Студент з номером " + student.getStudentID() + " вже існує.");
        }

        return current;
    }

    // Метод для виведення вмісту бінарного дерева у табличному вигляді
    public void printTree() {
        printRecursive(root);
    }

    private void printRecursive(TreeNode node) {
        if (node != null) {
            printRecursive(node.getLeftChild());
            node.getStudent().display();
            printRecursive(node.getRightChild());
        }
    }

    // Метод для пошуку студентів 2 курсу, які займаються спортом
    public void findSecondYearSportStudents() {
        findSecondYearSportStudentsRecursive(root);
    }

    private void findSecondYearSportStudentsRecursive(TreeNode node) {
        if (node != null) {
            findSecondYearSportStudentsRecursive(node.getLeftChild());
            if (node.getStudent().isSecondYearSportStudent()) {
                node.getStudent().display();
            }
            findSecondYearSportStudentsRecursive(node.getRightChild());
        }
    }
}
