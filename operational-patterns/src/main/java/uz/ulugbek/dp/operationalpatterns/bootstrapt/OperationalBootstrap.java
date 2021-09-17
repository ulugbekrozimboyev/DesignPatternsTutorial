package uz.ulugbek.dp.operationalpatterns.bootstrapt;

import org.springframework.boot.CommandLineRunner;
import uz.ulugbek.dp.operationalpatterns.domain.President;
import uz.ulugbek.dp.operationalpatterns.repository.PresidentRepository;

/**
 * Author: Ulug'bek Ro'zimboyev  <ulugbekrozimboyev@gmail.com>
 * Date: 9/17/2021 9:43 AM
 */
public class OperationalBootstrap implements CommandLineRunner {

    private final PresidentRepository presidentRepository;

    public OperationalBootstrap(PresidentRepository presidentRepository) {
        this.presidentRepository = presidentRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        President president = new President();
        president.setId(1l);
        president.setFirstName("George");
        president.setLastName("Washington");
        president.setEmailAddress("");
        presidentRepository.save(president);

        presidentRepository.save(new President(2l, "John", "Adams", null));


    }
}
