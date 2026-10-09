class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<board.length;i++){
            int k=0;
            int l=0;
            HashSet<Character> setright=new HashSet<>();
            HashSet<Character> setdown=new HashSet<>();
            while(k<board.length){
                if(board[k][i]=='.'){k++;continue;}
                if(setdown.contains(board[k][i]))return false;
                else setdown.add(board[k][i]);
                k++;
            }
            while(l<board.length){
                 if(board[i][l]=='.'){ l++; continue;}
                 if(setright.contains(board[i][l]))return false;
                 else setright.add(board[i][l]);
                 l++;
            }         
        }
        for(int i=0;i<board.length;i+=3){
            for(int j=0;j<board.length;j+=3){
                HashSet<Character> setBox=new HashSet<>();
               for(int k=i;k<i+3;k++){
                for(int l=j;l<j+3;l++){
                    if(board[k][l]=='.')continue;
                    if(setBox.contains(board[k][l]))return false;
                    else setBox.add(board[k][l]);
                }
               }
            }
        }
        return true;
    }
}