package org.temaspring;

public class FileStoreRepository implements MessageRepository{
    public void store(Message message) {
        System.out.println(message + "stored successfully in file");
    }
}
