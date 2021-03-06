package com.challenge.multimediacontent.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "multimediacontents")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class MultimediaContent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
//  Challenge with validation or not? => Disabled
//	@Size(min = 4, max = 12, message = "size must be between 4 y 12 characters")
//	@NotEmpty(message = "can not be empty")
	private String name;

	@Column(nullable = false)
	private Integer length; // in seconds

	private String artist;

	// ************************* //
	// ADD THE PROPERTIES NEEDED //
	// ************************* //

	public Long getId() {
		return id;
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

	public Integer getLength() {
		return length;
	}

	public void setLength(Integer length) {
		this.length = length;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

}
