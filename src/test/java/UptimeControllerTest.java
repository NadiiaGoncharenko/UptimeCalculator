import at.kumhofer.UptimeController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UptimeControllerTest {
    @Test
    public void test_calculateUptime_shouldBeCalculatedCorrectly(){ //!IMPORTANT: always write "test_.." at beginning!
        //Arrange
        UptimeController controller = new UptimeController();

        //Act
        String actualvalue = controller.calculateUptime(99.95);

        //Assert
        Assertions.assertEquals("43178,40", actualvalue); //checking if output value is correct
    }
}
