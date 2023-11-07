package pro.sky.ticket7task;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		try{
			int a = Integer.parseInt(" not an integer");
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException | NumberFormatException e){
			System.out.println("Обнаружено исключение:" + e.getMessage());
		}

	}

}
