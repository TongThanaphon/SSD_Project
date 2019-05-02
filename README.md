# SSD_Project

![Alt text](uml/UML.png?raw=true "UML")

# GRASP

## Controller
	SelectController,GameController, and GameOverController these class are dealing with all event of system.

## Creator
- All controller are contain or compositely aggregate instances of SwitchScene.
- SwitchScene have the initializing information for instance Game objects.
- GameController compositely aggregate and closely use instances of Game objects.
- Game and SelectController are closely use instances of Score objects.

## Information expert
	We’re design that each Class have there own role.
Score is management score of game like update score.
Game is a core so it have method to random answer,check answer
All controller are design to interact with the user.

## Low coupling
	SwitchScene is mediation between the other class.So change in one class having lower impact on other classes.

## Polymorphism
	Main is based on Application so it have start() and launch() method to run the game.

# Members
- Thanaphon Keawjam 6010545781
- Vichakorn Yotboonrueang 6010545889
- Hayato Kawai 6010545978