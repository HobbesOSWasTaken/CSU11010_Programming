/* SELF ASSESSMENT
   1. Did I use appropriate CONSTANTS instead of numbers within the code?
       Mark out of 5: 5
       Comment: The only constant number I needed was how many verses there were. I didn't make a constant for each verse number in the switch statement because it should
                be clear that it is looping over the verses.
   2. Did I use easy-to-understand, meaningful CONSTANT names formatted correctly in UPPERCASE?
       Mark out of 5: 5
       Comment: I used a constant for every line of the song and used a piece of that line for the constant name which is meaningful.
   3. Did I use easy-to-understand meaningful variable names formatted properly (in lowerCamelCase)?
       Mark out of 10:  10
       Comment: I only used one variable, verse, and it is formatted correctly.
   4. Did I indent the code appropriately?
       Mark out of 10: 10
       Comment: I correctly indented all the code
   5. Did I use an appropriate loop (or loops) to produce the different verses?
       Mark out of 20: 20
       Comment: I used a singular loop that runs 12 times (once per verse) and builds up the verses.
   6. Did I use a switch to build up the verses?
       Mark out of 25: 25
       Comment: I used a switch case statement with no break statements to build up the main body of the verses and another switch statement to print which day of christmas it was.
   7. Did I avoid duplication of code and of the lines which make up the verses (each line should be referred to in the code only once (or twice))?
       Mark out of 10: 9
       Comment: In terms of duplication I feel there must be a way to combine the two switch statements into one as they are basically the same thing written out twice however I don't know how.
                I only used the constant representing each line once.
   8. Does the program produce the correct output?
       Mark out of 10: 10
       Comment: Yes, it also uses \n at the end of each verse to space it nicely aswell
   9. How well did I complete this self-assessment?
       Mark out of 5: 5
   Total Mark out of 100 (Add all the previous marks): 99
*/
public class Assignment_12DoC {

    public static final int verses = 12;
    public static final String ON_THE = "On the";
    public static final String DAY_OF_CHRISTMAS = "day of Christmas";
    public static final String MY_TRUE_LOVE = "my true love sent to me:";
    public static final String FIRST_DAY = "a partridge in a pear tree \n";
    public static final String SECOND_DAY = "Two turtle doves";
    public static final String THIRD_DAY = "Three French hens";
    public static final String FOURTH_DAY = "Four calling birds";
    public static final String FIFTH_DAY = "Five gold rings";
    public static final String SIXTH_DAY = "Six geese a-laying";
    public static final String SEVENTH_DAY = "Seven swans a-swimming";
    public static final String EIGHTH_DAY = "Eight maids a-milking";
    public static final String NINTH_DAY = "Nine ladies dancing";
    public static final String TENTH_DAY = "Ten lords a-leaping";
    public static final String ELEVENTH_DAY = "Eleven pipers piping";
    public static final String TWELFTH_DAY = "Twelve drummers drumming";

    public static void main(String[] args) {
        for(int verse = 1; verse <= verses; verse++) {
            System.out.print(ON_THE);
            switch (verse) {
                case 1:
                    System.out.print(" first ");
                    break;
                case 2:
                    System.out.print(" second ");
                    break;
                case 3:
                    System.out.print(" third ");
                    break;
                case 4:
                    System.out.print(" fourth ");
                    break;
                case 5:
                    System.out.print(" fifth ");
                    break;
                case 6:
                    System.out.print(" sixth ");
                    break;
                case 7:
                    System.out.print(" seventh ");
                    break;
                case 8:
                    System.out.print(" eighth ");
                    break;
                case 9:
                    System.out.print(" ninth ");
                    break;
                case 10:
                    System.out.print(" tenth ");
                    break;
                case 11:
                    System.out.print(" eleventh ");
                    break;
                case 12:
                    System.out.print(" twelfth ");
                    break;
            }
            System.out.println(DAY_OF_CHRISTMAS);
            System.out.println(MY_TRUE_LOVE);

            switch(verse) {
                case 12:
                    System.out.println(TWELFTH_DAY);
                case 11:
                    System.out.println(ELEVENTH_DAY);
                case 10:
                    System.out.println(TENTH_DAY);
                case 9:
                    System.out.println(NINTH_DAY);
                case 8:
                    System.out.println(EIGHTH_DAY);
                case 7:
                    System.out.println(SEVENTH_DAY);
                case 6:
                    System.out.println(SIXTH_DAY);
                case 5:
                    System.out.println(FIFTH_DAY);
                case 4:
                    System.out.println(FOURTH_DAY);
                case 3:
                    System.out.println(THIRD_DAY);
                case 2:
                    System.out.println(SECOND_DAY);
                case 1:
                    if(verse > 1) {
                        System.out.print("and ");
                    }
                    System.out.println(FIRST_DAY);
            }
        }
    }
}
