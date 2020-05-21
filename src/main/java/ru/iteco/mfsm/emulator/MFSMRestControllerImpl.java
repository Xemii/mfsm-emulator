package ru.iteco.mfsm.emulator;

import net.bytebuddy.utility.RandomString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;

@RestController
public class MFSMRestControllerImpl {
    @Autowired
    private InteractionRepository interactionRepository;

    @PostConstruct
    public void afterInit() {
        System.out.println("MFSMRestControllerImpl inited");
    }

    /*@PostMapping("/mfsm-emulator/rest")
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
    }*/

    @PostMapping("/mfsm-emulator/rest/interactions")
    public InteractionEntityRequest createInteraction(@RequestBody InteractionEntityRequest request) {
        System.out.println("MFSMRestControllerImpl.createInteraction " + request);
        request.getInteraction().setId(RandomString.make(12));
        request.setInteraction(request.getInteraction());
        return request;
    }

    @PutMapping("/mfsm-emulator/rest/interaction/{id}")
    public InteractionEntityRequest updateInteraction(@PathVariable("id") String id, @RequestBody InteractionEntityRequest request) {
        System.out.println("MFSMRestControllerImpl.updateInteraction " + request);
        request.getInteraction().setId(id);
        request.setInteraction(request.getInteraction());
        return request;
    }
}
