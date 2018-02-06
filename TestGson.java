import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestGson {
    private static final Gson GSON = new Gson();

    public static void main(String[] args) throws IOException {
        Person person = new Person("Vasya", 30, Arrays.asList("Moscow", "Berlin", "Dubai"));
        String json = GSON.toJson(person);
        System.out.println(json);

        FileWriter fileWriter = new FileWriter("D:\\test.txt");
        fileWriter.write(json);
        fileWriter.close();

        Person person1 = GSON.fromJson(json, Person.class);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGeoHistory());
    }
}

class Person{
    private String name;
    private Integer age;
    @SerializedName("geo")
    private List<String> geoHistory = new ArrayList<>();

    public Person(String name, Integer age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<String> getGeoHistory() {
        return geoHistory;
    }

    public void setGeoHistory(List<String> geoHistory) {
        this.geoHistory = geoHistory;
    }
}