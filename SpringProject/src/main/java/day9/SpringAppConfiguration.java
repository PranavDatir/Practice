package day9;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;

public class SpringAppConfiguration {
	@Bean
	public List<String> countries(){
		List<String> countryList = Arrays.asList("India", "Bhutan", "Nepal");
		return countryList;
	}
}
