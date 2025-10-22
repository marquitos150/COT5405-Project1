import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class experiment {
    public static void main(String[] args) throws IOException {
        int[] roomNumber ={1,2,5,10};
        int[] conferenceNumber = {50, 200, 1000, 5000, 10000};


        FileWriter csvWriter = new FileWriter("data/greedy_results.csv");
        csvWriter.write("conferences,rooms,conferenceScheduled,Time(ms)\n");
        for (int n : conferenceNumber) {
            for (int rooms : roomNumber) {
                List<Conference> conferences = ConferenceGenerator.generateConference(n);

                long start = System.nanoTime();
                int scheduled = ConferenceScheduling.maxConferencesWithFixedRooms(conferences, rooms);
                long end = System.nanoTime();
                double timeMs = (end - start) / 1e6;
                csvWriter.write(n + "," + rooms + "," + scheduled + "," + String.format("%.3f", timeMs) + "\n");
                System.out.printf("N=%d, Rooms=%d, Scheduled=%d, Time=%.3f ms%n",
                        n, rooms, scheduled, timeMs);
            }
        }

        csvWriter.close();
    }
}