public class TreeNode {
    private Student student;
    private TreeNode leftChild;
    private TreeNode rightChild;

    public TreeNode(Student student) {
        this.student = student;
        this.leftChild = null;
        this.rightChild = null;
    }

    public Student getStudent() {
        return student;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(TreeNode leftChild) {
        this.leftChild = leftChild;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }
}
