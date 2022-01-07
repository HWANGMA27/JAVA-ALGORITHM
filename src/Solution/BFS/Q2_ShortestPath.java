package Solution.BFS;

import Solution.Common;
import Solution.Ref.Node;

import java.util.LinkedList;
import java.util.Queue;

public class Q2_ShortestPath implements Common {
    /**
     * 말단 노드까지의 가장 짧은 경로(BFS)
     */

    Node root;

    @Override
    public void solution() {
        Q1_BinaryTree tree = new Q1_BinaryTree();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
        int level = BFS(tree.root);
        System.out.println(level);
    }

    int BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node node = queue.poll();
                if(node.lt == null && node.rt == null){
                    return level;
                }else{
                    if(node.lt != null) queue.offer(node.lt);
                    if(node.rt != null) queue.offer(node.rt);
                }
            }
            level++;
        }
        return 0;
    }
}
