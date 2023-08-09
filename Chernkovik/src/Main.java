import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 целых числа: ");
        String input = in.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) throws IOException {
        String s[] = input.split(" ");
        String stringa = s[0];
        String stringaction = s[1];
        String stringb = s[2];

        if (s.length > 3) {
            throw new IOException();
        }

        int a;
        int b;
        int c;
        String stringc;

        if ((s[0].equals("1") || s[0].equals("2") || s[0].equals("3") || s[0].equals("4") || s[0].equals("5") || s[0].equals("6") || s[0].equals("7") || s[0].equals("8") || s[0].equals("9") || s[0].equals("10") || s[0].equals("0")) && (s[2].equals("1") || s[2].equals("2") || s[2].equals("3") || s[2].equals("4") || s[2].equals("5") || s[2].equals("6") || s[2].equals("7") || s[2].equals("8") || s[2].equals("9") || s[2].equals("10") || s[2].equals("0"))) {
            a = Integer.parseInt(stringa);
            b = Integer.parseInt(stringb);

            if (a < 1 || a > 10 || b < 1 || b > 10) {
                return "Ошибка\nВводимые числа должны быть в диапазоне от 1 до 10";
            }

            if (stringaction.equals("+")) {
                c = a + b;
                stringc = Integer.toString(c);
            } else if (stringaction.equals("-")) {
                c = a - b;
                stringc = Integer.toString(c);
            } else if (stringaction.equals("*")) {
                c = a * b;
                stringc = Integer.toString(c);
            } else if (stringaction.equals("/")) {
                c = a / b;
                stringc = Integer.toString(c);
            } else {
                throw new IOException();
            }
        } else if ((s[0].equals("I") || s[0].equals("II") || s[0].equals("III") || s[0].equals("IV") || s[0].equals("V") || s[0].equals("VI") || s[0].equals("VII") || s[0].equals("VIII") || s[0].equals("IX") || s[0].equals("X") || s[0].equals("N")) && (s[2].equals("I") || s[2].equals("II") || s[2].equals("III") || s[2].equals("IV") || s[2].equals("V") || s[2].equals("VI") || s[2].equals("VII") || s[2].equals("VIII") || s[2].equals("IX") || s[2].equals("X") || s[2].equals("N"))) {
            Roma romaa = Roma.valueOf(s[0]);
            Roma romab = Roma.valueOf(s[2]);
            a = romaa.getArab();
            b = romab.getArab();

            if (stringaction.equals("+")) {
                c = a + b - 1;
                Roma romac = Roma.values()[c];
                stringc = romac.toString();
            } else if (stringaction.equals("-")) {
                c = a - b - 1;
                Roma romac = Roma.values()[c];
                stringc = romac.toString();
            } else if (stringaction.equals("*")) {
                c = a * b - 1;
                Roma romac = Roma.values()[c];
                stringc = romac.toString();
            } else if (stringaction.equals("/")) {
                c = a / b - 1;
                Roma romac = Roma.values()[c];
                stringc = romac.toString();
            } else {
                throw new IOException();
            }
        } else {
            throw new IOException();
        }

        return stringc;
    }
}
