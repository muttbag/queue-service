package co.uk.queue.group.controller;

import co.uk.queue.group.service.QueueService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/queue")
public class QueueController {

    @Autowired
    QueueService queueService;

    @GetMapping(value = "/message", produces = MediaType.APPLICATION_JSON_VALUE)
    public String getMessage() throws IOException {

        return queueService.addMessage();
    }
}
