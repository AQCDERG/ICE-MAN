import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] z = new int[42];
        int[][] thisIsAnIntArrayArray = new int[3][];
        thisIsAnIntArrayArray[0] = new int[4];

        int[][] weCanAlsoDoThis = new int[3][3];

        int[][][] thisIs3DArray = new int[1][][];
        int[][][][][][][][] thisIsAn8thDimensionalArray = new int[1][2][3][4][5][6][7][8];
        //The first thing in the bracket must be specified
        int[][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][] thisIsA256DimensionalArray = new int[5][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][][];
        TheGrid a = new TheGrid();
        a.PrintGrid();
        int y = 0;
        Scanner scan = new Scanner(System.in);

        for(int x = 0; x <= 5; x++)
        {
            if(y % 2 == 0) {
                System.out.println("Pick Row");
                int row = scan.nextInt();
                System.out.println("Pick Column");
                int Col = scan.nextInt();
                a.i[row][Col] = "x";



                a.PrintGrid();
                if ((a.i[row][Col] == a.i[row][Col - Col] && a.i[row][Col] == a.i[row][Col - Col + 1] && a.i[row][Col] == a.i[row][Col - Col + 2]) || (a.i[row][Col] == a.i[row - row][Col] && a.i[row][Col] == a.i[row - row + 1][Col] && a.i[row][Col] == a.i[row - row + 2][Col]) || (a.i[row][Col] == a.i[row - row][Col - Col] && a.i[row][Col] == a.i[row - row + 1][Col - Col + 1] && a.i[row - row + 2][Col - Col + 2] == a.i[row - row + 2][Col]) )
                {
                    System.out.println("Congrauldation, it's a celebration party all night I know you been awaiten");

                }



                y++;
            }
            if(y % 2 == 1) {
                System.out.println("Pick Row");
                int row = scan.nextInt();
                System.out.println("Pick Column");
                int Col = scan.nextInt();
                a.i[row][Col] = "o";
                a.PrintGrid();

                y++;
                if ((a.i[row][Col] == a.i[row][Col - Col] && a.i[row][Col] == a.i[row][Col - Col + 1] && a.i[row][Col] == a.i[row][Col - Col + 2]) || (a.i[row][Col] == a.i[row - row][Col] && a.i[row][Col] == a.i[row - row + 1][Col] && a.i[row][Col] == a.i[row - row + 2][Col]) || (a.i[row][Col] == a.i[row - row][Col - Col] && a.i[row][Col] == a.i[row - row + 1][Col - Col + 1] && a.i[row - row + 2][Col - Col + 2] == a.i[row - row + 2][Col]) )
                {
                    System.out.println("Congrauldation, it's a celebration party all night I know you been awaiten");

                }
            }

        }


        }






    }
