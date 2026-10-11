import java.io.*;
import javax.crypto.*;

class Main {
    public static void main(String[] args) throws Exception {

        String message = "Hello Hema";

        KeyGenerator kg = KeyGenerator.getInstance("AES");
        kg.init(128);
        SecretKey key = kg.generateKey();

        Cipher c = Cipher.getInstance("AES");
        c.init(Cipher.ENCRYPT_MODE, key);

        byte[] data = c.doFinal(message.getBytes());

        try {
            FileOutputStream fos =
                new FileOutputStream("vault.dat");
            fos.write(data);
            fos.close();

            System.out.println("File encrypted and saved!");

            FileInputStream fis =
                new FileInputStream("vault.dat");
            byte[] encrypted = fis.readAllBytes();
            fis.close();

            c.init(Cipher.DECRYPT_MODE, key);
            byte[] original = c.doFinal(encrypted);

            System.out.println("Original: " +
                new String(original));

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}