package pl.mpas.gitspring.optional;

import java.util.Optional;

public class OptionalExample {

    public static void main(String[] args) {
        // tuuu
        // stary sposób - bez lambdy
        Optional<String> maybeNick = findNick();
        if (maybeNick.isPresent()) {
            System.out.println(maybeNick.get());
        }
        // nowy - lambda
        maybeNick.ifPresent(
                nick -> System.out.println("Mam nicka: " + nick)
        );
    }

    private static Optional<String> findNick() {
        return Optional.empty();
    }
}
