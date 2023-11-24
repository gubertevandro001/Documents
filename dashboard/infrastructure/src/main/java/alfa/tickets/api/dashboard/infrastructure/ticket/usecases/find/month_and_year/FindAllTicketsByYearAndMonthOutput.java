package alfa.tickets.api.dashboard.infrastructure.ticket.usecases.find.client;

import org.springframework.cglib.core.Local;

import java.time.LocalDate;

public record FindAllTicketsByYearAndMonthOutput(
        Long id,
        String title,
        Long clientId,
        Long moduleId,
        LocalDate openingDate,
        Local closingDate
) {
}
