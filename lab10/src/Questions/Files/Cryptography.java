/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questions.Files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author August Preuss
 *
 */
public class Cryptography {

    public static void encode(String fileName, int shift) {
        try {
            //makes shift stay within the range of 0 - 26    
            shift = (shift % 26 + 26) % 26;

            File f = new File(fileName);
            Scanner s = new Scanner(f);

            String outputFileName = fileName.replace(".txt", "") + "-encrypted.txt";
            FileWriter fw = new FileWriter(outputFileName);
            //goes through each line in the file
            while (s.hasNextLine()) {
                String message = s.nextLine();

                StringBuilder encryptedMessage = new StringBuilder();

                for (int i = 0; i < message.length(); i++) {
                    char c = message.charAt(i);

                    if (Character.isLetter(c)) {
                        //accounts for lower and uppercase character
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        //makes result remain positive, base is either a or A
                        c = (char) ((c - base + shift) % 26 + base);
                    }
                    encryptedMessage.append(c);
                }
                //writes the decrypted message to file
                fw.write(encryptedMessage.toString());
                fw.write(System.lineSeparator());
            }

            s.close();
            fw.close();

            System.out.println(outputFileName);

        } catch (FileNotFoundException fnf) {

        } catch (IOException ioe) {

        }
    }

    public static void decode(String fileName, int shift) {
        try {
            //makes shift stay within the range of 0 - 26
            shift = (shift % 26 + 26) % 26;

            File f = new File(fileName);
            Scanner s = new Scanner(f);

            String inputFileName = fileName.replace(".txt", "") + "-decrypted.txt";
            FileWriter fw = new FileWriter(inputFileName);
            //goes through each line in the file
            while (s.hasNextLine()) {
                String message = s.nextLine();

                StringBuilder decryptedMessage = new StringBuilder();

                for (int i = 0; i < message.length(); i++) {
                    char c = message.charAt(i);

                    if (Character.isLetter(c)) {
                        //accounts for lower and uppercase character
                        char base = Character.isLowerCase(c) ? 'a' : 'A';
                        //makes result remain positive, base is either a or A
                        c = (char) ((c - base - shift + 26) % 26 + base);
                    }
                    decryptedMessage.append(c);
                }
                //writes the decrypted message to file
                fw.write(decryptedMessage.toString());
                fw.write(System.lineSeparator());

            }
            s.close();
            fw.close();

            System.out.println(inputFileName);
        } catch (FileNotFoundException fnf) {

        } catch (IOException ioe) {

        }
    }

}
