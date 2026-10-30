
import java.nio.file.*;
import java.io.IOException;

class NIOFileDirectory {
    public static void main(String[] args) {

        try {
            Path directory = Paths.get("MyFolder");

            Files.createDirectories(directory);
            System.out.println("Directory created successfully");

            Path file = directory.resolve("sample.txt");

            Files.writeString(file, "Welcome to Java NIO API");
            System.out.println("File created successfully");

            String data = Files.readString(file);
            System.out.println("File Content: " + data);

            Path copyFile = directory.resolve("copy.txt");

            Files.copy(file, copyFile,
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully");

            Path moveFile = directory.resolve("moved.txt");

            Files.move(copyFile, moveFile,
                    StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully");

            if (Files.exists(file)) {
                System.out.println("File exists");
            }

            Files.delete(moveFile);
            System.out.println("File deleted successfully");

            Files.delete(file);
            System.out.println("Original file deleted successfully");

            Files.delete(directory);
            System.out.println("Directory deleted successfully");

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
