package Solution.DFS;

import Solution.BFS.Q1_BinaryTree;
import Solution.Common;
import Solution.Ref.Node;

public class Q3_ShortestPath implements Common {

    /*
    말단 노드까지의 가장 짧은 경로(DFS)
     */
    Node root;
    @Override
    public void solution() {
        Q3_ShortestPath tree = new Q3_ShortestPath();
        tree.root = new Node(1);
        tree.root.lt = new Node(2);
        tree.root.rt = new Node(3);
        tree.root.lt.lt = new Node(4);
        tree.root.lt.rt = new Node(5);
//        tree.root.rt.lt = new Node(6);
//        tree.root.rt.rt = new Node(7);
//        tree.root.rt.rt.lt = new Node(8);
        int level = DFS(0, tree.root);
        System.out.println(level);
    }

    private int DFS(int level, Node root) {
        if(root.rt == null && root.lt == null){
            return level;
        }else{
            return Math.min(DFS(level+1, root.lt), DFS(level+1, root.rt));
        }
    }
}
