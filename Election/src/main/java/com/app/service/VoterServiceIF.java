package com.app.service;

import java.util.List;

import com.app.DTOs.ReqVoterDTO;
import com.app.DTOs.RespVoterDTO;
import com.app.entities.Voter;

public interface VoterServiceIF {
	
	Voter insertNewVoter(Voter newVoter);
	
	List<Voter> getVotersList();
	
	Voter updateVoter(Voter voter);
	
	String deleteVoter(Integer voterID);
	
	RespVoterDTO authenticateVoter(ReqVoterDTO reqvoterDTO);

}
