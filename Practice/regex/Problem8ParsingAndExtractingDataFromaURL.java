import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* try to extract the protocol, host and port of the all the resources listed.*/
public class Problem8ParsingAndExtractingDataFromaURL {

    public static void main(String[] args) {
        List<String> list=Arrays.asList("ftp://file_server.com:21/top_secret/life_changing_plans.pdf",
                "http://regexone.com/lesson/introduction#section",
                "file://localhost:4040/zip_file",
                "https://s3cur3-server.com:9999/",
                "market://search/angry%20birds");

        Pattern p=Pattern.compile("(\\w+)://(\\w+\\-?\\w+\\.?\\w+):?(\\d+)?");
        Matcher m=null;
        for (String str : list) {
            m=p.matcher(str);
            while (m.find()) {
                System.out.println(m.group());
            }
        }
    }

}
