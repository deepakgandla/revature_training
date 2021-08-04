package collectionsfw;
import java.util.*;
public class ArrayListDemo {
    public static void main(String[] args) {
    	Object[] pylist = new Object[10];
        pylist[0] = 100;
        pylist[1] = new String("hai");
        for(Object ele: pylist) {
        	if(ele==null) {
        		break;
        	}
        	System.out.println(ele);
        }
  
		List<Product> list = new ArrayList<Product>();
		list.add(new Product(100, "ball", 20.0f, 10));
		list.add(new Product(10, "toy", 20.0f, 11));
		list.add(new Product(20, "bat", 50.0f, 16));
		
		Collections.sort(list, (p1, p2)->{
			String name1 = p1.getName();
			String name2 = p2.getName();
			return name1.compareTo(name2);
		});
		for(Product p:list) {
			System.out.println(p);
		}
		System.out.println();
		
		
	}
}
