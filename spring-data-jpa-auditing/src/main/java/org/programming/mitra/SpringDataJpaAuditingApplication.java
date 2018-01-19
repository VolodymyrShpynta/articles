package org.programming.mitra;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@EnableJpaAuditing
@EnableJpaRepositories
@SpringBootApplication
public class SpringDataJpaAuditingApplication implements CommandLineRunner {

    @Autowired
    private FileService fileService;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaAuditingApplication.class, args);
    }

    @Override
    public void run(String... args) {
        File file = new File("Java Notes", "Java is awesome");
        fileService.save(file);

        file.setName("Linux Notes");
        fileService.save(file);
    }
}











