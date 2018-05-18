package kadai5_1;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class kadai5_1Test {

	@Test
	public void 数字を英訳するメソッド() {
	 IntToEng ite = new IntToEng();
	 String expected = "one";
	 String actual = ite.translateEng(1);
	 assertThat(actual,is(expected));
	}

}
