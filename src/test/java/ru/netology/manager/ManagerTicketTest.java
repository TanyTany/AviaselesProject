package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.TicketsApp;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTicketTest {
    @Test
            public void shouldSearchByFromTo() {
        ManagerTicket managerTicket = new ManagerTicket();
        TicketsApp moscow = new TicketsApp(1, 4500, "MOW", "LED", 90);
        TicketsApp samara = new TicketsApp(2, 5800, "KUF", "MOW", 120);
        TicketsApp volgograd = new TicketsApp(3, 5400, "UG", "UTD", 130);
        TicketsApp novosibirsk = new TicketsApp(4, 5400, "NVS", "UTD", 150);
        TicketsApp moscow2 = new TicketsApp(5, 5600, "MOW", "LED", 90);
        TicketsApp samara2 = new TicketsApp(6, 5500, "KUF", "MOW", 120);
        TicketsApp moscow3 = new TicketsApp(7, 4300, "MOW", "LED", 90);

        managerTicket.ticketsRepository.save(moscow);
        managerTicket.ticketsRepository.save(samara);
        managerTicket.ticketsRepository.save(volgograd);
        managerTicket.ticketsRepository.save(novosibirsk);
        managerTicket.ticketsRepository.save(moscow2);
        managerTicket.ticketsRepository.save(samara2);
        managerTicket.ticketsRepository.save(moscow3);

        TicketsApp[] actual = managerTicket.searchByItemFromTo("MOW", "LED");
        TicketsApp[] expected = new TicketsApp[] {moscow3, moscow, moscow2};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldSearchByFromToIfNotTickets() {
        ManagerTicket managerTicket = new ManagerTicket();
        TicketsApp moscow = new TicketsApp(1, 4500, "MOW", "LED", 90);
        TicketsApp samara = new TicketsApp(2, 5800, "KUF", "MOW", 120);
        TicketsApp volgograd = new TicketsApp(3, 5400, "UG", "UTD", 130);
        TicketsApp novosibirsk = new TicketsApp(4, 5400, "NVS", "UTD", 150);
        TicketsApp moscow2 = new TicketsApp(5, 5600, "MOW", "LED", 90);
        TicketsApp samara2 = new TicketsApp(6, 5500, "KUF", "MOW", 120);
        TicketsApp moscow3 = new TicketsApp(7, 4300, "MOW", "LED", 90);


        managerTicket.ticketsRepository.save(moscow);
        managerTicket.ticketsRepository.save(samara);
        managerTicket.ticketsRepository.save(volgograd);
        managerTicket.ticketsRepository.save(novosibirsk);
        managerTicket.ticketsRepository.save(moscow2);
        managerTicket.ticketsRepository.save(samara2);
        managerTicket.ticketsRepository.save(moscow3);

        TicketsApp[] actual = managerTicket.searchByItemFromTo("MOW", "UTD");
        TicketsApp[] expected = new TicketsApp[] {};
        assertArrayEquals(actual, expected);

    }

    @Test
    public void shouldSearchByFromToIfOneTickets() {
        ManagerTicket managerTicket = new ManagerTicket();
        TicketsApp moscow = new TicketsApp(1, 4500, "MOW", "LED", 90);
        TicketsApp samara = new TicketsApp(2, 5800, "KUF", "MOW", 120);
        TicketsApp volgograd = new TicketsApp(3, 5400, "UG", "UTD", 130);
        TicketsApp novosibirsk = new TicketsApp(4, 5400, "NVS", "UTD", 150);
        TicketsApp moscow2 = new TicketsApp(5, 5600, "MOW", "LED", 90);
        TicketsApp samara2 = new TicketsApp(6, 5500, "KUF", "MOW", 120);
        TicketsApp moscow3 = new TicketsApp(7, 4300, "MOW", "LED", 90);


        managerTicket.ticketsRepository.save(moscow);
        managerTicket.ticketsRepository.save(samara);
        managerTicket.ticketsRepository.save(volgograd);
        managerTicket.ticketsRepository.save(novosibirsk);
        managerTicket.ticketsRepository.save(moscow2);
        managerTicket.ticketsRepository.save(samara2);
        managerTicket.ticketsRepository.save(moscow3);

        TicketsApp[] actual = managerTicket.searchByItemFromTo("NVS", "UTD");
        TicketsApp[] expected = new TicketsApp[] {novosibirsk};
        assertArrayEquals(actual, expected);

    }


}