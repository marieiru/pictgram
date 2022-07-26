package com.example.pictgram.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.web.multipart.MultipartFile;

import com.example.pictgram.validation.constraints.ImageByte;
import com.example.pictgram.validation.constraints.ImageNotEmpty;

import lombok.Data;

@Data
public class TopicForm {

	private Long id;

	private Long userId;

	@ImageNotEmpty
	@ImageByte(max = 2000000)
	private MultipartFile image;

	private String imageData;

	private String path;

	@NotEmpty
	@Size(max = 1000)
	private String description;

	private UserForm user;

	private List<FavoriteForm> favorites;

	private FavoriteForm favorite;

}