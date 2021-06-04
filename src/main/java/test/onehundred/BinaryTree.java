package test.onehundred;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * 二叉树的遍历
 * @author TKQ
 *
 */
public class BinaryTree {

	public static void main(String[] args) {
		TreeNode node5=new TreeNode( null, null,5);
		TreeNode node4=new TreeNode( null, node5,4);
		TreeNode node7=new TreeNode( null, null,7);
		TreeNode node6=new TreeNode( null, node7,6);
		TreeNode node3=new TreeNode( null, null,3);
		TreeNode node2=new TreeNode( node3, node6,2);
		TreeNode node1=new TreeNode( node4, node2,1);
//		System.out.println(getHeight(node1));
		levelFind(node1);
//		stackfind(node1);
//		System.out.println(searchNode(node1, 6));
	}
	public static int  getHeight(TreeNode node) {//递归求树的高度
		if (node==null) {
			return 0;
		}else {
			int rh=getHeight(node.getRight());
			int lh=getHeight(node.getLeft());
			return rh>lh?rh+1:lh+1;
		}
	}
	public void firstFind(TreeNode node) {//先序遍历//中序后序遍历都可依赖此法
		if(node!=null) {
			System.out.println(node.getData());
			firstFind(node.getLeft());
			firstFind(node.getRight());
		}
	}
	public static void levelFind(TreeNode node) {//层次遍历，类似于图的广度优先搜索，借助队列
		if(node==null) return;
		Queue<TreeNode> queue=new LinkedList<TreeNode>();
		queue.offer(node);
		while(!queue.isEmpty()) {
			TreeNode treeNode = queue.poll();
			System.out.println(treeNode.getData());

			if (treeNode.getLeft()!=null) {
				node=treeNode.getLeft();
				queue.add(node);
			};//左节点不为空，放入队列
			if (treeNode.getRight()!=null) {
				node=treeNode.getRight();
				queue.add(node);}
				;//右 节点不为空，放入队列
		}

	}
	public static Object searchNode(TreeNode node ,Object o) {//查找节点
		if (node==null) {
			return null;
		}
		if (node.getData().equals(o)) {
			return node;
		}else if(node.getLeft()!=null){
			return searchNode(node.getLeft(), o);
		}else if(node.getRight()!=null){
			return searchNode(node.getLeft(), o);
		}
		return null;
	}
	/**
	 * 核心过程为，首先放入根节点，如果不为空放入栈中，将此节点左节点换为根节点，
	 * 知道根节点为空，也就是此节点没有左孩子节点，此时跳出循环，此循环目的是将包括
	 * 父节点在内的所有拥有左孩子根节点放入栈，然后将最后一个放入节点出栈，找到其右孩子
	 * 如果有。重复以上操作，直到栈为空。
	 * 注意，此算法如果按照入栈顺序为先序遍历，按照出栈为中序遍历
	 * @param root
	 */
	public static void stackfind(TreeNode root) {//中序/前序非递归遍历借助栈
		if (root==null) {
			return;
		}
		Stack<TreeNode> stack=new Stack<>();
		while (root!=null||!stack.empty()) {
			while (root!=null) {
				System.out.print(root.getData()+" ");//此处前序遍历
				stack.add(root);
				root=root.getLeft();//
			}
			root=stack.pop();////此处中序遍历
//			System.out.print(root.getData()+" ");
			root=root.getRight();
		}
		}

}
class TreeNode{
	public TreeNode left;
	public TreeNode right;
	public Object data;
	public TreeNode getLeft() {
		return left;
	}
	public void setLeft(TreeNode left) {
		this.left = left;
	}
	public TreeNode getRight() {
		return right;
	}
	public void setRight(TreeNode right) {
		this.right = right;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public TreeNode(TreeNode left, TreeNode right, Object data) {
		super();
		this.left = left;
		this.right = right;
		this.data = data;
	}

}
