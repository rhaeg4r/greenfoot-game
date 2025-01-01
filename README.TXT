# greenfoot-game
# Racing Game: Interesting and Challenging Features

## Project Overview

This project is a simple car-avoidance game built in Greenfoot. The player controls a car that must dodge oncoming cars while moving across multiple lanes. The game includes a lane structure, a scoring system, and a "flying" mechanic for added gameplay depth. Below, I have elaborated on three interesting and challenging features that make this game engaging.

## Features

### 1. Lane Structure and Lane-Based Car Spawning

#### Features:
- The game screen is divided into four lanes, and oncoming cars spawn at the center of these lanes.
- This lane-based system provides a structured environment, making the game feel more organized and realistic.
- The lanes add predictability, allowing players to make better decisions on where to move and when to dodge.

#### Challenges:
- Implementing this feature required calculating the precise center of each lane and ensuring that each incoming car spawns at the correct point.
- Drawing the lane dividers using Greenfoot’s drawing tools was necessary to maintain the realistic look of the game without relying on pre-designed images.

### 2. Flying Feature of the Car

#### Features:
- The car has a flying ability that allows it to avoid collisions during tight situations. 
- This feature provides an escape option and helps players maintain their score when used strategically.

#### Challenges:
- Implementing the visuals for the flying car was challenging, as there is currently no graphic change to indicate when the car is in the flying state.
- A bug exists where holding down the spacebar for too long causes the game to end. The flying feature should only be activated with a quick tap of the spacebar.
- Although it was planned to limit the spacebar usage to five times, this feature has not yet been implemented in the game.

### 3. Real-Time Score Display and Game Over Message

#### Features:
- The game continuously displays the player's score, increasing as they avoid incoming cars.
- When a collision occurs, a "Game Over" message is shown on the screen, providing clear feedback and allowing players to restart the game.
- The live score helps players keep track of their progress and motivates them to beat their high score.

#### Challenges:
- Continuously updating the score on the screen while ensuring smooth gameplay was challenging.
- Managing the game state (whether the game is running or over) was important to ensure the final score and message display correctly when the game ends.
- 
![Greenfoot_CarGame2024-11-0522-47-58-ezgif com-optimize](https://github.com/user-attachments/assets/1bb39e13-15f9-4518-a7ee-a6304a25f64e)

## Real-Time Explanation of Gameplay

- **First Situation**: I moved right to face an oncoming car and then quickly moved left to avoid a collision.
- **Second Situation**: I used the flying superpower to dodge the second car, surviving even after coming into contact with it.
- **Third Situation**: I failed to use the flying ability for the third car, resulting in a direct hit and ending the game.

## Conclusion

Each feature of the game required a different approach and a deeper understanding of Greenfoot’s capabilities. Overcoming the challenges involved in implementing these features helped me improve my programming skills. These features together make the game more interactive and enjoyable, providing both fun and learning opportunities.

## How to Play

1. Clone or download the repository to your local machine.
2. Open the project in Greenfoot and run the game.
3. Use the arrow keys to switch between lanes.
4. Press the `Spacebar` to activate the flying ability and avoid collisions.
5. Avoid the oncoming cars to keep your score rising!
