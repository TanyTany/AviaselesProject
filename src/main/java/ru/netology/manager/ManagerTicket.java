package ru.netology.manager;

import ru.netology.Repository.TicketsRepository;
import ru.netology.domain.TicketsApp;

import java.util.Arrays;

public class ManagerTicket {
    TicketsRepository ticketsRepository = new TicketsRepository();

    public void add(TicketsApp item) {
        ticketsRepository.save(item);
    }

    public TicketsApp[] searchByItemFromTo(String from, String to) {
        TicketsApp[] result = new TicketsApp[0];
        for (TicketsApp ticket : ticketsRepository.findAll()) {
            if (matches(ticket, from) && matches(ticket,to)) {
                TicketsApp[] tmp = new TicketsApp[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
                Arrays.sort(result);
            }
        }
        return result;
    }

    public boolean matches(TicketsApp ticket, String search) {

        if (ticket.getFrom().equalsIgnoreCase(search)) {
            return true;
        } else if (ticket.getTo().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }
}


