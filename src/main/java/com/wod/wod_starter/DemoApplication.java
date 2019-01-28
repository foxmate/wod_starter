package com.wod.wod_starter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;
import com.wod.html_parser.html_parser;

@SpringBootApplication
@RestController
public class DemoApplication {

	@GetMapping(value="/workout")
	public String wywolanie() throws IOException{
		html_parser ph = new html_parser();
		String txt = "";
		for (int i = 1; i < 30; i++) {
			try {
				txt = txt + ph.polacz(2018, 9, i);
			} catch (Exception e) {
				//TODO: handle exception
			}	
		};
		return txt;
	};

	public static void main(String[] args) throws IOException {
		SpringApplication.run(DemoApplication.class, args);
	}

}

