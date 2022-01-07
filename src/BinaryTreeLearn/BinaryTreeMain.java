package BinaryTreeLearn;

import java.util.List;

public class BinaryTreeMain {
    public static void main(String[] args) {
        BinaryTreeTraverse binaryTree = new BinaryTreeTraverse();
        TreeNode treeNode = new TreeNode(3);
        TreeNode treeNode1 = new TreeNode(2, treeNode, null);
        TreeNode treeNode2 = new TreeNode(1, null, treeNode1);
        List<Integer> list= binaryTree.preorderTraversal(treeNode2);

        for (int num : list) {
            System.out.println(num);
        }
    }
}
