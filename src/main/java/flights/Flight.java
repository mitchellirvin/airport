package flights;

import java.util.ArrayList;
import java.util.List;
import lombok.Data;
import passengers.Passenger;

@Data
public abstract class Flight {

  private String id;
  protected List<Passenger> passengersList = new ArrayList<>();

  public Flight(String id) {
    this.id = id;
  }

  public abstract boolean addPassenger(Passenger passenger);

  public abstract boolean removePassenger(Passenger passenger);

}
