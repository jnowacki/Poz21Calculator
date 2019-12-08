package jnowacki;

import java.util.List;
import java.util.stream.Collectors;

public class PeopleService {

    private PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> getAllFromService() {
      return peopleRepository.getAll();
    };

    public List<Integer> getDoubleAgeFromAll() {
        return peopleRepository.getAll().stream()
                .map(person -> person.getAge() * 2)
                .collect(Collectors.toList());
    };
}
