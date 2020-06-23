package com.te;

import java.util.HashMap;
import java.util.Map;

public class TestHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		map.put(11, "AB");
		map.put(null, "LL");
		//map.put(11, "AC");
		//map.put(null, null);
		map.put(101, null);
		map.put(102, null);
		map.put(null, "kk");
		System.out.println(map);

	}

}
