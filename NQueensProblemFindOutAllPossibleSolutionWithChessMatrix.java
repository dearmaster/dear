package com.leaf.captain.algorithm.nqueens;

import java.util.Scanner;

/**
 * Every two queens should not be on the same row/cel.
 * Nor on the two diagonals
 */
public class NQueensProblemFindOutAllPossibleSolutionWithChessMatrix {

    private static int[][] chessboard = new int [0][0];
    private static int numberOfQueens;
    private static int count;

    public static void main(String[] args) {
        process();
    }

    private static void initChessboard() {
        chessboard = new int[numberOfQueens][numberOfQueens];
        for(int i=0; i<numberOfQueens; i++) {
            for(int j=0; j<numberOfQueens; j++) {
                chessboard[i][j] = 0;
            }
        }
        count = 0;
    }

    private static void process() {
        Scanner scanner = new Scanner(System.in);
        for(;;) {
            System.out.println("Please input the number of queens(-1 to exit):");
            numberOfQueens = scanner.nextInt();
            if(numberOfQueens == -1)
                System.exit(0);
            else if (numberOfQueens < 4) {
                System.err.println("No possible solution of placing the queens if number of queens is smaller than 4");
                System.exit(0);
            } else {
                initChessboard();
                findSolutions();
            }
        }
    }

    private static void findSolutions() {
        placeQueen(0, numberOfQueens);
    }

    private static void printSolution() {
        for(int i=0; i<numberOfQueens; i++) {
            for(int j=0; j<numberOfQueens; j++) {
                System.out.print(chessboard[i][j]);
                if(j == numberOfQueens -1)
                    System.out.println();
                else
                    System.out.print("  ");
            }
        }
    }

    private static void placeQueen(int queen, int totalNumberOfQueens) {
        if(queen == totalNumberOfQueens) {
            System.out.println("Solution " + ++count + " :");
            printSolution();
        }
        for(int col=0; col < totalNumberOfQueens; col++) {
            if(safeToPlace(queen, col)) {
                chessboard[queen][col] = 1;
                placeQueen(queen+1, totalNumberOfQueens);
                chessboard[queen][col] = 0; //backtrack
            }
        }
    }

    public static boolean safeToPlace(int row, int col) {
        for(int i=0; i<row; i++) {
            for(int j=0; j<chessboard.length; j++) {
                if(chessboard[i][j] == 1) {
                    if(i == row || j == col || (i - row == j - col) || (i + j == row + col)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

}