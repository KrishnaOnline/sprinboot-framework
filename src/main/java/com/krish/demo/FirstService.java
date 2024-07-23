package com.krish.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
//@PropertySource("classpath:custom.properties")
@PropertySources({
        @PropertySource("classpath:custom.properties"),
        @PropertySource("classpath:custom-2.properties")
})
public class FirstService {
    private final FirstClass firstClass;

    @Value("${my.property.name2}")
    private String customProperty;

    @Value("${my.custom.prop}")
    private String customPropFromOtherFile;

    @Value("${my.custom-2.prop}")
    private String customPropFromAnotherFile;

    private Environment environment;

//    @Autowired  // no need of it, when we use Constructor for DI
    public FirstService(/*@Qualifier("bean2") */FirstClass firstClass) {
        this.firstClass = firstClass;
    }

//    (OR) "Field Injection", but IT IS NOT RECOMMENDED...
//    @Autowired
//    private FirstClass firstClass;

    public String saySomething() {
        return "The Dependency is saying: \n"+firstClass.sayHello();
    }

    public String getJavaVersion() {
        return environment.getProperty("java.version");
    }
    public String getOsName() {
        return environment.getProperty("os.name");
    }
    // Get property from "application.properties"
    public String readCustomPropEnv() {
        return environment.getProperty("my.property.name1");
    }

    @Autowired
    public void setFirstClass(Environment environment) {
        this.environment = environment;
    }

    public String getCustomPropFromOtherFile() {
        return customPropFromOtherFile;
    }

    public String getCustomPropFromAnotherFile() {
        return customPropFromAnotherFile;
    }

    public String getCustomProperty() {
        return customProperty;
    }
}
