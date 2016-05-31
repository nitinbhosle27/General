package listassignment;

import java.util.LinkedList;
import java.util.Scanner;

public class SortedListDemo 
{

	public static void main(String[] args) 
	{
		 Scanner scan = new Scanner(System.in);
	      /* Creating object of linkedList */
		 LinkedListClass list1= new LinkedListClass();
		 LinkedListClass list2= new LinkedListClass();
	     System.out.println("Sorted Singly Linked List Test\n");          
	     char ch;
	     int value=1;
	     do
	     {	     
	     System.out.println("1. Insert In List 1");
	     System.out.println("2. Insert In List 2 ");
	     System.out.println("3. Display List 1");
	     System.out.println("4. Display List 2");
	     System.out.println("5. Merge List1 and List2 ");
	     
	     int choice = scan.nextInt();
	     switch (choice)
         {    
         case 1 :
          	
         	  
          	  while(value!=0)
          	  {
          	  System.out.println("Enter integer element to insert in List1 and ZERO to EXIT");
              value=scan.nextInt();	
              if(value!=0) 
         	  list1.insert(value);  
         	  }
         
             break; 
        
         case 2 :
        	  value=1;
        	  while(value!=0)
        	  {
              System.out.println("Enter integer element to insert in List2 and ZERO to EXIT");
        	  value=scan.nextInt();	 
              if(value!=0) 
              list2.insert(value);  
              } 
        	  break;
        
         case 3 : 
             list1.display();
             break;
             
        	 
         case 4 : 
             list2.display();
             break;
         
         case 5: 
        	 MergingList ml=new MergingList();
        	 ml.sortedmerge(list1,list2);
        	 break;
         
         default : 
             System.out.println("Wrong Entry \n ");
             break;
             
         }
	     
	     System.out.println("\nWant to Go to Main Menu (Type y or n) \n");
         ch = scan.next().charAt(0);                
	    
	     } while (ch=='y'||ch=='Y');     

	}

}
