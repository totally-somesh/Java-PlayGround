package MyBST;

public class Tester {

	public static void main(String[] args) {

		BinarySearchTree BST = new BinarySearchTree();
		
		BST.insert(50);
		BST.insert(40);
		BST.insert(10);
		BST.insert(25);
		BST.insert(5);
		BST.insert(70);
		BST.insert(60);
		BST.insert(65);
		BST.insert(80);
		
		System.out.println(" ---< InOrder >--- ");
		BST.inOrder();
		System.out.println(" ---< PreOrder >--- ");
		BST.preOrder();
		System.out.println(" ---< PostOrder >--- ");
		BST.postOrder(BST.getRoot());
		
		System.out.println(" ---< Finding Element >--- ");
		System.out.println(BST.find(70));
		System.out.println(BST.find(32));	
		
		System.out.println(" ---< Max Element >--- ");
		System.out.println(BST.getMax());
		
		System.out.println(" ---< Min Element >--- ");
		System.out.println(BST.getMin());
		
		System.out.println(" ---< InOrder By Recursion >--- ");
		BST.inOrder(BST.getRoot());
		System.out.println(" ---< PreOrder By Recursion >--- ");
		BST.preOrder(BST.getRoot());
		
	}
}
