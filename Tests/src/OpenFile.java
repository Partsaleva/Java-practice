import java.awt.Desktop;
import java.io.File;
import java.io.IOException;

public class OpenFile {

	public static void main(String[] args) throws IOException {
		File file=new File("/home/partsaleva/Documents/unt");
		
		if(!Desktop.isDesktopSupported()){
			System.out.println("Desktop is not supported");
			return;
		}
		Desktop desktop=Desktop.getDesktop();
		if(file.exists()){
			desktop.open(file);
		}

	}

}
