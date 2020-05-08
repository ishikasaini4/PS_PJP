package q3;

import java.io.IOException;
import java.nio.file.*;
import java.util.Scanner;

public class FilesDirectories {
	public static void main(String[] args) throws IOException {
		System.out.println("Enter a path");
		Scanner scn = new Scanner(System.in);
		
		String path = scn.nextLine();
		
		Path curDir = Paths.get(path);
		Files.list(curDir).forEach(System.out::println);
	}

}
