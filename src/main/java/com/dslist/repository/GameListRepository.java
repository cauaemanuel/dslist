package com.dslist.repository;

import com.dslist.entity.Game;
import com.dslist.entity.GameList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GameListRepository extends JpaRepository<GameList, Long> {
}
