import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class PersonTest {
    @Test
    public void verifyCallToGetAllergensMethod() {
        AllergyScreener mockAllergyScreener = mock(AllergyScreener.class);
        Person person = new Person("Tom", 34);
        person.askForAllergyTest(mockAllergyScreener);
        verify(mockAllergyScreener, times(1)).getAllergens(34);
    }
    @Test
    public void shouldReturnTomIfPersonNameIsTom() {
        String expectedName="Tom";
        Person person=new Person("Tom",23);
        assertEquals(expectedName,person.getName());
    }
    @Test
    public void shouldReturnTomIfPersonNameIsRam() {
        String expectedName="Tom";
        Person person=new Person("Ram",23);
        assertNotEquals(expectedName,person.getName());
    }
}