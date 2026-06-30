package task7;

public class NumberString {
    public static void main(String[] args) {
        int number = 50;
        String numberText = String.valueOf(number);

        System.out.println("Number: " + number);
        System.out.println("Number converted to String: " + numberText);

        String priceText = "120";
        int price = Integer.parseInt(priceText);

        System.out.println("String: " + priceText);
        System.out.println("String converted to number: " + price);

        String word = "hello world";
        String reversedWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reversedWord = reversedWord + word.charAt(i);
        }

        System.out.println("Original word: " + word);
        System.out.println("Reversed word: " + reversedWord);
    }
}
