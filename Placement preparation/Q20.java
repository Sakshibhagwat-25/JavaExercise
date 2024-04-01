class Demo {
    public static void main(String[] args) {
        String input1 = "abcdefghij google microsoft";
        String input2 = "cameron blue";
        
        System.out.println(WordWithHighestRepeatedLetters(input1)); 
        System.out.println(WordWithHighestRepeatedLetters(input2)); 
    }

    public static String WordWithHighestRepeatedLetters(String input) {
        String[] words = input.split("\\s+");
        String resultWord = "";
        int maxRepeatedLetters = 1;

        for (String word : words) {
            int[] counts = new int[26];
            int maxCount = 0;

            for (char c : word.toCharArray()) {
                if (Character.isLetter(c)) {
                    int index = c - 'a';
                    counts[index]++;
                    maxCount = Math.max(maxCount, counts[index]);
                }
            }

            if (maxCount > maxRepeatedLetters) {
                maxRepeatedLetters = maxCount;
                resultWord = word;
            }
        }

        return resultWord.isEmpty() ? "-1" : resultWord;
    }
}
