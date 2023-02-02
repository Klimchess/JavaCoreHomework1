public class Car {
   private String brand;
   private String model;
   private double engineVolume;
   private String color;
   private int year;
   private String country;
   public Car (String brand, String model, double engineVolume, String color, int year, String country){
        this.brand = (brand == null || brand.equals("") ? "default" : brand);
        this.model = (model == null || model.equals("") ? "default" : model);
        this.engineVolume = (engineVolume <= 0 ? 1.5 : engineVolume);
        this.color = (color == null || color.equals("") ? "белый" : color);
        this.year = (year <= 0 ? 2000 : year);
        this.country = (country == null || country.equals("") ? "default" : country);
    }
    public Car() {
       this.brand = "default";
       this.model = "default";
       this.engineVolume = 1.5;
       this.color = "белый";
       this.country = "default";
    }
   public String toString(){
       return  "\n" + brand + model + ", " + engineVolume + " объем двигателя," + " " + color + " цвет, " + year + " года выпуска, " + country + " страна производитель";
   }
}
