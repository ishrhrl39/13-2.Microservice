package org.msa.history.controller;

import org.msa.history.dto.HistoryDTO;
import org.msa.history.dto.ResponseDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping(value="v1/history")
@RestController
public class HistoryController {
	
	@RequestMapping(value="/save", method=RequestMethod.POST)
	public ResponseEntity<ResponseDTO> history(HttpServletRequest request, @RequestBody HistoryDTO historyDTO) throws Exception{
		ResponseDTO.ResponseDTOBuilder responseBuilder = ResponseDTO.builder();
		
		log.info("history = {}", historyDTO.toString());
		
		responseBuilder.code("200").message("success");
		return ResponseEntity.ok(responseBuilder.build());
	}
	
}
