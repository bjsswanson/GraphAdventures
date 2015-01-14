package com.swansonb.graphadv;

import org.springframework.stereotype.Service;

@Service
public class HelloInject {

	public HelloInject(){}
	
	public String getString() {
		return "Hello Inject!";
	}
	
}
