import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class SortFile {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\Harsh\\OneDrive\\Documents\\My document";

        File folder = new File(folderPath);

        if (!folder.exists()) {
            System.out.println("Folder Doesn't Exists..");
        }
        System.out.println("Name of the folder : " + folder.getName());

        File[] file = folder.listFiles();
        
        for (File files : file) {

            String fileExt = files.getName();
            String subFolder = "";
            
            if (fileExt.endsWith(".jpg") || fileExt.endsWith(".jpeg")) {
                subFolder = "IMAGE";
            }
            else if (fileExt.endsWith(".pdf")) {
                subFolder = "PDF";
            }
            else if (fileExt.endsWith(".mp4")) {
                subFolder = "VIDEO";
            }
            else if (fileExt.endsWith(".txt")) {
                subFolder = "TXT";
            }

            File destination = new File(folder, subFolder);
            if(!destination.exists()){
                destination.mkdir();
            } 

            try {
                 File newFile = new File(destination, files.getName());
                 Files.move(files.toPath(), newFile.toPath());
            } 
            catch (IOException e) {
                System.out.println("Error!!");
            }
        }
    }
}
