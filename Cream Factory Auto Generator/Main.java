public class Main {

    public static void main(String[] args){
        Thread myThreads [] = new Thread[4];
        for(int i = 0; i < 4; i++){
            myThreads[i] = new Thread(new Cow());
            myThreads[i].start();
        }

        ButterFactory butterFactory = new ButterFactory();
        Thread t1 = new Thread(butterFactory);

        CreamFactory creamFactory = new CreamFactory();
        Thread t2 = new Thread(creamFactory);

        t1.start();
        t2.start();
    }
}