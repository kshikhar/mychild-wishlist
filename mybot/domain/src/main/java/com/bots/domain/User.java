package com.bots.domain;

import java.util.Objects;

public class User {
	private final Long userId;

	private final String userName;

	public User(Long userId, String userName) {
		super();
		this.userId = userId;
		this.userName = userName;
	}

	public Long getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	@Override
	public int hashCode() {
		return Objects.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return Objects.equals(this, obj);
	}

}
