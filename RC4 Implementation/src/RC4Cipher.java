public class RC4Cipher {
    private byte[] S;
    private byte[] T;

    private byte[] keyStream;

    public RC4Cipher(String keyText) {
        //Converting String value to Bytes
        byte[] key = keyText.getBytes();
        // Initializing S and T Byte arrays
        S = new byte[256];
        T = new byte[256];

        // Initialize S array with values from 0 to 255
        for (int i = 0; i < 256; i++) {
            S[i] = (byte) i;
            T[i] = key[i % key.length];
        }
        // Saving the generated Key Stream
        keyStream = generateKeyStream();
    }

    public byte[] generateKeyStream() {

        //Generating the Cipher
        int j = 0;

        byte[] keyStream = new byte[256];

        for (int i = 0; i < 256; i++) {
            j = (j + S[i] + T[i]) & 0xFF;
            swap(S, i, j);
            keyStream[i] = S[(S[i] + S[j]) & 0xFF];
        }

        return keyStream;
    }

    private void swap(byte[] array, int i, int j) {
        //Swapping the array values
        byte temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public byte[] encrypt(byte[] plaintext) {
        //Converting the text value to byte values
        byte[] ciphertext = new byte[plaintext.length];

        //Encrypting the text
        for (int i = 0; i < plaintext.length; i++) {
            ciphertext[i] = (byte) (plaintext[i] ^ keyStream[i]);
        }

        return ciphertext;
    }

    public byte[] decrypt(byte[] ciphertext) {
        return encrypt(ciphertext); // Encryption and decryption are the same operation in RC4
    }
}
