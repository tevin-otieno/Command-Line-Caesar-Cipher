import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

@DisplayName("ceaser cipher tests")
class CCipherTest {
    @Test
    @DisplayName ("test for input")
    public void Cipher_testingInput(){
        CCipher cipher = new CCipher();
        assertNotNull(cipher);
    }

    @Test
    @DisplayName ("test for encryption")
    public void Cipher_testingEncryptingmethod() {
        assertEquals("mvvk", CCipher.encrypt("food",7));
    }

    @Test
    @DisplayName ("test for decryption")
    public void Cipher_testingDecryptingMethod() {
        assertEquals("food", CCipher.decrypt("mvvk",7));
    }

}