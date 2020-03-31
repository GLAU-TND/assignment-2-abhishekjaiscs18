/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class
import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree myBinarySearchTree =new MyBinarySearchTree();
        int[] insertData={13, 3, 4, 12, 14, 10, 5, 1, 8, 2, 7, 9, 11, 6, 18,15,20,25,16,30};
        for (int a:
                insertData) {
            myBinarySearchTree.insert(a);
            System.out.print("Inserted : "+a+"  ");
        }
        System.out.println("\nTree Traversal : ");
        myBinarySearchTree.traverse(myBinarySearchTree.root);
        System.out.println("\nTraversal of all Left Children : ");
        myBinarySearchTree.traverseLeftChildren(myBinarySearchTree.root);
        System.out.print("\nNumber of  nodes without left child : ");
        myBinarySearchTree.noOfNodesWithoutLeftChild(myBinarySearchTree.root);

    }
}