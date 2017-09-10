package tk.techthoughts.demos;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.Banner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class App implements CommandLineRunner {

    private static final Log LOG = LogFactory.getLog(App.class);

    public static void main( String[] args ) {
        SpringApplication app = new SpringApplication(App.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
    }

    public void run(String... args) throws Exception {
        if(args.length > 0) {
            LOG.info("Hello " + args[0]);
        }
        LOG.info("----Run Complete-----");
    }
}
