package com.example.springboot;

import jakarta.persistence.*;

@Entity
public class Test {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String content;

	protected Test() {}

	public Test (String content) {
		this.content = content;
	}

	@Override
	public String toString() {
		return String.format(
			"Test[id=%d, content='%s']",
			id, content);
	}

	public Long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}


