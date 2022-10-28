package ax.ha.appmodule;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class AppModuleApplication {

    public static void main(final String... args) {
        SpringApplication.run(AppModuleApplication.class, args);
    }

}
