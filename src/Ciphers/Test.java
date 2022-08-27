package Ciphers;

public class Test {
    public static void main(String[] args) {
        String text = "AaZz";
        text = Caesar.encrypt(text, 1);
        System.out.println(Caesar.decrypt(text, 1));
    }
}
