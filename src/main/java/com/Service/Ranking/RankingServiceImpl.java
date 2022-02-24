package com.Service.Ranking;

import com.Model.Ranking;
import com.Repository.RankingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RankingServiceImpl implements  RankingService{

    @Autowired
    RankingRepository repository;

    @Override
    public Ranking getById(Integer id) {
        return repository.getById(id);
    }
}
