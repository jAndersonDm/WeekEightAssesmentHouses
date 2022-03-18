/**
 * @author $${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Spring 2022
 * $${3/17/2022}
 */

package houses;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import houses.beans.Houses;
import houses.beans.Residence;
import houses.controller.BeanConfiguration;
import houses.repository.HouseRepo;

@SpringBootApplication
public class HousesApp implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(HousesApp.class, args);	
	}
	
	@Autowired
	HouseRepo theRepo;

	public void run(String... args) throws Exception {
		
		ApplicationContext appContext = new AnnotationConfigApplicationContext(BeanConfiguration.class);
		
		Houses theHouse = new Houses("7753 S Ave", "Cherokee", "IA");
		Residence res = new Residence("Josiah Anderson", "123-556-3213");
		theHouse.setHeadResident(res);
		theRepo.save(theHouse);
		
		List<Houses> allHouses = theRepo.findAll();
		for(Houses house: allHouses) {
			System.out.println(house.toString());
		}
		
		((AbstractApplicationContext) appContext).close();
	
	}

}
