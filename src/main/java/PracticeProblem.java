import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class PracticeProblem {

    public static String getName(int lineNumber, String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int currentLine = 1;

            while ((line = reader.readLine()) != null) {
                if (currentLine == lineNumber) {
                    String[] parts = line.split(" ");
                    if (parts.length >= 4) {
                        reader.close();
                        return parts[0] + " " + parts[1];
                    }
                }
                currentLine++;
            }

            reader.close();
        } catch (Exception e) {
        }
        return "";
    }

    public static int getAge(int lineNumber, String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            int currentLine = 1;

            while ((line = reader.readLine()) != null) {
                if (currentLine == lineNumber) {
                    String[] parts = line.split(" ");
                    if (parts.length >= 4) {
                        reader.close();
                        return Integer.parseInt(parts[2]);
                    }
                }
                currentLine++;
            }

            reader.close();
        } catch (Exception e) {
        }
        return -1;
    }

    public static int getNumber(int lineNumber, String filename) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(filename));
			String line;
			int currentLine = 1;
	
			while ((line = reader.readLine()) != null) {
				if (currentLine == lineNumber) {
					String[] parts = line.split(" ");
					if (parts.length >= 4) {
						reader.close();
						return Integer.parseInt(parts[3]);
					}
				}
				currentLine++;
			}
	
			reader.close();
		} catch (Exception e) {
		}
		return -1;
	}	

    public static void fileAppend(String output, String filename) {
        try {
            FileWriter writer = new FileWriter(filename, true);
            writer.write(output + "");
            writer.close();
        } catch (Exception e) {
        }
    }
}
