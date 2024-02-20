import java.util.*;

public class DiameterOfTree {
    static int res = -1;
    public static class Node{
        int val;
        Node left;
        Node right;
        public Node(int val){
            this.val = val;
        }
    }
    public static int Diameter(Node root){
        if(root==null) return -1;

        int lft = 1 + Diameter(root.left);
        int rgt = 1 + Diameter(root.right);

        res = Math.max(res,(lft+rgt));

        return Math.max(lft, rgt);

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        root.left = a;
        root.right = b;
        Node c = new Node(4);
        Node d = new Node(5);
        a.left = c;
        a.right = d;
        Node e = new Node(6);
        b.right = e;
        Diameter(root);

        System.out.println(res);
    }
}
