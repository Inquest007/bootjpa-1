package com.example.demo.servce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Alien;
import com.example.demo.repo.AlRepostry;

@Service
public class AlService {

	@Autowired
	private AlRepostry repo;
	
	public Alien saveAlien(Alien al) {
	return repo.save(al); }
	
	public Alien gAlById(int id) {
    return repo.findById(id).orElse(null); }
	
	public String dAlById(int id) {
	     repo.deleteById(id); 
	    return "deleted"+id; }
	
	public Alien uAlById(Alien aln) {
		Alien exAln = repo.findById(aln.getAid()).orElse(null);
		exAln.setAname(aln.getAname());
	    return repo.save(exAln); }
	
	
}
