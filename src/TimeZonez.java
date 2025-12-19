package datetime;
import java.time.Instant;
import java.time.ZoneId;

public class TimeZonez {
    static void main() {
        //ZoneId.getAvailableZoneIds().forEach(System.out::println);
        var zi = ZoneId.of("Europe/Paris");
        System.out.println(zi);

        ZoneId.of("Europe/Berlin").getRules()
                .getTransitionRules()
                .forEach(System.out::println);

        //See next time the timezone changes
        
        System.out.println(zi.getRules().nextTransition(Instant.now()));
    }
}
