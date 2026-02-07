import java.util.*;

public class HuffmanLite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Input Value: ");
        // String input = sc.nextLine();
        huffmanLite(sc.nextLine());
    }
    private static void huffmanLite(String input){
        // Count frequency
        Map<Character, Integer> freq = new HashMap<>();
        for (char ch : input.toCharArray()) {
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }

        // Sort characters by frequency (descending)
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        // Assign codes
        Map<Character, String> code = new HashMap<>();
        String currentCode = "0";

        for (char ch : chars) {
            code.put(ch, currentCode);
            currentCode += "1";
        }

        // Encode string
        StringBuilder result = new StringBuilder();
        for (char ch : input.toCharArray()) {
            result.append(code.get(ch));
        }

        System.out.println(result);
    }
}
