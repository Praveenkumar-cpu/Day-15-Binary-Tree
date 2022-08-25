package com.bridgelabz;

public class BinaryTreeMain {

    public static void main(String[] args) {

        BinaryTree b1 = new BinaryTree();
        Node root = null;

        root = b1.insert(root, 70);
        root = b1.insert(root, 30);
        root = b1.insert(root, 56);
       

        b1.print(root);
    }
}
