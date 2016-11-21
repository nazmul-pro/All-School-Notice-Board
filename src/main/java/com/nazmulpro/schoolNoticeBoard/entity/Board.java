package com.nazmulpro.schoolNoticeBoard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Type;

@Entity
public class Board extends BaseEntity<Long> {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name", length = 100, nullable = false, unique = true)
    private String name;

    @Column(name = "password", length = 255)
    private String password;
    
    @Column(name = "content")
    @Type(type="text")
    private String content;

    public Board() {}

    
    public Board(Long id, String name, String password, String content) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.content = content;
	}
    
    @Override
    public Long getId() {
        return id;
    }
    
    

    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Board [id=" + id + ", name=" + name + ", content=" + content
				+ "]";
	}



}