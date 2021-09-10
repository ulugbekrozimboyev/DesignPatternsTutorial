package uz.ulugbek.dp.factory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import uz.ulugbek.dp.factory.prototype.ProtoFalse;
import uz.ulugbek.dp.factory.prototype.ProtoTrue;

@SpringBootApplication
public class FactoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(FactoryApplication.class, args);
    }

    @Bean
    public ProtoFalse protoFalse(){
        return new ProtoFalse();
    }

    @Bean
    @Scope("prototype")
    public ProtoTrue protoTrue(){
        return new ProtoTrue();
    }

}
