package fr.insalyon.telecom.mgl.RomanNumberConverter;

import org.junit.Test;
import org.junit.Before;
import static org.assertj.core.api.Assertions.*;

public class RomanNumberConverterTest {

	RomanNumberConverter rn;

  @Before
  public void setup() {
    rn = new RomanNumberConverter();
  }

 @Test
  public void check() {
    assertThat(rn.convert("XIV"))
      .isNotEmpty()
      .isEqualTo(14);
  }

}