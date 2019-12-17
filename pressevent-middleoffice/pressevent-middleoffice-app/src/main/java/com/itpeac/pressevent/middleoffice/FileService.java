package com.itpeac.pressevent.middleoffice;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collection;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import com.itpeac.pressevent.middleoffice.domain.Image;


@Component
public class FileService {
	
	private static final String FILE_DIRECTORY = "/var/files";
	 
	public void storeFile(MultipartFile file) throws IOException {
		Path filePath = Paths.get(FILE_DIRECTORY + "/" + file.getOriginalFilename());
 
		Files.copy(file.getInputStream(), filePath, StandardCopyOption.REPLACE_EXISTING);
	}

	
}
