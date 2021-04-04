import java.util.Scanner;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    private static final Marker KIJELENTÉS = MarkerManager.getMarker("kijelentés");
    private static final Marker KÉRELEM = MarkerManager.getMarker("kérelem");

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();

        for (int i = 0; i < iterations; i++){
            logger.debug(KIJELENTÉS, "Zöld erdőben jártam,");
            logger.warn(KIJELENTÉS, "Kék ibolyát láttam,");
            logger.info("El akart hervadni,");
            logger.fatal(KÉRELEM, "Szabad-e locsolni?");
            //Thread.sleep(5000);
            Thread.sleep(500);
        }
    }
}
