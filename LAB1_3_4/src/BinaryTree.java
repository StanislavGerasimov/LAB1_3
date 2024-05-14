public class BinaryTree {
    private TreeNode root;

    public BinaryTree() {
        this.root = null;
    }

    // Метод для додавання студента до бінарного дерева
    public void addStudent(Student student) {
        root = addRecursive(root,null, student);
    }


    private TreeNode addRecursive(TreeNode current, TreeNode parent, Student student) {
        if (current == null) {
            TreeNode newNode = new TreeNode(student);
            newNode.setParent(parent); // Встановлюємо посилання на батька для нового вузла
            return newNode;
        }

        if (student.getStudentID() < current.getStudent().getStudentID()) {
            current.setLeftChild(addRecursive(current.getLeftChild(), current, student));
        } else if (student.getStudentID() > current.getStudent().getStudentID()) {
            current.setRightChild(addRecursive(current.getRightChild(), current, student));
        }

        return current;
    }

    /// Метод для виведення вмісту бінарного дерева у табличному вигляді
    public void printTree() {
        printRecursive(root, null, "ROOT");
    }

    private void printRecursive(TreeNode node, TreeNode parent, String position) {
        if (node != null) {
            node.getStudent().display();
            System.out.println("Parent: " + (parent != null ? parent.getStudent().getLastName() : "None"));
            System.out.println("Position: " + position);
            System.out.println();
            printRecursive(node.getLeftChild(), node, "LEFT");
            printRecursive(node.getRightChild(), node, "RIGHT");
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

    // Метод для видалення студентів 2 курсу, які займаються спортом
    public void removeSecondYearSportStudents() {
        root = removeSecondYearSportStudentsRecursive(root);
    }

    private TreeNode removeSecondYearSportStudentsRecursive(TreeNode current) {
        if (current == null) {
            return null;
        }

        // Рекурсивно обробляємо лівий та правий піддерева
        current.setLeftChild(removeSecondYearSportStudentsRecursive(current.getLeftChild()));
        current.setRightChild(removeSecondYearSportStudentsRecursive(current.getRightChild()));

        // Перевіряємо, чи поточний студент задовольняє критерії пошуку
        if (current.getStudent().isSecondYearSportStudent()) {
            // Якщо так, видаляємо його
            return removeNode(current);
        }

        return current;
    }

    //метод видалення вузлів
    private TreeNode removeNode(TreeNode node) {
        // Випадок 1: вузол не має дочірніх вузлів
        if (node.getLeftChild() == null && node.getRightChild() == null) {
            return null;
        }
        // Випадок 2: вузол має лише одного дочірнього вузла
        if (node.getLeftChild() == null) {
            return node.getRightChild();
        }
        if (node.getRightChild() == null) {
            return node.getLeftChild();
        }
        // Випадок 3: вузол має обидва дочірні вузли
        TreeNode smallestRightChild = findSmallestNode(node.getRightChild());
        node.getStudent().display();
        node.getStudent().display();
        node.getStudent().display();
        node.getStudent().display();
        node.getStudent().display();
        node.setStudent(smallestRightChild.getStudent());
        node.setRightChild(removeSecondYearSportStudentsRecursive(smallestRightChild));
        return node;
    }

    private TreeNode findSmallestNode(TreeNode node) {
        while (node.getLeftChild() != null) {
            node = node.getLeftChild();
        }
        return node;
    }
}
