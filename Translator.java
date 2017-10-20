public class Translator implements Assignment2{
   private char currentChar;
   private String s;
   private int counter;
   
   public Translator(String s){
      this.s = s;
      counter = 0;
   }

   public static void main(String[] args){
      String s = "   this   is  a silly  program  .";
      Translator ts = new Translator(s);
      String result = ts.translate(s);
   }

   public String translate(String s){
      currentChar = s.charAt(counter);//get character on the position 0

      while(!endOfText()){
         skipAndPrintBlanks();
         printWord();
         skipAndPrintBlanks();
         printWordReverse();      
      }
      
      System.out.print(currentChar);
      return s;
   }
   
   private boolean endOfText(){
      return currentChar == '.';
   }
   
   private void skipAndPrintBlanks(){
      while(currentChar == ' '){
         System.out.print(currentChar);
         counter++;
         currentChar = s.charAt(counter);      
      }
   }
   
   private void printWord(){
     while(currentChar != ' ' && !endOfText()){
         System.out.print(currentChar);         
         counter++;
         currentChar = s.charAt(counter);
     }
   }
   
   private void printWordReverse(){
      int wordLength = getWordLength();

      //create character array that will hold the word that is to be reversed and printed
      char[] word = new char[wordLength];
      int j = 0;
      while(currentChar != ' ' && !endOfText()){
         word[j] = currentChar;
         counter++;
         currentChar = s.charAt(counter);
         j++;
      }
      
      //print the word in reverse order (print the reversed word)     
      for(int i = word.length - 1; i >= 0; i--){
         System.out.print(word[i]);
      }
   }
   
   private int getWordLength(){
      int length = 0;
      char dummyCurrentChar = currentChar;
      int dummyCounter = counter;
      
      while(dummyCurrentChar != ' ' && dummyCurrentChar != '.'){
         dummyCounter++;
         dummyCurrentChar = s.charAt(dummyCounter);
         length++;
      }
      
      return length;
   }
}