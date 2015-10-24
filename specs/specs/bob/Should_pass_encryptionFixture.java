package specs.bob;

import com.example.Greeter;
import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.bob.Password;

/* Run this class as a JUnit test. */

@RunWith(ConcordionRunner.class)
public class Should_pass_encryptionFixture {
    
    public String greetingFor(String firstName) {
        return new Greeter().greetingFor(firstName);
    }

    public String encryption(String password){
        Password subject=new Password();
        return subject.encrpytion(password);
    }

    public String decryption(String password){
        Password subject=new Password();
        return subject.decryption(password);
    }

}
