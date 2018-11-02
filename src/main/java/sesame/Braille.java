package sesame;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Brahim Bahaida
 */
public final class Braille {
    /**
     * Length of the character.
     */

    private static final int BRAILLE_LENGTH = 6;

    /**
     * Braille detector for range 2.
     */

    private static final int BRAILLE_RANGE_2_INDEX = 2;

    /**
     * Braille detector for range 3.
     */

    private static final int BRAILLE_RANGE_3_INDEX = 5;

    /**
     * private constructor.
     */
    private Braille() {

    }


    /**
     *
     *
     * @param braille to decode
     *
     */

    public static String decode(final String braille) {
        if (braille.length() % BRAILLE_LENGTH != 0) {
            //System.err.println("error");
            throw new RuntimeException("Braille sequence should be divided by " + BRAILLE_LENGTH);
        }
        List<String> data = new ArrayList<>();
        for (int i = BRAILLE_LENGTH;
             i <= braille.length();
             i += BRAILLE_LENGTH) {
            data.add(braille.substring(i - BRAILLE_LENGTH, i));
        }
        StringBuilder word = new StringBuilder();
        for (String e: data) {
            char convertedChar = fromBrailleToAlphabet(e);
            if (convertedChar == '0') {
                //System.err.println("error");
                throw new RuntimeException("An error has occurred during the decoding phase");
            }

            word.append(convertedChar);
        }
        return word.toString();

    }


    /**
     *
     * @param braille to decode
     * @return braille corresponded char
     */

    private static char fromBrailleToAlphabet(final String braille) {
        if (braille.length() != BRAILLE_LENGTH) {
            return '0';
        }
        if (braille.equals("-*-***")) {
            return 'w';
        }
        if (braille.charAt(BRAILLE_RANGE_2_INDEX) == '*') {
            if (braille.charAt(BRAILLE_RANGE_3_INDEX) == '*') {
                switch (braille) {
                    case "*-*--*" :
                        return 'u';
                    case "***--*" :
                        return 'v';
                    case "*-**-*" :
                        return 'x';
                    case "****-*" :
                        return 'y';
                    case "*-*-**" :
                        return 'z';
                    default: return '0';
                }
            } else {
                switch (braille) {
                    case "*-*---" :
                        return 'k';
                    case "***---" :
                        return 'l';
                    case "*-**--" :
                        return 'm';
                    case "****--" :
                        return 'n';
                    case "*-*-*-" :
                        return 'o';
                    case "*-***-" :
                        return 'p';
                    case "*****-" :
                        return 'q';
                    case "***-*-" :
                        return 'r';
                    case "-***--" :
                        return 's';
                    case "-****-" :
                        return 't';
                    default: return '0';
                }
            }
        } else {
            switch (braille) {
                case "*-----" :
                    return 'a';
                case "**----" :
                    return 'b';
                case "*--*--" :
                    return 'c';
                case "**-*--" :
                    return 'd';
                case "*---*-" :
                    return 'e';
                case "*--**-" :
                    return 'f';
                case "**-**-" :
                    return 'g';
                case "**--*-" :
                    return 'h';
                case "-*-*--" :
                    return 'i';
                case "-*-**-" :
                    return 'j';
                default: return '0';
            }
        }
    }
}
