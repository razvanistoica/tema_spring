package org.temaspring;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {

    private static final Integer DEFAULT_MESSAGE_COUNT = 3;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(RepositoryConfiguration.class);
        BusinessService businessService = (BusinessService) applicationContext.getBean("businessService");
        String messageCount = DEFAULT_MESSAGE_COUNT.toString();

        if (args.length > 0) {
            messageCount = args[0];
        }

        if (messageCount.matches("\\d+")) {
            for (int i = 0; i < Integer.parseInt(messageCount); i++) {
                Message message = (Message) applicationContext.getBean("message");
                businessService.process(message);
            }
        } else {
            throw new NumberFormatException("For input argument: " + messageCount);
        }
    }

}
