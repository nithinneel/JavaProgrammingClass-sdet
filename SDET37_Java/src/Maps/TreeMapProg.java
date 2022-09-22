package Maps;

import java.util.TreeMap;

public class TreeMapProg {
public static void main(String[] args) {
	TreeMap<Integer, String> map = new TreeMap<>();
	map.put(1, "hi");
	map.put(5, "hello");
	map.put(3, "A");
	map.put(4, null);
	
	System.out.println(map);
}
}
