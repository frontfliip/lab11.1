package task1;

import lombok.Getter;
import lombok.Singular;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

import java.util.List;

@SuperBuilder
@ToString
@Getter
public class User extends Human {
    private String name;
    private int age;
    private Gender gender;
    private double weight;
    private double height;
    @Singular(value = "work")
    private List<String> occupations;
}