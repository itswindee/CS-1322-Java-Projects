import java.util.Random;

public class Cow implements Runnable {

    static LinkedList items = new LinkedList();


    public static boolean haveMilk(){
        if(items.isEmpty()){
            return false;
        }
        else{
            return true;
        }
    }

    public static Milk takeMilk(){
        return items.getNext();
    }

    public static int countMilk(){
        return items.countItems();
    }

    @Override
    public void run() {
        Random rand = new Random();
        while(true){
            Milk milk = new Milk();
            items.add(milk);
            try{
                Thread.sleep(rand.nextInt(5000) + 5000);
            }
            catch(Exception e){
                System.out.println(e.getMessage());
            }
        }
    }
}