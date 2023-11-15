package org.example;
import java.util.*;
public class NQueen {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of queens");
        int n = sc.nextInt();
        long startTime = System.currentTimeMillis();
        int[][] board = new int[n][n];
        if(placeQueen(board,0,n)){
            long endTime = System.currentTimeMillis();
            System.out.println("The total time required to find Nqueens solution is " + (endTime-startTime));
            displayBoard(board);
        }else{
            System.out.println("Solution is not possible");
        }

    }

    public static boolean isSafe(int[][] board,int row,int col,int n){
        //for checking col
        for(int i=0;i<row;i++){
            if(board[i][col] == 1){
                return false;
            }
        }

        //for checking upper left diagonal
        for(int i=row,j=col;i>=0 && j>=0;i-- ,j--){
            if(board[i][j] == 1){
                return false;
            }
        }

        //for checking upper right diagonal
        for(int i=row,j=col;i>=0 && j<n;i--,j++){
            if(board[i][j] == 1){
                return false;
            }
        }
        return true;
    }

    public static boolean placeQueen(int[][] board,int row,int n){
        if(row == n){
            return true;
        }
        for(int col=0;col<n;col++){
            if(isSafe(board,row,col,n)){
                board[row][col] = 1;

                if(placeQueen(board,row+1,n)){
                    return true;
                }

                board[row][col] = 0;
            }
            //displayBoard(board);
        }
        return false;
    }

    public static void displayBoard(int[][] board){
        for(int row=0;row<board.length;row++){
            for(int col=0;col<board[row].length;col++){
                if(board[row][col] == 1){
                    System.out.print("Q ");
                }else{
                    System.out.print(". ");
                }
            }
            System.out.println();
        }
    }
}
