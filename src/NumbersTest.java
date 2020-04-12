

import java.math.BigDecimal;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NumbersTest {

	static Numbers num;
	
	@BeforeAll
	 static void execute(){
		num = new Numbers();
	}
	
	@Test
	void mathsWithFloats_Test() {
		Assert.assertEquals(0.20f, num.mathsWithFloats(2.40f, 2.20f), 0.0000005); 
	}

	@Test
	void mathsWithFloatsLoop_Test() {
		Assert.assertEquals(20.00f, num.mathsWithFloatsLoop(0.20f), 0.00001); 
	}
	
	@Test
	void mathsWithFloatsLoopBig_Test() {
		Assert.assertEquals(new BigDecimal("20.0"), num.mathsWithFloatsLoopBig(0.20f)); 
	}
	
}
