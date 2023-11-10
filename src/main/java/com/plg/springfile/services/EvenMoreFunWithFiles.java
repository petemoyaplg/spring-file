package com.plg.springfile.services;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.springframework.stereotype.Service;

import com.plg.springfile.constants.Texts;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class EvenMoreFunWithFiles {
  public void createFile() {
    File file = new File("file/data.txt");

    try (Writer writer = new FileWriter(file);) {
      file.createNewFile();
      log.info("FICHIER CREEE");

      writer.write("LIGNE 1\n");
      writer.write("LIGNE 2");
      // writer.flush();

      Writer writer2 = new FileWriter(new File("file/certificat.xml"));
      writer2.write(Texts.T1);
      // // writer.flush();
      writer2.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
