/*
 * Node class
 * @author Roberto Rodriguez
 * @version 4/23/2018
 */
public class Node {
    //local variables
    private int frequency;
    private String word;
    private Node leftChild, rightChild;
    //no-args constructor
    public Node () {
        frequency = 0;
        word = null;
        leftChild = rightChild = null;
    }
    //overloaded constructor
    public Node(String n) {
        frequency = 1;
        word = n;
        leftChild = rightChild = null;
    }
    /*
     * @return String - return the word in the node
     */
    public String getWord() {
        return word;
    }
    /*
     * @return int - increase frequency
     */
    public void addFrequency() {
        frequency++;
    }
    /*
     * @return int - return the value for the frequency
     */
    public int getFrequecy () {
        return frequency;
    }
    /*
     * @return object - return the object of the left child
     */
    public Node getLeftChild () {
        return leftChild;
    }
    /*
     * @return object - return the object of the right child
     */
    public Node getRightChild () {
        return rightChild;
    }
    //setting a node to the right child
    public void setRightChild (Node n) {
        rightChild = n;
    }
    //setting a node to the left child
    public void setLeftChild (Node n) {
        leftChild = n;
    }
    /*
     * @param String
     * @return - to compare the current node with a node being added
     */
    public int compareTo(String r) {
        int temp;
        int value = 0;
        if (r.length() <= this.getWord().length())
            temp = r.length();
        else
            temp = this.getWord().length();

        for (int i = 0; i < temp; i++) {
            if (r.charAt(i) > this.getWord().charAt(i)) {
                value = 1;
                break;
            }
            else if (r.charAt(i) < this.getWord().charAt(i)) {
                value = -1;
                break;
            }
        }
        return value;
    }
    /*
     * @return String - to return the word in the node
     */
    public String toString () {
        return "" + word;
    }
}

