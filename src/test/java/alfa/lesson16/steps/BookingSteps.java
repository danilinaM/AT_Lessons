package alfa.lesson16.steps;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.ru.Дано;
import io.cucumber.java.ru.Если;
import io.cucumber.java.ru.И;
import io.cucumber.java.ru.То;

import java.util.List;
import java.util.Map;

public class BookingSteps {

    //Блок 1
    @Дано("пользователь авторизован как {word}")
    public void authorizeUser(String userRole) {
    }

    @Дано("свободный столик на {int} персон")
    public void freeTableAvaialablePrepare(int personAmount) {
    }

    @Если("забронировать столик на {int} персон")
    public void orderTableForPersonAMount(int personAmount) {
    }

    // Блок 3
    @То("бронь записана : {word}")
    public void bookingSuccessful(String bookingAvailable) {
    }

    @То("бронь не записана")
    public void bookingDeclined() {
    }

    @И("отменить бронирование")
    public void declineBooking() {
    }

    // Блок 4
    @Дано("в ресторане есть столики:")
    public void avaiableTablesNumberSeatCount(DataTable table) {
        List<Map<String, String>> rows = table.asMaps();
    }

    // Блок 5
    @Если("гость оставляет пожелание к брони:")
    public void guestLeavesMessage(String message) {
        System.out.println(message);
    }

    // Блок 8
    @Если("^гость (увеличивает|уменьшает) бронь на (\\d+) человека$")
    public void changeGuestsNumber(String action, int amount) {
    }
}