package comp2402a5;

public class BSTNode<Node extends BSTNode<Node,T>,T>
        extends BinaryTreeNode<Node> {
    /**
     * The key stored at this node
     */
    T x;

}
