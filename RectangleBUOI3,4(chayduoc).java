//bai 1
public class Rectangle {
    private int len;
    private int wid;

    public Rectangle() {
        this.len = 10;
        this.wid = 10;
    }

    public Rectangle(int len, int wid) {
        if(len >= 0 && len <= 20 && wid >= 0 && wid <= 20) {
            this.len = len;
            this.wid = wid;
        } else {
            throw new IllegalArgumentException("chieu rong va chieu cao tu 0 den 20.");
        }
    }

    public void setLen(int len) {
        this.len = len;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getLen() {
        return len;
    }

    public int getWid() {
        return wid;
    }

    public double calculatePerimeter() {
        return 2 * (len + wid);
    }

    public double calculateDiagonal() {
        return Math.sqrt(len * len + wid * wid);
    }

    public int calculateArea() {
        return len * wid;
    }

    public void display() {
        System.out.println("["+ len + " x " + wid + "]");
    }

    public boolean isSquare() {
        return len == wid;
    }

    public void drawRectangle(char c) {
        for(int i=0; i<len; i++) {
            for(int j=0; j<wid; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    }



    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10, 10);
        System.out.println("Dien tich hinh chu nhat: " + rectangle.calculateArea());
        System.out.println("Chu vi hinh chu nhat: " + rectangle.calculatePerimeter());
    }
}