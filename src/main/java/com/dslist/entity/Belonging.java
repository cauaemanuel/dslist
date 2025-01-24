package com.dslist.entity;

import jakarta.persistence.Embeddable;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_belonging")
public class Belonging {

    @EmbeddedId
    private BelongingPK id = new BelongingPK();
    private Integer position;

    public Belonging(){}

    public Belonging(Game game, GameList list, Integer position){
        super();
        this.id.setGame(game);
        this.id.setList(list);
        this.position = position;
    }
}
