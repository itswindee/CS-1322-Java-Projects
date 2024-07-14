public class CreamFactory implements Runnable{

    int milkCount = 0;


    @Override
    public void run() {
        while(true){
            if(Cow.haveMilk()){
                milkCount++;
                System.out.println("Cream Factory got milk from a cow.");
                System.out.println("Now Cream Factory has " + milkCount + " milk.");
                Cow.takeMilk();
            }
            if(milkCount >= 2){
                System.out.println("I made cream.");
                milkCount -= 2;
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