package org.example.buscket;

public class Grandson extends Thread{
           private final Buscket buscket;

        public Grandson(int id, Buscket buscket) {
            super("Grandson" + id);
            this.buscket = buscket;
        }

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Candy candy = buscket.getCandy();
                    System.out.printf("%s eated candy %d\n", getName(), candy.getId());
                    buscket.putCandy(new Candy());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

