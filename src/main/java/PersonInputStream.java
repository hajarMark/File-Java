import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class PersonInputStream {
    public void addPerson(Person person) throws IOException {

        File f = new File("test.txt");
        FileWriter fw = new FileWriter(f,true);
        fw.write(person.getName());
        fw.write(System.getProperty( "line.separator" ));
        fw.write(person.getAge());
        fw.write(System.getProperty( "line.separator" ));
        fw.close();
    }
}
