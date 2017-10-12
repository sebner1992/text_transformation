# A2_starter
Assignment 2 handout

Assignment 2: Text transformation 

Implement a Java program for the text-transformation discussed in the lecture.

The input structure is as follows (defined with Wirth's EBNF):
```
Text  = [Word] { Blanks Word } ".".
Blanks = Blank { Blank }.
Blank = " ".
Word = Letter { Letter }.
Letter = "a" | "b" | "c" | ... | "z" | "A" | "B" | "C" | ... | "Z".
```
So words are separated by at least one blank. A point marks the end of the text input.
The input text has to be transformed so that each second word is reversely written, that is, last letter first, etc.
Blanks and the "." are not changed (they are mapped 1:1).

Your program shall implement the following interface
```java
public interface Assignment2 {
   public String translate(String s);
}
```
Example: 
the call `translate("   this   is  a silly  program  .")` 
must return `"   this   si  a yllis  program  ."`

Note: this is a slightly modified version of the text-transformation example originally described by E.W.Dijkstra (http://www.cs.utexas.edu/users/EWD/ewd03xx/EWD302.PDF)
