/* The "FinalEvaluation" class.
 * Created by: Bryan
 * Last Modified: June 12, 2020
 * There are two players, the user versus the computer. The user rolls one die and the computer rolls one die 
 * both at the same time. The number the die rolls is the number of tiles the person rolling gets to move ahead. Players
 * keep rolling until someone reaches the last tile first. They start at tile 1, and there are 60 tiles in total. Certain 
 * tiles contain ladders, and certain tiles contain snakes. Anyone who lands on the ladder gets a new number at the top
 * of the ladder, and anyone who lands on the snake gets a new number at the bottom of the snake.*/

import java.awt.*;
import hsa.Console;

public class FinalEvaluation
{
     // declare console variable
     static Console c;           // The output console
     
     public static void main (String[] args)
     {
          // create a new Console
          c = new Console (48,110);
          
          // variables
          int userCounter = 1; // counts the tile the user is on
          int computerCounter = 1; // counts the tile the computer is on
          int counter=0; // the largest tile between the user and computer
          String input1; // initial input from the user
          int input=-39920007; // checks if initial input is integer
          int userRolled=0; // randomizes a number between 1-6 to simulate a die for the user
          int computerRolled=0; // randomizes a number between 1-6 to simulate a die for the computer
          int round=0; // indicates to the user the round (1-10)
          int [] userPoints = new int [10]; // stores the user's points for each round
          int [] computerPoints = new int [10]; // stores the computer's points for each round
          
          // infinite loop if user decides to keep playing once the game ends
          while (true)
          {
               // program tries to read input if it is an integer
               try
               {
                    // loops until 10 rounds of game is over
                    while (round<10)
                    {
                         // loops until someone has reached the last tile (tile 60)
                         while (counter<60)
                         {
                              // if user inputs 1, it will roll a dice
                              if (input == 1)
                              {
                                   userRolled = (int)(Math.random()*6+1);
                                   computerRolled = (int)(Math.random()*6+1);
                                   c.clear();
                                   intro();
                                   c.println("Round " + (round+1) + ":");
                                   c.println("You Rolled: " + userRolled);
                                   c.println("Opponent Rolled: " + computerRolled);
                                   userCounter = userCounter + userRolled;
                                   computerCounter = computerCounter + computerRolled;
                                   
                                   // if neither user or computer reaches tile 60 yet
                                   if (userCounter < 60 && computerCounter < 60)
                                   {
                                        // if user lands on tile 6, they reach a ladder and get a new tile number
                                        if (userCounter == 6)
                                        {
                                             userCounter = 26;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a ladder!");
                                        }
                                        // if computer lands on tile 6, they reach a ladder and get a new tile number
                                        else if (computerCounter == 6)
                                        {
                                             computerCounter = 26;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a ladder!");
                                        }
                                        // if user lands on tile 8, they reach a ladder and get a new tile number
                                        else if (userCounter == 8)
                                        {
                                             userCounter = 29;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a ladder!");
                                        }
                                        // if computer lands on tile 8, they reach a ladder and get a new tile number
                                        else if (computerCounter == 8)
                                        {
                                             computerCounter = 29;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a ladder!");
                                        }
                                        // if user lands on tile 33, they reach a ladder and get a new tile number
                                        else if (userCounter == 33)
                                        {
                                             userCounter = 48;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a ladder!");
                                        }
                                        // if computer lands on tile 33, they reach a ladder and get a new tile number
                                        else if (computerCounter == 33)
                                        {
                                             computerCounter = 48;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a ladder!");
                                        }
                                        // if user lands on tile 37, they reach a ladder and get a new tile number
                                        else if (userCounter == 37)
                                        {
                                             userCounter = 41;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a ladder!");
                                        }
                                        // if computer lands on tile 37, they reach a ladder and get a new tile number
                                        else if (computerCounter == 37)
                                        {
                                             computerCounter = 41;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a ladder!");
                                        }
                                        // if user lands on tile 58, they reach a snake and get a new tile number
                                        else if (userCounter == 58)
                                        {
                                             userCounter = 43;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a snake!");
                                        }
                                        // if computer lands on tile 58, they reach a snake and get a new tile number
                                        else if (computerCounter == 58)
                                        {
                                             computerCounter = 43;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a snake!");
                                        }
                                        // if user lands on tile 54, they reach a snake and get a new tile number
                                        else if (userCounter == 54)
                                        {
                                             userCounter = 34;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a snake!");
                                        }
                                        // if computer lands on tile 54, they reach a snake and get a new tile number
                                        else if (computerCounter == 54)
                                        {
                                             computerCounter = 34;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a snake!");
                                        }
                                        // if user lands on tile 24, they reach a snake and get a new tile number
                                        else if (userCounter == 24)
                                        {
                                             userCounter = 2;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a snake!");
                                        }
                                        // if computer lands on tile 24, they reach a snake and get a new tile number
                                        else if (computerCounter == 24)
                                        {
                                             computerCounter = 2;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a snake!");
                                        }
                                        // if user lands on tile 30, they reach a snake and get a new tile number
                                        else if (userCounter == 30)
                                        {
                                             userCounter = 11;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("You landed on a snake!");
                                        }
                                        // if computer lands on tile 30, they reach a snake and get a new tile number
                                        else if (computerCounter == 30)
                                        {
                                             computerCounter = 11;
                                             counter = largestCounter(computerCounter, userCounter);
                                             c.println("Opponent landed on a snake!");
                                        }
                                        
                                        
                                        c.println("Your Tile: " + userCounter); 
                                        c.println("Opponent's Tile: " + computerCounter);
                                        counter = largestCounter(computerCounter, userCounter);
                                        
                                   } // end of if (userCounter < 60 && computerCounter < 60)
                                   
                                   // if the user reaches the last tile before the computer
                                   else if (userCounter >= 60 && computerCounter <60)
                                   {
                                        userPoints [round] = 2;
                                        computerPoints [round] = 0;
                                        c.println("Your Tile: 60");
                                        c.println("Opponent's Tile: " + computerCounter);
                                        userCounter = 60;
                                        counter = largestCounter(computerCounter, userCounter);
                                        c.println("Your Points This Round: " + userPoints [round]);
                                        c.println("Opponent's Points This Round: " + computerPoints [round]);
                                        // if this game is the last round
                                        if (round == 9)
                                        {
                                             input = 2;
                                        }
                                        c.println("Enter a command above to continue into the next round.");
                                        break;
                                   }
                                   // if the computer reaches the last tile before the user
                                   else if (computerCounter >= 60 && userCounter <60)
                                   {
                                        computerPoints [round] = 2;
                                        userPoints [round] = 0;
                                        c.println("Your Tile: " + userCounter);
                                        c.println("Opponent's Tile: 60");
                                        computerCounter = 60;
                                        counter = largestCounter(computerCounter, userCounter);
                                        c.println("Your Points This Round: " + userPoints [round]);
                                        c.println("Opponent's Points This Round: " + computerPoints [round]);
                                        // if the game is the last round
                                        if (round == 9)
                                        {
                                             input = 2;
                                        }
                                        c.println("Enter a command above to continue into the next round.");
                                        break;
                                   }
                                   // if both user and computer reach the last tile at the same time
                                   else if (userCounter >=60 && computerCounter >= 60)
                                   {
                                        userPoints [round] = 1;
                                        computerPoints [round] = 1;
                                        c.println("Your Tile: 60");
                                        c.println("Opponent's Tile: 60");
                                        computerCounter = 60;
                                        userCounter = 60;
                                        counter = largestCounter(computerCounter, userCounter);
                                        c.println("Your Points This Round: " + userPoints [round]);
                                        c.println("Opponent's Points This Round: " + computerPoints [round]);
                                        // if the game is the last round
                                        if (round == 9)
                                        {
                                             input = 2;
                                        }
                                        c.println("Enter a command above to continue into the next round.");
                                        break;
                                   }
                                   // draws a circle for the corresponding tile number
                                   userPrintCircle(userCounter);
                                   computerPrintCircle(computerCounter);
                              } // end of if (input == 1)
                              // outputs results, only runs if it is the last round
                              if (input == 2)
                              {
                                   outputResults(userPoints, computerPoints, round);
                                   round = 0;
                                   c.println("Thanks for playing!");
                                   computerCounter = 1;
                                   userCounter = 1;
                              }
                              // restarts the round
                              else if (input == 3)
                              {
                                   c.clear();
                                   reset();
                                   c.setCursor(13,1);
                                   c.println("Round " + (round+1) + ":");
                                   computerCounter = 1;
                                   userCounter = 1;
                                   c.println("You Rolled: ");
                                   c.println("Opponent Rolled:");
                                   c.println("Your Tile: " + userCounter);
                                   c.println("Opponent's Tile: " + computerCounter); 
                                   board();    
                              }
                              // allows the user to check the points for each round anytime
                              else if (input == 4)
                              {
                                   outputResults(userPoints, computerPoints, round);
                              }
                              // allows the user to start a new game
                              else if (input == 5)
                              {
                                   c.clear();
                                   reset();
                                   c.setCursor(13,1);
                                   round = 0;
                                   computerCounter = 1;
                                   userCounter = 1;
                                   c.println("Round " + (round+1) + ":");
                                   c.println("You Rolled: ");
                                   c.println("Opponent Rolled:");
                                   c.println("Your Tile: " + userCounter);
                                   c.println("Opponent's Tile: " + computerCounter); 
                                   board();
                              }
                              // allows the user to end the game anytime
                              else if (input == 6)
                              {
                                   c.clear();
                                   c.setCursor(1,1);
                                   intro();
                                   c.println("Thanks for playing!");
                                   c.setCursor(14,1);
                                   round = 0;  
                              }
                              // initial homescreen of the game
                              else if (input == -39920007)
                              {
                                   reset();
                                   board();
                              }
                              // if the user does not enter a valid command
                              else if (input<1 || input>6 && input != -39920007)
                              {
                                   c.setCursor(18,1);
                                   c.println("Invalid Command! Choose a number above!");
                              }
                              c.setCursor(21,1);
                              input1 = c.readLine(); // receives input
                              input = Integer.parseInt(input1); // converts input into an int (data validation)
                         } // end of while (counter<60) 
                         round++;
                         computerCounter = 1;
                         userCounter = 1;
                         counter = 0;
                         c.setCursor(21,1);
                         input1 = c.readLine(); // receives input
                         input = Integer.parseInt(input1); // converts input into an int (data validation)
                    } // end of while (round<10)
               } // end of try
               // if user enters wrong data type, they need to re-enter
               catch (NumberFormatException e)
               {    
                    input = 0;
               }
          } // end of while (true)
     } // main method
     
