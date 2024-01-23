import java.io.Serializable;

public class TruckDetails implements Serializable{

    private String truckname;
    private int truckid;

    TruckDetails(String truckname, int truckid){
        this.truckname = truckname;
        this.truckid = truckid;
    }

    public int getTruckid() {
        return truckid;
    }
    public void setTruckid(int truckid) {
        this.truckid = truckid;
    }
    public String getTruckname() {
        return truckname;
    }
    public void setTruckname(String truckname) {
        this.truckname = truckname;
    }


    @Override
    public String toString() {
        return "TRUCK DETAILS: TRUCK NAME :"+truckname +" TRUCK ID:"+ truckid;
    }
  
}
