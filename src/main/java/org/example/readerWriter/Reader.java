package org.example.readerWriter;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Reader extends Thread{
    private Database database;

    @Override
    public void run() {
        try {
            Thread.sleep(1000);
            database.startReading();
            Data data = database.getData();
            System.out.printf("Reader %d has read data %s%n", this.getId(), data);
            database.stopReading();

        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
