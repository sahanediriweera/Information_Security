import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;

public class DES {
    public DES(){

    }

    public void generateKey(String customKey) throws InvalidKeyException, NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException {

        DESKeySpec keySpec = new DESKeySpec(customKey.getBytes());
        SecretKey desKey = SecretKeyFactory.getInstance("DES").generateSecret(keySpec);

        byte[] keyByte = desKey.getEncoded();
        String keyStr = new String(keyByte);
        System.out.println(keyStr);

        Cipher des = Cipher.getInstance("DES/ECB/PKCS5Padding");
        des.init(Cipher.ENCRYPT_MODE,desKey);

        byte[] msg = "Helo".getBytes();
        System.out.println("Plain Text is: "+new String(msg));


    }
}
