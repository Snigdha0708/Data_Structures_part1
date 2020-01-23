class LinkedList
{
    Node head;
    class Node
    {
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            next=null;
        }
    }
    LinkedList insert(LinkedList list,int data)
    {
        Node newnode=new Node(data);
        newnode.next=null;
        Node ptr=null;
        if(list.head==null)
        {
            list.head=newnode;
        }
        else
        {
            ptr=list.head;
            while (ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.next=newnode;
        }
        return list;
    }
    void print(LinkedList list)
    {
        Node ptr=list.head;
        while (ptr!=null)
        {
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
    }
    LinkedList delete(LinkedList list,int data)
    {
        Node ptr= null;
        if(list.head.data==data)
            list.head=list.head.next;
        else
        {
           ptr=list.head;
           if(ptr.next.data==data&&ptr.next.next!=null)
           {
               Node temp=ptr.next.next;
               ptr.next=temp;
               //System.out.println(ptr.data);
           }
           else if(ptr.next.next==null)
           {
               ptr=null;
           }
           else
           {
               ptr=ptr.next;
           }
        }
        return list;
    }
}
public class Ll {
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list=list.insert(list,10);
        list=list.insert(list,20);
        list=list.insert(list,30);
        list=list.delete(list,30);
        list.print(list);
    }
}
