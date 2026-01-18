class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> bannedSet = new HashSet<>();
        for (String b : banned) bannedSet.add(b.toLowerCase());
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");
        String[] words = paragraph.split("\\s+");
        Map<String, Integer> freq = new HashMap<>();
        String res = "";
        int maxCount = 0;
        for (String word : words) {
            if (word.isEmpty() || bannedSet.contains(word)) continue;
            freq.put(word, freq.getOrDefault(word, 0) + 1);
            if (freq.get(word) > maxCount) {
                maxCount = freq.get(word);
                res = word;
            }
        }
        return res;
    }
}