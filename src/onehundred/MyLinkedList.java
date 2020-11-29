package onehundred;
/**
 * 实现linkedList
 * @author TKQ
 *
 */
public class MyLinkedList {
	public static void main(String[] args) {
		MyLinkedList linkedList=new MyLinkedList();
		linkedList.put(3);
		linkedList.put(2);
		System.out.println(linkedList.getSize());
	}
	private int size=0;
	private Node HeadNode=new Node(null);//头结点
	public void put(Object o) {
		Node pointNode=HeadNode;
		while (pointNode.getNextNode()!=null) {
			pointNode=pointNode.getNextNode();
		}
		Node node=new Node(o);
		pointNode.setNextNode(node);;
		size++;
	}
	public Object getObject(Object o) {
		Node pointNode=HeadNode;
		while (pointNode.getNextNode()!=null) {
			if(pointNode.getDataObject().equals(o)) {
				return o;
			}else {		
			pointNode=pointNode.getNextNode();
				};
		}
		return "wu";
	}
	public void remove(int i ) {
		if (i<size) {
			Node pointNode=HeadNode;
			for (int j = 0; j < i; j++) {
				pointNode.setDataObject(pointNode.getNextNode().getNextNode());;
			}	
		}
		
	}
	public int getSize() {
		return size;
	}
}
class Node{
	public Object dataObject;
	public Node nextNode;
	public Node(Object dataObject) {
	this(dataObject, null);
	}
	public Node(Object dataObject, Node nextNode) {
		super();
		this.dataObject = dataObject;
		this.nextNode = nextNode;
	}
	public Object getDataObject() {
		return dataObject;
	}
	public void setDataObject(Object dataObject) {
		this.dataObject = dataObject;
	}
	public Node getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node nextNode) {
		this.nextNode = nextNode;
	}
	
}