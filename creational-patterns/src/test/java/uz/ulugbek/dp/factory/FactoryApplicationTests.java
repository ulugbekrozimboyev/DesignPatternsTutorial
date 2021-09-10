package uz.ulugbek.dp.factory;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import uz.ulugbek.dp.factory.prototype.ProtoFalse;
import uz.ulugbek.dp.factory.prototype.ProtoTrue;
import uz.ulugbek.dp.factory.singleton.SingA;
import uz.ulugbek.dp.factory.singleton.SingB;

@SpringBootTest
class FactoryApplicationTests {

    @Autowired
    private SingB singB1;
    @Autowired
    private SingB singB2;

    @Autowired
    private ProtoTrue true1;
    @Autowired
    private ProtoTrue true2;

    @Autowired
    private ProtoFalse false1;
    @Autowired
    private ProtoFalse false2;

    @Test
    public void  testSingleton(){

        SingA singA1 = SingA.getInstance();
        SingA singA2 = SingA.getInstance();

        Assert.assertNotNull(singA1);
        Assert.assertSame(singA1, singA2);

        Assert.assertNotNull(singB1);
        Assert.assertSame(singB1, singB2);
    }

    @Test
    public void testPrototypes(){

        Assert.assertSame(false1, false2);
        Assert.assertNotSame(true1, true2);
    }
}
