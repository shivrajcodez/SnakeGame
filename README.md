# Snake Game in Java (Swing) 🐍

A classic Snake Game built using **Java Swing**. The game features real-time snake movement, apple generation, score tracking, and collision detection.

---

## Features:
- Snake moves in four directions (Up, Down, Left, Right).
- Apple appears at random positions on the grid.
- Score increases when the snake eats an apple.
- Snake grows longer after eating apples.
- Game ends when the snake collides with itself or the wall.
- Displays current score and **Game Over** screen.
- After Game Over, the message "Press R to Restart" will appear
- When the user presses R, the snake, score, and apple reset → game starts again immediately.

---

## Screenshots:

<p align="center">
  <img src="./Screenshot1.png" alt="Snake Game Screenshot 1" width="300"/>
  <img src="./Screenshot2.png" alt="Snake Game Screenshot 2" width="300"/>
</p>

---

## How It Works:
- Built with **Java Swing** for GUI rendering.
- Uses a **Timer** for game loop execution.
- Apple positions generated randomly, aligned to the grid.
- Snake body managed using arrays for X and Y coordinates.
- Key events handled via **KeyAdapter** for movement controls.

---

## Getting Started:

### Prerequisites
- Install **Java JDK 8 or higher**

### Project Structure:
- ├── gamePanel.java     # Game logic and rendering
- ├── SnakeGame.java     # Main class to run the game
- └── README.md          # Project documentation

### Skills Learned:

- Java Swing (GUI development)
- Event-driven programming
- Timer-based game loop design
- Collision detection and grid-based logic

### Run Instructions
```bash        
# Compile
javac gamePanel.java SnakeGame.java

# Run
java SnakeGame
