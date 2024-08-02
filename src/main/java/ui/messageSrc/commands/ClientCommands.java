package ui.messageSrc.commands;

import lombok.Getter;

@Getter
public enum ClientCommands implements Commandable {

    VIEW_ORDERS("Просмотр моих заказов"),
    VIEW_USER_CARS("Мои автомобили"),
    ADD_USER_CAR("Добавить автомобиль"),
    GO_TO_SHOWROOM("Услуги автосалона");

    private final String command;
    ClientCommands(String command) {
        this.command = command;
    }


    @Getter
    enum CommandsInShowRoom {

        VIEW_ALL_CARS("Автомобили в продаже"),
        CREATE_PURCHASE_ORDER("Купить авто"),
        CREATE_SERVICE_ORDER("Обслужить авто"),
        SEARCH_CAR("Поиск автомобиля"),
        BACK("Назад");

        private final String command;
        CommandsInShowRoom(String command) {
            this.command = command;
        }
    }
}
