class Solution {
    boolean visited[][];
    
    public boolean exist(char[][] board, String word) {
        
        visited = new boolean[board.length][board[0].length];
        for(int i = 0 ; i < board.length ; i++){
            for(int j = 0 ; j < board[0].length ; j++){
                if(word.charAt(0) == board[i][j] && searchWord(i,j,0,board,word)){
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean searchWord(int i ,int j,int startIdx,char[][] board, String word)
    {
        
        if(startIdx == word.length())
            return true;
        
        if(i < 0 || i >= board.length || j < 0 || j >= board[0].length || word.charAt(startIdx) != board[i][j] || visited[i][j])
            return false;
        
        visited[i][j] = true;
        
            if( searchWord(i+1,j,startIdx+1,board,word) ||
                searchWord(i-1,j,startIdx+1,board,word) || 
                searchWord(i,j+1,startIdx+1,board,word) || 
                searchWord(i,j-1,startIdx+1,board,word) )
                    
                return true;
        
        visited[i][j] = false;
        
        
        return false;
    }
}
