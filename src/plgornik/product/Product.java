package plgornik.product;

public class Product {

    String name;
    private String category;
    private double price;
    private double sizePack;
    private String unit;

    public Product(String name, String category, double price, double sizePack, String unit) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.sizePack = sizePack;
        this.unit = unit;
    }

    @Override
    public String toString() {
        return "plgornik.product.Product{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", price=" + price +
                ", sizePack=" + sizePack +
                ", unit='" + unit + '\'' +
                '}';
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getSizePack() {
        return sizePack;
    }

    public String getUnit() {
        return unit;
    }

    public double pricePerUnit() {
        double unitPrice;
        switch (unit) {
            case "kg", "l" -> {
                unitPrice = price / sizePack;
            }
            case "ml", "g" -> {
                unitPrice = price * 1000 / sizePack;
            }
            case "dag" -> {
                unitPrice = price * 100 / sizePack;
            }
            default -> {
                unitPrice = price/sizePack;
            }
        }
        return unitPrice;
    }
    
    public String changeUnitText(){
        String unitProt = null;
        switch (unit) {
            case "ml", "l" -> {
                unitProt = "litr";
            }
            case "g", "kg" -> {
                unitProt = "kilogram";
            }
            default -> {
                unitProt = "sztukę";
            }
        }
        return unitProt;
    }
    
    public void displayPrice(){
        System.out.println(name + "\n" + "Cena produktu wynosi: " + price + " zł za " + sizePack + " " + unit);
        System.out.printf("Cena jednostkowa produktu wynosi: %.2f zł za jeden %s",pricePerUnit(), changeUnitText());
        System.out.println(" ");
        System.out.println("<--->");
    }
}
