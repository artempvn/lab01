package by.artempvn.lab01.core;

import java.util.Arrays;
import by.artempvn.lab01.util.StringUtils;

public class Utils {

  public static boolean isAllPositiveNumbers(String... str) {
    return Arrays.asList(str).stream().allMatch(string -> StringUtils.isPositiveNumber(string));
  }
}
