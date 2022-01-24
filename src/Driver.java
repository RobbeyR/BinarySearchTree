/*
 * Driver Class
 * @author Roberto Rodriguez
 * @version 4/23/2018
 */

import java.util.Random;

public class Driver {
    public static void main(String[] args){

        //Library of words to be added to the tree.
        String[] words = {"Amok", "Nirvana", "Levin", "Minotaur", "Naif",
                "Brevet", "Dehort", "Costive", "Boffin", "Hoyle",
                "Scion", "Pissoir", "Looby", "Kvell", "Redact", "Pi" };

        Random rand = new Random(); // Initialize Random
        BinarySearchTree myTree = new BinarySearchTree(); // Initialize the BinarySearchTree

        // Loop to add items to the BinarySearchTree
        for (int addLoop = 0; addLoop < 30; addLoop++){
            int r = rand.nextInt(16);
            System.out.println("Adding: " + words[r]);
            myTree.insert(words[r]); // Method call to the BinarySearchTree to insert nodes
        }

        // Start multiple searches
        System.out.println("---Searches---");
        myTree.search(words[rand.nextInt(16)]);
        myTree.search(words[rand.nextInt(16)]);
        myTree.search(words[rand.nextInt(16)]);

        // Print the BinarySearchTree using all
        System.out.println("---Printing---");
        myTree.printPreOrder();
        myTree.printInOrder();
        myTree.printPostOrder();
    }
}

