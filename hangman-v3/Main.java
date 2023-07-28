// Jordan joseph
// 2/3/23
//You will be creating a program that plays the classic game of Hangman.a
//Before you game begins, you will have the computer randomly choose a word for the player to guess. The game will then display the mystery word as a series of asterisks ("*") and the player has a certain number of guesses to guess the letter. The player wins if they guess the word before they run out of guesses.
//
import java.util.Scanner;
class Main {

  public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
    String wordy = mysteryWord();
    String word = wordy.toLowerCase();
    String starline = (word);

    int length  = word.length();
    int guessesleft = 5;

    String guessedletters = ("");
    String guess;

    boolean isamatch;

    for(int i = 0; i < length; i++){

      starline = starline.substring(0,i) + '*' + word.substring(i + 1); // word censorer
      
    }

   while(!starline.equals(word) && guessesleft > 0){
     
    System.out.println('\n' + "Here's what you have so far: " + starline);  
    System.out.println("You have " + guessesleft + " guesses left");  
    System.out.println("Here are the letters you have guessed so far:" + guessedletters);  
    System.out.print("What letter would you like to guess next? : ");  

    guess = scan.next();
    guess = guess.toLowerCase();

    isamatch = false;
    for(int i = 0;i < length; i++ ){
      if((word.substring(i, i + 1).equals(guess))){ // word scanner
        starline = starline.substring(0,i) + guess + starline.substring(i + 1); // word converter
        isamatch = true;
      } 
    }
    
    guessedletters += guess + " ";

    if(isamatch ==true){
    System.out.println("Correct!!");
    }
    if(isamatch == false){
      guessesleft--;
    System.out.println("Wrong!!");
    }

    if(guessesleft == 0){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("  O   |");
      System.out.println("--|-- |");    //hang man 5
      System.out.println("  Ʌ   |");
      System.out.println(" | |  |");
      System.out.println("      |");
      System.out.println("=========");
    } 
    if(guessesleft == 1){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("  O   |");
      System.out.println("--|-- |"); //hang man 4
      System.out.println("  Ʌ   |");
      System.out.println(" |    |");
      System.out.println("      |");
      System.out.println("=========");
    } 
    if(guessesleft == 2){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("  O   |");    //hang man 3
      System.out.println("--|-- |");
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("=========");
    } 
    if(guessesleft == 3){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("  O   |");
      System.out.println("--|   |");    //hang man 2
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("=========");
    } 
    if(guessesleft == 4){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("  O   |");
      System.out.println("  |   |");
      System.out.println("      |");   //hang man 1
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("=========");
    }
    if(guessesleft == 5){
      System.out.println("       ");
      System.out.println("  +---+");
      System.out.println("  |   |"); 
      System.out.println("      |");   //hang man 0
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("      |");
      System.out.println("=========");
    }      
   }

    if(starline.equals(word)){
      System.out.println("The word is " + wordy);
      System.out.println('\n'+"You win!!");
    }                                                          // victory
    if(guessesleft == 0){                             
      System.out.println('\n'+"You lose:((");
      System.out.println("The word is " + wordy);
    }
  }
  
   public static String mysteryWord(){
       int rando = (int)(Math.random()*10); // word bank
        if(rando == 1){
        return "COMPUTER";
        }
        else if(rando == 2){
        return "WATER";
        }
        else if(rando == 3){
        return "PROFESSION";
        }
        else if(rando == 4){
        return "COLLECTION";
        }
        else if(rando == 5){
        return "TOOTH";
        }
        else if(rando == 6){
        return "MIDNIGHT";
        }
        else if(rando == 7){
        return "BUYER";
        }
        else if(rando == 8){
        return "PAYMENT";
        }
        else if(rando == 9){
        return "SHAGGY";
        }
        return "BILLS";
     
   }
}