package busResv;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getBusNo(){
        return busNo;
    }

    public boolean isAc(){
        return ac;
    }

    public int getCapacity(){
        return capacity;
    }

    public void setAc(boolean ac1){
        ac=ac1;
    }
    public void setCapacity(int cap){
        capacity=cap;
    }

    public void displayBusInfo(){
        System.out.println("BusNo:"+busNo+" Ac:"+ac+" Total Capacity:"+capacity);
    }

}
