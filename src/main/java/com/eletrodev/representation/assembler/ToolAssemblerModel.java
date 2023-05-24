package com.eletrodev.representation.assembler;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.eletrodev.domain.model.Tool;
import com.eletrodev.representation.model.ToolModel;

@Component //This annotation tell to Spring that this is a Spring's component.
public class ToolAssemblerModel {
	@Autowired
	private ModelMapper modelMapper;
	
	public ToolModel toModel(Tool tool) {
		return modelMapper.map(tool,ToolModel.class);
		
	}
	
	public List<ToolModel> toModelList(List<Tool> tools){
		List<ToolModel> models= new ArrayList<>();
		for(Tool tool: tools) {
			models.add(this.toModel(tool));
		}
		return models;
	}
}
