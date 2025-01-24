package com.dslist.service;

import com.dslist.dto.GameDTO;
import com.dslist.dto.GameMinDTO;
import com.dslist.entity.Game;
import com.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class GameService {

    @Autowired
    private GameRepository repository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> dto = repository.findAll()
                .stream()
                .map(x -> new GameMinDTO(x))
                .toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public List<GameMinDTO> findByList(Long listid){
        List<GameMinDTO> dto = repository.searchByList(listid)
                .stream()
                .map(x -> new GameMinDTO(x))
                .toList();
        return dto;
    }

    @Transactional(readOnly = true)
    public GameDTO getById(Long id){
        return new GameDTO(repository.findById(id).get());
    }


}
