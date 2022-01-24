/*
 * BinarySearchTree class
 * @author Roberto Rodriguez
 * @version 4/23/2018
 */
public class BinarySearchTree {
    private Node root;
    //no-args constructor
    public BinarySearchTree () {
        root = null;
    }
    //checking to see if root is empty
    public boolean isEmpty () {
        return root == null;
    }
    //inserting a word into a node if the word is not already in the tree
    public void insert (String n) {
        Node temp = search(n);
        if (temp == null) {
            add(new Node(n));
        }
        else {
            temp.addFrequency();
            System.out.println(temp.getWord() + " increased to " + temp.getFrequecy() + " frequency");
        }
    }
    //adding a node in a particular location
    public void add (Node n) {

        //If the tree is empty, put the object at the root
        if ( isEmpty() ) {
            root = n;
        } else {
            add(root, n);
        }
    }
    //using recursion to add nodes to the tree and determining where the node goes
    void add (Node subRoot, Node n) {

        //Determine whether p should go left or right
        if ( subRoot.compareTo(n.getWord()) == -1 ) {     //Left

            //Is there a left child already
            if (subRoot.getLeftChild () == null) {
                //Put n as root's left child
                subRoot.setLeftChild (n);
            } else {
                //Recursively call add on the left child
                add (subRoot.getLeftChild(), n);
            }
        } else {                                           //Right

            //Is there a right child already
            if (subRoot.getRightChild () == null) {
                //Put n as root's right child
                subRoot.setRightChild (n);
            } else {
                //Recursively call add on the right child
                add (subRoot.getRightChild(), n);
            }
        }
    }

    public Node search (String c) {
        //Searching for words that are the same

        if ( isEmpty() )
            return null;

        return search (root, c);
    }

    Node search (Node subroot, String c) {

        //Did we find a match
        if ( c.equals(subroot.getWord()) ) {
            System.out.println("Found " + subroot.getWord() + " in tree");
            return subroot;
        } else if (subroot.compareTo(c) == -1) {   //Left

            //Is there a left child
            if (subroot.getLeftChild () == null) {
                return null;
            } else {
                return search (subroot.getLeftChild (), c);
            }

        } else {                                    //Right

            //Is there a right child
            if (subroot.getRightChild () == null) {
                return null;
            } else {
                return search (subroot.getRightChild (), c);
            }

        }

    }

    public void printPreOrder () {

        System.out.println ("Running PreOrder Traversal:");
        printPreOrder (root);
    }

    void printPreOrder (Node subroot) {
        if (subroot == null)
            return;

        //Print subroot
        System.out.println ( subroot.toString() );

        //Left subtree
        printPreOrder ( subroot.getLeftChild () );

        //Right subtree
        printPreOrder ( subroot.getRightChild () );
    }

    public void printInOrder () {

        System.out.println ("Running InOrder Traversal:");
        printInOrder (root);
    }

    void printInOrder (Node subroot) {
        if (subroot == null)
            return;

        //Left subtree
        printInOrder ( subroot.getLeftChild () );

        //Print subroot
        System.out.println ( subroot.toString() );

        //Right subtree
        printInOrder ( subroot.getRightChild () );
    }

    public void printPostOrder () {

        System.out.println ("Running PostOrder Traversal:");
        printPostOrder (root);
    }

    void printPostOrder (Node subroot) {
        if (subroot == null)
            return;

        //Left subtree
        printPostOrder ( subroot.getLeftChild () );

        //Right subtree
        printPostOrder ( subroot.getRightChild () );

        //Print subroot
        System.out.println ( subroot.toString() );
    }
}
