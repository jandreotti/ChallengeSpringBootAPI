package com.challenge.multimediacontent.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.challenge.multimediacontent.models.entity.Reproduction;
import com.challenge.multimediacontent.models.services.IReproductionService;

@RestController
//Disabled by challenge request
//@RequestMapping("/api")
public class ReproductionRestController {

	@Autowired
	private IReproductionService reproductionService;

	/**
	 * Test endpoint to get all reproductions
	 * 
	 * @return returns all reproductions
	 */
	@GetMapping("/reproductions")
	public List<Reproduction> index() {
		return reproductionService.findAll();
	}

	/**
	 * Endpoint to count the total of time, a media content was reproduced by a
	 * certain player
	 * 
	 * @param idPlayer:            id of Player to search by
	 * @param idMultimediaContent: id of MultimediaContent to search by
	 * @return Long: Represent the times that the selected Player reproduce the
	 *         selected MultimediaContent
	 */
	@GetMapping("/players/{idPlayers}/multimedia/{idMedia}")
	public Long getPlayerMultimediaContentCount(@PathVariable(value = "idPlayers") Long idPlayer,
			@PathVariable(value = "idMedia") Long idMultimediaContent) {
		return reproductionService.countPlayerMediaContent(idPlayer, idMultimediaContent);
	}

	/**
	 * Endpoint to count the total of time, a media content was reproduced
	 * 
	 * @param idMultimediaContent: the id of the MultimediaContent to search by.
	 * @return Long: Represent the times that the selected MultimediaContent was
	 *         reproduced.
	 */
	@GetMapping("/multimedia/{id}/times")
	public Long getMultimediaContentCount(@PathVariable(value = "id") Long idMultimediaContent) {
		return reproductionService.countByMultimediaContentId(idMultimediaContent);
	}

}
