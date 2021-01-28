package io.disshell;

import io.disshell.service.AskQuestionService;
import io.disshell.service.AskQuestionServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringApp {
    public static void main(String[] args) throws IOException {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        AskQuestionService service = context.getBean(AskQuestionService.class);
        service.AskQuestion();
    }
}
