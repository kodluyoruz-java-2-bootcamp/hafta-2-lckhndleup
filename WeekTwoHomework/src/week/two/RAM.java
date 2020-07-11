package week.two;

public class RAM extends Hardware{

    private int memory = 8;
    private int frequency = 3200;

    public RAM(int memory,int frequency){
        if (memory > 16){
            int result = ((memory-16)/4)*100;
            setPrice(getPrice()+result);
        }
        if (frequency > 3600){
            int result = ((frequency-3600)/400)*200;
            setPrice(getPrice()+result);
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }
}
