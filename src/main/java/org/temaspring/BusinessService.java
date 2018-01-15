package org.temaspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BusinessService {

    @Autowired
    MessageRepository messageRepository;

    public void process(Message message) {
        System.out.println("Process: " + message.getMessageId().getId());
        messageRepository.store(message);
    }
}
