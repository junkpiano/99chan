package me.junkpiano.chan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository repository;

    public List<Message> getRecentMessages(Integer n) {
        return repository.findByOrderByIdDesc(PageRequest.of(0, n));
    }

    @Transactional
    public void save(Message message) {
        repository.save(message);
    }
}
