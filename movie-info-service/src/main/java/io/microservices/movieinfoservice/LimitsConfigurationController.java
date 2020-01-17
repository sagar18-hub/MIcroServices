/**
 * 
 */
package io.microservices.movieinfoservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adms.java1
 *
 */
@RestController
public class LimitsConfigurationController {

	/**
	 * @param args
	 */
	@RequestMapping(value = "/limits", method = RequestMethod.GET)
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(2000, 2);
	}
	
	
		@RequestMapping(value = "/movie", method = RequestMethod.GET)
		public Movie MovieFromConfigurations() {
			return new Movie("Marathi", "Shivaji");
		}
		
}
