/* SELF ASSESSMENT

1. readDictionary
- I have the correct method definition [Mark out of 5:] 5
- Comment: It returns an ArrayList of type String
- My method reads the words from the "words.txt" file. [Mark out of 5:] 5
- Comment: I used the scanner class with a File object as input and it reads each line of the file
- It returns the contents from "words.txt" in a String array or an ArrayList. [Mark out of 5:] 5
- Comment: It returns an ArrayList

2. readWordList
- I have the correct method definition [Mark out of 5:] 5
- Comment: It takes no parameters and retuns an ArrayList of type string
- My method reads the words provided (which are separated by commas, saves them to an array or ArrayList of String references and returns it. [Mark out of 5:] 5
- Comment: It separates out the words using the .split() function with a delimiter and then removes any spaces in the arrays words

3. isUniqueList
- I have the correct method definition [Mark out of 5:] 5
- Comment: It takes in an ArrayList of type String and returns a boolean
- My method compares each word in the array with the rest of the words in the list. [Mark out of 5:] 5
- Comment: It does and it makes sure not to compare the word against itself
- Exits the loop when a non-unique word is found. [Mark out of 5:]
- Comment: It does so by returning false
- Returns true is all the words are unique and false otherwise. [Mark out of 5:]
- Comment: If the loop never returns false to say there is a same word then it returns true

4. isEnglishWord
- I have the correct method definition [Mark out of 5:]
- Comment: It returns a boolean and takes in a String as the word
- My method uses the binarySearch method in Arrays library class. [Mark out of 3:] 3
- Comment: Since I used ArrayLists I used the Collections libraries binary search. I also had to sort it beforehand for it to work.
- Returns true if the binarySearch method return a value >= 0, otherwise false is returned. [Mark out of 2:] 2
- Comment: I simplified the if statement to be the return

5. isDifferentByOne
- I have the correct method definition [Mark out of 5:] 5
- Comment: It takes in two words to compare and returns a boolean
- My method loops through the length of a words comparing characters at the same position in both words searching for one difference. [Mark out of 10:] 10
- Comment: It does so by converting them to char arrays then looping through and comparing each position against each other

6. isWordChain
- I have the correct method definition [Mark out of 5:] 5
- Comment: It takes in an array list to check and returns a boolean
- My method calls isUniqueList, isEnglishWord and isDifferentByOne methods and prints the appropriate message [Mark out of 10:] 10
- Comment:  It does not specify that this function has to call isUniqueList and isEnglishWord in the assignment so I called them in the main function before running isWordChain but isDifferentByOne is used

7. main
- Reads all the words from file words.txt into an array or an ArrayList using the any of teh Java.IO classes covered in lectures [Mark out of 10:] 10
- Comment: Read dictionary handles this functionality
- Asks the user for input and calls isWordChain [Mark out of 5:] 5
- Comment: It prints out asking for input aswell as making sure the input is correct using isUniqueList and isEnglishWord

 Total Mark out of 100 (Add all the previous marks): 100
*/

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Assignment_WordLink {
    private static ArrayList<String> words;
    private static boolean failed = false;
    public static void main(String[] args) {
        words = readDictionary();
        while(true) {
            ArrayList<String> input = readWordList();
            if (input.get(0).equals("")) {
                break;
            }
            if (!isUniqueList(input)) {
                failed = true;
                System.out.println("Not all words in that list are unique :(");
            }
            else {
                for(String string : input) {
                    if(!isEnglishWord(string)) {
                        failed = true;
                        System.out.println(string + " is not a valid english word :(");
                    }
                }
                if(failed) {
                    System.out.println("Not a valid chain of words from Lewis Carroll's word-links game.");
                }
            }
            if(!failed) {
                if(isWordChain(input)) {
                    System.out.println("Valid chain of words from Lewis Carroll's word-links game.");
                }
                else {
                    System.out.println("Not a valid chain of words from Lewis Carroll's word-links game.");
                }
            }

        }
        System.out.println("Game quitting..");

    }

    private static ArrayList<String> readDictionary() {
        File file = new File("src/words.txt");
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner;
        try {
            scanner = new Scanner(file);
            while(scanner.hasNextLine()) {
                result.add(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("[ERROR]: File not found");
        }
        return result;
    }

    private static ArrayList<String> readWordList() {
        ArrayList<String> result = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a comma separated list of words (or an empty list to quit): ");
        String input = scanner.nextLine();
        //scanner.close();
        String[] strings = input.split(",");
        // Remove spaces
        for(int index = 0; index < strings.length; index++) {
            strings[index] = strings[index].trim();
        }
        Collections.addAll(result, strings);
        return result;
    }

    private static boolean isUniqueList(ArrayList<String> list) {
        for(int index = 0; index < list.size(); index++) {
            for(int index2 = 0; index2 < list.size(); index2++) {
                if(index != index2) {
                    if(list.get(index).equals(list.get(index2))) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private static boolean isEnglishWord(String word) {
        Collections.sort(words, Collections.reverseOrder());
        int result = Collections.binarySearch(words, word, Collections.reverseOrder());
        return result >= 0;
    }

    private static boolean isDifferentByOne(String word1, String word2) {
        char[] word1Char = word1.toCharArray();
        char[] word2Char = word2.toCharArray();
        if(word1Char.length != word2Char.length) {
            return false;
        }
        int different = 0;
        for(int index = 0; index < word1Char.length; index++) {
            if(word1Char[index] != word2Char[index]) {
                different++;
            }
        }
        return different == 1;
    }

    private static boolean isWordChain(ArrayList<String> wordList) {
        for(int index = 0; index < wordList.size() - 1; index++) {
            if(!isDifferentByOne(wordList.get(index), wordList.get(index + 1))) {
                return false;
            }
        }
        return true;
    }
}
