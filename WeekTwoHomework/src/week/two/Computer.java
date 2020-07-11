package week.two;

public class Computer {

    private Hardware cpu;
    private Hardware ram;
    private Hardware ssd;
    private Hardware motherboard;
    private Hardware gpu;

    public double getTotalPrice(){

        double totalPrice = cpu.getPrice()+ram.getPrice()+ssd.getPrice()+motherboard.getPrice()+gpu.getPrice();
        return totalPrice;
    }

    public int getTotalPower(){

        int totalPower = cpu.getPower()+ram.getPower()+ssd.getPower()+motherboard.getPower()+gpu.getPower();
        return totalPower;
    }

    public Hardware getGpu() {
        return gpu;
    }

    public void setGpu(Hardware gpu) {
        this.gpu = gpu;
    }

    public Hardware getCpu() {
        return cpu;
    }

    public void setCpu(Hardware cpu) {
        this.cpu = cpu;
    }

    public Hardware getRam() {
        return ram;
    }

    public void setRam(Hardware ram) {
        this.ram = ram;
    }

    public Hardware getSsd() {
        return ssd;
    }

    public void setSsd(Hardware ssd) {
        this.ssd = ssd;
    }

    public Hardware getMotherboard() {
        return motherboard;
    }

    public void setMotherboard(Hardware motherboard) {
        this.motherboard = motherboard;
    }
}