     // **************** METHODS ************************* 
     
     // tells the user basic game information and commands
     public static void intro ()
     {
          c.println("SNAKES AND LADDERS\n*******************************");
          c.println("COMMANDS:\nTo roll, enter \"1\"");
          c.println("To restart the round, enter \"3\"");
          c.println("To check points, click \"4\"");
          c.println("To start a new game, enter \"5\"");
          c.println("To end the game, enter \"6\"\n*******************************");
          c.println("Your colour: Blue");
          c.println("Opponent's Colour: Orange\n*******************************");
          
     }
     // resets the board so that it displays both user and computer at tile 1
     public static void reset ()
     {
          intro();
          c.setColor(Color.blue);
          c.fillOval(110,880,15,15);
          c.setColor(Color.orange);
          c.fillOval(110,890,15,15);
          c.setColor(Color.black);
          board();
     }
     // outputs the results of the round using arrays that store points
     public static void outputResults(int [] userPoints, int [] computerPoints, int round)
     {
          c.clear();
          intro();
          int arraySumUser=0;
          int arraySumComputer=0;
          
          // calculates the sum of the user's points
          for (int y=0; y<userPoints.length; y++)
          {
               arraySumUser = arraySumUser + userPoints [y];
          }
          // calculates the sum of the computer's points
          for (int y=0; y<computerPoints.length; y++)
          {
               arraySumComputer = arraySumComputer + computerPoints [y];
          }
          // if the user has more total points than the computer, user wins
          if (arraySumUser > arraySumComputer && round == 9)
          {
               c.println("Your Points: " + arraySumUser);
               c.println("Opponent's Points: " + arraySumComputer);
               c.println("You win!");
          }
          // if the computer has more total points than the user, computer wins
          if (arraySumComputer > arraySumUser && round == 9)
          {
               c.println("Your Points: " + arraySumUser);
               c.println("Opponent's Points: " + arraySumComputer);
               c.println("You lost!");
          }
          // if both computer and user have the same points, it's a tie
          if (arraySumUser == arraySumComputer && round == 9)
          {
               c.println("Your Points: " + arraySumUser);
               c.println("Opponent's Points: " + arraySumComputer);
               c.println("It's a tie!");
          }
          // prints user's stats for each round
          c.println("\nYour Game Stats:");
          for (int x=0; x<round; x++)
          {
               c.println("Round " + (x+1) + ": " + userPoints [x] + " points");
          }
          // prints computer's stats for each round
          c.println("\nOpponent's Game Stats:");
          for (int x=0; x<round; x++)
          {
               c.println("Round " + (x+1) + ": " + computerPoints [x] + " points");
          }
          c.println("Enter any command above to exit the screen:");
     }
     // calculates the largest tile between the computer and the user to know when the game ends
     public static int largestCounter(int computerCounter, int userCounter)
     {
          int x=0;
          x = Math.max(computerCounter, userCounter);
          return(x);
     }
     // draws the board with graphical output
     public static void board ()
     {
          c.setColor(Color.black);
          c.setCursor(23,14);
          // print the tile numbers 
          c.println("60");
          c.setCursor(23,23);
          c.println("59");
          c.setCursor(23,32);
          c.println("58");
          c.setCursor(23,41);
          c.println("57");
          c.setCursor(23,49);
          c.println("56");
          c.setCursor(23,58);
          c.println("55");
          c.setCursor(23,67);
          c.println("54");
          c.setCursor(23,75);
          c.println("53");
          c.setCursor(23,84);
          c.println("52");
          c.setCursor(23,93);
          c.println("51");
          
          c.setCursor(27,14);
          c.println("41");
          c.setCursor(27,23);
          c.println("42");
          c.setCursor(27,32);
          c.println("43");
          c.setCursor(27,41);
          c.println("44");
          c.setCursor(27,49);
          c.println("45");
          c.setCursor(27,58);
          c.println("46");
          c.setCursor(27,67);
          c.println("47");
          c.setCursor(27,75);
          c.println("48");
          c.setCursor(27,84);
          c.println("49");
          c.setCursor(27,93);
          c.println("50");
          
          c.setCursor(31,14);
          c.println("40");
          c.setCursor(31,23);
          c.println("39");
          c.setCursor(31,32);
          c.println("38");
          c.setCursor(31,41);
          c.println("37");
          c.setCursor(31,49);
          c.println("36");
          c.setCursor(31,58);
          c.println("35");
          c.setCursor(31,67);
          c.println("34");
          c.setCursor(31,75);
          c.println("33");
          c.setCursor(31,84);
          c.println("32");
          c.setCursor(31,93);
          c.println("31");
          
          c.setCursor(35,14);
          c.println("21");
          c.setCursor(35,23);
          c.println("22");
          c.setCursor(35,32);
          c.println("23");
          c.setCursor(35,41);
          c.println("24");
          c.setCursor(35,49);
          c.println("25");
          c.setCursor(35,58);
          c.println("26");
          c.setCursor(35,67);
          c.println("27");
          c.setCursor(35,75);
          c.println("28");
          c.setCursor(35,84);
          c.println("29");
          c.setCursor(35,93);
          c.println("30");
          
          c.setCursor(39,14);
          c.println("20");
          c.setCursor(39,23);
          c.println("19");
          c.setCursor(39,32);
          c.println("18");
          c.setCursor(39,41);
          c.println("17");
          c.setCursor(39,49);
          c.println("16");
          c.setCursor(39,58);
          c.println("15");
          c.setCursor(39,67);
          c.println("14");
          c.setCursor(39,75);
          c.println("13");
          c.setCursor(39,84);
          c.println("12");
          c.setCursor(39,93);
          c.println("11");
          
          c.setCursor(43,14);
          c.println("1");
          c.setCursor(43,23);
          c.println("2");
          c.setCursor(43,32);
          c.println("3");
          c.setCursor(43,41);
          c.println("4");
          c.setCursor(43,49);
          c.println("5");
          c.setCursor(43,58);
          c.println("6");
          c.setCursor(43,67);
          c.println("7");
          c.setCursor(43,75);
          c.println("8");
          c.setCursor(43,84);
          c.println("9");
          c.setCursor(43,93);
          c.println("10");
          
          // print each tile
          c.drawRect(100,440,70,80);
          c.drawRect(170,440,70,80);
          c.drawRect(240,440,70,80);
          c.drawRect(310,440,70,80);
          c.drawRect(380,440,70,80);
          c.drawRect(450,440,70,80);
          c.drawRect(520,440,70,80);
          c.drawRect(590,440,70,80);
          c.drawRect(660,440,70,80);
          c.drawRect(730,440,70,80);
          
          c.drawRect(100,520,70,80);
          c.drawRect(170,520,70,80);
          c.drawRect(240,520,70,80);
          c.drawRect(310,520,70,80);
          c.drawRect(380,520,70,80);
          c.drawRect(450,520,70,80);
          c.drawRect(520,520,70,80);
          c.drawRect(590,520,70,80);
          c.drawRect(660,520,70,80);
          c.drawRect(730,520,70,80);
          
          c.drawRect(100,600,70,80);
          c.drawRect(170,600,70,80);
          c.drawRect(240,600,70,80);
          c.drawRect(310,600,70,80);
          c.drawRect(380,600,70,80);
          c.drawRect(450,600,70,80);
          c.drawRect(520,600,70,80);
          c.drawRect(590,600,70,80);
          c.drawRect(660,600,70,80);
          c.drawRect(730,600,70,80);
          
          c.drawRect(100,680,70,80);
          c.drawRect(170,680,70,80);
          c.drawRect(240,680,70,80);
          c.drawRect(310,680,70,80);
          c.drawRect(380,680,70,80);
          c.drawRect(450,680,70,80);
          c.drawRect(520,680,70,80);
          c.drawRect(590,680,70,80);
          c.drawRect(660,680,70,80);
          c.drawRect(730,680,70,80);
          
          c.drawRect(100,760,70,80);
          c.drawRect(170,760,70,80);
          c.drawRect(240,760,70,80);
          c.drawRect(310,760,70,80);
          c.drawRect(380,760,70,80);
          c.drawRect(450,760,70,80);
          c.drawRect(520,760,70,80);
          c.drawRect(590,760,70,80);
          c.drawRect(660,760,70,80);
          c.drawRect(730,760,70,80);
          
          c.drawRect(100,840,70,80);
          c.drawRect(170,840,70,80);
          c.drawRect(240,840,70,80);
          c.drawRect(310,840,70,80);
          c.drawRect(380,840,70,80);
          c.drawRect(450,840,70,80);
          c.drawRect(520,840,70,80);
          c.drawRect(590,840,70,80);
          c.drawRect(660,840,70,80);
          c.drawRect(730,840,70,80);
          
          // draw ladders
          c.drawLine(475,700,475,900);
          c.drawLine(495,700,495,900);
          
          c.drawLine(475,720,495,720);
          c.drawLine(475,740,495,740);
          c.drawLine(475,780,495,780);
          c.drawLine(475,800,495,800);
          c.drawLine(475,820,495,820);
          c.drawLine(475,860,495,860);
          c.drawLine(475,880,495,880);
          
          c.drawLine(605,900,685,700);
          c.drawLine(630,900,710,700);
          
          c.drawLine(615,880,640,880);
          c.drawLine(620,860,645,860);
          c.drawLine(637,820,662,820);
          c.drawLine(647,800,672,800);
          c.drawLine(654,780,679,780);
          c.drawLine(665,760,676,760);
          c.drawLine(670,740,692,740);
          c.drawLine(679,720,701,720);
          
          c.drawLine(125,580,325,660);
          c.drawLine(125,555,325,635);
          
          c.drawLine(135,560,135,585);
          c.drawLine(155,568,155,594);
          c.drawLine(175,576,175,603);
          c.drawLine(195,584,195,610);
          c.drawLine(215,592,215,618);
          c.drawLine(235,600,235,626);
          c.drawLine(255,608,255,634);
          c.drawLine(275,616,275,642);
          c.drawLine(295,624,295,649);
          c.drawLine(315,632,315,657);
          
          c.drawLine(610,535,610,670);
          c.drawLine(630,535,630,670);
          c.drawLine(610,550,630,550);
          c.drawLine(610,570,630,570);
          c.drawLine(610,590,630,590);
          c.drawLine(610,610,630,610);
          c.drawLine(610,630,630,630);
          c.drawLine(610,650,630,650);
          
          // draw snakes
          c.fillOval(561,467,6,6);
          c.fillOval(548,467,6,6);
          c.drawArc(540,460,33,33,0,180);
          c.drawArc(540,620,33,33,180,180);
          c.drawLine(540,476,540,637);
          c.drawLine(573,476,573,637);
          
          c.fillOval(350,715,6,6);
          c.fillOval(340,710,6,6);
          c.drawArc(330,700,33,33,135,-180);
          c.drawArc(190,870,33,33,135,180);
          c.drawLine(335,705,195,875);
          c.drawLine(358,728,218,898);
          
          c.fillOval(771,710,6,6);
          c.fillOval(758,710,6,6);
          c.drawArc(260,460,33,33,0,180);
          c.drawArc(260,560,33,33,180,180);
          c.drawLine(260,476,260,577);
          c.drawLine(293,476,293,577);
          
          c.fillOval(281,467,6,6);
          c.fillOval(268,467,6,6);
          c.drawArc(750,700,33,33,0,180);
          c.drawArc(750,800,33,33,180,180);
          c.drawLine(750,716,750,816);
          c.drawLine(783,716,783,816);
     }
     // draws a circle in the corresponding tile the user is on
     public static void userPrintCircle(int userCounter)
     {
          int userCounterDot;
          c.setColor(Color.blue);   
          // if the number is between 0 and 10
          while (userCounter>0 && userCounter<=10)
          {    
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(110,880,15,15);
                         break;
                    case 2:
                         c.fillOval(185,880,15,15);
                         break;
                    case 3:
                         c.fillOval(260,880,15,15);
                         break;
                    case 4:
                         c.fillOval(335,880,15,15);
                         break;
                    case 5:
                         c.fillOval(410,880,15,15);
                         break;
                    case 6:
                         c.fillOval(485,880,15,15);
                         break;
                    case 7:
                         c.fillOval(560,880,15,15);
                         break;
                    case 8:
                         c.fillOval(635,880,15,15);
                         break;
                    case 9:
                         c.fillOval(710,880,15,15);
                         break;
                    case 0:
                         c.fillOval(785,880,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 11 and 20
          while (userCounter>=11 && userCounter<=20)
          {
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(785,790,15,15);
                         break;
                    case 2:
                         c.fillOval(710,790,15,15);
                         break;
                    case 3:
                         c.fillOval(635,790,15,15);
                         break;
                    case 4:
                         c.fillOval(560,790,15,15);
                         break;
                    case 5:
                         c.fillOval(485,790,15,15);
                         break;
                    case 6:
                         c.fillOval(410,790,15,15);
                         break;
                    case 7:
                         c.fillOval(335,790,15,15);
                         break;
                    case 8:
                         c.fillOval(260,790,15,15);
                         break;
                    case 9:
                         c.fillOval(185,790,15,15);
                         break;
                    case 0:
                         c.fillOval(110,790,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 21 and 30
          while (userCounter>=21 && userCounter<=30)
          {
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(110,710,15,15);
                         break;
                    case 2:
                         c.fillOval(185,710,15,15);
                         break;
                    case 3:
                         c.fillOval(260,710,15,15);
                         break;
                    case 4:
                         c.fillOval(335,710,15,15);
                         break;
                    case 5:
                         c.fillOval(410,710,15,15);
                         break;
                    case 6:
                         c.fillOval(485,710,15,15);
                         break;
                    case 7:
                         c.fillOval(560,710,15,15);
                         break;
                    case 8:
                         c.fillOval(635,710,15,15);
                         break;
                    case 9:
                         c.fillOval(710,710,15,15);
                         break;
                    case 0:
                         c.fillOval(785,710,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 31 and 40
          while (userCounter>=31 && userCounter<=40)
          {
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(785,630,15,15);
                         break;
                    case 2:
                         c.fillOval(710,630,15,15);
                         break;
                    case 3:
                         c.fillOval(635,630,15,15);
                         break;
                    case 4:
                         c.fillOval(560,630,15,15);
                         break;
                    case 5:
                         c.fillOval(485,630,15,15);
                         break;
                    case 6:
                         c.fillOval(410,630,15,15);
                         break;
                    case 7:
                         c.fillOval(335,630,15,15);
                         break;
                    case 8:
                         c.fillOval(260,630,15,15);
                         break;
                    case 9:
                         c.fillOval(185,630,15,15);
                         break;
                    case 0:
                         c.fillOval(110,630,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 41 and 50
          while (userCounter>=41 && userCounter<=50)
          {
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(110,540,15,15);
                         break;
                    case 2:
                         c.fillOval(185,540,15,15);
                         break;
                    case 3:
                         c.fillOval(260,540,15,15);
                         break;
                    case 4:
                         c.fillOval(335,540,15,15);
                         break;
                    case 5:
                         c.fillOval(410,540,15,15);
                         break;
                    case 6:
                         c.fillOval(485,540,15,15);
                         break;
                    case 7:
                         c.fillOval(560,540,15,15);
                         break;
                    case 8:
                         c.fillOval(635,540,15,15);
                         break;
                    case 9:
                         c.fillOval(710,540,15,15);
                         break;
                    case 0:
                         c.fillOval(785,540,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 51 and 60
          while (userCounter>=51 && userCounter<=60)
          {
               userCounterDot = userCounter%10;
               // checks the one's digit of the number
               switch (userCounterDot)
               {
                    case 1:
                         c.fillOval(785,460,15,15);
                         break;
                    case 2:
                         c.fillOval(710,460,15,15);
                         break;
                    case 3:
                         c.fillOval(635,460,15,15);
                         break;
                    case 4:
                         c.fillOval(560,460,15,15);
                         break;
                    case 5:
                         c.fillOval(485,460,15,15);
                         break;
                    case 6:
                         c.fillOval(410,460,15,15);
                         break;
                    case 7:
                         c.fillOval(335,460,15,15);
                         break;
                    case 8:
                         c.fillOval(260,460,15,15);
                         break;
                    case 9:
                         c.fillOval(185,460,15,15);
                         break;
                    case 0:
                         c.fillOval(110,460,15,15);
                         break;
               }
               board();
               break;
          }
     }
     // draws a circle in the corresponding tile the computer is on
     public static void computerPrintCircle(int computerCounter)
     {
          int computerCounterDot;
          c.setColor(Color.orange); 
          // if the number is between 0 and 10
          while (computerCounter>0 && computerCounter<=10)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(110,860,15,15);
                         break;
                    case 2:
                         c.fillOval(185,860,15,15);
                         break;
                    case 3:
                         c.fillOval(260,860,15,15);
                         break;
                    case 4:
                         c.fillOval(335,860,15,15);
                         break;
                    case 5:
                         c.fillOval(410,860,15,15);
                         break;
                    case 6:
                         c.fillOval(485,860,15,15);
                         break;
                    case 7:
                         c.fillOval(560,860,15,15);
                         break;
                    case 8:
                         c.fillOval(635,860,15,15);
                         break;
                    case 9:
                         c.fillOval(710,860,15,15);
                         break;
                    case 0:
                         c.fillOval(785,860,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 11 and 20
          while (computerCounter>=11 && computerCounter<=20)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(785,780,15,15);
                         break;
                    case 2:
                         c.fillOval(710,780,15,15);
                         break;
                    case 3:
                         c.fillOval(635,780,15,15);
                         break;
                    case 4:
                         c.fillOval(560,780,15,15);
                         break;
                    case 5:
                         c.fillOval(485,780,15,15);
                         break;
                    case 6:
                         c.fillOval(410,780,15,15);
                         break;
                    case 7:
                         c.fillOval(335,780,15,15);
                         break;
                    case 8:
                         c.fillOval(260,780,15,15);
                         break;
                    case 9:
                         c.fillOval(185,780,15,15);
                         break;
                    case 0:
                         c.fillOval(110,780,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 21 and 30
          while (computerCounter>=21 && computerCounter<=30)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(110,700,15,15);
                         break;
                    case 2:
                         c.fillOval(185,700,15,15);
                         break;
                    case 3:
                         c.fillOval(260,700,15,15);
                         break;
                    case 4:
                         c.fillOval(335,700,15,15);
                         break;
                    case 5:
                         c.fillOval(410,700,15,15);
                         break;
                    case 6:
                         c.fillOval(485,700,15,15);
                         break;
                    case 7:
                         c.fillOval(560,700,15,15);
                         break;
                    case 8:
                         c.fillOval(635,700,15,15);
                         break;
                    case 9:
                         c.fillOval(710,700,15,15);
                         break;
                    case 0:
                         c.fillOval(785,700,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 31 and 40
          while (computerCounter>=31 && computerCounter<=40)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(785,620,15,15);
                         break;
                    case 2:
                         c.fillOval(710,620,15,15);
                         break;
                    case 3:
                         c.fillOval(635,620,15,15);
                         break;
                    case 4:
                         c.fillOval(560,620,15,15);
                         break;
                    case 5:
                         c.fillOval(485,620,15,15);
                         break;
                    case 6:
                         c.fillOval(410,620,15,15);
                         break;
                    case 7:
                         c.fillOval(335,620,15,15);
                         break;
                    case 8:
                         c.fillOval(260,620,15,15);
                         break;
                    case 9:
                         c.fillOval(185,620,15,15);
                         break;
                    case 0:
                         c.fillOval(110,620,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 41 and 50
          while (computerCounter>=41 && computerCounter<=50)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(110,550,15,15);
                         break;
                    case 2:
                         c.fillOval(185,550,15,15);
                         break;
                    case 3:
                         c.fillOval(260,550,15,15);
                         break;
                    case 4:
                         c.fillOval(335,550,15,15);
                         break;
                    case 5:
                         c.fillOval(410,550,15,15);
                         break;
                    case 6:
                         c.fillOval(485,550,15,15);
                         break;
                    case 7:
                         c.fillOval(560,550,15,15);
                         break;
                    case 8:
                         c.fillOval(635,550,15,15);
                         break;
                    case 9:
                         c.fillOval(710,550,15,15);
                         break;
                    case 0:
                         c.fillOval(785,550,15,15);
                         break;
               }
               board();
               break;
          }
          // if the number is between 51 and 60
          while (computerCounter>=51 && computerCounter<=60)
          {
               computerCounterDot = computerCounter%10;
               // checks the one's digit of the number
               switch (computerCounterDot)
               {
                    case 1:
                         c.fillOval(785,460,15,15);
                         break;
                    case 2:
                         c.fillOval(710,460,15,15);
                         break;
                    case 3:
                         c.fillOval(635,460,15,15);
                         break;
                    case 4:
                         c.fillOval(560,460,15,15);
                         break;
                    case 5:
                         c.fillOval(485,460,15,15);
                         break;
                    case 6:
                         c.fillOval(410,460,15,15);
                         break;
                    case 7:
                         c.fillOval(335,460,15,15);
                         break;
                    case 8:
                         c.fillOval(260,460,15,15);
                         break;
                    case 9:
                         c.fillOval(185,460,15,15);
                         break;
                    case 0:
                         c.fillOval(110,460,15,15);
                         break;
               }
               board();
               break;
          }
     }
} // end of class