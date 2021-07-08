import java.io.*;
import java.util.*;
 
public class Btree {
    public static StringBuilder sb = new StringBuilder();
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BinaryTree tree = new BinaryTree(Integer.parseInt(br.readLine()));
        String s = "";
        while ((s = br.readLine()) != null && s.length() != 0) {    //EOF���� �Է¹���
            tree = tree.addTree(tree, Integer.parseInt(s));
        }
        postorder(tree);
        System.out.println(sb);
    }
 
    public static void postorder(BinaryTree tree) {
        if (tree.left != null) postorder(tree.left);
        if (tree.right != null) postorder(tree.right);
        sb.append(tree.data + "\n");
    }
}
 
class BinaryTree {
    int data;
    BinaryTree left;
    BinaryTree right;
 
    public BinaryTree(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
 
    public BinaryTree addTree(BinaryTree tree, int val) {
        BinaryTree curTree = null;
        if (tree == null) return new BinaryTree(val);
        if (tree.data > val) {
            curTree = addTree(tree.left, val);  //���ο� ���� ���� Ʈ�� ����
            tree.left = curTree;                //�θ� ����� ���ʿ� ���δ�
        } else if (tree.data < val) {
            curTree = addTree(tree.right, val); //���ο� ���� ���� Ʈ�� ����
            tree.right = curTree;               //�θ� ����� �����ʿ� ���δ�
        }
        return tree;                            //���� ���� Ʈ�� return
    }
}