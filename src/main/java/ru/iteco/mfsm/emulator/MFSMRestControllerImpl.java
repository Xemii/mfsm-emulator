package ru.iteco.mfsm.emulator;

import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class MFSMRestControllerImpl {
    @PostConstruct
    public void afterInit() {
        System.out.println("MFSMRestControllerImpl inited");
    }

    @PostMapping("/mfsm-emulator/rest")
    public String createEntity(@RequestBody String body) {
        System.out.println("MFSMRestControllerImpl.createEntity");
        System.out.println("body=" + body);

        return "{\"User\":{\"id\": \"1\"}}";
    }

    @PutMapping("/mfsm-emulator/rest/{id}")
    public void updateEntity(@PathVariable("id") String id) {
        System.out.println("MFSMRestControllerImpl.updateEntity " + id);
    }

    @DeleteMapping("/mfsm-emulator/rest/{id}")
    public void deleteEntity(@PathVariable("id") String id) {
        System.out.println("MFSMRestControllerImpl.deleteEntity " + id);
    }
}
