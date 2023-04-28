package Matrice;
import java.util.Scanner;

public class Matrix 
{
    private int nColonne=-1, nRighe=-1;
    private int [][]matrice;
    public void creaMatrice()
    {
        Scanner input=new Scanner(System.in);
        System.out.println("Inserisci il numero di righe");
        nRighe=input.nextInt();
        input.nextLine();
        assert nRighe>0:"Righe non valide";
        

        System.out.println("Inserisci il numero di colonne");
        nColonne=input.nextInt();
        input.nextLine();
        assert nColonne>0:"Colonne non valide";

        matrice=new int[nRighe][nColonne];

        for(int r=0;r<nRighe;r++)
            for(int c=0;c<nColonne;c++)
            {
                System.out.println("Inserisci un numero");
                matrice[r][c]=input.nextInt();
                input.nextLine();
            }

       
    }
    public void stampaMatrice()
    {
        for(int r=0;r<nRighe;r++)
        {
            for(int c=0;c<nColonne;c++)
            {
                System.out.print(matrice[r][c]+" ");
            }
            System.out.print("\n");
        }
            
    }
    public int getElemento(int posRiga, int posColonna)
    {
        assert nRighe>-1 && nColonne>-1: "Prima setta il numero di righe e colonne";
        assert posColonna<=nColonne && posRiga<=nRighe : "Out of bound";
        return matrice[posRiga][posColonna];
    }
    public int getRighe()
    {
        return nRighe;
    }
    public int getColonne()
    {
        return nColonne;
    }
    public int [][]add(int [][]matriceDaSommare)
    {
        assert nRighe>-1 && nColonne>-1: "Prima setta il numero di righe e colonne";
        assert matriceDaSommare[0].length==matrice[0].length && matriceDaSommare.length==matrice.length: "Dimensioni diverse, impossibile sommare";
        int matriceSomma[][]=new int[nRighe][nColonne];
        for(int riga=0;riga<nRighe;riga++)
            for(int colonna=0;colonna<nColonne;colonna++)
                matriceSomma[riga][colonna]=matrice[riga][colonna]+matriceDaSommare[riga][colonna];
        return matriceSomma;
    }
    public int[][]mul(int [][]matriceDaMoltiplicare)
    {
        assert nRighe==matriceDaMoltiplicare[0].length: "Dimensioni diverse, impossibile moltiplicare";
        assert matriceDaMoltiplicare!=null:"Ue Trmo";
        int [][] matriceMoltiplicazione=new int[nRighe][nColonne];
        for(int riga=0;riga<nRighe;riga++)
        {
            for(int colonna=0;colonna<matriceDaMoltiplicare[0].length;colonna++)
            {
                matriceMoltiplicazione[riga][colonna]=0;
                for(int linea=0;linea<matriceDaMoltiplicare[0].length;linea++)
                {
                    matriceMoltiplicazione[riga][colonna] += matrice[riga][linea] * matriceDaMoltiplicare[linea][colonna];
                }
            }
        }
        return matriceMoltiplicazione;
        
    }
    public int [][] pow(int n)
    {
        assert nRighe==nColonne: "La matrice non e' quadrata";
        int [][]matricePotenza=new int[nRighe][nColonne];
        if(n==0)
        {
            for(int riga=0;riga<nRighe;riga++)
            for(int colonna=0;colonna<nColonne;colonna++)
                matricePotenza[riga][colonna] = (riga==colonna)? 1:0;
        }
        else
        {
            if(n==1)
                return matrice;
            for(int riga=0;riga<nRighe;riga++)
                for(int colonna=0;colonna<nColonne;colonna++)
                    matricePotenza[riga][colonna]=0;
            for(int i=0;i<n;i++)
            {
                
                for(int riga=0;riga<nRighe;riga++)
                {
                    for(int colonna=0;colonna<nColonne;colonna++)
                    {
                        matricePotenza[riga][colonna]=0;
                        for(int linea=0;linea<nColonne;linea++)
                        {
                            matricePotenza[riga][colonna] += matrice[riga][linea] * matrice[linea][colonna];
                        }
                    }
                }
            
            }
        }
        
        return matricePotenza;
    }

}
