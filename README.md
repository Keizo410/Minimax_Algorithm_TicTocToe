# TicTocToe with Minimax_Algorithm AI
__Hello!__
This is a simple __*console*__ based TicTocToe game. You can play with ___Minimax Algorithm AI___.

## Implementation

### How to calculate Heuristics: 
Thanks to the simplicity and limited state space of this game nature, heuristics is simple enough to be calculated just based on either __win__ or __lose__. 
If we won, +10. Tie means 0. Lose -10. 
https://github.com/Keizo410/Minimax_Algorithm_TicTocToe/blob/8b6792e73abead614d7af70060f910f3294f49e6/src/main/java/main/minimax_algorithm_test/Player_AI.java#L20-L30


### How to initiate the minimax algorithm:
This method is sometimes called __decision__ function, which literally decides which action to be taken for AI player side.

https://github.com/Keizo410/Minimax_Algorithm_TicTocToe/blob/b517e77ac8142ef39f941b55f8636ebebeff1186/src/main/java/main/minimax_algorithm_test/Player_AI.java#L33-L58


### How MinMax algorithm Works:
There are several ways to implement minmax algorithm. Some people creates __2 different function min and max__ for simulating the state each other. For this implementation,
I used __isMaximizing__ parameter to identify which player's turn this is. 
**Important: You have to adjust the decision, heuristics, recusive call parameters depend on which player is responsible for the FIRST move. If this was not properly implemented, AI player chooses self-destructive move.**
