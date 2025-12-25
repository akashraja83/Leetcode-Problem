class Solution {
    //Create hashCode for Email :
    private static int hashCode(String email) {
        char[] chars = email.toCharArray();
        int hash = 0;
        int idx = 0;
        int domainIdx = email.indexOf('@');

        // Process local part before domain
        for (int i = 0; i < domainIdx; i++) {
            char ch = chars[i];
            if (ch == '+') break;           // Stop at '+'
            if (ch == '.') continue;        // Skip periods
            hash += ch * ++idx;             // Accumulate weighted char values
        }

        // Include domain part fully
        for (int i = domainIdx; i < chars.length; i++) {
            hash += chars[i] * ++idx;
        }

        return hash;
    }

    public static int numUniqueEmails(String[] emails) {
        Set<Integer> set = new HashSet<>();

        for (String email : emails) {
            set.add(hashCode(email));
        }

        return set.size();
    }
    
    
//     public int numUniqueEmails(String[] emails) {
//         Set<String> uniqueEmail = new HashSet<>();
//         for(String email: emails){
//             uniqueEmail.add(normalize(email));
//         }
//         return uniqueEmail.size();
//     }

//     static String normalize(String email){
//         int domainInd = email.indexOf('@');
//         StringBuilder sr = new StringBuilder(email.length());

//         //now we building string
//         for(int index=0; index<domainInd; index++){
//             char ch = email.charAt(index);
//             if(ch=='+') break;
//             if(ch!='.') sr.append(ch);
//         }
//         //now we append domain name
//         sr.append(email.substring(domainInd));

//         return sr.toString();
//     }
}