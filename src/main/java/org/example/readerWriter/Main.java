package org.example.readerWriter;

import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        Database database = new Database();

        for (int i = 0; i < 10; i++) {
          if(ThreadLocalRandom.current().nextBoolean()) {
              Reader reader = new Reader(database);
              reader.start();
              Writer writer = new Writer(database);
              writer.start();
              ///update
//// update3
          }
        }
    }
}
