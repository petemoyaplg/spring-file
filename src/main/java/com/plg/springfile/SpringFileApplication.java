package com.plg.springfile;

import java.io.File;
import java.nio.file.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.plg.springfile.services.EvenMoreFunWithFiles;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringFileApplication implements CommandLineRunner {

	@Autowired
	private EvenMoreFunWithFiles evenMoreFunWithFiles;

	public static void main(String[] args) {
		SpringApplication.run(SpringFileApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info("Serveur run");

		// CREATION
		File file = new File("file/debug.log");
		System.out.println("File = " + file);

		Path path = Path.of("file/debug.log");
		System.out.println("Path = " + path);

		File clientFile = new File("C:/Users/gpetemoya/Documents/CLIENT_RAWSUR_701.xlsx");

		// REQUETE SUR LE FS
		System.out.println("file exist ? " + file.exists());
		System.out.println("clientFile exist ? " + clientFile.exists());
		System.out.println("clientFile is dir ? " + clientFile.isDirectory());
		System.out.println("clientFile is file ? " + clientFile.isFile());
		System.out.println("clientFile execute ? " + clientFile.canExecute());

		// INTEROGER LE FILE
		System.out.println("Name de clientFile : " + clientFile.getName());
		System.out.println("Parent de clientFile : " + clientFile.getParent());
		System.out.println("Path de clientFile : " + clientFile.getPath());
		System.out.println("CanonicalPath de clientFile : " + clientFile.getCanonicalPath());

		System.out.println("==========================================");

		File canonical = new File("file/././../debug.log");
		System.out.println("Name de canonical : " + canonical.getName());
		System.out.println("Parent de canonical : " + canonical.getParent());
		System.out.println("Path de canonical : " + canonical.getPath());
		System.out.println("CanonicalPath de canonical : " + canonical.getCanonicalPath());

		// REPERTOIRE COURANT
		File currentDirectory = new File(".");
		System.out.println("Repertoire courant : " + currentDirectory);
		System.out.println("CanonicalPath de currentDirectory : " + currentDirectory.getCanonicalPath());

		this.evenMoreFunWithFiles.createFile();

	}

}
