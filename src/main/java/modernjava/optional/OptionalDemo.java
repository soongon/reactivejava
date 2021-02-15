package modernjava.optional;

import java.util.Optional;

public class OptionalDemo {

    public static void main(String[] args) {

        Optional<String> greet = hello("kim");

        String msg = greet.orElse("");

    }


    public static Optional<String> hello(String param) {

        if (param.length() > 2) {
            return Optional.of("hello");
        } else {
            return Optional.of(null);
        }
    }
}
