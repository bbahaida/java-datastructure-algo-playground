package sesame;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class Braille {
    public static void main(String[] args) {
        String braille = "**----***-*-*-----**--*--*-*--*-**--";
        decode(braille);
    }

    /*
       # **----***-*-*-----**--*--*-*--*-**--
       # *-----**----*--*--**-*--
       # -*-****---*-***--**-----
       # *-----

     */
    private static void decode(String braille){
        if(braille.length()%6 != 0){
            System.err.println("error");
            return;
        }
        List<String> data = new ArrayList<>();
        for (int i = 6; i<=braille.length(); i+=6){
            data.add(braille.substring(i - 6, i));
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


    private static char fromBrailleToAlphabet(String braille){
        if (braille.length() != 6) return '0';
        if (braille.equals("-*-***") ) return 'w';
        if(braille.charAt(2) == '*'){
            if(braille.charAt(5) == '*'){
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
