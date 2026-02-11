package com.alpha.hospital.controller;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PostMapping("/savedoctor")
public class HospitalController {
	public ResponseStructure saveDoctor(@RequestBody Doctor d) {
		return docotorservice.saveDoctor(d);
		
	}

}
