public class LeetCode1768 {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder build = new StringBuilder();

        int i = 0;

        while (i < word1.length() || i < word2.length()) {
            if (i < word1.length()) {
                build.append(word1.charAt(i));
            }

            if (i < word2.length()) {
            }
            build.append(word2.charAt(i));
        }
        return build.toString();
    }
}
