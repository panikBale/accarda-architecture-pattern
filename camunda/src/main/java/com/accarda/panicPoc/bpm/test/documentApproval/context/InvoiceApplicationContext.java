package com.accarda.panicPoc.bpm.test.documentApproval.context;

import com.accarda.panicPoc.bpm.test.documentApproval.delegates.DocumentReader;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class InvoiceApplicationContext {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Bean
    public DocumentReader documentReaderService() {
        return new DocumentReader();
    }

}
