package Ciphers;

import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Caesar {
    public static String encrypt(String original, int shift){
        StringBuilder result = new StringBuilder(original.length());
        for(char ch : original.toCharArray()){
            if (ch != ' ') {
                ch = (char) (ch + shift);
                if(!Character.isAlphabetic(ch))
                    ch -= 26;
            }
            result.append(ch);
        }
        return result.toString();
    }
    public static String decrypt(String original, int shift){
        return encrypt(original, 26 - (shift % 26));
    }
}
