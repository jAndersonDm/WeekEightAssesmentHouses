/**
 * @author $${Josiah Anderson} - janderson78@dmacc.edu
 * CIS175 - Spring 2022
 * $${3/17/2022}
 */

package houses.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import houses.beans.Houses;
import houses.beans.Residence;

@Configuration
public class BeanConfiguration {
	
	
	@Bean
	public Houses house() {
		Houses bean = new Houses("7753 S Ave", "Cherokee");
		return bean;
	}
	
	@Bean
	public Residence residence() {
		Residence bean = new Residence("Josiah Anderson", "553-331-4423");
		return bean;
	}

}
