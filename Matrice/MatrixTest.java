package Matrice;
import java.util.Scanner;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix m= new Matrix();
        m.creaMatrice();
        m.stampaMatrice();
        int [][] m1={
            {1,0,0},
            {0,1,0},
            {0,0,1}
        };
        int[][] mS=m.mul(m1);
        System.out.print("\n");
        for(int r=0;r<mS.length;r++)
        {
            for(int c=0;c<mS[0].length;c++)
            {
                System.out.print(mS[r][c]+" ");
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        
        int [][]mP=m.pow(2);
        for(int r=0;r<mP.length;r++)
        {
            for(int c=0;c<mP[0].length;c++)
            {
                System.out.print(mP[r][c]+" ");
            }
            System.out.print("\n");
        }
        
    }
}
