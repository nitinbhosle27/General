package listassignment;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MergingList 
{
	Node temp; 
	
	@SuppressWarnings("rawtypes")
	void sortedmerge(LinkedListClass list1, LinkedListClass list2) 
	 {
	
	  LinkedList list3=new LinkedList();
      int size1=list1.size;
      int size2=list2.size;
      if(size1>=size2)
      {
    	  while(list1.begin.getLink()!=null)
    	  {
    		 while(list2.begin.getLink()!=null)
    		 {
    			if(list1.begin.getData()>list2.begin.getData())
    			{
    				System.out.println(list1.begin.getData()+"  "+list2.begin.getData());
    	
    				list3.add(list2.begin.getData());
    			
    				list2.begin=list2.begin.getLink();
    			}
    			
    		 }
    		 list1.begin=list1.begin.getLink();
    		 
    	  }
       }
      System.out.println(list3);
			 
    }	 
}