package com.app.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.DTOs.ReqVoterDTO;
import com.app.DTOs.RespVoterDTO;
import com.app.entities.Voter;
import com.app.service.VoterServiceIF;

@RestController
@RequestMapping("/voters")
@CrossOrigin(origins = "http://localhost:3000")
public class VoterController {
	
	@Autowired
	private VoterServiceIF voterServiceInstance;
	

	@PostMapping("/newvoter")
	public Voter addNewVoter(@RequestBody Voter newVoter) {
		
		Voter insertedVoter = voterServiceInstance.insertNewVoter(newVoter);
		
		return insertedVoter;
	}
	
	@GetMapping
	public List<Voter> getVotersList(){
		
		List<Voter> votersList = voterServiceInstance.getVotersList();
		
		return votersList;
	}
	
	@PutMapping("/updatevoter")
	public Voter updateV(@RequestBody Voter voter) {
		
		Voter updateVoter = voterServiceInstance.updateVoter(voter);
		
		return updateVoter;
	}
	
	@DeleteMapping("/deletevoter/{voterID}")
	public String deleteV(@PathVariable Integer voterID) {
		
		String deletionStatus = voterServiceInstance.deleteVoter(voterID);
		
		return deletionStatus;
	}
	
	@PostMapping("/authenticate")
	public RespVoterDTO authentication(@RequestBody ReqVoterDTO reqvoterDTO) {
		
		RespVoterDTO mappedRespVoterDTO = voterServiceInstance.authenticateVoter(reqvoterDTO);
		
		return mappedRespVoterDTO;		
	} 

}
