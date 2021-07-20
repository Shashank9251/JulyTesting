package jul5_collections;

import java.util.ArrayList;
import java.util.Iterator;


public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		 list.add("John");
		 list.add("Sandeep");
		 list.add("Vinay");
		 list.add("Shashank");
		 list.add("Sandeep");
		 
		System.out.println(list);
		
	Iterator itr = list.iterator();
	while(itr.hasNext()){
	System.out.println(itr.next());
	}
for(String name:list) {
	System.out.println(name);
}
for (int i=0; i<list.size();i++) {
	System.out.println(list.get(i));
}
list.add(1,"Vinod");
System.out.println("adding the name");
for (int i=0; i<list.size();i++) {
	System.out.println(list.get(i));
}
list.remove(2);
System.out.println("removing the name in the index");
for(int i=0; i<list.size();i++) {
	System.out.println(list.get(i));
}
}
}

