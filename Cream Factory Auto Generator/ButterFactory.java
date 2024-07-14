public class ButterFactory implements Runnable {

    int milkCount = 0;


    @Override
    public void run() {
        while(true){
            if(Cow.haveMilk()){
                milkCount++;
                System.out.println("Butter Factory got milk from a cow.");
                System.out.println("Now Butter Factory has " + milkCount + " milk.");
                Cow.takeMilk();
            }
            if(milkCount >= 4){
                System.out.println("I made butter.");
                milkCount -= 4;
            }
            try{
                Thread.sleep(1000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}