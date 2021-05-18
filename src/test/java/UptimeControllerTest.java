import at.kumhofer.UptimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {
    @Test
    public void test_calculateUptime_shouldBeCalculatedCorrectly(){
        /* !IMPORTANT: always write "test_.." at beginning!
         * normally: test_Given_..._When_..._Then_...
         * (e.g.: test_Given_ApplicationStarted_When_CallingMain_Then_NoExceptionShouldBeThrown(){} */

        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualvalue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals(String.format("%.2f", 43178.40), actualvalue); //checking if output value is correct
    }
}
