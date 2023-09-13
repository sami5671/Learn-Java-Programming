public class problem_6 {
    public static void main(String[] args) {
        int twoDArr[][] = {
            {10, 20, 30}, {40, 50, 60}, {70, 80, 90}
        };

        int row = twoDArr.length;
        int column = twoDArr[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(twoDArr[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
