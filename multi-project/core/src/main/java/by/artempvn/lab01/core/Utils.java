package by.artempvn.lab01.core;

import by.artempvn.lab01.util.StringUtils;

public class Utils {

	public static boolean isAllPositiveNumbers(String... str) {
		if (str == null) {
			return false;
		}
		int i = 0;
		boolean isAllPositive = true;
		while (i < str.length && isAllPositive) {
			isAllPositive = StringUtils.isPositiveNumber(str[i]);
			i++;
		}
		return isAllPositive;
	}

}
