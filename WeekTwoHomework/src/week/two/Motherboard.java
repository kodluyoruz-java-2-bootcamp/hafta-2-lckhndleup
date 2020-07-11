package week.two;

public class Motherboard extends Hardware{

    private String cpuArchitect = "intel";
    private boolean wifiIncluded = true;
    private boolean bluetoothIncluded = true;

    public Motherboard(boolean wifiIncluded,boolean bluetoothIncluded){
        if(wifiIncluded == true){
            setPrice(getPrice()+250);
        }
        if(bluetoothIncluded == true){
            setPrice(getPrice()+100);
        }
    }

    public String getCpuArchitect(){
        return this.cpuArchitect;
    }
    public void setCpuArchitect(String cpuArchitect){
        this.cpuArchitect = cpuArchitect;
    }
    public boolean isWifiIncluded(){
        return this.wifiIncluded;
    }
    public void setWifiIncluded(boolean wifiIncluded){
        this.wifiIncluded = wifiIncluded;
    }

    public boolean isBluetoothIncluded() {
        return bluetoothIncluded;
    }
    public void setBluetoothIncluded(boolean bluetoothIncluded) {
        this.bluetoothIncluded = bluetoothIncluded;
    }
}
