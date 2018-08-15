/*
 * This Java source file was generated by the Gradle 'init' task.
 */
import flights.BusinessFlight;
import flights.EconomyFlight;
import flights.Flight;
import org.junit.Test;
import passengers.Passenger;

import static org.junit.Assert.*;

public class FlightTest {

  @Test
  public void testEconomyFlightForVip() {
    Flight economyFlight = new EconomyFlight("1");
    Passenger John = new Passenger("John", true);

    assertEquals(true, economyFlight.addPassenger(John));
    assertEquals(false, economyFlight.removePassenger(John));
  }

  @Test
  public void testEconomyFlightForNonVip() {
    Flight economyFlight = new EconomyFlight("2");
    Passenger Mike = new Passenger("Mike", false);

    assertEquals(true, economyFlight.addPassenger(Mike));
    assertEquals(true, economyFlight.removePassenger(Mike));
  }

  @Test
  public void testBusinessFlightForVip() {
    Flight businessFlight = new BusinessFlight("3");

    Passenger John = new Passenger("John", true);

    assertEquals(true, businessFlight.addPassenger(John));
    assertEquals(false, businessFlight.removePassenger(John));
  }

  @Test
  public void testBusinessFlightForNonVip() {
    Flight businessFlight = new BusinessFlight("4");
    Passenger Mike = new Passenger("Mike", false);

    assertEquals(false, businessFlight.addPassenger(Mike));
    assertEquals(false, businessFlight.removePassenger(Mike));
  }
}
