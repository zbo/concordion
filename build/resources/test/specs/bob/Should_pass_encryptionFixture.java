package specs.bob;

import com.example.Greeter;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class Should_pass_encryptionFixture {
    
    public String greetingFor(String firstName) {
        return new Greeter().greetingFor(firstName);
    }
}
