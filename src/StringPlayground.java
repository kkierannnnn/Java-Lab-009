public class StringPlayground {
    public static int countParentheses(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') { count++; }
            else if (c == ')') { count--; }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] testStrings = {"((3 + 7) * 2)", "(()(()))", "((()))("};

        for (String s : testStrings) {
            System.out.println("Count for \"" + s + "\": " + countParentheses(s));
        }
    }
}
