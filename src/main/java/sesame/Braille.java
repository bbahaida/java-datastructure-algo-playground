package sesame;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Braille {

    private final static int BRAILLE_LENGTH = 6;
    private final static int BRAILLE_RANGE_2_INDEX = 2;
    private final static int BRAILLE_RANGE_3_INDEX = 5;

    private Braille(){

    }

    /**
     *
     * @param args
     */

    public static void main(final String[] args) {
        String braille = "**----***-*-*-----**--*--*-*--*-**--";
        decode(braille);
    }

    /*
       # **----***-*-*-----**--*--*-*--*-**--
       # *-----**----*--*--**-*--
       # -*-****---*-***--**-----
       # *-----

     */

    /**
     *
     * @param braille
     *
     */

    private static void decode(final String braille){
        if(braille.length()%BRAILLE_LENGTH != 0){
            System.err.println("error");
            return;
        }
        List<String> data = new ArrayList<>();
        for (int i = BRAILLE_LENGTH; i<=braille.length(); i+=BRAILLE_LENGTH){
            data.add(braille.substring(i - BRAILLE_LENGTH, i));
        }
        StringBuilder word = new StringBuilder();
        for (String e: data) {
            char convertedChar = fromBrailleToAlphabet(e);
            if(convertedChar == '0'){
                System.err.println("error");
                return;
            }

            word.append(convertedChar);
        }
        System.out.print(word.toString());

    }


    /**
     *
     * @param braille
     * @return braille corresponded char
     */

    private static char fromBrailleToAlphabet(final String braille){
        if (braille.length() != BRAILLE_LENGTH) {
            return '0';
        }
        if (braille.equals("-*-***") ) {
            return 'w';
        }
        if(braille.charAt(BRAILLE_RANGE_2_INDEX) == '*'){
            if(braille.charAt(BRAILLE_RANGE_3_INDEX) == '*'){
                switch (braille){
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
            }else {
                switch (braille){
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
        }else {
            switch (braille){
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
