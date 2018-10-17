package codility.tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Node<T> {
	
	private T data=null;
	
	private Node<T> parent=null;
	
	private List<Node<T>> children=new ArrayList<>();
	
	public Node(T data ) {
		this.data=data;
	}
	
	
	public Node<T> addChild(Node<T> child){
		child.setParent(this);
		this.children.add(child);
		return child;
	}

	
	public Node<T> getRoot() {
		 if(parent == null){
		  return this;
		 }
		 return parent.getRoot();
	}
	
	public void deleteNode() {
		if (parent != null) {
			int index = this.parent.getChildren().indexOf(this);
			this.parent.getChildren().remove(this);
			for (Node<T> each : getChildren()) {
				each.setParent(this.parent);
			}
			this.parent.getChildren().addAll(index, this.getChildren());
		} else {
			deleteRootNode();
		}
		this.getChildren().clear();
	}

	public Node<T> deleteRootNode() {
		if (parent != null) {
			throw new IllegalStateException("deleteRootNode not called on root");
		}
		Node<T> newParent = null;
		if (!getChildren().isEmpty()) {
			newParent = getChildren().get(0);
			newParent.setParent(null);
			getChildren().remove(0);
			for (Node<T> each : getChildren()) {
				each.setParent(newParent);
			}
			newParent.getChildren().addAll(getChildren());
		}
		this.getChildren().clear();
		return newParent;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getParent() {
		return parent;
	}

	public void setParent(Node<T> parent) {
		this.parent = parent;
	}


	public List<Node<T>> getChildren() {
		return Collections.unmodifiableList(this.children);
	}

	public void setChildren(List<Node<T>> children) {
		this.children = children;
	}
}
