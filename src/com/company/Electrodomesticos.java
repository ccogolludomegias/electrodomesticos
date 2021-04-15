package com.company;

public class Electrodomesticos {
    private double Precio_base;
    private String Color;
    private String Consumo_energetico;
    private double Peso;
    public Electrodomesticos(){

    }

    public Electrodomesticos(double Precio_base,String Color, String Consumo_energetico, double Peso){
        Precio_base = this.getPrecio_base();
        Color = this.getColor();
        Consumo_energetico = this.getConsumo_energetico();
        Peso = this.getPeso();
    }

    public double getPrecio_base() {
        return Precio_base;
    }

    public void setPrecio_base(double precio_base) {
        Precio_base = precio_base;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public String getConsumo_energetico() {
        return Consumo_energetico;
    }

    public void setConsumo_energetico(String consumo_energetico) {
        Consumo_energetico = consumo_energetico;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double peso) {
        Peso = peso;
    }

    public void defaults(){
         this.setColor("blanco");
         this.setConsumo_energetico("F");
         this.setPrecio_base(100);
         this.setPeso(5);
    }
}
