package Solution.BFS;

import Solution.Common;
import Solution.Ref.Node;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPath implements Common {
    /**
     * 2진트리 넓이 우선 탐색으로 출력 (BFS)
     */

    Node root;

    @Override
    public void solution() {
        ShortestPath tree = new ShortestPath();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
        tree.root.rt.lt = new Node(6);
        tree.root.rt.rt = new Node(7);
        tree.root.rt.rt.lt = new Node(8);
        BFS(tree.root);
    }
    void BFS(Node root){
        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);
        int level = 0;

        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Node temp = queue.poll();
                if(temp.lt == null && temp.rt == null){
                    System.out.println("Length : " + (level));
                    return;
                }else {
                    if(temp.lt != null) queue.offer(temp.lt);
                    if(temp.rt != null) queue.offer(temp.rt);
                }
            }
            level++;
        }
    }
}

