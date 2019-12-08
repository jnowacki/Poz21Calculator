package jnowacki;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

    @Mock
    private PeopleRepository peopleRepository;

    @InjectMocks
    private PeopleService peopleService;

    @Test
    public void pplRepoTest() {
        List<Person> ppl = Arrays.asList(new Person(21), new Person(37));

        when(peopleRepository.getAll()).thenReturn(ppl);

        assertEquals(peopleService.getAllFromService().size(), 2);
    }
}
