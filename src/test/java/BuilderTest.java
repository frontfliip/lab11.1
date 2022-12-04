

import org.junit.Test;
import task1.Human;
import task1.User;

import java.util.Objects;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static task1.Gender.MALE;


public class BuilderTest {
    @Test
    public void testBuilder(){
        User user = User.builder().age(19).gender(MALE).height(191.0).name("Ivan").work("Student").work("Programmer").weight(81.0).build();
        assertTrue(user instanceof Human);
        assertEquals(2, user.getOccupations().size());
        assertEquals("Ivan", user.getName());
        assertEquals(MALE, user.getGender());
        assertTrue(user.getOccupations().contains("Student"));
        assertEquals(191.0, user.getHeight(), 0.0);
        assertEquals(81.0, user.getWeight(), 0.0);
    }
}
