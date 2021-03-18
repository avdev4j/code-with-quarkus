package org.acme;

import javax.enterprise.context.ApplicationScoped;
import java.util.Optional;

@ApplicationScoped
public class UserService {

    public Optional<String> sampleMethod() {
        RandomUtil.generateResetKey();
        RandomUtil.generateActivationKey();
        RandomUtil.generatePassword();

        return Optional.of("beer");
    }
}
