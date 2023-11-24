package alfa.tickets.api.dashboard.infrastructure.client.usecases;

public record FindClientByIdOutput(
        Long id,
        String name
) {
}
