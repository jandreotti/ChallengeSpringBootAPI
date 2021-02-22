package com.challenge.multimediacontent.models.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.challenge.multimediacontent.models.entity.Reproduction;

public interface IReproductionDao extends CrudRepository<Reproduction, Long> {

	// with @Querry
	@Query("SELECT COUNT(r) FROM Reproduction r WHERE r.player.id=?1 AND r.multimediaContent.id=?2")
	public Long countPlayerMediaContent(Long idPlayer, Long idMultimediaContent);

	// with Query Methods
	public Long countByMultimediaContentId(Long idMultimediaContent);

}
