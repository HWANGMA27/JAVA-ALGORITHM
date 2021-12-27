package Solution.DFS;

import Solution.Common;
import Solution.Ref.Node;

public class BinaryTree implements Common {
    /**
     * 2진트리 출력 (전위 후위 중위)
     */

    Node root;

    @Override
    public void solution() {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.DFS1(tree.root);
        System.out.println();
        tree.DFS2(tree.root);
        System.out.println();
        tree.DFS3(tree.root);
    }
    //중위
    void DFS1(Node root){
        if(root == null) return;
        else {
            DFS1(root.lt);
            System.out.print(root.data + " ");
            DFS1(root.rt);
        }
    }
    void DFS2(Node root){
        if(root == null) return;
        else {
            System.out.print(root.data + " ");
            DFS2(root.lt);
            DFS2(root.rt);
        }
    }
    //후위
    void DFS3(Node root){
        if(root == null) return;
        else {
            DFS3(root.lt);
            DFS3(root.rt);
            System.out.print(root.data + " ");
        }
    }
}
