/**
 * 
 */
package com.example.RatingNewDataService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adms.java1
 *
 */
@RestController
public class RatingConfigurationController {
	@RequestMapping(value = "/limits", method = RequestMethod.GET)
	public RatingConfiguration retriveLimitsFromConfigurations() {
		return new RatingConfiguration(3000, 30);
	}
}
