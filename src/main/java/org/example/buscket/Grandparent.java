package org.example.buscket;

public class Grandparent extends Thread{
    private final Buscket buscket;

    public Grandparent(int id, Buscket buscket) {
        super("Grandma" +id);
        this.buscket = buscket;
    }

    @Override
    public void run() {
        while(true) {
        for (int i = 0; i < 100; i++) {
            try {
                Candy candy = new Candy();
                buscket.putCandy(candy);
                System.out.printf("%s put candy %d\n", getName(), candy.getId());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
