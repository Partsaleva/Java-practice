package h5_Regular_Expressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Problem10UseYourChainsBuddy {

    public static void main(String[] args) {
        String manual1="<html><head><title></title></head><body><h1>hello</h1><p>znahny!"
                + "@#%&&&&****</p><div><button>dsad</button></div><p>grkg^^^^%%%)))([]12</p></body></html>";
        String manual2="<html><head><title></title></head><body><h1>Intro</h1><ul>"
                + "<li>Item01</li><li>Item02</li><li>Item03</li></ul><p>jura qevivat "
                + "va jrg fyvccrel fabjl</p><div><button>Click me, baby!</button></div>"
                + "<p> pbaqvgvbaf fabj  qpunvaf ner nofbyhgryl rffragvny sbe fnsr "
                + "unaqyvat nygubhtu fabj punvaf znl ybbx </p><span>This manual is false, "
                + "do not trust it! The illuminati wrote it down to trick you!</span>"
                + "<p>vagvzvqngvat gur onfvp vqrn vf ernyyl fvzcyr svg gurz bire lbhe "
                + "gverf qevir sbejneq fybjyl naq gvtugra gurz hc va pbyq jrg</p><p> "
                + "pbaqvgvbaf guvf vf rnfvre fnvq guna qbar ohg vs lbh chg ba lbhe gverf</p></body>";
        decript(manual1);
        decript(manual2);
    }
    
    public static void decript(String manual){
        Pattern p=Pattern.compile("<p>(.+?)<\\/p>");
        Matcher m =p.matcher(manual);
        String textForDecription="";
        while (m.find()) {
            textForDecription+=m.group(1);
        }
        textForDecription=textForDecription.replace("\\W|[A-Z]", "");
        StringBuilder result=new StringBuilder();
        for (int i = 0; i < textForDecription.length(); i++) {
            int ch= textForDecription.charAt(i);
            if (ch==32) 
                result.append(" ");
            if (ch>=97 && ch<110) 
                result.append((char) (ch+13));
            if(ch>=110 && ch<123) 
                result.append((char) (ch-13));                            
        }
        System.out.println(result);
    }
}
