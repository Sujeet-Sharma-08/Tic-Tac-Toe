A **console-based Tic Tac Toe game** built in **Java** using **Object-Oriented Programming (OOP)**.  
The game can be played between a **Human Player** and a **Bot Player**.  
The Bot currently plays random moves but can be extended with smarter AI (like **Minimax Algorithm**).  

---

## ✨ Features
- ✅ **Board class** for grid management & win condition checking  
- ✅ **Abstract Player class** with two implementations:
  - **HumanPlayer** – Takes user input
  - **BotPlayer** – Plays automated moves (random for now)  
- ✅ **Encapsulation, Abstraction, Inheritance, Polymorphism**  
- ✅ Covers **all possible outcomes**: Human Wins, Bot Wins, Draw  
- ✅ Easy to extend with **Minimax AI Bot** for unbeatable gameplay  

---

### 📂 Project Structure
### ├── Board.java # Handles game board logic
### ├── Player.java # Abstract base class for players
### ├── HumanPlayer.java # Handles user input moves
### ├── BotPlayer.java # Handles bot moves
### ├── Game.java # Game controller (turns, results)
### └── TicTacToe.java # Main entry point

## 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/tic-tac-toe-java.git
   cd tic-tac-toe-java
Compile the Java files:

javac TicTacToe.java
Run the game:


## java TicTacToe  

## 🖼️ Sample Gameplay  

### ✅ Case 1: Human Wins  
```text
X | X | X
--+---+--
O |   |  
--+---+--
O |   |  

🎉 Sujeet wins!



❌ Case 2: Bot Wins

X |   |  
--+---+--
X | O |  
--+---+--
X |   | O

🎉 Computer wins!

🤝 Case 3: Draw

X | O | X
--+---+--
O | X | X
--+---+--
O | O | X

It's a draw!


🧑‍💻 Tech Used
Language: Java

Paradigm: Object-Oriented Programming (OOP)

Concepts: Encapsulation, Inheritance, Abstraction, Polymorphism

AI: Simple Bot (Random moves, can upgrade to Minimax)
