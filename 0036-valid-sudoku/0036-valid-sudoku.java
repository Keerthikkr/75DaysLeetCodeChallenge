class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char num = board[i][j];

                if (num != '.') {
                    String row = num + " row " + i;
                    String column = num + " column " + j;
                    String box = num + " box " + (i / 3) + "-" + (j / 3);

                    if (set.contains(row) || 
                        set.contains(column) || 
                        set.contains(box)) {
                        return false;
                    }

                    set.add(row);
                    set.add(column);
                    set.add(box);
                }
            }
        }

        return true;
    }
}