package com.challenge.multimediacontent.models.services;

import java.util.List;

import com.challenge.multimediacontent.models.entity.Reproduction;

public interface IReproductionService {

	public List<Reproduction> findAll();

	public Long countPlayerMediaContent(Long idPlayer, Long idMultimediaContent);

	public Long countByMultimediaContentId(Long idMultimediaContent);

}
