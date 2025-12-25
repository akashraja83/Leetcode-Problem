import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> uniqueEmails = new HashSet<>(); // Set to store unique email addresses
        
        for (String email : emails) {
            String[] parts = email.split("@"); // Split into local and domain parts
            String local = parts[0];
            String domain = parts[1];
            
            // Process the local part
            StringBuilder processedLocal = new StringBuilder();
            for (char c : local.toCharArray()) {
                if (c == '+') break; // Ignore everything after the first plus sign
                if (c != '.') processedLocal.append(c); // Ignore periods
            }
            
            // Combine processed local part with domain
            String uniqueEmail = processedLocal.toString() + "@" + domain;
            uniqueEmails.add(uniqueEmail); // Add to set of unique emails
        }
        
        return uniqueEmails.size(); // Return the number of unique emails
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        String[] emails1 = {"test.email+alex@leetcode.com", "test.e.mail+bob.cathy@leetcode.com", "testemail+david@lee.tcode.com"};
        System.out.println(sol.numUniqueEmails(emails1)); // Output: 2

        String[] emails2 = {"a@leetcode.com", "b@leetcode.com", "c@leetcode.com"};
        System.out.println(sol.numUniqueEmails(emails2)); // Output: 3
    }
}
