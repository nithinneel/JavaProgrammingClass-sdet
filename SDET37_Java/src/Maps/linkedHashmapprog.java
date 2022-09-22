package Maps;

import java.util.LinkedHashMap;

public class linkedHashmapprog {
public static void main(String[] args) {
	LinkedHashMap<Integer,String> map = new LinkedHashMap<>();
	map.put(1, "A");
	map.put(5, "B");
	map.put(null, "C");
	map.put(2, "D");
	map.remove(null);
	map.replace(5, "B", "hii");
	
	System.out.println(map);
}
}
