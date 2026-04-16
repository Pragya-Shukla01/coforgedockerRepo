package com.coforge.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(name="usertable")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private long uid;
private String uname;
private String pwd;
public User(String uname, String pwd) {
	super();
	this.uname = uname;
	this.pwd = pwd;
}

}
