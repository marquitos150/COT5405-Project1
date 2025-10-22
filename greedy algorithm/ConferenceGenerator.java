import java.util.*;

public class ConferenceGenerator {
    public static List<Conference> generateConference(int n) {
        Random rand = new Random();
        List<Conference> conferences = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = rand.nextInt(24 * 60 - 30);
            int lasting =rand.nextInt(24 * 60);
            int end = Math.min(start + lasting, 24 * 60);
            conferences.add(new Conference(start, end));
        }
        return conferences;
    }
}
