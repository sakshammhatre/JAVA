
import java.io.*;

class FileHandlingStreams {
    public static void main(String[] args) {

        try {
            // Byte Stream
            FileOutputStream fout = new FileOutputStream("byte.txt");
            String data = "Hello Java Byte Stream";
            fout.write(data.getBytes());
            fout.close();

            FileInputStream fin = new FileInputStream("byte.txt");
            int ch;

            System.out.println("Byte Stream Output:");

            while ((ch = fin.read()) != -1) {
                System.out.print((char) ch);
            }

            fin.close();


            // Character Stream
            FileWriter writer = new FileWriter("character.txt");
            writer.write("Hello Java Character Stream");
            writer.close();

            FileReader reader = new FileReader("character.txt");

            System.out.println("\n\nCharacter Stream Output:");

            while ((ch = reader.read()) != -1) {
                System.out.print((char) ch);
            }

            reader.close();


            // Buffered Stream
            BufferedWriter bw =
                    new BufferedWriter(new FileWriter("buffered.txt"));

            bw.write("Hello Java Buffered Stream");
            bw.close();

            BufferedReader br =
                    new BufferedReader(new FileReader("buffered.txt"));

            System.out.println("\n\nBuffered Stream Output:");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}
