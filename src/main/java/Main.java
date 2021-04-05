import java.security.cert.X509Certificate;
import java.util.Scanner;

import org.apache.logging.log4j.*;

public class Main {

    private static final Logger logger = LogManager.getLogger(Main.class.getName());
    private static final Marker KIJELENTÉS = MarkerManager.getMarker("kijelentés");
    private static final Marker KÉRELEM = MarkerManager.getMarker("kérelem");

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        int iterations = sc.nextInt();

        for (int i = 0; i < iterations; i++){
            ThreadContext.put("iteration", Integer.toString(i+1));
            logger.debug(KIJELENTÉS, "Zöld erdőben jártam,");
            logger.warn(KIJELENTÉS, "Kék ibolyát láttam,");
            logger.info("El akart hervadni,");
            logger.fatal(KÉRELEM, "Szabad-e locsolni?");
            Thread.sleep(1000);
        }
    }
}
