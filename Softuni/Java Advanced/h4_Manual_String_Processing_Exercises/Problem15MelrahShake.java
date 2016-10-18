package h4_Manual_String_Processing_Exercises;

public class Problem15MelrahShake {

    public static void main(String[] args) {
        String text="##mtm!!mm.mm*mtm.#";
        String pattern="mtm";
        shakeIt(text, pattern);
        text="astalavista baby";
        pattern="sta";
        shakeIt(text, pattern);

    }

    private static void shakeIt(String text, String pattern) {
        boolean found_first=false, found_second=false;
        for (int i = 0; i < text.length()/2; i++) {
            
        }
        for (int i = text.length()-1; i > text.length()/2; i--) {
            
        }
    }

}
