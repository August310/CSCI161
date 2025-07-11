/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Questions.Files;

import java.io.File;
import java.io.FileNotFoundException;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author araderma
 */
public class CryptographyTest {

    public CryptographyTest() {
    }

    @BeforeClass
    public static void setUpClass() {

        // clean up the directory we need and restore necessary files
        String path = "files/cryptography";
        File directory = new File(path);

        for(File f : directory.listFiles())
        {
            f.delete();
        }

        String message1 = "One if by land\nTwo if by sea";
        String message2 = "NOTHING TO SEE HERE PLEASE MOVE ALONG";
        String message3 = "A Math Problem:\n2 + 2 = 4";
        String secretMessage = "Gur vafgehpgvbaf unir n uvqqra obahf jbeq sbe Dhvm 5";
        String encryptedMessage1 = "Kn bdan cx marwt hxda Xejucrwn";
        String encryptedMessage2 = "tlla bz pu aol jsbiovbzl hmaly khyr";
        String encryptedMessage3 = "i uiv, i xtiv, i kivit: Xiviui!";

        HashMap<String, String> map = new HashMap();
        map.put(path + "/message1.txt", message1);
        map.put(path + "/message2.txt", message2);
        map.put(path + "/message3.txt", message3);
        map.put(path + "/secret message.txt", secretMessage);
        map.put(path + "/encryptedMessage1.txt", encryptedMessage1);
        map.put(path + "/encryptedMessage2.txt", encryptedMessage2);
        map.put(path + "/encryptedMessage3.txt", encryptedMessage3);

        PrintWriter pw;

        try
        {
            for(String key : map.keySet())
            {
                pw = new PrintWriter(new File(key));
                pw.print(map.get(key));
                pw.close();
            }
        }
        catch (Exception ex)
        {
            System.out.println(ex.toString());
            System.out.println("Error cleaning directory. Contact your instructor to fix this issue.");
        }

    }

    private Object[] read(String path)
    {
        String results = "";
        try
        {
            Scanner scan = new Scanner(new File(path));
            while(scan.hasNext())
            {
                results += scan.nextLine() + "\n";
            }
            return new Object[] {true, results};
        }
        catch (FileNotFoundException ex)
        {
            return new Object[] {false, "Could not find file: " + path};
        }
    }

    /**
     * Test of encode method, of class Cryptography.
     */
    @Test
    public void testEncode_CorrectOutputForMixedText() {
        String path = "files/cryptography/message1.txt";

        System.out.println("Test: CorrectOutputForMixedMethod:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, 5);

        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }


        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "Tsj nk gd qfsi\n" + "Ybt nk gd xjf";

        assertEquals("Encrypted message deviated from expected result.", expected, value);
    }
    @Test
    public void testEncode_CorrectOutputForAllCapitals() {
        String path = "files/cryptography/message2.txt";

        System.out.println("Test: CorrectOutputForAllCapitals:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, 13);
        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "ABGUVAT GB FRR URER CYRNFR ZBIR NYBAT";

        assertEquals("Encrypted message deviated from expected result.", expected, value);
    }
    @Test
    public void testEncode_DoesNotModifyNonLetters() {
        String path = "files/cryptography/message3.txt";

        System.out.println("Test: DoesNotModifyNonLetters:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, 8);
        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = (((String)results[1]).trim().substring(((String)results[1]).trim().lastIndexOf("\n"))).trim();

        String expected = "2 + 2 = 4";

        assertEquals("Non-letters have been modified in message3.txt.", expected, value);
    }
    @Test
    public void testEncode_SameValueForNoShift()
    {
        String path = "files/cryptography/message1.txt";

        System.out.println("Test: SameValueForNoShift:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, 0);
        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "One if by land\n" + "Two if by sea";

        assertEquals("Encrypted message deviated from expected result.", expected, value);
    }
    @Test
    public void testEncode_HandlesNegativeShift()
    {
        String path = "files/cryptography/message2.txt";

        System.out.println("Test: HandlesNegativeShift:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, -15);
        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "YZESTYR EZ DPP SPCP AWPLDP XZGP LWZYR";

        assertEquals("Incorrect result for a negative shift value", expected, value);
    }
    @Test
    public void testEncode_HandlesLargeShiftValues()
    {
        String path = "files/cryptography/message2.txt";

        System.out.println("Test: HandlesLargeShiftValues:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.encode(path, 42);
        String output = path.substring(0, path.lastIndexOf(".")) + "-encrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "DEJXYDW JE IUU XUHU FBUQIU CELU QBEDW";

        assertEquals("Incorrect result large shift value (37).", expected, value);
    }

    /**
     * Test of decode method, of class Cryptography.
     */
    @Test
    public void testDecode_WorksForMixedText()
    {
        String path = "files/cryptography/secret message.txt";

        System.out.println("Test: Decode_WorksForMixedText:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, 13);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "The instructions have a hidden bonus word for Quiz 5";

        assertEquals("Decrypted results deviated from expected value: ", expected, value);
    }

    @Test
    public void testDecode_WorksForAllLowerCaseLetters()
    {
        String path = "files/cryptography/encryptedMessage2.txt";

        System.out.println("Test: Decode_WorksForAllLowerCaseLetters:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, 7);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "meet us in the clubhouse after dark";

        assertEquals("Decrypted results deviated from expected value: ", expected, value);
    }

    @Test
    public void testDecode_WorksForLargeShift()
    {
        String path = "files/cryptography/encryptedMessage2.txt";

        System.out.println("Test: Decode_WorksForLargeShift:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, 33);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "meet us in the clubhouse after dark";

        assertEquals("Incorrect result large shift value (33).", expected, value);
    }

    @Test
    public void testDecode_WorksForNegativeShift()
    {
        String path = "files/cryptography/encryptedMessage1.txt";

        System.out.println("Test: Decode_WorksForNegativeShift:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, -17);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "Be sure to drink your Ovaltine";

        assertEquals("Incorrect result for a negative shift (-17).", expected, value);
    }

    @Test
    public void testDecode_DoesNotModifyNonLetters()
    {
        String path = "files/cryptography/encryptedMessage3.txt";

        System.out.println("Test: Decode_DoesNotModifyNonLetters:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, 8);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim().replaceAll("[a-zA-Z]", "*");

        String expected = "* ***, * ****, * *****: ******!";

        assertEquals("Commas have been changed", expected, value);
    }

    @Test
    public void testDecode_SameValueForNoShift()
    {
        String path = "files/cryptography/message2.txt";

        System.out.println("Test: Decode_SameValueForNoShift:");
        System.out.println("--Original contents for: " + path);
        System.out.println(read(path)[1]);

        Cryptography.decode(path, 0);
        String output = path.substring(0, path.lastIndexOf(".")) + "-decrypted.txt";
        Object[] results = read(output);

        if((boolean)results[0] == false)
        {
            System.out.println("--Could not find matching encrypted file: " + output);
            fail("Could not find expected output file: " + path);
        }

        System.out.println("--Encrypted result in: " + output);
        System.out.println(results[1]);

        String value = ((String)results[1]).trim();

        String expected = "NOTHING TO SEE HERE PLEASE MOVE ALONG";

        assertEquals("Commas have been changed", expected, value);
    }

}
