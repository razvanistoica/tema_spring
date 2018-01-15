package org.temaspring;

import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository {
    public void store(Message message);
}
