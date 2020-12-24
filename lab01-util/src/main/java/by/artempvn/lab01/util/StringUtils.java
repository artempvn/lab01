package by.artempvn.lab01.util;

import org.apache.commons.lang3.math.NumberUtils;

public class StringUtils {

  public static boolean isPositiveNumber(String str) {
    return (NumberUtils.isParsable(str) && Double.parseDouble(str) > 0);
  }
}
