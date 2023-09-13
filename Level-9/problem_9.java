public class problem_9 {
     public static String removeConsonants(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            input = input.toLowerCase();
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == ' ' || ch == ',') {
                result.append(ch);
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        String inputText = "Hello, have a good day";
        String resultString = removeConsonants(inputText);

        System.out.println("Original String: " + inputText);
        System.out.println("String without consonants: " + resultString);
    }

   
}
