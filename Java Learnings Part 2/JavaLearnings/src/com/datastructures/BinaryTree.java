package com.datastructures;

/*
 * binary tree is an extension of linked list
 * has left and right nodes attached to each node
 * a binary tree is complete when each node has 2 or 0 childs
 * the depth(path from the root) is O(log n)
 * height=>maximum depth
 * fast searchable collection *   
 * 
 */

public class BinaryTree {

	BNode root;

	/*
	 * 1. create a root node to begin with 2. create a parent for further
	 * traversal and adding of the nodes 3. if the new node is less than the
	 * parent, the new node is added to the left 4. if the new node is greater
	 * than the parent, it is added to the right
	 * 
	 */

	public void insert(int key, String name) {
		// create a new node and initialize it

		BNode newNode = new BNode(key, name);

		// if the root is null, make the new node as the root
		if (root == null) {

			root = newNode;
		} else {

			// if not, set the root node as the parent for us to begin with
			// traversing the tree
			BNode focusNode = root;

			// Create a parent to be used in the future
			BNode parent;

			while (true) {
				// root is the top parent. so we start from there

				parent = focusNode;

				// if the new node is less than the parent,add it to left

				if (key < focusNode.key) {
					// switch the focus to the left
					focusNode = focusNode.left;

					// if the left child has no children
					if (focusNode == null) {
						parent.left = newNode;
					}

				} else {
					// if the new node is greater than the parent, add it to
					// right
					// i.e. else will automatically add
					focusNode = focusNode.right;

					// if the right child has no children
					if (focusNode == null) {
						parent.right = newNode;
						return;// all done
					}
				}

			}
		}
	}

	// public boolean remove(int value, BNode parent) {
	// if (value < this.key) {
	// if (parent.left != null)
	// return parent.left.remove(value, this);
	// else
	// return false;
	// } else if (value > this.value) {
	// if (right != null)
	// return right.remove(value, this);
	// else
	// return false;
	// } else {
	// if (left != null && right != null) {
	// this.value = right.minValue();
	// right.remove(this.value, this);
	// } else if (parent.left == this) {
	// parent.left = (left != null) ? left : right;
	// } else if (parent.right == this) {
	// parent.right = (left != null) ? left : right;
	// }
	// return true;
	// }
	// }

	public BNode findNode(int key) {
		// Start at the top of the tree
		BNode focusNode = root;

		while (focusNode.key != key) {
			// traverse the node from the root to left side
			if (key < focusNode.key) {
				focusNode = focusNode.left;

			} else {
				focusNode.right = focusNode;
			}

			if (focusNode == null) {
				return null;
			}
		}
		return focusNode;
	}

	// parent before children
	// starts with the parent, then left child, then right
	public void preorderTraversal(BNode focusNode) {
		if (focusNode != null)
			System.out.println(focusNode);
		preorderTraversal(focusNode.left);
		preorderTraversal(focusNode.right);

	}

	// child before parent
	// starts with left child, moves to right right child, then parent
	public void postOrderTraversal(BNode focusNode) {
		if (focusNode != null) {
			postOrderTraversal(focusNode.left);
			postOrderTraversal(focusNode.right);
			System.out.println(focusNode);
		}
	}

	public void inorderTraversal(BNode focusNode) {
		if (focusNode != null) {
			// traverse the left child of the tree recursively
			inorderTraversal(focusNode.left);
			System.out.println(focusNode);
			// traverse the right child of the tree recursively
			inorderTraversal(focusNode.right);

		}
	}
	// private boolean isBST() {
	// return isBST(root, null, null);
	// }
	// private boolean isBST(BNode x, int min, int max) {
	// if (x == null) return true;
	// if (min != 0 && x.key.compareTo(min) <= 0) return false;
	// if (max != 0 && x.key.compareTo(max) >= 0) return false;
	// return isBST(x.left, min, x.key) && isBST(x.right, x.key, max);
	// }

	public boolean isBST( BNode parent, int value){
		if(parent.getRight()!=null && parent.getLeft()!=null && 
				parent.getLeft().getKey()<=value && parent.getRight().getKey()>=value){
			return true;
		}
		return false;
	}
}

class BNode {

	int key;
	BNode left, right;

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public BNode getLeft() {
		return left;
	}

	public void setLeft(BNode left) {
		this.left = left;
	}

	public BNode getRight() {
		return right;
	}

	public void setRight(BNode right) {
		this.right = right;
	}

	String name;

	BNode(int v, String name) {
		this.key = v;
		this.name = name;
	}

	@Override

	public String toString() {
		return "name is" + name + "and the key is " + key;
	}
}
