package ai;

import ai.leetocde.*;

import java.util.Stack;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // ZIGZAG CONVERTION
        zigzagConversion zigzagConversion = new zigzagConversion();
        System.out.println(zigzagConversion.convert("PAYPALISHIRING", 3));

        // VALID PARENTHESIS
        validParenthesis vp = new validParenthesis();
        System.out.println(vp.isValid("({({[]})})"));
        System.out.println(vp.isValid("({({[})})"));
    }
}