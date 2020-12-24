package by.artempvn.lab01.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class StringUtilsTest {

  @Test
  public void isPositiveNumberTest() {
    assertTrue(StringUtils.isPositiveNumber("31"));
  }
}
