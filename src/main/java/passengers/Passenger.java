package passengers;

import lombok.Data;

@Data
public class Passenger {

  private String name;
  private boolean vip;

  public Passenger(String name, boolean vip) {
    this.name = name;
    this.vip = vip;
    name.indexOf("asd");
  }

}