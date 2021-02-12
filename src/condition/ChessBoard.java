package condition;

public class ChessBoard {
    public static int way(int x1, int y1, int x2, int y2) {
       int rsl = 0;
       if (Math.abs(x2 - x1) == Math.abs(y2 - y1)) {
           rsl = Math.abs(x2 - x1);
           System.out.println(rsl > 0 ? "Ход сделан. Клеток пройдено: " + rsl  : "Ход не был совершен.");
           // Если ход был совершен верно, то в одну строку проверка + длина хода, иначе - хода не было
       } else {
           System.out.println("Такой ход недопустим.");
       }
       return rsl;
    }

    public static void main(String[] args) {
        /**
         *  длина хода 0, т.е. не было хода
         *  недопустимый ход
         *  допустимый ход
         */
        way(0, 1, 0, 1);
        way(5, 6, 7, 0);
        way(1, 6, 4, 3);
    }
}
