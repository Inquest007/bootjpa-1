package com.example.demo.ctrller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Alien;
import com.example.demo.servce.AlService;

@RestController
public class AlienController {
	
	@Autowired
	private AlService alServ;
	
	@PostMapping("/addAlien")
	public Alien addAlien (@RequestBody Alien aln) {
		return alServ.saveAlien(aln);
	}
	
	
	@GetMapping("/alien/{id}")
	public Alien getAlien(@PathVariable int id) {
	return alServ.gAlById(id); }
	
	
	@DeleteMapping("/delete/{id}")
	public String deleteAlien(@PathVariable int id) {
		return alServ.dAlById(id); }
	
	
	@PutMapping("/update")
	public Alien updateAlien(@RequestBody Alien al) {
		return alServ.uAlById(al); }
	
	

	
}
