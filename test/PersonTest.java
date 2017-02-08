import org.junit.Test;

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
}