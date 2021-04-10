import java.util.function.Predicate;

import static java.lang.Character.isLowerCase;
import static java.lang.Character.isUpperCase;
import static java.lang.Character.toLowerCase;

public class ROT13  {

    char[] alphaArray = new char[]{'A','B','C','D','E','F','G','H','I','J','K',
            'L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};

    ROT13(Character cs, Character cf) {

    }

    ROT13() {
    }


    public String crypt(String text) throws UnsupportedOperationException {

        return "";
    }

    public boolean checkCasing(char c){
        if(Character.isUpperCase(c)){
            return true;
        }
        else
            return false;
    }

    public String encrypt(String text) {

        return text;
    }

    public String decrypt(String text) {
        return text;
    }

    public String rotate(String s, Character c) {
        for (int i = 0; i < s.length(); i++) {
            if(checkCasing(s.charAt(i))){

            }
        }
        return "";
    }

}
