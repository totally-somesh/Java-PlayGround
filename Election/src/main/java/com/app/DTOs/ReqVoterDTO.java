package com.app.DTOs;

import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ReqVoterDTO {

	private String email;

	private String password;

}
