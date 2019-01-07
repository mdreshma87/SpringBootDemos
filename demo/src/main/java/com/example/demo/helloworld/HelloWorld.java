package com.example.demo.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
@GetMapping(path="/hello-world")
public String helloworld()
{
	return "hello World";
}
@GetMapping(path="/hello-world-bean")
public HelloWorldBean helloworldbean()
{
	return new HelloWorldBean("hello World");
}

@GetMapping(path="/hello-world/path-variable/{name}")
public HelloWorldBean helloworldpathvariable(@PathVariable String name)
{
	return new HelloWorldBean(String.format("hello World, %s",name));
}
}
