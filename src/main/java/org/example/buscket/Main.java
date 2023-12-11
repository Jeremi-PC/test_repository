package org.example.buscket;
//Напишите программу о бабушках/дедушках и внуках. Каждая бабушка
// и каждый дедушка периодически кладут несколько конфет в специальную корзинку.
// Внуки иногда заглядывают в корзинку, чтобы взять конфетку.
// Если в корзинке нет конфет, то внуки ждут, пока они появятся.
// В корзинку помещается не больше 10 конфет. Когда корзинка полная,
// то бабушки и дедушки не могут добавить в неё новые конфеты.
public class Main {
    public static void main(String[] args) {

    Buscket buscket =new Buscket();
        for (int i = 0; i < 10; i++) {
            Grandparent grandparent = new Grandparent(i, buscket);
            Grandson grandson = new Grandson(i, buscket);
            grandparent.start();
            grandson.start();

        }
    }
}