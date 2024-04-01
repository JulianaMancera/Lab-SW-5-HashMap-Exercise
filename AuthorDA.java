import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.*;

public class AuthorDA {

    public HashMap<String, Author> getAuthors(String filePath) {
        HashMap<String, Author> authors = new HashMap<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                String[] data = line.split(",");
                
                Author author = new Author(data[0], data[1]);
                
                authors.put(data[0], author);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return authors;
    }
}
