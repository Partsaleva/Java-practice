/*Write a program to count the number of words in given sentence. 
 * Use any non-letter character as word separator.*/
public class Problem4CountAllWords {

    public static void main(String[] args) {
        String text1="Welcome to the Software University (SoftUni)!";
        String text2="I am coming...";
        String text3="It's OK, I'm in.";
        String text4="Java is a set of several computer software products "
                + "and specifications from Oracle Corporation that provides "
                + "a system for developing application software and deploying "
                + "it in a cross-platform computing environment. Java is used "
                + "in a wide variety of computing platforms from embedded devices "
                + "and mobile phones on the low end, to enterprise servers and "
                + "supercomputers on the high end.";
        System.out.println(numberOfWords(text1));
        System.out.println(numberOfWords(text2));
        System.out.println(numberOfWords(text3));
        System.out.println(numberOfWords(text4));
        
    }

    private static int numberOfWords(String text){
        String[] words=text.split("\\W+");
        return words.length;
    }
}
