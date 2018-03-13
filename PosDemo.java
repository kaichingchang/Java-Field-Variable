public class PosDemo {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int[] n = {x, y};
        Pos p = new Pos();
        p.up(n[0]);
        p.right(n[1]);
        System.out.println("(" + p.x + ", " + p.y + ")");
    }
}

/*《程式語言教學誌》的範例程式
   http://kaiching.org/
   檔名：PosDemo.java
   功能：示範屬性及區域變數
   作者：張凱慶 */
