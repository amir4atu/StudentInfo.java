import java.util.*;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        System.out.println(input.length());

        System.out.println(input.toUpperCase());
        System.out.println(input.toLowerCase());

        String[] words = input.trim().split("\\s+");
        System.out.println(words.length);

        for (String word : words) {
            System.out.print(new StringBuilder(word).reverse().toString() + " ");
        }
        System.out.println();

        String searchWord = scanner.nextLine();
        System.out.println(input.contains(searchWord));

        String oldWord = scanner.nextLine();
        String newWord = scanner.nextLine();
        System.out.println(input.replace(oldWord, newWord));

        String cleaned = input.replaceAll("\\s+", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        System.out.println(cleaned.equals(reversed));

        String second = scanner.nextLine();
        System.out.println(input.equals(second));

        String delimiter = scanner.nextLine();
        String[] parts = input.split(delimiter);
        for (String part : parts) {
            System.out.println(part);
        }

        int vowels = 0, consonants = 0;
        String vowelsStr = "aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ";
        for (char c : input.toCharArray()) {
            if (Character.isLetter(c)) {
                if (vowelsStr.indexOf(c) != -1) vowels++;
                else consonants++;
            }
        }
        System.out.println(vowels + " " + consonants);

        System.out.println(input.replace(" ", ""));

        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) longest = word;
        }
        System.out.println(longest);

        System.out.println(input.replace(" ", "").length());

        String start = scanner.nextLine();
        System.out.println(input.startsWith(start));

        String end = scanner.nextLine();
        System.out.println(input.endsWith(end));

        System.out.println(new StringBuilder(input).reverse().toString());

        System.out.println(input.replaceAll("\\d", ""));

        System.out.println(input.replaceAll("[aeiouаеёиоуыэюяAEIOUАЕЁИОУЫЭЮЯ]", "*"));

        Map<Character, Integer> freq = new HashMap<>();
        for (char c : input.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }
        for (Map.Entry<Character, Integer> entry : freq.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        System.out.println(input.matches("\\d+"));

        scanner.close();
    }
}