package Solution.BFS;

import Solution.Common;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree implements Common {
    /**
     * 2진트리 넓이 우선 탐색으로 출력 (BFS)
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
        BFS(tree.root);
    }
    void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()){
            int len = queue.size();
            for (int i = 0; i < len ; i++) {
                Node node = queue.poll();
                System.out.println(node.data);
                if(node.lt != null) queue.offer(node.lt);
                if(node.rt != null) queue.offer(node.rt);
            }
        }
    }
}

class Node{
    int data;
    Node lt, rt;

    public Node(int var){
        data = var;
        lt = rt = null;
    }
}
