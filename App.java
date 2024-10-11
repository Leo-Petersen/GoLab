import java.util.Scanner;

public class App {

    static String[][] goBoard = new String[9][9];


    public static void main(String[] args) throws Exception {

        // goBoard[1][1] = "-o";
        // goBoard[2][2] = "-*";


        // Print co-ordinate system
        System.out.print("  ");
        for (int i = 0; i < goBoard[0].length; i++){
        System.out.print((i+1) + " ");
        }
        System.out.println();


        // Print Go Board
        for (int i = 0; i < goBoard.length; i++){
            System.out.print((i+1) + " ");
            for (int j = 0; j < goBoard[i].length; j++){
                if(goBoard[i][j] == null){
                    if(j == 0){
                        System.out.print("+");
                    }
                    else{
                        System.out.print("-+");
                    }
                }
                else{
                    System.out.print(goBoard[i][j]);
                }
            }
            System.out.println();
        }

        // Prompt player moves
        Scanner obj = new Scanner(System.in);

        while(true){

            // Black's turn
            System.out.println("Black's turn, enter move X and Y:");
            int BmoveX = obj.nextInt()-1;
            int BmoveY = obj.nextInt()-1;

            if (BmoveX > 8 || BmoveX < 0) {
                System.out.println("Out of Bounds!!!!!!!");
                continue;
            }
            if (BmoveY > 8 || BmoveY < 0) {
                System.out.println("Out of Bounds!!!!!!!");
                continue;
            }

            if (goBoard[BmoveY][BmoveX] == null){
                if (BmoveX == 0){ //account for first row not having dash
                    goBoard[BmoveY][BmoveX] = "*";
                } else {
                    goBoard[BmoveY][BmoveX] = "-*";
                }
            }

            // White's turn
            System.out.println("White's turn, enter move X and Y:");
            int WmoveX = obj.nextInt()-1;
            int WmoveY = obj.nextInt()-1;

            if (WmoveX > 8 || WmoveX < 0) {
                System.out.println("Out of Bounds!!!!!!!");
                continue;
            }
            if (WmoveY > 8 || WmoveY < 0) {
                System.out.println("Out of Bounds!!!!!!!");
                continue;
            }

            if (goBoard[WmoveY][WmoveX] == null){
                if (WmoveX == 0){ //account for first row not having dash
                    goBoard[WmoveY][WmoveX] = "o";
                } else {
                    goBoard[WmoveY][WmoveX] = "-o";
                }
            }

            // Re-print board with new moves
            for (int i = 0; i < goBoard.length; i++){
                System.out.print((i+1) + " ");
                for (int j = 0; j < goBoard[i].length; j++){
                    if(goBoard[i][j] == null){
                        if(j == 0){
                            System.out.print("+");
                        }
                        else{
                            System.out.print("-+");
                        }
                    }
                    else{
                        System.out.print(goBoard[i][j]);
                    }
                }
                System.out.println();
            }
        }

    }
}
