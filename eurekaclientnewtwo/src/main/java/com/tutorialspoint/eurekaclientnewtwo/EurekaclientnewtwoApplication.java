package com.tutorialspoint.eurekaclientnewtwo;

import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.appinfo.ApplicationInfoManager;
import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;

@SpringBootApplication
@EnableEurekaClient
@RestController
public class EurekaclientnewtwoApplication {
	
   public static void main(String[] args) {
      SpringApplication.run(EurekaclientnewtwoApplication.class, args);
   }
   @RequestMapping(value = "/")
   public String home() {
      return "Eureka Client application of clientnewtwo";
   } 
   @Component
   public class DynamicMetadataReporter {
    
      @Autowired
      private ApplicationInfoManager aim;
    
      @PostConstruct
      public void init() {
         Map<String, String> map = aim.getInfo().getMetadata();
         map.put("dynamic-s1", "value_2");
      }
   }
}
