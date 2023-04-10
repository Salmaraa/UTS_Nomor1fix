public class item {
    //Atribut
    static item[] items = new item[0];
    int harga;
    String nama;
    String rank;
    int quantity;

    //Constructor
    public item(int harga, String nama, String rank, int quantity) {
        this.harga = harga;
        this.nama = nama;
        this.rank = rank;
        this.quantity = quantity;
        addItem(this);
    }

    //Method
    public static void addItem(item newItem) {
        item[] newItems = new item[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            newItems[i] = items[i];
        }
        newItems[items.length] = newItem;
        items = newItems;
    }

    public static void seeAllItem() {
        int totalHarga = 0;
        for (item i : items) {
            totalHarga += i.harga * i.quantity;
        }
        System.out.println("Your Item backpack worth: " + totalHarga + " with item as listed below:");
        quantityToString("S", "potion", 1000);
        quantityToString("A", "Sword", 5000);
        quantityToString("A", "Armor", 10000);
    }

    private static int quantityToString(String rank, String nama, int harga) {
        int count = 0;
        for (item i : items) {
            if (i.rank.equals(rank) && i.nama.equals(nama)) {
                count += i.quantity;
            }
        }
        System.out.println(count + " " + rank + " " + nama + " worth: " + count * harga);
        return count;
    }
}

