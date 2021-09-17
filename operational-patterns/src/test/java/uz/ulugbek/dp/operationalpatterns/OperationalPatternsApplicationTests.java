package uz.ulugbek.dp.operationalpatterns;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.ulugbek.dp.operationalpatterns.repository.PresidentRepository;

@SpringBootTest
class OperationalPatternsApplicationTests {

    @Autowired
    private PresidentRepository presidentRepository;

    @Test
    void contextLoads() {
    }

    @Test
    public void testRepository() {
        System.out.println(presidentRepository.findById(1l));
        System.out.println(presidentRepository.findById(2l));
    }

}
