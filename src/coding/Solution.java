package coding;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Stack;

public class Solution {
	
	
	public static int solution(Node T) {
        // write your code in Java SE 8
		int maxValue=0;
		for (Entry<Integer, Set<Integer>> entry:result.entrySet() ) {
			if(entry.getValue().size() > maxValue)
				maxValue=entry.getValue().size();
		}
		return maxValue-1;
    }
	
	
	static class Node {
		public int value;
		public Node left;
		public Node right;
		
		public Node(int vaue) {
			this.value=vaue;
			left=right=null;
		}
	}
	
	static class BinartTree {
		public Node root;
	
		public void travelThroughPath(Node node,int counter){
			if(node==null)
				return ;
			if(result.get(counter)==null)
				result.put(counter, new HashSet<>());

			result.get(counter).add(node.value);
			if(node.left==null && node.right==null){
			}else{
				if(node.left!=null)
					travelThroughPath(node.left,counter+1);
				if(node.right!=null)
					travelThroughPath(node.right,counter+1);
			}
		}
		
		


	    public void print(Node root) {
	        int[] values = new int[100];

	        traverse(root, 0, values);
	    }

	    private void traverse(Node node, int level, int[] values) {
	        if (node == null) return;
	        values[level] = node.value;
	        // reached a leaf?
	        if (node.left == null && node.right == null)  printPath(values, level);

	        // visit the left node
	        if (node.left != null)  traverse(node.left, level + 1, values);
	        
	        // visit the right node
	        if (node.right != null) traverse(node.right, level + 1, values);
	        
	    }
	    
	    public void traverse2(Node root) {
	        Stack<Node> stack = new Stack<Node>();
	        Stack<Integer> levels = new Stack<Integer>();
	        int[] values = new int[100];
	        Node node = root;
	        int level = 0;
	        while (!stack.isEmpty() || node != null) {
	            if (node != null) {
	                values[level] = node.value;
	                level++;
	                if (node.right != null) {
	                    stack.push(node.right);
	                    levels.push(level);
	                }
	                if (node.left == null && node.right == null) {
	                    printPath(values, level - 1);
	                }
	                node = node.left;
	            } else {
	                node = stack.pop();
	                level = levels.pop();
	            }
	        }
	    }

	    private void printPath(int[] array, int level) {
	        for (int i = 0; i <= level; i++) {
	            System.out.print(String.valueOf(array[i]) + " ");
	        }
	        System.out.println("");
	    }


	}
	
	static Map<Integer, Set<Integer>> result=new HashMap<>();
	public static void main(String[] args) {
		BinartTree tree=new BinartTree();
		tree.root=new Node(4);
		tree.root.left=new Node(5);
		tree.root.right=new Node(6);
		tree.root.right.left=new Node(1);
		tree.root.right.right=new Node(6);
		tree.root.left.left=new Node(4);
		tree.root.left.left.left=new Node(5);
		
		tree.travelThroughPath(tree.root, 0);
		int maxValue=0;
		for (Entry<Integer, Set<Integer>> entry:result.entrySet() ) {
			if(entry.getValue().size() > maxValue)
				maxValue=entry.getValue().size();
		}
		System.out.println(maxValue);
	}
	

}
