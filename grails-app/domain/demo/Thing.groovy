package demo

class Thing {
    static int totalItems = 0
    static int incItems = 0

    String name

    def setName(String name) {
        this.name = name

        totalItems += 1
        if (name.startsWith('inc')) {
            incItems += 1
        }
    }
}
