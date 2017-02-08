import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

public class PersonTest {
    @Test
    public void verifyCallToGetAllergensMethod() {
        AllergyScreener mockAllergyScreener = mock(AllergyScreener.class);
        Person person = new Person("Tom", 34, mockAllergyScreener);
        person.askForAllergyTest();
        verify(mockAllergyScreener, times(1)).getAllergens(34);
    }
    @Test
    public void shouldReturnTomIfPersonNameIsTom() {
        String expectedName="Tom";
        AllergyScreener mockAllergyScreener = mock(AllergyScreener.class);
        Person person=new Person("Tom",23,mockAllergyScreener);
        assertEquals(expectedName,person.getName());
    }
}