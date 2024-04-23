import java.io.FileWriter;

public class Pizza extends PizzaHouse{
    private int size;
    private String flavor;
    private int count;
    public Pizza (String flavor, int size, int count){
        this.flavor = flavor;
        this.size = size;
        this.count = count;
    }


    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public  void writeFile(){
        try{
            FileWriter fw = new FileWriter("pizzahouse.txt", true);
            String str = PrintInfo();
            fw.write(str);
            fw.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public String PrintInfo(){
         return ("\nPizza flavor - " + getFlavor() + "\n Pizza size - " + getSize() + "\n Pizza count - " + getCount());

    }
}
