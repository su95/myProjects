/*
 * creates a word game board like this
   -------------------
   G Z U D J G F I W O 
   N R 3 * * * * P K F 
   B Q * * * * 0 J M A 
   W U W * C F W H K I 
   J Q P * A N H N D * 
   2 Q O * J V I 1 S * 
   * P R * U L I * B * 
   * H G 9 S D E * Y * 
   * R O D X Y J * E 7 
   * B Z O B L T * L A 
   --------------------
 */


public class WordGame1 {
	
	private char[][] newGame;                               // the actual game board
	private boolean[][] isFilled = new boolean[10][10];     // to check whether the space is filled or not
	private int startX, startY;                             // position in board where word is to be started
	private String word;                                    // word to be filled
	String alphabets = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";        // alphabets to be filled randomly in remaining spaces of board
	
	String[] words = { "****1", "****2", "****3", "****4", "****5",
			"****6","****7", "****8", "****9", "****0" };   // list of words used to fill the board
	boolean[] wordsUsed = new boolean[words.length];        // to check so as to not use same word again
	
	// constructor method
	
	public WordGame1() {
		
		newGame = new char[10][10];
		
	}
	
	
	// to print out the game board
	
	public void printGame() {
		
		System.out.println("-------------------");
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				System.out.print(newGame[i][j] + " ");
				
			}
			
			System.out.println();
			
		}
		
		System.out.println("-------------------");
	}
	
	// creates a new game board
	
	public char[][] getNewGame(){
		
		for(int i = 0; i < 10; i++) {
			
			wordsUsed[i] = false; // sets all the words used to false initially
			
		}
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				isFilled[i][j] = false; // sets all the spaces used to false initially
				
			}
			
							
		}
		
		char[][] game = loadGame();
		
		return game;
	}
	
	// loads the game board with words
	
	private char[][] loadGame() {
		
		for(int i = 0; i < 6; i++) {   // fills the board with six words i < 6
			
			// wordFillDirection 1 top to bottom
			// wordFillDirection 2 bottom to top
			// wordFillDirection 3 left to right
			// wordFillDirection 4 right to left
			
			int wordFillDirection;
			
			// this do while loop checks whether the word can be
			// placed in the given position  
			
			do {
				
				startX = getStartX();
				startY = getStartY();
				wordFillDirection = (int) ((Math.random() * 4) + 1);
				word = getWord();
				
				
			} while((isFilled[startX][startY]) || !checkIfWorks(startX, startY , word, wordFillDirection));
			
			//        false                           false
			
			fillWord(wordFillDirection, word, startX, startY);
			
			
		}
		
		fillSpaces(); // after filling the board with words calls fillSpaces method to fill the board with random chars
		
		return newGame;
	}
	
	// methods to get positions of x & y randomly in a 10x10 matrix  
	
	private int getStartX() { return (int) (Math.random() * 10); }
	
	private int getStartY() { return (int) (Math.random() * 10); }

	// checks whether the word fits in the place
	
	private boolean checkIfWorks(int startX, int startY, String wordToCheck, int wordFillDirection) {
				
		int wordLength = word.length();
		
		// we can place the word in board in four different ways which will be decided by wordFillDirection 
		// wordFillDirection 1 top to bottom
		// wordFillDirection 2 bottom to top	
		// wordFillDirection 3 left to right
		// wordFillDirection 4 right to left
		
		if(wordFillDirection == 1) {
			
			if(startX + wordLength < 10) {
				
				for(int i = startX; i < startX + wordLength; i++) {
					
					int j = startY;
					if(isFilled[i][j]) { return false; }
					
				}
				
				return true;
				}
			else return false;
			
		}
		
		else if(wordFillDirection == 2) {
			
			if(startX - wordLength > 0) {
				
				for(int i = startX; i > startX - wordLength; i--) {
					
					int j = startY;
					if(isFilled[i][j]) { return false; }
					
				}
				
				return true;
				}
			else return false;
			
		}
		
		else if(wordFillDirection == 3) {
			
			if(startY + wordLength < 10) {
				
				for(int j = startY; j < startY + wordLength; j++) {
					
					int i = startX;
					if(isFilled[i][j]) { return false; }
					
				}
				
				return true;
				}
			else return false;
			
		}
		
		else if(wordFillDirection == 4) {
			
			if(startY - wordLength > 0) {
				
				for(int j = startY; j > startY - wordLength; j--) {
					
					int i = startX;
					if(isFilled[i][j]) { return false; }
					
				}
				
				return true;
				}
			else return false;
			
		}
		
		return false;
	}
	
	// fills the word in the defined space

	private void fillWord(int wordFillDirection, String word, int startX, int startY) {
		
		int i = startX;
		int j = startY;
		
		for(int x = 0; x < 10; x++) {
			
			if(word.equals(words[x])) { wordsUsed[x] = true; } // sets the used word to true so that it wont be used again
			
		}
		
		if(wordFillDirection == 1) {
					
			for(int index = 0; index < word.length(); index++) {
				
				newGame[i][j] = word.charAt(index);
				isFilled[i][j] = true;
				i++;
			}
			
		} else if(wordFillDirection == 2) {
			
			for(int index = 0; index < word.length(); index++) {
				
				newGame[i][j] = word.charAt(index);
				isFilled[i][j] = true;
				i--;
			}
			
		} else if(wordFillDirection == 3) {
			
			for(int index = 0; index < word.length(); index++) {
			
				newGame[i][j] = word.charAt(index);
				isFilled[i][j] = true;
				j++;
			}
			
		} else if(wordFillDirection == 4) {
			
			for(int index = 0; index < word.length(); index++) {
			
				newGame[i][j] = word.charAt(index);
				isFilled[i][j] = true;
				j--;
			}
			
		}	
		
		else {
			
			System.out.println("Wrong Fill Direction");
			
		}
				
		
	}
	
	// get a random word from a word list

	private String getWord() {
		
		int rand;
		
		do {
			
			rand = (int) (Math.random() * 10);
			
		} while(wordsUsed[rand]);  // do while loop so as to get the word which is not used before
		
		return words[rand];
	}

	// finally fills all the empty spaces with random letters
	
	private void fillSpaces() {
		
		for(int i = 0; i < 10; i++) {
			
			for(int j = 0; j < 10; j++) {
				
				if(!isFilled[i][j]) {
					
					int randAlphabet = (int) (Math.random() * 26);
					
					newGame[i][j] = alphabets.charAt(randAlphabet);
					
				}
				
			}
			
		}
		
	}
	
}

































