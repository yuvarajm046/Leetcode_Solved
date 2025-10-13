class Solution {
    public String sortVowels(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList(
            'a','e','i','o','u','A','E','I','O','U'
        )); 

        List<Character> vowel_s = new ArrayList<>();   
        for(char c : s.toCharArray()) {
            if(vowels.contains(c)) vowel_s.add(c);
        }

        Collections.sort(vowel_s);

        StringBuilder sb = new StringBuilder();
        int a = 0;
        for(char c : s.toCharArray()) {
            if(vowels.contains(c)){
                sb.append(vowel_s.get(a++));
            }
            else{
                sb.append(c);
            }
        }
        return sb.toString();

    
}}