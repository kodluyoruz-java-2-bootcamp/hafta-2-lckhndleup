package week.two;

public class GPU extends Hardware {

    private int memory = 4;
    private int bits = 256;

    public GPU(int memory,int bits){
        if (memory>8){
            double result = ((memory-8)/2)*250;
            setPrice(getPrice()+result);
        }
        if (bits>128){
            double result = ((bits-128)/64)*400;
            setPrice(getPrice()+result);
        }
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getBits() {
        return bits;
    }

    public void setBits(int bits) {
        this.bits = bits;
    }
}
