import java.io.*;
import java.lang.reflect.Array;
import java.nio.file.NoSuchFileException;
import java.util.ArrayList;
import java.util.Scanner;

/** Created by glebsabirzanov on 23/03/16. */
public class PasswordDictionaryGenerator {
	public static void main(String[] args) {
		String line = null;
		String fileRead = "keywords", fileWrite = "passwords";
		ArrayList<String> list = new ArrayList<>();

		try {
			FileReader fileReader = new FileReader(fileRead);
			FileWriter fileWriter = new FileWriter(fileWrite);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

			while ((line = bufferedReader.readLine()) != null) {
				list.add(line);
			}

			for (int i = 0; i < list.size() - 1; i++) {
				for (int j = 0; j < list.size(); j++) {
					for (int k = 0; k < list.size(); k++) {
						bufferedWriter.write(list.get(i) + list.get(j) + list.get(k) + "\n");
					}
				}
			}
			bufferedWriter.close();
			bufferedReader.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
