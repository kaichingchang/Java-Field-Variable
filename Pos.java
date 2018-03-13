public class Pos {
    int x;
    int y;

    Pos() {
        x = 0;
        y = 0;
    }

    void up(int n) {
        y += n;
    }

    void right(int n) {
        x += n;
    }
}

/*《程式語言教學誌》的範例程式
   http://kaiching.org/
   檔名：Pos.java
   功能：示範屬性及區域變數
   作者：張凱慶 */
