package week.two;

public class CPU extends Hardware {

    private int cores;
    private int threads;

    public CPU(int cores){
        if(cores >= 6){
            setPrice(getPrice()+getPrice()*0.3);
        }
    }

    public int getCores(){
        return this.cores;
    }
    public void setCores(int cores){
        this.cores = cores;
    }
    public int getThreads(){
        return this.threads;
    }
    public void setThreads(int threads){
        this.threads = threads;
    }
}