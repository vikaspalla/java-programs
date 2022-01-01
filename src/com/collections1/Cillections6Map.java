package com.collections1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Cillections6Map {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("my name ", "vikas");
		map.put("actor", "maheshbabu");
		map.put("cm", "jagan");
		System.out.println(map);
		System.out.println(map.get("actor"));

		Set<String> keys = map.keySet();
		for (String key : keys) {
			System.out.println(key + " " + map.get(key));
		}

	}
}
