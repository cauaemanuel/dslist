package com.dslist.controller;

import com.dslist.dto.GameDTO;
import com.dslist.dto.GameMinDTO;
import com.dslist.entity.Game;
import com.dslist.service.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll(){
       return gameService.findAll();
    }

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable Long id){
        return gameService.getById(id);
    }


}
