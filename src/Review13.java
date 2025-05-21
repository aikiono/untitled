public class Review13 {
    public static void main(String[] args) {
        double randomNum = Math.random()*4;
        int randomNumInt = (int) randomNum;
        if (randomNumInt == 1) {
            System.out.println("大吉");
        }else if (randomNumInt == 2) {
            System.out.println("中吉");
        }else if (randomNumInt == 3) {
            System.out.println("小吉");
        }else if (randomNumInt == 4) {
            System.out.println("凶");
        }
    }
}
