/**
 * This entire class is used to build a Binary Tree data structure.
 * There is the Node Class and the Tree Class, both explained below.
 *
 * @author Unknown
 * <p>
 * <p>
 * This class implements the nodes that will go on the Binary Tree.
 * They consist of the data in them, the node to the left, the node
 * to the right, and the parent from which they came from.
 * @author Unknown
 */


/**
 * This class implements the nodes that will go on the Binary Tree.
 * They consist of the data in them, the node to the left, the node
 * to the right, and the parent from which they came from.
 *
 * @author Unknown
 *
 */


/**
 * A binary tree is a data structure in which an element
 * has two successors(children). The left child is usually
 * smaller than the parent, and the right child is usually
 * bigger.
 *
 * @author Unknown
 */
class Tree {
    /** The root of the Binary Tree */
    private Node root;

    /**
     * Constructor
     */
    public Tree() {
        root = null;
    }

    /**
     * Method to find a Node with a certain value
     *
     * @param key Value being looked for
     * @return The node if it finds it, otherwise returns the parent
     */
    public Node find(int key) {
        Node current = root;
        while (current != null) {
            if (key < current.data) {
                current = current.left;
            } else if (key > current.data) {
                current = current.right;
            } else {    // If you find the value return it
                return current;
            }
        }
        return null;
    }

    /**
     * Inserts certain value into the Binary Tree
     *
     * @param value Value to be inserted
     */
    public void put(int value) {
        Node newNode = new Node(value);
        if (root == null)
            root = newNode;
        else {
            //This will return the soon to be parent of the value you're inserting
            Node parent = find(value);

            //This if/else assigns the new node to be either the left or right child of the parent
            if (value < parent.data) {
                parent.left = newNode;
                parent.left.parent = parent;
                return;
            } else {
                parent.right = newNode;
                parent.right.parent = parent;
                return;
            }
        }
    }

    /**
     * Deletes a given value from the Binary Tree
     *
     * @param value Value to be deleted
     * @return If the value was deleted
     */
    public boolean remove(int value) {
        //temp is the node to be deleted
        Node temp = find(value);

        //If the value doesn't exist
        if (temp.data != value)
            return false;

        //No children
        if (temp.right == null && temp.left == null) {
            if (temp == root)
                root = null;

                //This if/else assigns the new node to be either the left or right child of the parent
            else if (temp.parent.data < temp.data)
                temp.parent.right = null;
            else
                temp.parent.left = null;
            return true;
        }

        //Two children
        else if (temp.left != null && temp.right != null) {
            Node successor = findSuccessor(temp);

            //The left tree of temp is made the left tree of the successor
            successor.left = temp.left;
            successor.left.parent = successor;

            //If the successor has a right child, the child's grandparent is it's new parent
            if (successor.right != null && successor.parent != temp) {
                successor.right.parent = successor.parent;
                successor.parent.left = successor.right;
                successor.right = temp.right;
                successor.right.parent = successor;
            }
            if (temp == root) {
                successor.parent = null;
                root = successor;
                return true;
            }

            //If you're not deleting the root
            else {
                successor.parent = temp.parent;

                //This if/else assigns the new node to be either the left or right child of the parent
                if (temp.parent.data < temp.data)
                    temp.parent.right = successor;
                else
                    temp.parent.left = successor;
                return true;
            }
        }
        //One child
        else {
            //If it has a right child
            if (temp.right != null) {
                if (temp == root) {
                    root = temp.right;
                    return true;
                }

                temp.right.parent = temp.parent;

                //Assigns temp to left or right child
                if (temp.data < temp.parent.data)
                    temp.parent.left = temp.right;
                else
                    temp.parent.right = temp.right;
                return true;
            }
            //If it has a left child
            else {
                if (temp == root) {
                    root = temp.left;
                    return true;
                }

                temp.left.parent = temp.parent;

                //Assigns temp to left or right side
                if (temp.data < temp.parent.data)
                    temp.parent.left = temp.left;
                else
                    temp.parent.right = temp.left;
                return true;
            }
        }
    }

    /**
     * This method finds the Successor to the Node given.
     * Move right once and go left down the tree as far as you can
     *
     * @param n Node that you want to find the Successor of
     * @return The Successor of the node
     */
    public Node findSuccessor(Node n) {
        if (n.right == null)
            return n;
        Node current = n.right;
        Node parent = n.right;
        while (current != null) {
            parent = current;
            current = current.left;
        }
        return parent;
    }

    /**
     * Returns the root of the Binary Tree
     *
     * @return the root of the Binary Tree
     */
    public Node getRoot() {
        return root;
    }

    /**
     * Prints leftChild - root - rightChild
     *
     * @param localRoot The local root of the binary tree
     */
    public void inOrder(Node localRoot) {
        if (localRoot != null) {
            inOrder(localRoot.left);
            System.out.print(localRoot.data + " ");
            inOrder(localRoot.right);
        }
    }

    /**
     * Prints root - leftChild - rightChild
     *
     * @param localRoot The local root of the binary tree
     */
    public void preOrder(Node localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.data + " ");
            preOrder(localRoot.left);
            preOrder(localRoot.right);
        }
    }

    /**
     * Prints rightChild - leftChild - root
     *
     * @param localRoot The local root of the binary tree
     */
    public void postOrder(Node localRoot) {
        if (localRoot != null) {
            postOrder(localRoot.left);
            postOrder(localRoot.right);
            System.out.print(localRoot.data + " ");
        }
    }
}