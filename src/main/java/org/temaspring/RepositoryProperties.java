package org.temaspring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("repository.properties")
public class RepositoryProperties {

    @Value("${repository.type}")
    private RepositoryType type;

    public RepositoryType getType() {
        return type;
    }
}
