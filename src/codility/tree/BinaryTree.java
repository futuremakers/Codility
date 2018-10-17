package codility.tree;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
	BNode root;
	public void add(int value) {
	    root = addRecursive(root, value);
	}
	
	public boolean containsNode(int value) {
	    return containsNodeRecursive(root, value);
	}
	
	private BNode addRecursive(BNode current, int value) {
        if (current == null) {
            return new BNode(value);
        }
     
        if (value < current.value) {
            current.left = addRecursive(current.left, value);
        } else if (value > current.value) {
            current.right = addRecursive(current.right, value);
        } else {
            // value already exists
            return current;
        }
     
        return current;
    }
	private BNode deleteRecursive(BNode current, int value) {
	    if (current == null) {
	        return null;
	    }
	 
	    if (value == current.value) {
	        // Node to delete found
	        // ... code to delete the node will go here
	    } 
	    if (value < current.value) {
	        current.left = deleteRecursive(current.left, value);
	        return current;
	    }
	    current.right = deleteRecursive(current.right, value);
	    return current;
	}
	public void traverseInOrder(BNode node) {
	    if (node != null) {
	        traverseInOrder(node.left);
	        System.out.print(" " + node.value);
	        traverseInOrder(node.right);
	    }
	}
	public void traversePostOrder(BNode node) {
	    if (node != null) {
	        traversePostOrder(node.left);
	        traversePostOrder(node.right);
	        System.out.print(" " + node.value);
	    }
	}
	public void traversePreOrder(BNode node) {
	    if (node != null) {
	        System.out.print(" " + node.value);
	        traversePreOrder(node.left);
	        traversePreOrder(node.right);
	    }
	}
	
	public void traverseLevelOrder() {
	    if (root == null) {
	        return;
	    }
	 
	    Queue<BNode> nodes = new LinkedList<>();
	    nodes.add(root);
	 
	    while (!nodes.isEmpty()) {
	 
	    	BNode node = nodes.remove();
	 
	        System.out.print(" " + node.value);
	 
	        if (node.left != null) {
	            nodes.add(node.left);
	        }
	 
	        if (node.right!= null) {
	            nodes.add(node.right);
	        }
	    }
	}
	
	private int findSmallestValue(BNode root) {
	    return root.left == null ? root.value : findSmallestValue(root.left);
	}
	/*@Test
	public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
	    BinaryTree bt = createBinaryTree();
	 
	    assertTrue(bt.containsNode(6));
	    assertTrue(bt.containsNode(4));
	  
	    assertFalse(bt.containsNode(1));
	}*/
	private boolean containsNodeRecursive(BNode current, int value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    return value < current.value
	      ? containsNodeRecursive(current.left, value)
	      : containsNodeRecursive(current.right, value);
	}
	
	private BinaryTree createBinaryTree() {
	    BinaryTree bt = new BinaryTree();
	    bt.add(6);
	    bt.add(4);
	    bt.add(8);
	    bt.add(3);
	    bt.add(5);
	    bt.add(7);
	    bt.add(9);
	    return bt;
	}
}

class BNode {
    int value;
    BNode left;
    BNode right;
 
    BNode(int value) {
        this.value = value;
        right = null;
        left = null;
    }
    
    
}