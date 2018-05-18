# READ_ME

- [Project Spec](https://git.generalassemb.ly/SECA/project-I/tree/master)
- Command Line Rock-Paper-Scissors game

### Technologies Used
- Java, Object Oriented Design, IntelliJ Idea

### Approach
1. Create Player Class
    - Player
      - String Name
      - win count
      - currentMove
2. GameState Object 
    - Game History structure
      - addHistory(String)
      - getHistory()
    - numPlayers for gametype
3. Create menu and command line interface
    - runGame() method of Main
    - print methods
      - welcome()
      - readMove()
    - decideWinner(String String)


### Installation Instructions
    1. install Java 8 sdk 1.8
    2. fork or clone repository
    3. navigate to repo within command line interface
    4. compile Main.java
    5. execute compiled main

### Unsolved Problems

### Wins and Challenges
-   using debugger to trace error through the stack and method calls
        - found an error trying to compare strings with == not .equals
-   getting in too deep to the play part of my game function, had trouble breaking up into smaller components because I wanted to pass by reference into methods so that I could modify the players and gamestates
-   too huge of a commit in making the play function work had me grinding to make sure I had every detail correct rather than checking small parts of it as I went
