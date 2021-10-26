import static org.junit.jupiter.api.Assertions.*;

@DisplayName ("ceaser cipher tests")
class CCipherTest {
    @Test
    @DisplayName ("test for encryption")
    public void Cipher_testingEncryptingmethod() {
        CCipher cipher =new CCipher();
        assertEquals("mvvk",cipher.encrypt("food",7));
    }

    @Test
    @DisplayName ("test for decryption")
    public void Cipher_testingDecryptingMethod() {
        CCipher cipher =new CCipher();
        assertEquals("food",cipher.decrypt("mvvk",&));
    }

}