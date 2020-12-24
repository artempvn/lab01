package by.artempvn.lab01.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

	public static boolean isPositiveNumber(String str) {
		boolean isPositive = false;
		if (str != null && NumberUtils.isParsable(str)) {
			double number = Double.parseDouble(str);
			isPositive = (number > 0);
		}
		return isPositive;
	}

}
