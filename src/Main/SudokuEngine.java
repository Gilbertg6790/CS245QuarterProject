/** *************************************************************
 * file: SudokuEngine.java
 * author: Albert Gil, Cody Nguyen, Ynebin Yin, Matt Musquiz
 * class: CS 245 - Programming Graphical User Interfaces
 *
 * assignment: Hangman V1.2
 * date last modified: 10/26/17
 *
 * purpose: This class contains the working engine for the sudoku game
 *
 *************************************************************** */
package Main;

import java.util.ArrayList;
import java.util.Collections;

public class SudokuEngine {
    
    private ArrayList<ArrayList<Integer>> grid;
    private final int GRID_SIZE;
    //will contain the answers
    private int answers[][] = new int[9][9];
    //will contain if the user guess a tile wrong.
    private boolean guessedWrong[][] = new boolean [9][9];
    //the total amount of points the user can gain.
    private int sudokuPoints = 540;
    
    public SudokuEngine(){
        GRID_SIZE = 9;
        fillAnswers();
        for (int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                guessedWrong[i][j] = false;
            }
        }
    }
    
    //method: checkAnswer
    //purpose: checks the passed in answer with the answers grid. If it is wrong
    //it checks if the points have been deducted for that answer already. If
    //the answer is wrong and points haven't been deducted, it deducts 10 points
    //and set guessedWrong[x][y] to true to prevent further deductions.
    //Returns true for a correct answer and false for an incorrect answer.
    //Note: currently don't know if having it return anything is useful yet, I
    //included it just in case.
    public boolean checkAnswer(int guess, int x, int y){
        if(guess == answers[x][y]){
            return true;
        } else {
            if (guessedWrong[x][y]){
                return false;
            } else {
                sudokuPoints -= 10;
                guessedWrong[x][y] = true;
                return false;
            }

        }
        
    }
    
    //method: fillAnswers
    //purpose: populates the answer table to enable checking.
    public void fillAnswers(){
        answers[0][0] = 8;
        answers[0][1] = 3;
        answers[0][2] = 5;
        answers[0][3] = 4;
        answers[0][4] = 1;
        answers[0][5] = 6;
        answers[0][6] = 9;
        answers[0][7] = 2;
        answers[0][8] = 7;
        
        answers[1][0] = 2;
        answers[1][1] = 9;
        answers[1][2] = 6;
        answers[1][3] = 8;
        answers[1][4] = 5;
        answers[1][5] = 7;
        answers[1][6] = 4;
        answers[1][7] = 3;
        answers[1][8] = 1;
        
        answers[2][0] = 4;
        answers[2][1] = 1;
        answers[2][2] = 7;
        answers[2][3] = 2;
        answers[2][4] = 9;
        answers[2][5] = 3;
        answers[2][6] = 6;
        answers[2][7] = 5;
        answers[2][8] = 8;
        
        answers[3][0] = 5;
        answers[3][1] = 6;
        answers[3][2] = 9;
        answers[3][3] = 1;
        answers[3][4] = 3;
        answers[3][5] = 4;
        answers[3][6] = 7;
        answers[3][7] = 8;
        answers[3][8] = 2;
        
        answers[4][0] = 1;
        answers[4][1] = 2;
        answers[4][2] = 3;
        answers[4][3] = 6;
        answers[4][4] = 7;
        answers[4][5] = 8;
        answers[4][6] = 5;
        answers[4][7] = 4;
        answers[4][8] = 9;
        
        answers[5][0] = 7;
        answers[5][1] = 4;
        answers[5][2] = 8;
        answers[5][3] = 5;
        answers[5][4] = 2;
        answers[5][5] = 9;
        answers[5][6] = 1;
        answers[5][7] = 6;
        answers[5][8] = 3;
        
        answers[6][0] = 6;
        answers[6][1] = 5;
        answers[6][2] = 2;
        answers[6][3] = 7;
        answers[6][4] = 8;
        answers[6][5] = 1;
        answers[6][6] = 3;
        answers[6][7] = 9;
        answers[6][8] = 4;
        
        answers[7][0] = 9;
        answers[7][1] = 8;
        answers[7][2] = 1;
        answers[7][3] = 3;
        answers[7][4] = 4;
        answers[7][5] = 5;
        answers[7][6] = 2;
        answers[7][7] = 7;
        answers[7][8] = 6;
        
        answers[8][0] = 3;
        answers[8][1] = 7;
        answers[8][2] = 4;
        answers[8][3] = 9;
        answers[8][4] = 6;
        answers[8][5] = 2;
        answers[8][6] = 8;
        answers[8][7] = 1;
        answers[8][8] = 5;
    }
    
    protected void initGame(){
        grid = new ArrayList<>();
        for(int i = 0; i < GRID_SIZE; ++i){
            grid.add(new ArrayList<>());
            for(int j = 0; j < GRID_SIZE; ++j){
                grid.get(i).add(-1);
            }
        }
        addNumbers();
        System.out.println(gridToString());
    }
    
    
    private void addNumbers(){
	grid.get(0).set(0, 8);
        grid.get(0).set(3, 4);
        grid.get(0).set(5, 6);
        grid.get(0).set(8, 7);
        grid.get(1).set(6, 4);
        grid.get(2).set(1, 1);
        grid.get(2).set(6, 6);
        grid.get(2).set(7, 5);
        grid.get(3).set(0, 5);       
        grid.get(3).set(2, 9);
        grid.get(3).set(4, 3);
        grid.get(3).set(6, 7);
        grid.get(3).set(7, 8);
        grid.get(4).set(4, 7);
        grid.get(5).set(1, 4);
        grid.get(5).set(2, 8);
        grid.get(5).set(4, 2);
        grid.get(5).set(6, 1);        
	grid.get(5).set(8, 3);
        grid.get(6).set(1, 5);
        grid.get(6).set(2, 2);
        grid.get(6).set(7, 9);
        grid.get(7).set(2, 1);
	grid.get(8).set(0, 3);
        grid.get(8).set(3, 9);
        grid.get(8).set(5, 2);
        grid.get(8).set(8, 5); 
    }
    
    public ArrayList<ArrayList<Integer>> getGrid(){
        return grid;
    }
    
    public void addToGrid(int i, int j, int val){
        grid.get(i).set(j, val);
    }
    
    public void removeFromGrid(int i, int j){
        grid.get(i).set(j,-1);
    }
    
    public String gridToString(){
        String gridString = "";
        for(int i = 0; i < GRID_SIZE; ++i){
            for(int j = 0; j < GRID_SIZE; ++j){
                gridString += grid.get(i).get(j) + ",\t";
                if((j+1)%3 == 0) gridString += "\t";
            }
            if((i+1)%3 == 0) gridString += "\n";
            gridString += "\n";
        }
        return gridString;
    }
    
    private boolean validSubmit(){
        for(int i = 0; i < GRID_SIZE; ++i){
            ArrayList<Integer> row = new ArrayList<>(GRID_SIZE);
            ArrayList<Integer> box = new ArrayList<>(GRID_SIZE);
            ArrayList<Integer> column = (ArrayList<Integer>)grid.get(i).clone();
            for(int j = 0; j < GRID_SIZE; ++j){
                row.set(j, grid.get(j).get(i));
                int iBox = (i/3)*3 + j/3;
                int jBox = i*3%9+j%3;
                box.set(j, grid.get(iBox).get(jBox));
            }
            if (!(validate(column) && validate(row) && validate(box)))
                return false;            
        }
        return true;
    }
    
    private boolean validate(ArrayList<Integer> check){
        int i = 0;
        Collections.sort(check);
        for(int num : check){
            if(num != ++i) return false;
        }
        return true;
    }
    
    protected void gameLoop(){
        
    }
    
    
}
