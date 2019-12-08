package jnowacki;

import java.util.List;

public class PeopleService {

    private PeopleRepository peopleRepository;

    public PeopleService(PeopleRepository peopleRepository) {
        this.peopleRepository = peopleRepository;
    }

    public List<Person> getAllFromService() {
      return peopleRepository.getAll();
    };
}
