package com.challenge.multimediacontent.models.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "reproductions")
public class Reproduction implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY)
	private Player player;

	@ManyToOne(fetch = FetchType.LAZY)
	private MultimediaContent multimediaContent;

	@Column(name = "moment")
	@Temporal(TemporalType.TIMESTAMP)
	private Date moment;

	@PrePersist
	public void prePersist() {
		moment = new Date();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public MultimediaContent getMultimediaContent() {
		return multimediaContent;
	}

	public void setMultimediaContent(MultimediaContent multimediaContent) {
		this.multimediaContent = multimediaContent;
	}

}
