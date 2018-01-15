package org.temaspring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class RepositoryConfiguration {

    @Bean
    MessageRepository messageRepository(RepositoryProperties repositoryProperties) {
        switch (repositoryProperties.getType()) {
            case IN_FILE:
                return new FileStoreRepository();
            case IN_MEMORY:
                return new InMemoryStoreRepository();
            default:
                throw new UnsupportedOperationException("Repository type not supporte" + repositoryProperties.getType());
        }
    }

}
