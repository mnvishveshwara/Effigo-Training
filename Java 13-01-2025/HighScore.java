public class HighScore {
    public static void main(String[] args) {
        int[] store = {randomNumber(), randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber(),randomNumber() };

        int seat=0;
        int highScore=0;
        for (int i = 0; i < store.length; i++) {
            if (store[i]>highScore) {
                highScore=store[i];
                seat=i;
            }
        }
        System.out.println("highscore : "+highScore+ " and the seat is "+ seat);
    }

    public static int randomNumber(){
        return (int) (Math.random() * 50000);
    }
}
