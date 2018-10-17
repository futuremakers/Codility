package codility.tree;

public class DepthFirst {

	public static void main(String[] args) {
		Node<String> root = createTree();
		printTree(root, " ");
	}

	private static Node<String> createTree() {
		Node<String> root = new Node<>("root");

		Node<String> node1 = root.addChild(new Node<String>("node 1"));

		Node<String> node11 = node1.addChild(new Node<String>("node 11"));
		node11.addChild(new Node<String>("node 111"));
		node11.addChild(new Node<String>("node 112"));

		node1.addChild(new Node<String>("node 12"));

		Node<String> node2 = root.addChild(new Node<String>("node 2"));

		node2.addChild(new Node<String>("node 21"));
		node2.addChild(new Node<String>("node 22"));
		return root;
	}
	
	private static <T> void printTree(Node<T> node, String appender) {
		System.out.println(appender + node.getData());
		node.getChildren().forEach(each ->  printTree(each, appender + appender));
	}
}
