
public class problem_6 {
    public static void main(String[] args) {
        int TwoDArray[][] = {
            {1, 2, 3},{4, 5, 6},{7, 8, 9}
        };

        int row = TwoDArray.length;
        int column = TwoDArray[0].length;

        for(int i = 0; i < row; i++) {

            for(int j = 0; j < column; j++) {
                System.out.println(+TwoDArray[i][j] + " ");
            }
            System.out.println();
    }
}
}
