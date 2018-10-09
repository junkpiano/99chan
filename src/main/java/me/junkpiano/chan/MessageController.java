package me.junkpiano.chan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MessageController {

    @Autowired
    private MessageService service;

    @GetMapping("/messages")
    public String messages(Model model) {
        model.addAttribute("messageForm", new MessageForm());
    }
}
