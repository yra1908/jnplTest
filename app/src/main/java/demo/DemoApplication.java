package demo;

import demo.frame.WebStartExample;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

import java.io.File;
import java.net.URISyntaxException;

@SpringBootApplication
public class DemoApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
        showClasPathForJar();
    }

    private static void showClasPathForJar() {

        try {
            System.out.println("*****************************************");
            System.out.println(new File(WebStartExample.class.getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).toString());
            System.out.println("*****************************************");
        } catch (URISyntaxException e) {
            e.printStackTrace();
        }

    }


    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(DemoApplication.class);
    }

}
