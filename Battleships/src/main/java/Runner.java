import java.lang.reflect.Array;
import java.util.ArrayList;

public class Runner {
    private int player1;
    private int player2;
    static ArrayList<Ships> shipList = new ArrayList<Ships>();

    public static void main(String[] args) {
       createBoard();
       System.out.println("------------------");
       placeShips();
       //createBoard2();


       //Player1 ships
       Ships p1 = new Ships(2,2);
       Ships p2 = new Ships(2,2);
       Ships b1 = new Ships(2,2);
       Ships s1 = new Ships(2,2);
       Ships d1 = new Ships(2,2);
       Ships c1 = new Ships(2,2);
       shipList.add(p1);
       shipList.add(p2);

       //Player2 ships
        Ships pp1 = new Ships(2,2);
        Ships pp2 = new Ships(2,2);
        Ships bb1 = new Ships(2,2);
        Ships ss1 = new Ships(2,2);
        Ships dd1 = new Ships(2,2);
        Ships cc1 = new Ships(2,2);


    }


    public static void createBoard(){
        int[][] board = new int[12][12];
            for (int r = 0; r < board.length; r++) {
                for (int c = 0; c < board.length; c++) {
                    System.out.print(board[r][c]);
                }
                System.out.println();
            }
        }


    public static void createBoard2() {
        int[][] board2 = new int[3][3];
        for (int r = 0; r < board2.length; r++) {
            for (int c = 0; c < board2.length; c++) {
                System.out.print(board2[r][c]);
            }
            System.out.println();
        }
    }

    private static void placeShips(){
        System.out.println("1");
        for (int i=0; i< shipList ; i++){
            System.out.println("2");
            Ships ship = shipList.get(i++);
            boolean placement = true;
            if (placement == true){
                System.out.println(ship);
            }
            System.out.println("3");
        }
    }




    }








