import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.*;

public class TestJacjson {
    public static void main(String[] args) throws IOException {
        Cat cat = new Cat();
        cat.name = "Murka";
        cat.age = 5;
        cat.weight = 4;

        FileWriter fileWriter = new FileWriter("D:\\test.txt");

        StringWriter writer = new StringWriter();

        ObjectMapper mapper = new ObjectMapper();

        mapper.writeValue(fileWriter, cat);
        fileWriter.close();

//        String result = writer.toString();
//        System.out.println(result);
//        System.out.println(cat.name + " " + cat.age + " " + cat.weight);
//
//        StringReader reader = new StringReader(result);
//        Cat cat1 = mapper.readValue(reader, Cat.class);
//        System.out.println(cat1.name + " " + cat1.age + " " + cat1.weight);
    }
}
@JsonAutoDetect
class Cat{
    public String name;
    public int age;
    public int weight;
}
