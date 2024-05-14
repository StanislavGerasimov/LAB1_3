public class TreeNode {
    private Student student;
    private TreeNode leftChild;
    private TreeNode rightChild;
    private TreeNode parent;
    public TreeNode(Student student) {
        this.student = student;
        this.leftChild = null;
        this.rightChild = null;
        this.parent = null;
    }

    public Student getStudent() {
        return student;
    } //геттер об'єкту "студент"

    public void setStudent(Student student) {  //сеттер об'єкту студент
        this.student = student;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }   //геттер лівого нащадку

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }   //сеттер лівого нащадку

    public TreeNode getRightChild() {
        return rightChild;
    }   //геттер правого нащадку

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }    //сеттер правого нащадку
    public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }


}
