package collection;

import java.util.LinkedHashMap;
import java.util.Map;

public class FindProductObj {
	public static void main(String[] args) {
		
		Product p1 = new Product();
		p1.setPdCode("P001");
		p1.setPdName("Pen");
		p1.setPdPrice(5000);
		
		Product p2 = new Product();
		p2.setPdCode("P002");
		p2.setPdName("Pencil");
		p2.setPdPrice(200);
		
		Product p3 = new Product();
		p3.setPdCode("P003");
		p3.setPdName("Ruler");
		p3.setPdPrice(100);	
		
		Product p4 = new Product();
		p4.setPdCode("P004");
		p4.setPdName("Correction pen");
		p4.setPdPrice(300);
		
		Product p5 = new Product();
		p5.setPdCode("P005");
		p5.setPdName("Eraser");
		p5.setPdPrice(200);
		
		LinkedHashMap <String, Product> map = new LinkedHashMap();
		map.put(p1.getPdCode(), p1);
		map.put(p2.getPdCode(), p2);
		map.put(p3.getPdCode(), p3);
		map.put(p4.getPdCode(), p4);
		map.put(p5.getPdCode(), p5);
		
		for(Map.Entry<String, Product> m:map.entrySet()) {			
			if(m.getKey() == "P001") {
				System.out.println(m.getValue());	
			}	
		}		
	}
}
