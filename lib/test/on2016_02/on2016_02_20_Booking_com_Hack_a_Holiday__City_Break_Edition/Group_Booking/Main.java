package on2016_02.on2016_02_20_Booking_com_Hack_a_Holiday__City_Break_Edition.Group_Booking;

import net.egork.chelper.tester.NewTester;

import org.junit.Assert;
import org.junit.Test;

public class Main {
	@Test
	public void test() throws Exception {
		if (!NewTester.test("lib/test/on2016_02/on2016_02_20_Booking_com_Hack_a_Holiday__City_Break_Edition/Group_Booking/Group Booking.task"))
			Assert.fail();
	}
}
