public class Grid {
    int [][] board2 = new int [3][3];


    public void createBoard2(){

        for (int r = 0; r < board2.length; r++) {
            for (int c = 0; c < board2.length; c++) {
              System.out.print(board2[r][c]);
            }
            System.out.println();
        }

    }






}
