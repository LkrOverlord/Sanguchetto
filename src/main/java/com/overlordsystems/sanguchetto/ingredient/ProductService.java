package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

/*
Mediante la anotación service indicamos que esta clase va ser un singleton y por lo tanto cuando se crea la
instancia, el objeto se mantiene vivo hasta que se cierra la aplicación y es por esa razón que es un
service y siempre esta disponible. Además es por esta razón que el lista de ingredientes solo lo creamos una
vez ya que sino fuera singleton tengo que crear la lista cada que vez que quiero usar el IngredientService y no
es muy conveniente.
 */
@Service
public class ProductService {

    /*
    Se agrega new ArrayList para que pueda ser una mutable, anteriormente era una lista y por lo tanto
    no era mutable, es decir no se podia agregar o eliminar elementos.
     */
    /*
    Dejamos esto porque no sabemos si funciona bien
    private List<Ingredient> ingredients = new ArrayList<>(Arrays.asList(
            new Ingredient(1,"Tomate", 2.5, 25),
            new Ingredient(2,"Papa", 1.5, 25),
            new Ingredient(3,"Lechuga", 0.5, 25)
    ));

     */

    private Map<Integer, Product> productsMaped = new HashMap<>(
            Map.of( 1, new Product(1,"Tomate",23,45, TypeOfProduct.INGREDIENT),
                    2, new Product(2,"Papas fritas",23,45, TypeOfProduct.INGREDIENT),
                    3, new Product(3,"Lechuga",23,45, TypeOfProduct.INGREDIENT)
            )
    );

    public int productsSize(){
        return this.productsMaped.size();
    }

    public List<Product> getAllProducts() {
        List<Product> products = new ArrayList<>(productsMaped.values());
        return products;
    }

    public void addProduct(Product newProduct) {
        productsMaped.put(newProduct.getId(), newProduct);
    }

    public List<Product> getProductsByName(ProductKeyword nameProduct) {
        List<Product> wantedProducts =productsMaped.values().stream()
                .filter(product -> product
                        .getName().toLowerCase(Locale.ROOT)
                        .contains(nameProduct.getName().toLowerCase(Locale.ROOT))
                )
                .collect(Collectors.toList());
        return wantedProducts;
    }

    public Product getProductById(int idProduct) {
        return this.productsMaped.get(idProduct);
    }

    public Product getIngredientByName(String name){
        Product wantedProduct= productsMaped.values().stream()
                .filter(product -> product
                        .getName().toLowerCase(Locale.ROOT)
                        .contains(name.toLowerCase(Locale.ROOT)))
                .findFirst()
                .get();
        return wantedProduct;
    }

    public void updateProduct(Product updateProduct){
        this.productsMaped.put(updateProduct.getId(), updateProduct);
    }

    public void deleteProduct(int id) {
        this.productsMaped.remove(id);
    }
}
