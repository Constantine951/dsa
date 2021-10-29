/*
* Problem: https://leetcode.com/problems/stream-of-characters
*
* Approach: Trie Tree
*/
class StreamChecker {
    
    class TrieNode {
        boolean word = false;
        Map<Character, TrieNode> children = new HashMap<>();
    }

    class TrieTree {
        TrieNode root = new TrieNode();
        public void insert(String s) {
            TrieNode current = root;
            for (int i = s.length()-1; i >= 0; i--) {
                current = current.children.computeIfAbsent(s.charAt(i), x -> new TrieNode());
            }
            current.word = true;
        }

        public boolean search(StringBuilder builder) {
            TrieNode current = root;
            for (int i = builder.length()-1; i >= 0; i--) {
                char ch = builder.charAt(i);
                current = current.children.get(ch);
                if (current == null) return false;
                if (current.word) return true;
            }
            return false;
        }
    }
    
    TrieTree trie = new TrieTree();
    StringBuilder builder = new StringBuilder();

    public StreamChecker(String[] words) {
        for (String word: words) {
            trie.insert(word);
        }
    }

    public boolean query(char letter) {
        builder.append(letter);
        return trie.search(builder);
    }
}
