class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet();

        for(int row =0; row<9; row++ ){
            for(int col =0; col<9; col++){
                char num = board[row][col];

                if(num=='.'){
                    continue;
                }

                int boxIndex = (row/3) *3 + (col/3);

                String rowKey = num + "in row" + row;
                String colKey = num + "in col" + col;
                String boxkey = num + "in box" + boxIndex;

                if(!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxkey) ){
                    return false;
                }
            }
        }
        return true;
    }
}
