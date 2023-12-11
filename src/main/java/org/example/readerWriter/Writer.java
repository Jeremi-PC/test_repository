package org.example.readerWriter;

import lombok.*;

@AllArgsConstructor
public class Writer extends Thread{
    private Database database;

    @Override
    public void run() {
        try {
            database.startWriting();
            Data data = new Data();
            database.startWriting();
            System.out.printf("Writer %d has wrote data %s%n", this.getId(), new Data());
            database.stopWriting();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
