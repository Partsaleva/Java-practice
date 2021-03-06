package homework2JavaStreams.tasks5to8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

//Problem 7. *Create Zip Archive
//Write a program that reads three txt files words.txt, 
//count-chars.txt and lines.txt and create a zip archive 
//named text-files.zip. Use FileOutputStream, ZipOutputStream, and FileInputStream.
public class ZipArchive {

	public static void main(String[] args) {
		try(ZipOutputStream zos = new ZipOutputStream(
				new FileOutputStream("text-files.zip"))){
			
			addToZipFile("words.txt", zos);
			addToZipFile("count-chars.txt", zos);
			addToZipFile("lines.txt", zos);

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void addToZipFile(String fileName, ZipOutputStream zos)
			throws FileNotFoundException, IOException {

		System.out.println("Writing '" + fileName + "' to zip file");
		
		FileInputStream fis = new FileInputStream(fileName);
		ZipEntry zipEntry = new ZipEntry(fileName);
		zos.putNextEntry(zipEntry);

		byte[] bytes = new byte[1024];
		int length;
		while ((length = fis.read(bytes)) >= 0) {
			zos.write(bytes, 0, length);
		}

		zos.closeEntry();
		fis.close();
	}
}
