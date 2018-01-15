package org.temaspring;

public class InMemoryStoreRepository implements MessageRepository{
    public void store(Message message) {
        System.out.println(message + "stored successfully in memory");
    }
}
