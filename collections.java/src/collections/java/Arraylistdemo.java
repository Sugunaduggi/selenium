package collections.java;
import java.util.ArrayList;
import java.util.List;

public class Arraylistdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> mylist = new ArrayList<Object>();
		mylist.add(35);
		mylist.add("suguna");
		mylist.add(35.24);
		
		for(int i =0 ;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
		
		mylist.remove(1);
         for(int i =0 ;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
         
        mylist.add(0,"duggi");
        for(int i =0 ;i<mylist.size();i++) {
			
			System.out.println(mylist.get(i));
		}
         
		// add(),get(),remove(),set(),isempty(),clear()
		

	}

}
