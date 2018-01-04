package ru.kpdesign.socialbot.shared;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

/**
 * @author Mirimas
 */
public class PersonResp implements Serializable {
	private int id;
	private String username;
	private Date birthday;

	public PersonResp() {
	}

	public PersonResp(int id, String username, Date birthday) {
		this.id = id;
		this.username = username;
		this.birthday = birthday;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		PersonResp that = (PersonResp) o;
		return id == that.id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
}
