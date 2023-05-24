package com.eletrodev.control;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.eletrodev.domain.repository.ToolRepository;
import com.eletrodev.representation.assembler.ToolAssemblerModel;
import com.eletrodev.representation.model.ToolModel;

@RestController
@RequestMapping("/tool")
public class ToolController {
	@Autowired
	private ToolRepository toolRepository;
	@Autowired
	private ToolAssemblerModel toolAssemblerModel;
	
	@GetMapping("/all")
	public List<ToolModel> getAllTools() {
		return toolAssemblerModel.toModelList(toolRepository.findAll());
		
	}
}
