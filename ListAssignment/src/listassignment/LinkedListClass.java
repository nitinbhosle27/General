package listassignment;

public class LinkedListClass 
{
     
	Node begin;
    int size;
    public LinkedListClass()
    {
        begin=null;
        size = 0;
    }
    
    /* Function to check if list is empty  */
    public boolean isEmpty()
    {
        return begin == null;
    }
    
    /*  Function to check size of list  */
    public int getSize()
    {
        return size;
    }    
    
    /*  Function to insert an element  */
    public void insert(int val)
    {
        Node newptr, ptr, temp = null;
        newptr = new Node(val, null);
        boolean ins = false;
        
        
        if (begin == null)
        {
           begin = newptr;
        
        }
        
        else if (val <= begin.getData())
        {
            newptr.setLink(begin);
            begin = newptr;
        }
       
        else
        {
            temp = begin;
            ptr = begin.getLink();
            while(ptr != null)
            {
                if (val >= temp.getData() && val <= ptr.getData())
                {
                    temp.setLink(newptr);
                    newptr.setLink(ptr);
                    ins = true;
                    break;
                }
                else
                {
                    temp = ptr;
                    ptr = ptr.getLink();
                }
            }
            if (ins == false)
            {
                temp.setLink(newptr);
            }
        }
        size++;
    }
    
    /*  Function to display elements  */
    public void display()
    {
        System.out.print("Sorted Singly Linked List = ");
        if (size == 0) 
        {
            System.out.print("empty\n");
            
        }
        else if (begin.getLink() == null) //if only first node then print it
        {
            System.out.println(begin.getData() );
           
        }
        Node ptr = begin;
        System.out.print(begin.getData()+ "->"); //printing first node 
        ptr = begin.getLink();
        while (ptr.getLink() != null) 
        {
            System.out.print(ptr.getData()+ "->");
            ptr = ptr.getLink();
        }
       System.out.print(ptr.getData()+ "\n"); //printing last node
    }
}