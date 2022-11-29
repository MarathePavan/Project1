
package securesafeguardsystem;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;
import javax.management.openmbean.InvalidKeyException;

public class CryptoUtils
{
    private static final String ALGORITHM = "AES";
    private static final String TRANSFORMATION = "AES";
 
    public static void encrypt(String key, File inputFile, File outputFile)
            throws CryptoException, java.security.InvalidKeyException {
        doCrypto(Cipher.ENCRYPT_MODE, key, inputFile, outputFile);
    }
 
    public static void decrypt(String key, File inputFile, File outputFile)
            throws CryptoException, java.security.InvalidKeyException {
        doCrypto(Cipher.DECRYPT_MODE, key, inputFile,outputFile);
    }
 
    private static void doCrypto(int cipherMode, String key, File inputFile,
            File outputFile) throws CryptoException, java.security.InvalidKeyException {
        try {
            Key secretKey = new SecretKeySpec(key.getBytes(), ALGORITHM);
            Cipher cipher = Cipher.getInstance(TRANSFORMATION);
            cipher.init(cipherMode, secretKey);
             
            FileInputStream inputStream = new FileInputStream(inputFile);
            byte[] inputBytes = new byte[(int) inputFile.length()];
            inputStream.read(inputBytes);
             
            byte[] outputBytes = cipher.doFinal(inputBytes);
             
            FileOutputStream outputStream = new FileOutputStream(outputFile);
            outputStream.write(outputBytes);
             
            inputStream.close();
            outputStream.close();
             
        } catch (NoSuchPaddingException | NoSuchAlgorithmException
                | InvalidKeyException | BadPaddingException
                | IllegalBlockSizeException | IOException ex) {
            throw new CryptoException("Error encrypting/decrypting file", ex);
        }
    }

    static void decrypt(String key, String enc, String dec) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
class CryptoException extends Exception {
 
    public CryptoException() {
    }
 
    public CryptoException(String message, Throwable throwable) {
        super(message, throwable);
    }
}
class Test implements ActiveUser
{ 
    
    String move(String str) throws IOException 
    { 
        int len = str.length();
        int last = str.lastIndexOf("\\");
        String filename = str.substring(last+1);
        System.out.println("FileName"+filename);
        String newStr="";
        if(checkClick[0]==0)
        {
            newStr = "C:\\securedsafeguardsystem\\"+active[0]+"\\Images\\"+filename;
        }
        else if(checkClick[0]==1)
        {
            newStr = "C:\\securedsafeguardsystem\\"+active[0]+"\\Videos\\"+filename;
        }
        else if(checkClick[0]==2)
        {
            newStr = "C:\\securedsafeguardsystem\\"+active[0]+"\\Docs\\"+filename;
        }
        else if(checkClick[0]==3)
        {
            newStr = "C:\\securedsafeguardsystem\\"+active[0]+"\\Audios\\"+filename;    // +active[0]+
        }
        Path temp = Files.move(Paths.get(str),Paths.get(newStr)); 
  
        if(temp != null) 
        { 
            System.out.println("File renamed and moved successfully");
            return newStr; 
        } 
        else
        { 
            System.out.println("Failed to move the file"); 
        } 
        return null;
    }
    String moveblack(String str) throws IOException 
    {
        int len = str.length();
        int last = str.lastIndexOf("\\");
        String filename = str.substring(last+1);
        System.out.println("FileName"+filename);
        String newStr="";
        return null;
    }    
    static void copyFileUsingStream(File source, File dest) throws IOException {
    InputStream is = null;
    OutputStream os = null;
    try {
        is = new FileInputStream(source);
        os = new FileOutputStream(dest);
        byte[] buffer = new byte[1024];
        int length;
        while ((length = is.read(buffer)) > 0) {
            os.write(buffer, 0, length);
        }
    } finally {
        is.close();
        os.close();
    }
    }
}
    
    

