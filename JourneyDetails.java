import java.time.LocalDate;
import java.io.Serializable;

public class JourneyDetails implements Serializable {
    
    private String sourcelocation;
    private String destinationlocation;
    private LocalDate journeystartdate;
    private LocalDate journeyenddate;

    JourneyDetails(String sourcelocation, String destinationlocation, LocalDate journeystartdate, LocalDate journeyenddate){
        this.sourcelocation = sourcelocation;
        this. destinationlocation = destinationlocation;
        this.journeyenddate = journeyenddate;
        this.journeystartdate = journeystartdate;
    }

    public String getDestinationlocation() {
        return destinationlocation;
    }
    public void setDestinationlocation(String destinationlocation) {
        this.destinationlocation = destinationlocation;
    }

    public String getSourcelocation() {
        return sourcelocation;
    }
    public void setSourcelocation(String sourcelocation) {
        this.sourcelocation = sourcelocation;
    }

    public LocalDate getJourneyenddate() {
        return journeyenddate;
    }

    public void setJourneyenddate(LocalDate journeyenddate) {
        this.journeyenddate = journeyenddate;
    }

    public LocalDate getJourneystartdate() {
        return journeystartdate;
    }
    public void setJourneystartdate(LocalDate journeystartdate) {
        this.journeystartdate = journeystartdate;
    }

  
    @Override
    public String toString() {
        return "JOURNEY DETAILS: DEPARTURE TIME:"+ journeystartdate + " ARRIVAL TIME:" + journeyenddate + " SOURCE:" + sourcelocation +" DESTINATION:" +destinationlocation;
    }

}
