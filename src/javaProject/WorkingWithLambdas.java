package javaProject;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class WorkingWithLambdas {

	
		public static void main(String[] args) {
			
		
		int[] a = {1,2,3,4,5,6,7};
		
		IntStream.of(a)
				 .forEach(values -> System.out.printf("%d ",values));
				 	
		System.out.printf("Count : %d%n", IntStream.of(a).count());
		System.out.printf("Min : %d%n", IntStream.of(a).min().getAsInt());
		System.out.printf("Sum : %d%n", IntStream.of(a).sum());
		System.out.printf("Average : %f%n", IntStream.of(a).average().getAsDouble());
		
		System.out.println("facorial :");
		System.out.printf("%d ",IntStream.of(a)
					.reduce(1,(x,y) -> x * y ));

		System.out.println("\nsum of squares :");
		System.out.printf("%d ",IntStream.of(a)
					.reduce(1,(x,y) -> x+(y*y)));
		
		Integer[] values = {5,9,6,7,4,9,5}; 

		System.out.printf("\nThe values greater than 4 : %s%n",
			Arrays.stream(values)
					.filter(value -> value > 4)
					.collect(Collectors.toList()));
		
		System.out.printf("The values greater than 4 sorted : %s%n",
				Arrays.stream(values)
						.filter(value -> value > 4)
						.sorted()
						.collect(Collectors.toList()));
		
		String[] names = {"sai","rama","zabi","ming","gajjala","jaya"};
		System.out.printf(" %s%n ",
	   Arrays.stream(names)
	   				.map(String::toUpperCase)
	   		.collect(Collectors.toList()) );
	   		
		System.out.printf(" %s%n ",
				Arrays.stream(names)
				.filter(s -> s.compareToIgnoreCase("m") > 0)
				.sorted(String.CASE_INSENSITIVE_ORDER.reversed())
				.collect(Collectors.toList())
				);
			
		}
	}
