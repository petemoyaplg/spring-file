package com.plg.springfile.services;

import java.io.BufferedWriter;
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
    File file2 = new File("file/certificat.xml");

    try (Writer writer = new FileWriter(file);
        Writer writer2 = new FileWriter(file2);
        BufferedWriter bw = new BufferedWriter(writer2);) {
      file.createNewFile();
      log.info("FICHIER CREEE");

      writer.write("LIGNE 1\n");
      writer.write("LIGNE 2");
      // writer.flush();

      // BufferedWriter writer2 = new FileWriter(new File("file/certificat.xml"));
      bw.write(Texts.T1);
      // // // writer.flush();
      // bw.close();
    } catch (IOException e) {
      System.out.println(e.getMessage());
      e.printStackTrace();
    }
  }
}
