package alfa.lesson12;

public class BaggageDropDesk {

    private String flightNumber[];

    public BaggageDropDesk(String[] flightNumber) {
        this.flightNumber = flightNumber;
    }

    public BaggageTicket checkInBaggage(String passangerName, String fligthNumber, int baggageWeigth) {
        try {
            if (passangerName == null || passangerName.isEmpty()) {
                throw new InvalidPassengerNameException();
            }
            if (baggageWeigth < 0) {
                throw new InvalidBaggageWeightException();
            }
            boolean found = false;
            for (String n : flightNumber) {
                if (fligthNumber.equals(n)) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                throw new FlightNotFoundException();
            }
            if (baggageWeigth > 23) {
                throw new OverweightBaggageException();
            }
            if (fligthNumber.startsWith("A")) {
                throw new BaggageTagPrintException();
            }

            System.out.println("Your data is too good, u should pay fee 5 $$$");
            return new BaggageTicket(passangerName, fligthNumber, baggageWeigth);

        } catch (InvalidPassengerNameException e) {
            System.out.println("Passenger name must have at least 1 symbol");
        } catch (InvalidBaggageWeightException e) {
            System.out.println("Baggage weigth must be >= 0");
        } catch (FlightNotFoundException e) {
            System.out.println("Flight number " + fligthNumber + " does not exist");
        } catch (OverweightBaggageException e) {
            System.out.println("Baggage weight must be <= 23 kg");
        } catch (BaggageTagPrintException e) {
            System.out.println("Flight number can't start with 'A'");
        }
        return null;
    }
}