package com.helth.and.insurance.user.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.helth.and.insurance.user.entity.User;

public interface IUserRepositary extends JpaRepository<User, Serializable>{

}
