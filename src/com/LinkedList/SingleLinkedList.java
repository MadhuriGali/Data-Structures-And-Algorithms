package com.LinkedList;

import java.util.HashMap;

public class SingleLinkedList {

	private ListNode head;
	private ListNode a;
	private ListNode b;

	public static void main(String[] args) {
		SingleLinkedList s1 = new SingleLinkedList();// creation of single linked list
		ListNode first = new ListNode(1);
		ListNode second = new ListNode(4);
		ListNode third = new ListNode(3);
		ListNode fourth = new ListNode(2);
		ListNode fifth = new ListNode(5);
		s1.a = first;
		first.next = second;
		second.next = third;
		third.next = fourth;
		fourth.next=fifth;
		ListNode first1 = new ListNode(2);
		ListNode second1 = new ListNode(4);
		ListNode third1 = new ListNode(5);
		s1.b= first1;
		first1.next = second1;
		second1.next = third1;
		//s1.mergeSortedList(s1.a,s1.b);
		//System.out.println(s1.swapNodes(s1.a,2));
		s1.partition(s1.a,3);
	}

	public void insertionAtBeginning(int data) {// insertion at Beginning
		ListNode newNode = new ListNode(data);
		newNode.next = head;
		head = newNode;

	}

	public void insertionAtEnd(int data) {// insertion At End
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		while (current.next != null) {
			current = current.next;
		}
		current.next = newNode;

	}

	public void insertAtParticularPosition(int data, int position) {// insert At Particular Position
		ListNode newNode = new ListNode(data);
		ListNode current = head;
		if (position == 1) {
			newNode.next = head;
			head = newNode;
		}
		int count = 1;
		while (count < position - 1) {
			current = current.next;
			count++;
		}
		ListNode previous = current.next;
		newNode.next = previous;
		current.next = newNode;
	}

	public ListNode deleteAtBeginning() {// delete At Beginning
		ListNode curr = head;
		if (curr == null) {
			return null;
		} else {
			head = head.next;
			curr.next = null;
		}
		return curr;
	}

	public ListNode deleteAtEnding() {// delete At Ending
		ListNode curr = head;
		if (curr == null) {
			return null;
		} else {
			while (curr.next.next != null) {
				curr = curr.next;
			}
		}
		ListNode prev = curr.next;
		curr.next = null;
		return prev;
	}

	public ListNode deleteAtPosition(int position) {// delete At particular Position
		if (position == 1) {
			ListNode curr = head;
			head = head.next;
			curr.next = null;
			return curr;

		}
		int count = 1;
		ListNode curr = head;
		// curr=curr.next;
		while (count < position - 1) {
			curr = curr.next;
			count++;
		}
		ListNode prev = curr.next;
		curr.next = prev.next;
		return prev;
	}

	public boolean searchElement(int element) {// search Element
		ListNode curr = head;
		while (curr != null) {
			if (curr.data == element)
				return true;
			else
				curr = curr.next;
		}

		return false;

	}

	public ListNode reversLinkedlist() {// print reverse linked list
		ListNode current = head;
		ListNode previous = null;
		ListNode next = null;

		while (current != null) {
			next = current.next;
			current.next = previous;
			previous = current;
			current = next;
		}
		return previous;

	}

