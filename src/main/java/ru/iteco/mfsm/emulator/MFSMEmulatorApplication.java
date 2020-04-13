package ru.iteco.mfsm.emulator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class MFSMEmulatorApplication {
    public static void main(String[] args) {
        SpringApplication.run(MFSMEmulatorApplication.class, args);
    }

    @PostConstruct
    public void afterInit() {
        System.out.println("MFSMEmulatorApplication inited");
    }
}
