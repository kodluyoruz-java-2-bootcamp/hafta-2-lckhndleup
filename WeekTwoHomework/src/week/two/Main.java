package week.two;

public class Main {
    public static void main(String[] args) {

        testComputer1();
        testComputer2();
    }


    private static void testComputer1()
    {
        Computer computer = new Computer();
        CPU cpu = new CPU(6);
        cpu.setBrand("AMD");
        cpu.setPower(150);
        cpu.setPrice(1499.90);
        cpu.setCores(6);
        cpu.setThreads(12);
        Motherboard motherboard = new Motherboard(true,true);
        motherboard.setBrand("MSI");
        motherboard.setPower(100);
        motherboard.setPrice(1349.90);
        motherboard.setCpuArchitect("AMD");
        motherboard.setWifiIncluded(true);
        motherboard.setBluetoothIncluded(true);
        RAM ram = new RAM(16,3600);
        ram.setBrand("Adata");
        ram.setPower(50);
        ram.setPrice(749.0);
        ram.setMemory(16);
        ram.setFrequency(3600);
        GPU gpu = new GPU(8,192);
        gpu.setBrand("AMD");
        gpu.setPower(200);
        gpu.setPrice(3499.0);
        gpu.setMemory(8);
        gpu.setBits(192);
        SSD ssd = new SSD(512);
        ssd.setBrand("Samsung");
        ssd.setPower(50);
        ssd.setPrice(599.90);
        ssd.setMemory(512);
        computer.setCpu(cpu);
        computer.setMotherboard(motherboard);
        computer.setRam(ram);
        computer.setGpu(gpu);
        computer.setSsd(ssd);
        final double totalPrice = computer.getTotalPrice();
        final double estimatedTotalPrice = 8897.67;
        if (estimatedTotalPrice != totalPrice)
        {
            throw new RuntimeException(String.format("Fiyat hesaplama metodunuz yanlış! Beklenen: %.2f Çıkan: %.2f", estimatedTotalPrice, totalPrice));
        }
        final int totalPower = computer.getTotalPower();
        final int estimatedTotalPower = 550;
        if (estimatedTotalPower != totalPower)
        {
            throw new RuntimeException(String.format("Güç tüketimi hesaplama metodunuz yanlış! Beklenen: %d Çıkan: %d", estimatedTotalPower, totalPower));
        }
    }
    private static void testComputer2()
    {
        Computer computer = new Computer();
        CPU cpu = new CPU(8);
        cpu.setBrand("Intel");
        cpu.setPower(160);
        cpu.setPrice(1699.90);
        cpu.setCores(8);
        cpu.setThreads(12);
        Motherboard motherboard = new Motherboard(false,false);
        motherboard.setBrand("Asus");
        motherboard.setPower(80);
        motherboard.setPrice(1499.90);
        motherboard.setCpuArchitect("Intel");
        motherboard.setWifiIncluded(false);
        motherboard.setBluetoothIncluded(false);
        RAM ram = new RAM(8,3200);
        ram.setBrand("Corsair");
        ram.setPower(50);
        ram.setPrice(499.0);
        ram.setMemory(8);
        ram.setFrequency(3200);
        GPU gpu = new GPU(8,256);
        gpu.setBrand("Nvidia");
        gpu.setPower(190);
        gpu.setPrice(4499.90);
        gpu.setMemory(8);
        gpu.setBits(256);
        SSD ssd = new SSD(1024);
        ssd.setBrand("Sandisk");
        ssd.setPower(50);
        ssd.setPrice(999.90);
        ssd.setMemory(1024);
        computer.setCpu(cpu);
        computer.setMotherboard(motherboard);
        computer.setRam(ram);
        computer.setGpu(gpu);
        computer.setSsd(ssd);
        final double totalPrice = computer.getTotalPrice();
        final double estimatedTotalPrice = 10783.57;
        if (estimatedTotalPrice != totalPrice)
        {
            throw new RuntimeException(String.format("Fiyat hesaplama metodunuz yanlış! Beklenen: %.2f Çıkan: %.2f", estimatedTotalPrice, totalPrice));
        }
        final int totalPower = computer.getTotalPower();
        final int estimatedTotalPower = 530;
        if (estimatedTotalPower != totalPower)
        {
            throw new RuntimeException(String.format("Güç tüketimi hesaplama metodunuz yanlış! Beklenen: %d Çıkan: %d", estimatedTotalPower, totalPower));
        }
    }
}
