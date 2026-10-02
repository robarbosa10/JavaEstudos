package application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate ld01 = LocalDate.now();
		LocalDateTime ld02 = LocalDateTime.now();
		Instant ld03 = Instant.now();
		
		
		System.out.println(ld01);
		System.out.println(ld02);
		System.out.println(ld03);

	}

}
