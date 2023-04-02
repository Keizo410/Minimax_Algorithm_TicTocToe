/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package main.minimax_algorithm_test;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

/**
 *
 * @author iek42
 */
public class Minimax_Algorithm_Test {

    public static void main(String[] args) throws InterruptedException {
   
        boolean gameDone = false;
        TicTacToe game = new TicTacToe();
        Player p1 = new Player(" X ");
        game.setPlayer(p1);
        
  
        while(!gameDone){
            game.draw();
            System.out.print("Enter your 2 digit coord: ");
            Scanner in = new Scanner(System.in);
            int coord = in.nextInt();
            TimeUnit.SECONDS.sleep(10);
            game.Play(coord);
            gameDone = game.checkGameWinner();
            
        }
    }
}
