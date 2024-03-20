package shopping;

import java.util.ArrayList;
import java.util.List;

public class ProductLoader {

    public static List<ProductFactory> loadProducts() {
        List<ProductFactory> products = new ArrayList<>();
        
        Appliances refrigerators = new Appliances("Refrigerators", 1499.99, "whirlpool", 10);
        Appliances dishwasher = new Appliances("Dishwashers", 1199.99, "Bosch", 15 );
        Appliances washingmachine  = new Appliances("Washing Machine", 1699.99, "Top Load Washers", 12);
        Appliances Microwave = new Appliances("Microwave", 799.99, "Counter Top Microwave", 17);
        
        Cosmetics Eyelashconditioner = new Cosmetics("Eyelashconditioner", 99.9, "RevitaLash", 10);
        Cosmetics Concealer = new Cosmetics("Concealer", 10, "Itcosmetics", 18);
        
        

        HomeGoods sofa = new HomeGoods("Sofa", 999.99, "Living Room Sofa", 10);
        HomeGoods bed = new HomeGoods("Bed", 3999.99, "Queen Size Beds", 12);
        HomeGoods desk = new HomeGoods("Desk", 219.99, "Home Office Desk", 25);
        HomeGoods curtain = new HomeGoods("Curtain", 79.99, "Blackout Curtains", 25);
        HomeGoods pillow = new HomeGoods("Pillow", 59.99, "Bed Pillow", 60);
        HomeGoods comfortor = new HomeGoods("Comforter", 69.99, "Casual shirt", 30);
        
        Kitchen utensil = new Kitchen("Utensil", 29.99, "Prestige", 10);
        Kitchen pan = new Kitchen("Saucepan", 39.99, "Stainless steel", 20);
        Kitchen glassbakingdish = new Kitchen("Glass Baking Dish", 149.99, "Microwave", 15);
        Kitchen peeler = new Kitchen("Peeler", 29.99, "Vegetable Peeler", 6);
        
        Perfume Women = new Perfume("Women", 119.99, "Elizabith Tailor", 20);
        Perfume Men = new Perfume("Men", 129.99, "Gucci", 30);
        Perfume Oil = new Perfume("Oil", 169.99, "Skylar", 10);
        
        Purse Handbag = new Purse("Handbag", 199.99, "MontanaWest", 23);
        Purse Wallet = new Purse("Wallet", 69.99, "Tommy Hilfiger", 13);
        Purse Crossbodyhandpurse = new Purse("Crossbodyhandpurse", 79.99, "Travelon", 10);
        
        
        products.add(refrigerators);
        products.add(dishwasher);
        products.add(washingmachine);
        products.add(Microwave);
        products.add(Eyelashconditioner);
        products.add(Concealer);
        products.add(glassbakingdish);
        products.add(pan);
        products.add(utensil);
        products.add(peeler);
        products.add(sofa);
        products.add(bed);
        products.add(desk);
        products.add(curtain);
        products.add(pillow);
        products.add(comfortor);
        products.add(Women);
        products.add(Men);
        products.add(Oil);
        products.add(Handbag);
        products.add(Wallet);
        products.add(Crossbodyhandpurse);
     
        return products;
    }
}
