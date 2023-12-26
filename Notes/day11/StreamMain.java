package day11;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> allNumbers = Arrays.asList(34,78,98,17,21);
		//Populating a Stream on the top of collection: allNumbers
		Stream<Integer> intStream = allNumbers.stream();
		
		Consumer<Integer> intConsumer = num -> System.out.println(num * 10);
		intStream.forEach(intConsumer);

	}

}
