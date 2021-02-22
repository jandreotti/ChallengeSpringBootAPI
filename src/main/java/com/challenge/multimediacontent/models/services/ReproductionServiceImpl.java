package com.challenge.multimediacontent.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.challenge.multimediacontent.models.dao.IReproductionDao;
import com.challenge.multimediacontent.models.entity.Reproduction;

@Service
public class ReproductionServiceImpl implements IReproductionService {

	@Autowired
	private IReproductionDao reproductionDao;

	@Override
	@Transactional(readOnly = true)
	public List<Reproduction> findAll() {
		return (List<Reproduction>) reproductionDao.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Long countPlayerMediaContent(Long idPlayer, Long idMultimediaContent) {
		return reproductionDao.countPlayerMediaContent(idPlayer, idMultimediaContent);
	}

	@Override
	@Transactional(readOnly = true)
	public Long countByMultimediaContentId(Long idMultimediaContent) {
		return reproductionDao.countByMultimediaContentId(idMultimediaContent);
	}

}
