package uz.ulugbek.dp.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.ulugbek.dp.factory.singleton.SingA;
import uz.ulugbek.dp.factory.singleton.SingB;

@SpringBootTest
class FactoryApplicationTests {

    @Autowired
    SingB singB1;
    @Autowired
    SingB singB2;

    @Test
    public void  testSingleton(){

        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();

        Assert.assertNotNull(singA1);
        Assert.assertSame(singA1, singA2);

        Assert.assertNotNull(singB1);
        Assert.assertSame(singB1, singB2);
    }

}
