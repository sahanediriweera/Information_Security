public class Main {
    public static void main(String[] args) {
        String key = "3321";
        byte[] plaintext = "Sahan Ediriweera".getBytes();

        RC4Cipher rc4 = new RC4Cipher(key);

        byte[] encrypted = rc4.encrypt(plaintext);
        byte[] decrypted = rc4.decrypt(encrypted);

        System.out.println("Plaintext: " + new String(plaintext));
        System.out.println("Encrypted: " + new String(encrypted));
        System.out.println("Decrypted: " + new String(decrypted));
    }
}