# NacoTeck 2K26 - Technical Symposium organized by National College, Trichy.

## 🏆 Achievement
**🥇 First Prize in Code Crack Event**

---

## 📋 Event Overview
This repository documents my solutions for the **NacoTeck 2K26 Symposium** - "Code Crack Event". Round 1 involved reverse-engineering code from given outputs without hardcoding, while Round 2 provided problem statements with test cases to implement solutions.

---

## Round 1: Reverse Coding Challenge (Python) ✅ **CLEARED**

### Problem Statement: Fibonacci Series with Dynamic Sum

**Objective:** Derive the relationship between Fibonacci sequence and the sum pattern from the given output.

**Output Pattern:**
```
Level 1 -> Sum = 3 AddrShift = 1
Level 2 -> Sum = 6 AddrShift = 1
Level 3 -> Sum = 10 AddrShift = 2
Level 4 -> Sum = 15 AddrShift = 3
Level 5 -> Sum = 21 AddrShift = 5
...and so on
```

### Key Observations:
1. **Sum Pattern:** Increases by `3 + i` at each level (where `i` is the iteration index)
2. **AddrShift Pattern:** Follows Fibonacci sequence (1, 1, 2, 3, 5, 8, 13...)
3. **Solution Approach:** Derived the relationship mathematically without hardcoding output values

### Solution (Python)

```python
#Sum varies by +3 with i
sum = 3
#Finobacci Series
a, b = 1, 0

for i in range(0, 19):
    c = a + b
    a,b = b,c
    print(f"Level {i+1} -> Sum = {sum} AddrShift = {c}")
    #Relation Expression derived from output
    sum = sum + 3 + i
```

### Explanation:
- **Fibonacci Generation:** `c = a + b` generates the next Fibonacci number
- **Sum Calculation:** `sum = sum + 3 + i` dynamically computes the sum based on iteration
- **No Hardcoding:** Both patterns are derived mathematically, not hardcoded
- **Relationship:** The sum increment follows a linear progression while AddrShift follows Fibonacci

---

## Round 2: Huffman-Lite Frequency Tree (C++ / C Required) 🚀

### Problem Statement: Huffman Coding - Frequency-Based Encoding

**Objective:** Implement a custom Huffman-like encoding algorithm where characters are encoded based on frequency with intuitive pattern generation.

**Input Example:**
```
Senselessness
```

**Output:**
```
001011001011101000110100
```

### Huffman-Lite Logic:
- **Most Frequent Character** → Encoded as `"0"`
- **Next Frequent** → `"01"`
- **Next Frequent** → `"011"`
- **Next Frequent** → `"0111"`
- Pattern: Each subsequent character gets an additional `"1"` appended

### Key Observations:
1. **Frequency Counting:** Count occurrence of each character in the input
2. **Sorting:** Sort characters by frequency in descending order
3. **Code Generation:** Assign codes based on the pattern (0, 01, 011, 0111...)
4. **Encoding:** Iterate through input character-wise and substitute each character with its assigned code

### Solution (Java Implementation)

```java
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
```

### Approach Explanation:

1. **Frequency Map:** Use HashMap to count each character's occurrence
2. **Sorting:** Sort characters by frequency (descending) to assign shorter codes to frequent characters
3. **Code Assignment:** 
   - 1st character: `"0"`
   - 2nd character: `"01"`
   - 3rd character: `"011"`
   - nth character: `"0" + "1"*(n-1)`
4. **Encoding Process:** Iterate through input string and replace each character with its corresponding code
5. **Output:** Concatenated binary-like string representing the encoded input

### Related Problems on Coding Platforms:
- **LeetCode 399:** Evaluate Division (Graph-based relationship)
- **LeetCode 347:** Top K Frequent Elements (Frequency sorting)
- **LeetCode 1167:** Minimum Cost to Connect Sticks (Huffman Coding concept)
- **GeeksforGeeks:** Huffman Coding Implementation

### Time Complexity: O(n log k) where n = string length, k = unique characters
### Space Complexity: O(k) for storing frequency map and codes

---

## 📸 Round 1 Question Paper
[Add image of Round 1 question paper here]

---

## 📸 Round 2 Question Paper
[Add image of Round 2 question paper here]

---

## 🎓 Learning Outcomes

✅ **Pattern Recognition:** Ability to reverse-engineer code from output patterns  
✅ **Mathematical Derivation:** Combining Fibonacci and arithmetic sequences  
✅ **Custom Sorting:** Implementing frequency-based sorting for encoding  
✅ **Data Structures:** Using HashMap and PriorityQueue concepts  
✅ **Algorithm Design:** Creating intuitive encoding schemes  
✅ **Problem Analysis:** Breaking down complex problems into logical steps  

---

## 💡 Key Takeaways

1. **No Hardcoding:** Both solutions derive patterns mathematically
2. **Intuitive Design:** Huffman-Lite algorithm is simpler than standard Huffman but follows the same principle
3. **Character-wise Processing:** Iterating and substituting characters is more efficient than pattern matching
4. **Frequency Optimization:** Most frequent characters get shorter codes for better compression

---

## 🎯 Competition Details
**Event:** Code Crack Event  
**Symposium:** NacoTeck 2K26  
**Result:** 🥇 **First Prize**  
**Rounds Completed:** 2/2 ✅

---

*Last Updated: February 7, 2026*