	public void displayReverse(ListNode head) {// displaying single linked list
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	public void display() {// displaying single linked list
		ListNode current = head;
		while (current != null) {
			System.out.print(current.data + "--->");
			current = current.next;
		}
		System.out.println("null");
	}

	public int count() {// printing single linked list count
		ListNode current = head;
		if (current == null)
			return 0;
		int count = 0;
		while (current != null) {
			count++;
			// System.out.println(current);
			// System.out.print(head.data +"--->");
			current = current.next;
		}

		return count;

	}

	public int middleNode() {// finding middle node of linkedList
		ListNode current = head;
		ListNode slowPtr = current;
		ListNode fastPtr = current;
		while (fastPtr != null && fastPtr.next != null) {
			slowPtr = slowPtr.next;
			fastPtr = fastPtr.next.next;
		}

		// System.out.println("slowptr" + slowPtr);
		return slowPtr.data;

	}

	public int nThNodeFromEnd(int position) {// finding nth node from the end of linkedList
		ListNode fastPtr = head;
		ListNode slowPtr = head;
		int count = 0;
		while (count < position) {
			fastPtr = fastPtr.next;
			count++;
		}
		while (fastPtr != null) {
			fastPtr = fastPtr.next;
			slowPtr = slowPtr.next;
		}
		return slowPtr.data;

	}

	public ListNode removeDuplicatesFromlinkedList() {// remove duplicates from sorted linked list
		ListNode currPtr = head;
		ListNode result = head;
		ListNode nextPtr = currPtr.next;
		while (nextPtr != null) {
			if (currPtr.data == nextPtr.data) {
				currPtr.next = nextPtr.next;
				nextPtr = currPtr.next;
			} else {
				currPtr = nextPtr;
				nextPtr = nextPtr.next;
			}
		}
		return result;
	}

	public ListNode removeKey(int key) {
		ListNode currPtr = head;
		ListNode result = head;
		ListNode prevPtr=head;
		while(currPtr!=null) {
			if(currPtr.data==key) 
			{
				prevPtr.next=currPtr.next;
				currPtr=prevPtr.next;
			}else {
				prevPtr=currPtr;
				currPtr=currPtr.next;
				
			}
		}
			return result;
	}
	public ListNode insertNodeInSortedList(ListNode newNode) {//inserting the node in soretd list
		ListNode result=head;
		ListNode curr=head;
		ListNode prev=null;
		while(curr!=null && curr.data<newNode.data) {
			prev=curr;
			curr=curr.next;
			
		}newNode.next=curr;
		prev.next=newNode;
		return result;
	}
	public void detectLoop() {//detecting whether loop exist or not
		ListNode fastPtr=head;
		ListNode slowptr=head;
		while(fastPtr!=null && fastPtr.next!=null) {
			slowptr=slowptr.next;
			fastPtr=fastPtr.next.next;
			if(fastPtr==slowptr) removingLoop(slowptr);
		}
		//return false;
		//return 0;
	}
	public int getStartOfnode(ListNode ptr) {
		ListNode temp=head;
		while(ptr!=temp) {
			temp=temp.next;
			ptr=ptr.next;		
			
		}
		return temp.data;
	}
	public void removingLoop(ListNode ptr) {
		ListNode temp=head;
		ListNode prev=ptr;
		ListNode result=head;
		while(ptr!=temp) {
			temp=temp.next;
			prev=ptr;
			ptr=ptr.next;		
			
		}
		prev.next=null;
		System.out.println(result);
	}
	public ListNode mergeSortedList(ListNode list1,ListNode list2) {
		ListNode temp=new ListNode(7);
		ListNode  newNode=temp;
		while(list1!=null && list2!=null) {
			if(list1.data<=list2.data) {
				temp.next=list1;
				list1=list1.next;
				temp=temp.next;
			}else {
				temp.next=list2;
				list2=list2.next;
				temp=temp.next;				
			}
		}if(list1!=null) temp.next=list1;
		if(list2!=null) temp.next=list2;
		System.out.println(newNode.next);
		return newNode.next;
		
	}
	public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode fastPtr=head,slowPtr=head;
        int count=0;
        while(count<n){
            fastPtr=fastPtr.next;
            count++;
        }
        if(fastPtr==null) return head.next;
        while(fastPtr.next!=null){
            fastPtr=fastPtr.next;
            slowPtr=slowPtr.next;
        }
        slowPtr.next=slowPtr.next.next;
       
        return head;
    }
	 public ListNode swapNodes(ListNode head, int k) {
	        ListNode first=head,last=head,prevF=first,result=head;
	        for(int i=0;i<k;i++){
	            if(i+1==k) first=first;
	            else {
	                prevF=first;
	                first=first.next;
	            }
	        }
	        ListNode fastPtr = head;
			ListNode slowPtr = head,prevL=slowPtr;
			int count = 0;
			while (count < k) {
				fastPtr = fastPtr.next;
				count++;
			}
			while (fastPtr != null) {
				fastPtr = fastPtr.next;
	            prevL=slowPtr;
				slowPtr = slowPtr.next;
			}last=slowPtr;
			int temp=first.data;
			first.data=last.data;
			last.data=temp;
	        
	        System.out.println(first.data);
	        System.out.println(last.data);
	        System.out.println(prevF.data);
	        System.out.println(prevL.data);
	        return result;
}
	 public ListNode swapPairs(ListNode head) {
	        ListNode first=head,result=head;
	        while(first!=null && first.next!=null ){
	            int temp=first.data;
	            first.data=first.next.data;
	            first.next.data=temp;
	            first=first.next.next;
	        }
	        return result;
	        
	    }
	 public ListNode deleteDuplicates(ListNode head) {
		 HashMap<Integer,Integer> map=new HashMap<>();
	        ListNode result=new ListNode(7);
	         result.next=head;
	         ListNode prev=result,curr=result.next;
	         while(curr!=null && curr.next!=null){
	             if(curr.data==curr.next.data || map.containsKey(curr.data)){
	                 map.put(curr.data,1);
	                 curr=curr.next;
	             }else{
	                 prev.next=curr;
	                 prev=prev.next;
	                 curr=curr.next;
	             }
	         }
	         if(map.containsKey(curr.data)) prev.next=null;
	         else prev.next=curr;
	         System.out.println(map);
	         System.out.println(result.next);
	         return result.next;
	    }
	 public ListNode partition(ListNode head, int x) {
	        ListNode greatEle=head,prevGreat=head,prevLess=head,result=head;
	        ListNode lessEle=greatEle;
	        while(greatEle!=null){
	            prevGreat=greatEle;
	            if(greatEle.data<=x) greatEle=greatEle.next;
	            else break;
	        }while(lessEle.next!=null){
	            if(lessEle.data<x) {
	                 prevLess.next=lessEle.next;
	                 ListNode temp=prevGreat.next;
	                 prevGreat.next=lessEle;
	                 lessEle.next=temp;
	                 lessEle=lessEle.next;

	            }else {
	                prevLess=lessEle;
	                lessEle=lessEle.next;

	            }
	        }
	        System.out.println(result);
	        return result;
	    }
}