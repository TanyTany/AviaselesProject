package ru.netology.Repository;

import ru.netology.domain.TicketsApp;

public class TicketsRepository {

    private TicketsApp[] items = new TicketsApp[0];

    public void save(TicketsApp item) {
        int lenght = items.length + 1;
        TicketsApp[] tmp = new TicketsApp[lenght];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public TicketsApp[] findAll() {
        return items;
    }

    public TicketsApp findById(int id) {
        for (TicketsApp item : items) {
            if (item.getId() == id) {
                return item;
            }
        }
        return null;
    }


    public void removeById(int id) throws NotFoundException {
        if (findById(id) == null) {
            throw new NotFoundException("Element with id: " + id + " not found");
        } else {

            int length = items.length - 1;
            TicketsApp[] tmp = new TicketsApp[length];
            int index = 0;
            for (TicketsApp item : items) {
                if (item.getId() != id) {
                    tmp[index] = item;
                    index++;
                }
            }
            items = tmp;
        }
    }
}


