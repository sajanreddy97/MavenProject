import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class JenkinsCalculatorTest {

    @Test
    public void addTest() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        assertEquals(calculator.addNumbers(5, 5), 10);
    }

    @Test
    public void subtractTest() {
        JenkinsCalculator calculator = new JenkinsCalculator();
        assertEquals(calculator.subtractNumbers(10, 5), 5);
    }
}
