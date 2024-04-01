import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class BookDA {

    public static HashMap<String, Book> bookMap loadBooks(String fileName){
        HashMap<String, Book> books = new HashMap<>();

    try(BufferedReader br = new BufferedReader(new FileReader(fileName))){

        String line;

        while ((line = br.readLine()) != null) {{

            String[] data = line.split(", ");
            String 

        }

    }
    
    }
}
}


