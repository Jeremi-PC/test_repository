package org.example.readerWriter;

import java.time.LocalDateTime;
import lombok.*;
@ToString
public class Data {
   private LocalDateTime localDateTime;

    public Data() {

    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    @Override
    public String toString() {
        return "Data{" +
                "localDateTime=" + localDateTime +
                '}';
    }
}
