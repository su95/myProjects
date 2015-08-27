import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SudokuSolver {
	
	private static int N = 9;
	
	private static int freq[] = new int[N+1];  // frequency counter: the numbers which are repeated most can be solved easily
	
	private static int[] spaces = new int[N+1];
	
	private static int[] count = new int[N+1];     // sum of freq and spaces
	
	private static int[][] sudoku = new int[N][N]; // 2d array to store the sudoku puzzle
	
	 // 3D array to store the positions of each number
    // the 1st digit is the number and remaining two are (i, j) positions
	
	private static String[][][] pos = new String[N+1][N][N];
	
    
    public static void checkSquare(int x, int y,int i, int j,int k, int[][] sudoku,String[][][] pos) {
        
        for (int p = x-3; p < x; p++)  {
        	
            for (int q = y-3; q < y; q++) {
                
            	if (sudoku[p][q] == k) { pos[k][i][j] = "x"; } 
                
            }
        }
        
        
    }
    
    public static void printSudoku(int N,int[][] sudoku) {
        // print the sudoku puzzle
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (sudoku[i][j] == 0) System.out.print("* ");
                else                   System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }
    
    public static void loadPos(int N, int[][] sudoku, String[][][] pos) {
         for(int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (sudoku[i][j] == k) pos[k][i][j] = "x";
                    else                   pos[k][i][j] = "y";
                }
            }
        }
    }
    
    public static void print3darray(int N, String[][][] pos) {
        // print the 3d array after litte solving
        for(int k = 1; k <= N; k++) {
            System.out.println(k + "'s");
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (pos[k][i][j] == "y") System.out.print("(" + i + "," + j + ")");
                    
                }
            }
            System.out.println();
        }
        
    }
    
    public static void step1(int N, String[][][] pos) {
         // step-1 solve for k = 1,2,3..
        for (int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(pos[k][i][j] == "x") {
                    	
                        for (int p = 0; p < N; p++) { pos[k][i][p] = "z"; }   
                        
                        for (int p = 0; p < N; p++) { pos[k][p][j] = "z"; }   
                        
                    }
                }
            }
        }
        
        for (int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(pos[k][i][j] == "z") { pos[k][i][j] = "x"; }
                }
            }
        }
    }

    public static void step2(int N, int[][] sudoku, String[][][] pos) {
      // step 2 check for any numbers in the same slot
        for (int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(sudoku[i][j] != 0) {
                            pos[k][i][j] = "x";   
                    }
                }
            }
        }   
    }
    
    public static void step3(int N, int[][] sudoku, String[][][] pos) {
     // step-3 check for any numbers in the squares
        for(int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (pos[k][i][j] == "y") {
                        if      (i < 3 && j < 3) { checkSquare(3,3,i,j,k,sudoku,pos); }
                        else if (i < 3 && j < 6) { checkSquare(3,6,i,j,k,sudoku,pos); }
                        else if (i < 3 && j < 9) { checkSquare(3,9,i,j,k,sudoku,pos); }
                        else if (i < 6 && j < 3) { checkSquare(6,3,i,j,k,sudoku,pos); }
                        else if (i < 6 && j < 6) { checkSquare(6,6,i,j,k,sudoku,pos); }
                        else if (i < 6 && j < 9) { checkSquare(6,9,i,j,k,sudoku,pos); }
                        else if (i < 9 && j < 3) { checkSquare(9,3,i,j,k,sudoku,pos); }
                        else if (i < 9 && j < 6) { checkSquare(9,6,i,j,k,sudoku,pos); }
                        else if (i < 9 && j < 9) { checkSquare(9,9,i,j,k,sudoku,pos); }
                    }
                }
            }
        }   
    }
    
    public static void getfreq(int N,int[] freq, int[][] sudoku) {
        for(int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                int x = sudoku[i][j];
                freq[x]++;
            }
        }
    }
    
    public static void getCount(int N, int[] freq, int[] spaces, int[] count) {
        for (int i = 0; i <= N; i++)
            count[i] = freq[i] + spaces[i];
        
    }
    
    public static void getspaces(int N,int[] spaces, String[][][] pos) {
        for(int k = 1; k <= N; k++) {
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (pos[k][i][j] == "y") spaces[k]++;
                    
                }
            }
        }
     
        
    }
    
    //
    
    public static void fillSudoku(int N, int[] count, int[][] sudoku, String[][][] pos) {
          for (int k = 1; k <= N; k++) {
            
                for(int i = 0; i < N; i++) {
                    for (int j = 0; j < N; j++) {
                        if (count[k] == 9 && pos[k][i][j] == "y") sudoku[i][j] = k;
                    }
                }
            
        }
    }
    
    public static void main(String[] args) {
    	
    	File file = new File("C:/Java/workspace/myProjects/src/puzzle2.txt");
    	
    	Scanner input;
		try {
			input = new Scanner(file);
			
			N = input.nextInt();
			
	        // input of the puzzle
	        for(int i = 0; i < N; i++) {
	            for (int j = 0; j < N; j++) {
	                int x = input.nextInt();
	                sudoku[i][j] = x;
	            }
	        }
		} catch (FileNotFoundException e) {
		
			e.printStackTrace();
		}
        
        printSudoku(N,sudoku);
        
        getfreq(N, freq, sudoku);
        
        loadPos(N, sudoku, pos);
       
        
        // print the 3d array
        System.out.println("before");
        print3darray(N,pos);
        
        // if there is a number it cancels all the other elements in the same row and column
        step1(N, pos);
        
        // print the 3d array after litte solving
        System.out.println("after step 1");
        print3darray(N,pos);
        
        // step 2 check for any numbers in the same slot
        step2(N, sudoku,pos);
                
        // print the 3d array after litte solving
        System.out.println("after step 2");
        print3darray(N,pos);
        
        // step-3 check for any numbers in the squares
        step3(N, sudoku, pos);
        
        System.out.println("after step 3");
        print3darray(N,pos);
        
        
        spaces[0] = 0;
        getspaces(N, spaces, pos);
                   
        getCount(N, freq, spaces, count);
        
        fillSudoku(N, count, sudoku, pos);
        
        for(int i = 0; i < 100; i++) {
            loadPos(N, sudoku, pos);
            step1(N, pos);
            step2(N, sudoku,pos);
            step3(N, sudoku, pos);
            getfreq(N, freq, sudoku);
            getspaces(N, spaces, pos);
            getCount(N, freq, spaces, count);
            fillSudoku(N, count, sudoku, pos);
        }
            
        System.out.println("after step 4");
        print3darray(N,pos);    
        
        printSudoku(N, sudoku);
    }
}