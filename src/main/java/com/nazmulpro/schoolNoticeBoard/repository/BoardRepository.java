package com.nazmulpro.schoolNoticeBoard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nazmulpro.schoolNoticeBoard.entity.Board;



public interface BoardRepository extends JpaRepository<Board, Long> {

	public Board findByName(String name);
}
