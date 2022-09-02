package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.demo.model.Alien;



public interface AlRepostry extends JpaRepository<Alien,Integer>{

}
