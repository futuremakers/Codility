package codility.tree;

import java.util.HashMap;
import java.util.Map;




 public class Main{
	 
	static class Node {
			int data;
			Node left,right=null;
			
			public Node(int data) {
				this.data=data;
				left=right=null;
			}
		}

			static  class BinaryTree {
			Node root;
			
			int largestUinquePathUtil(Node node, Map<Integer, Integer> m,int counter)
			{
			    if (node==null)
			        return m.size();
			    // put this node into hash
			    m.put(node.data, counter++);
			 
			    int max_path = Math.max(largestUinquePathUtil(node.left, m,counter),largestUinquePathUtil(node.right, m,counter));
			 
			    // remove current node from path "hash"
			    m.remove(node.data);
			 
			    // if we reached a condition where all duplicate value
			    // of current node is deleted
			    if (m.get(node.data) == 0)
			        m.remove(node.data);
			 
			    return max_path;
			}
			}
	
	public static void main(String[] args) {
		 // Create binary tree shown in above figure
		 BinaryTree tree = new BinaryTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.right.left = new Node(6);
		tree.root.right.right = new Node(7);
		tree.root.right.left.right = new Node(8);
		tree.root.right.right.right = new Node(9);
		Map<Integer, Integer> m =new HashMap<>();
		int counter=0;
		System.out.println(tree.largestUinquePathUtil(tree.root, m, counter));
	}
	
	
}