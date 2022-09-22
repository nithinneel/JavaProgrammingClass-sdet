package Maps;

import java.util.HashMap;

public class HashMappro {
public static void main(String[] args) {
	HashMap<Integer, String> map = new HashMap<Integer, String>();
	map.put(1, "dvg");
	map.put(5, "bengaluru");
	map.put(null, "hi..");
	map.put(2, null);
	
	System.out.println(map);
}
}
