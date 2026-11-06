package org.example.profile;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;


@SpringBootApplication
@EnableConfigurationProperties(PaymentProperty.class)
public class ProfileManagement {
    public static void main(String[] args) {
        ApplicationContext context =
                SpringApplication.run(ProfileManagement.class,args);

        PaymentProperty bean =
                context.getBean(PaymentProperty.class);

        System.out.println("========PaymentProperty.class");

        System.out.println("Mode_Name : " + bean.getModeName());
        System.out.println("Url : " + bean.getUrl());
        System.out.println("Environment : " + bean.getEnvironment());
        System.out.println("Status : " + bean.getStatus());

    }
}
