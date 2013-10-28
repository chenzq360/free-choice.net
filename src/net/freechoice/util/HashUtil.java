package net.freechoice.util;

public class HashUtil {
	public static int hashIntegers(int...ii) {
		int hash = 1;
		for (int i : ii) {
			hash = 31*hash + i;
		}
		return hash;
	}
}
