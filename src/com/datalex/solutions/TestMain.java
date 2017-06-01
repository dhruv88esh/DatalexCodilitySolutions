/**
 * 
 */
package com.datalex.solutions;

import java.util.Arrays;
import java.util.List;

/**
 * @author 1984b
 *
 */
public class TestMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = Arrays.asList("a", "b", "w", "c");
		System.out.println(list.toString());
		list.remove("w");
		System.out.println(list.toString());
	}

}
