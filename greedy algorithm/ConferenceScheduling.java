import java.util.*;

public class ConferenceScheduling {
    public static int maxConferencesWithFixedRooms(List<Conference> conferences, int roomCount) {
        if (conferences == null || conferences.isEmpty() || roomCount <= 0)
            return 0;

        conferences.sort(Comparator.comparingInt(m -> m.endTime));

        PriorityQueue<Integer> roomEndTimes = new PriorityQueue<>();
        int scheduled = 0;

        for (Conference m : conferences) {
            if(!roomEndTimes.isEmpty() && roomEndTimes.peek() <= m.startTime) {
                roomEndTimes.poll();
                roomEndTimes.offer(m.endTime);
                scheduled++;
            }else if (roomEndTimes.size() < roomCount) {
                roomEndTimes.offer(m.endTime);
                scheduled++;
            }
        }

        return scheduled;
    }
}
