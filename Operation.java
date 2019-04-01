package arhiv;

public enum Operation {
    CREATE/*("0 - упаковать файлы в архив")*/,
    ADD/*("1 - добавить файл в архив")*/,
    REMOVE/*("2 - удалить файл из архива")*/,
    EXTRACT/*("3 - распаковать архив")*/,
    CONTENT/*("4 - просмотреть содержимое архива")*/,
    EXIT/*("5 - выход")*/;

    /*private final String name;

    Operation(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }*/
}
