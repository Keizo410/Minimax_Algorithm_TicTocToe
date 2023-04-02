/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.minimax_algorithm_test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author iek42
 */
public class TicTacToe {
    ArrayList<String> board = new ArrayList<>();
    String stone;
    
    TicTacToe(){
      for(int i = 0; i< 10; i++){
        this.board.add(i, null);
      }
    }
    
    public void setPlayer(Player p){
        if(p.player.equals(" X ")){
            stone = " X ";
        }else{
            stone = " O ";
        }
    }
    
    public String getPlayer(){
        return stone;
    }
    
    public void playerChange(){
        if(this.stone.equals(" X ")){
            stone = " O ";
        }else{
            stone = " X ";
        }
    }
    
    public ArrayList<String> getBoard(){
        return this.board;
    }
    
    public void printBoard(){
        for (String s : getBoard()) {
             System.out.print(s + " ");
     }
    }
    
    public void draw(){
           
        for(int j = 0; j < 9; j++){
            
           System.out.print("|");
           System.out.print(board.get(j));
           
           if(j%3==2){
              System.out.print("|");
              System.out.println("");
           }            
        }
    }
    
    public void Play(int coordinates){
        int x = coordinates/10;
        int y = coordinates - x*10;
        int index = 0;
        switch(y){
            case 1:
                index = 5+x;
                break;
            case 2:
                index = x+y;
                break;
            case 3:
                index =x-1;
                break;
        }
        this.board.set(index, stone);
        playerChange();
    }
    
    public boolean checkGameWinner(){
        int[][] stones = new int[3][3];
        ArrayList<String> board = getBoard();
        int counter = 0;
        boolean game_finished = false;
        
        for(int i= 0; i < 3; i++){
            for(int j = 0; j<3; j++){
                String Player = board.get(counter);
                if(Player==null){
                   stones[i][j] = 0;
                }else if(Player.equals(" X ")){
                   stones[i][j] = 1;
                }else if(Player.equals(" O ")){
                   stones[i][j] = 2;
                }
                
                
                counter++;
            }
            
        }
        
        for(int i = 0; i<3;i++){
            
            //horizontal check
            if(stones[i][0]!=0&&stones[i][0]==stones[i][1]&&stones[i][1]==stones[i][2]){
                game_finished = true;
                draw();
                System.out.println("Player "+stones[i][0]+" Win!!");
            }
            //vertical check
            if(stones[0][i]!=0&&stones[0][i]==stones[1][i]&&stones[2][i]==stones[1][i]){
                game_finished = true;
                draw();
                System.out.println("Player "+stones[0][i]+" Win!!");
            }
            //diagonal check
            if(stones[0][0]!=0&&stones[0][0]==stones[1][1]&&stones[1][1]==stones[2][2]){
                game_finished = true;
                draw();
                System.out.println("Player "+stones[0][0]+" Win!!");
            }
        }
        return game_finished;
    }
    
   
    
}
