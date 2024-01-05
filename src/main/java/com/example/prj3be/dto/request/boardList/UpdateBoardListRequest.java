package com.example.prj3be.dto.request.boardList;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(description = "Update List Title")
public class UpdateBoardListRequest {

	private String title;
	private Integer id;
}
