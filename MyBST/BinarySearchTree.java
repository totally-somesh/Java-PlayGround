package MyBST;

import java.util.Stack;

public class BinarySearchTree {

	private Node root;

	public BinarySearchTree() {

		this.root = null;
	}

	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public boolean insert(int data) {

		Node newNode = new Node(data);

		if (root == null) {

			root = newNode;
			return true;
		}

		Node temp = root;
		while (true) {

			if (data < temp.getData()) {

				if (temp.getLeftChild() == null) {

					temp.setLeftChild(newNode);
					return true;
				}
				temp = temp.getLeftChild();
			} else {

				if (temp.getRightChild() == null) {

					temp.setRightChild(newNode);
					return true;
				}

				temp = temp.getRightChild();
			}
		} // end of while

	}// end of insert method

	public void inOrder() {

		Node temp = root;
		Stack<Node> stack = new Stack<>();

		while (temp != null || !stack.isEmpty()) {

			while (temp != null) {

				stack.push(temp);
				temp = temp.getLeftChild();

			} // end of minor while

			temp = stack.pop();
			System.out.print(temp.getData() + " | ");
			temp = temp.getRightChild();

		} // end of major while

		System.out.println(" ");
	}//end of InOrder method
	
	public void preOrder() {
		
		Node temp = root;
		Stack<Node> stack = new Stack<>();
		
		while(temp != null || !stack.isEmpty()) {
			
			while(temp!= null) {
				
				stack.push(temp);
				System.out.print(temp.getData() +" | ");
				temp = temp.getLeftChild();
						
			}//end of minor while
			
			temp = stack.pop();
			temp = temp.getRightChild();
			
		}//end of major while
		
		System.out.println(" ");
		
	}//end of preOrder method
	
	public void postOrder(Node root) {
		
		if(root == null) {
			return;		
		}
		
		postOrder(root.getLeftChild());
		postOrder(root.getRightChild());
		System.out.print(root.getData() + " | ");		
		
	}//end of postOrder method

	
	public boolean find(int data) {
		
		Node temp = root;
		
		while(temp != null) {
			
			if(temp.getData() == data) {
				return true;
			}
			
			if(data < temp.getData()) {
				
				temp = temp.getLeftChild();
				
			}else {
				
				temp = temp.getRightChild();	
			}		
		}//end of while
		return false;
	}//end of find method
	
	public int getMax() {
		
		Node temp = root;
		if(root == null) {
			return -1;
		}
		
		while(temp.getRightChild() != null) {
			
			temp = temp.getRightChild();
		}
		
		return temp.getData();	
		
	}//end of getMax method
	
	public int getMin() {
		
		Node temp = root;
		if(root == null) {
			return -1;
		}
				
		while(temp.getLeftChild() != null) {
			
				temp = temp.getLeftChild();		
		
		}//end of while
		
		return temp.getData();
	}//end of getMin method
	
	public void inOrder(Node root) {
		
		if(root == null) {
			return;
		}
		
		inOrder(root.getLeftChild());
		System.out.print(root.getData() + " | ");
		inOrder(root.getRightChild());
		
	}//end of IndOrder By Recursion
	
	public void preOrder(Node root) {
		
		if(root == null) {	
			return;			
		}
		
		System.out.print(root.getData() + " | ");
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());
		
	}//end of preOrder By Recursion
	
	
	
	
	
	
	
	
	
	
	
}
