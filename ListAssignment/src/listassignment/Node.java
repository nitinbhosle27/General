package listassignment;

public class Node 
{
	int data;
	Node link;
	
	public Node()
	    {
	        link = null;
	        data = 0;
	    }    
	
	public Node(int data, Node link) 
	{
		super();
		this.data = data;
		this.link = link;
	}
	
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLink() {
		return link;
	}
	public void setLink(Node link) {
		this.link = link;
	}
	
}
