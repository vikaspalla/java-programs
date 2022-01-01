package com.collections1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionClass {
	{
		List<Integer> values = new ArrayList<>();
		values.add(4);
		values.add(5);
		values.add(6);
		values.add(2); // by list --- we can give index and element

		Collections.sort(values);
		Collections.reverse(values);
		for (Integer o : values) {
			System.out.println(o);
		}

	}
} 