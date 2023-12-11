package org.example.buscket;

import java.util.HashSet;
import java.util.Set;

public class Buscket {
    private final Set<Candy> buscket;
    private static final int MAX_SIZE = 10;

    public Buscket() {
        this.buscket = new HashSet<>();
    }
    public synchronized Candy getCandy() throws InterruptedException {
        while (buscket.isEmpty()) {
            wait();
        }
        Candy candy = buscket.stream().findFirst().orElseThrow();
        buscket.remove(candy);
        System.out.println("Candy took from buscket" + candy.getId());
        notify();
        return candy;
    }
    public synchronized void putCandy(Candy candy) throws InterruptedException {
        while (buscket.size() == MAX_SIZE) {
            wait();
        }
        buscket.add(candy);
        System.out.println("Candy put into buscket" + candy.getId());
        notify();
    }
}
