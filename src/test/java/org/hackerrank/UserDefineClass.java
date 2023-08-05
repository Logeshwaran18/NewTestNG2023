package org.hackerrank;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

import java.util.Set;

public class UserDefineClass {

	@Test
	private void tc1() {
		Example e = new Example();
		e.setEmpId(101);
		e.setEmpName("logesh");
		e.setEmpPhNo(9629930060l);

		Example e1 = new Example();
		e1.setEmpId(201);
		e1.setEmpName("Praveen");
		e1.setEmpPhNo(7845638852l);

		Map<Integer, Example> m = new LinkedHashMap<Integer, Example>();
		m.put(1, e);
		m.put(2, e1);

		Set<Entry<Integer, Example>> es = m.entrySet();
		for (Entry<Integer, Example> x : es) {
			System.out.println(x.getKey());

			System.out.println(x.getValue().getEmpId());
			System.out.println(x.getValue().getEmpName());
			System.out.println(x.getValue().getEmpPhNo());

		}
	}
}
