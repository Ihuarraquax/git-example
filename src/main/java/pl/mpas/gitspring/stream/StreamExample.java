package pl.mpas.gitspring.stream;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//@Slf4j
public class StreamExample {
    private static final Logger log = LoggerFactory.getLogger(StreamExample.class);

    public static void main(String[] args) {
        List<String> colors = Arrays.asList(
                "white",
                "black",
                "blue",
                "red",
                "pink"
        );

        // TODO:
        // wyrzuć wrzystkie kolory których nazwy mają mniej niż 4 liter
        // zamień stringi na liczbe znaków
        // zbierz to do listy
        colors.stream()
                .filter((String s) -> {
                    log.info("testing object [{}]", s);
                    return s.length() >= 4; })
                .map(s -> {
                    log.info("mapping object [{}]", s);
                    return s.length();});
//                .collect(Collectors.toList())
//                .forEach(integer -> System.out.println("number: " + integer));
    }
}
