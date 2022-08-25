package com.bridgelabz;

public class BinaryTreeMain {

    public static void main(String[] args) {

        BinaryTree b1 = new BinaryTree();
        Node root = null;

        root = b1.insert(root, 70);
        root = b1.insert(root, 30);
        root = b1.insert(root, 56);
        root = b1.insert(root, 22);
        root = b1.insert(root, 40);
        root = b1.insert(root, 60);
        root = b1.insert(root, 3);
        root = b1.insert(root, 63);
        root = b1.insert(root, 65);
        root = b1.insert(root, 95);
        root = b1.insert(root, 6);
        root = b1.insert(root, 11);
        root = b1.insert(root, 67);


        b1.print(root);
    }
}
