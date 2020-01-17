/**
 * 
 */
package com.catalog.moviecatalognewservice;

import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author adms.java1
 *
 */
@RestController
@RequestMapping("/catalog")
public class MovieConfigurationController {

	@RequestMapping(value = "/limits", method = RequestMethod.GET)
	public MovieConfiguration retriveLimitsFromConfigurations() {
		return new MovieConfiguration(1000, 1);
	}

	@RequestMapping(value = "/{userId}", method = RequestMethod.GET)
	public List<CatalogItem> getCatalog(@PathVariable("userId") String userId) {
		return Collections.singletonList(new CatalogItem("Shivaji", "Marathi",
				5));

		/*
		 * ist<Rating>ratings =Arrays.asList( new Rating("1234",5), new
		 * Rating("78945",4) ); return ratings.stream().map(rating ->{ new
		 * CatalogItem("Transformer","Test",4) }) .collect(Collectors.toList());
		 */
	}
}
