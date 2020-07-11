package week.two;

public class SSD extends Hardware{

    private int memory = 500;

    public SSD(int memory){
        if (memory > 750){
            int result = ((memory-750)/250)*275;
            setPrice(getPrice()+result);
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
