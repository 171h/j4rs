package org.astonbitecode.j4rs.mpxj;
import org.junit.Test;

public class ExchangeTest {

  @Test
  public void test() throws Exception {
    String json =  Exchange.toJson("src/test/resources/mpxj/example.mpp", "src/test/resources/mpxj/example.json");
    assert json.length() != 0;
  }
}
