package palindromeFinder;

public class PalindromeFinder {
    String paragraph;

    PalindromeFinder() {
        this.paragraph = "";
    }

    PalindromeFinder(String paragraph) {
        this.paragraph = paragraph;
    }

    public void setText(String paragraph) {
        this.paragraph = paragraph;
    }

    public String getText() {
        return this.paragraph;
    }

    public String getLongestPalindrome() {
        String longest = "";
        for (int i = 0; i < paragraph.length(); i++) {
            // ungerade: "aba" - Mittelpunkt ist i
            // gerade:   "abba" - Mittelpunkt zwischen i und i+1

            String odd  = expandAroundCenter(paragraph, i, i);
            String even = expandAroundCenter(paragraph, i, i+1);

            longest = odd.length() > longest.length()
                    ? odd
                    : even.length() > longest.length()
                        ? even
                        : longest;
        }
        return longest;
    }

    String expandAroundCenter(String text, int left, int right) {
        while (left >= 0 && right < text.length() && Character.toLowerCase(text.charAt(left)) == Character.toLowerCase(text.charAt(right))) {
            left--;
            right++;
        }
        return text.substring(left + 1, right);
    }
}
