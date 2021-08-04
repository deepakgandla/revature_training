package collectionsfw;
class Node{
	public Object value;
	public Node next;
	public Node(Object value) {
		this.value = value;
		this.next =null;
	}
}

public class LinkedList {
      public Node head;
      public LinkedList(Node head) {
    	  this.head = head;
      }
      
      public void insert(Object value) {
    	  Node node = new Node(value);
    	  Node currNode =this.head;
    	  while(true) {
    		  currNode = currNode.next;
    		  if(currNode.next==null) {
    			  currNode.next=node;
    			  break;
    		  }
    	  }
     
      }
      
      public void insertAtBeginning(Object value) {
    	  Node node = new Node(value);
    	  node.next = this.head;
    	  this.head = node;
    	  
    	  
      }
      
      public void insertAt(int index, Object value) {
    	  Node node = new Node(value);
    	  int count = 0;
    	  Node currNode = this.head;
    	  while(true) {
    		  if(count == index-1) {
    			  Node tempNode = currNode.next;
    			  currNode.next = node;
    			  node.next = tempNode;
    			  break;
    		  }
    		  currNode = currNode.next;
    		  count++;
    	  }
      }
      
      public void printLinkedList() {
    	  Node currNode = this.head;
    	  while(currNode!=null) {
    		  if (currNode.next == null) {
    			  System.out.println(currNode.value + "-->" + null);
    			  break;
    		  }
    		  System.out.print(currNode.value + "-->");
    		  currNode = currNode.next;
    	  }
    	
    
      }
     
     public void removeAt(int index) {
    	 Node currNode = this.head;
    	 int count = 0;
    	 while(true) {
    		 if(count == index-1 ) {
    			 Node nextNode = currNode.next;
    			 currNode.next = nextNode.next;
    			 break;
    		 }
    		 currNode = currNode.next;
    		 count++;
    	
    		 
    	 }
     }
     
     public void remove(Object value) {
    	 if(this.head.value == value) {
    		 this.head = this.head.next;
    	 }
    	 else {
    		 int index = 0;
    		 Node currNode = this.head;
        	 while(currNode.next!=null) {
        		 if(currNode.value == value) {
        			this.removeAt(index);
        			break;
        		 }
        		 currNode = currNode.next;
        		 index++;
        	 }
    	 }
  
     }
      
      
      
      public static void main(String args[]) {
    	  
    	  LinkedList l1 = new LinkedList(new Node(20));
    	  l1.head.next = new Node(21);
    	  l1.insert(22);
    	  l1.insert("hello");
    	  l1.insert(24);
    	  l1.insert(2.4f);
    	  l1.insert('c');
    	  l1.insertAt(2, "Middle");
    	  l1.insertAtBeginning("start");
    	  l1.insertAtBeginning("initial");
    	  l1.removeAt(6);
    	  l1.removeAt(1);
    	  l1.printLinkedList();
    	  l1.remove("Middle");
    	  l1.printLinkedList();
      }
}
