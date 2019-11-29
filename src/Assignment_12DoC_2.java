/* SELF ASSESSMENT
 1. Did I use easy-to-understand meaningful properly formatted, variable names and CONSTANTS?
        Mark out of 10: 10
        Comment: All constants used all upper case lettering and any variables used lowerCamelCase
 2. Did I implement the getVerse function correctly and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 20
        Comment: I took away 5 marks for my implementation of the function as it may be difficult to understand. I made a loop which gets the christmas gift for each day in the verse.
                 However I felt this would not be immediately apparent upon first look.
 3. Did I implement the getChristmasGift function correctly using a switch statement and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment: I did implement this function correctly and with a switch statement. One thing that I may have taken marks for was my use of returning null as the default.
                 But because there is no variable input such as from a user I know this default statement will never run.
 4. Did I implement the getOrdinalString function correctly using if or conditional operators and in a manner that can be understood (5 marks for function definition, 5 marks for function call and 15 marks for function implementation)?
       Mark out of 25: 25
        Comment: I used a nice and compact format which is relatively easily understood via conditional operators.
 5. Does the program produce the output correctly?
       Mark out of 10: 10
        Comment: The output is produced correctly and is also spaced correctly with the use of \n within each sentence to make new lines after each one.
 6. How well did I complete this self-assessment?
        Mark out of 5: 5
        Comment: I gave myself a mark and wrote a comment for each part of the self assessment.
 Total Mark out of 100 (Add all the previous marks): 95
*/
public class Assignment_12DoC_2 {

    public static final int VERSES = 12;
    public static final String ON_THE = "On the";
    public static final String DAY_OF_CHRISTMAS = "day of Christmas \n";
    public static final String MY_TRUE_LOVE = "my true love sent to me: \n";
    public static final String FIRST_DAY = "a partridge in a pear tree \n";
    public static final String SECOND_DAY = "Two turtle doves \n";
    public static final String THIRD_DAY = "Three French hens \n";
    public static final String FOURTH_DAY = "Four calling birds \n";
    public static final String FIFTH_DAY = "Five gold rings \n";
    public static final String SIXTH_DAY = "Six geese a-laying \n";
    public static final String SEVENTH_DAY = "Seven swans a-swimming \n";
    public static final String EIGHTH_DAY = "Eight maids a-milking \n";
    public static final String NINTH_DAY = "Nine ladies dancing \n";
    public static final String TENTH_DAY = "Ten lords a-leaping \n";
    public static final String ELEVENTH_DAY = "Eleven pipers piping \n";
    public static final String TWELFTH_DAY = "Twelve drummers drumming \n";

    public static void main(String[] args) {
        String song = "";
        for(int i = 1; i <= VERSES; i++) {
            song += getVerse(i);
            song += "\n";
        }
        System.out.print(song);
    }

    public static String getVerse(int verse) {
        String verseString = ON_THE + getOrdinalString(verse) + DAY_OF_CHRISTMAS + MY_TRUE_LOVE;
        for(int i = verse; i > 0; i--) {
            verseString += getChristmasGift(i, verse);
        }
        return verseString;
    }

    public static String getOrdinalString(int number) {
        String ordinalString = (number == 1) ? " first "
                                : (number == 2) ? " second "
                                : (number == 3) ? " third "
                                : (number == 4) ? " fourth "
                                : (number == 5) ? " fifth "
                                : (number == 6) ? " sixth "
                                : (number == 7) ? " seventh "
                                : (number == 8) ? " eighth "
                                : (number == 9) ? " ninth "
                                : (number == 10) ? " tenth "
                                : (number == 11) ? " eleventh "
                                : " twelfth ";
        return ordinalString;
    }

    public static String getChristmasGift(int gift, int verse) {
        switch(gift) {
            case 1:
                if(verse == 1) {
                    return FIRST_DAY;
                }
                return "and " + FIRST_DAY;
            case 2:
                return SECOND_DAY;
            case 3:
                return THIRD_DAY;
            case 4:
                return FOURTH_DAY;
            case 5:
                return FIFTH_DAY;
            case 6:
                return SIXTH_DAY;
            case 7:
                return SEVENTH_DAY;
            case 8:
                return EIGHTH_DAY;
            case 9:
                return NINTH_DAY;
            case 10:
                return TENTH_DAY;
            case 11:
                return ELEVENTH_DAY;
            case 12:
                return TWELFTH_DAY;
            default:
                return null;
        }
    }
}
