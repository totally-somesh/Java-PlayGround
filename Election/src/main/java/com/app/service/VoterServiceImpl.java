package com.app.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.DTOs.ReqVoterDTO;
import com.app.DTOs.RespVoterDTO;
import com.app.entities.Voter;
import com.app.exceptions.ResourceNotFoundException;
import com.app.repository.VoterRepoIF;

@Service
@Transactional
public class VoterServiceImpl implements VoterServiceIF {

	@Autowired
	private VoterRepoIF voterRepoInstance;
	
	@Autowired
	private ModelMapper mapper;

	@Override
	public Voter insertNewVoter(Voter newVoter) {

		Voter addedVoter = voterRepoInstance.save(newVoter);

		return addedVoter;
	}

	@Override
	public List<Voter> getVotersList() {

		List<Voter> votersList = voterRepoInstance.findAll();

		return votersList;
	}

	@Override
	public Voter updateVoter(Voter voter) {

		Voter updatedVoter = voterRepoInstance.save(voter);

		return updatedVoter;
	}

	@Override
	public String deleteVoter(Integer voterID) {

		String msg = "Voter Deletion Failed Miserably, Boss !";

		if (voterRepoInstance.existsById(voterID)) {
		
			voterRepoInstance.deleteById(voterID);
			msg = "Voter Deleted Succesfully, Boss !";
		}
		
		return msg;
	}

	@Override
	public RespVoterDTO authenticateVoter(ReqVoterDTO reqvoterDTO) {
		
		Voter foundVoter = voterRepoInstance
				.findByEmailAndPassword(reqvoterDTO.getEmail(), reqvoterDTO.getPassword())
				.orElseThrow(() -> new ResourceNotFoundException("Invalid Email / Password, Boss !"));
		
		RespVoterDTO mappedRespDTO = mapper.map(foundVoter, RespVoterDTO.class);
		
		String msg = "XXX";
		
		if(foundVoter.getVotingStatus()) {
			
			msg = "Hello, " +foundVoter.getVoterName()+ " : You've Voted Succesfully ! Thank You !";
			mappedRespDTO.setMsg(msg);
			
		}else{
			
			msg = "Hello, " +foundVoter.getVoterName()+ " : You've Not Voted Yet, Boss. Please Vote !";
			mappedRespDTO.setMsg(msg);
		}
		
		
		return mappedRespDTO;
	}

	
	
}
