package task1;

import static task1.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        Human hm = User.builder().age(19).gender(MALE).height(190.0).name("Ivan").work("Student").work("Programmer").build();
        System.out.println(hm.toString());
    }
}
