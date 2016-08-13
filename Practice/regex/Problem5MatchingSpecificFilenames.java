import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*If you use Linux or the command line frequently, are often dealing with 
 * lists of files. Most files have a filename component as well as an extension, 
 * but in Linux, it is also common to have hidden files that have no filename.

In this simple example, extract the filenames and extension types of only image
 files (not including temporary files for images currently being edited).
  Image files are defined as .jpg,.png, and .gif.*/
public class Problem5MatchingSpecificFilenames {

    public static void main(String[] args) {
        List<String> files= Arrays.asList(".bash_profile", "workspace.doc", "img0912.jpg", 
                "updated_img0912.png", "documentation.html", "favicon.gif", "img0912.jpg.tmp", "access.lock");
        Pattern p= Pattern.compile("(\\w+)\\.(jpg|png|gif)$");
        Matcher m=null;
        for (String file : files) {
            m=p.matcher(file);
            if (m.find()) {
                System.out.println(file);
            }
        }

    }

}
