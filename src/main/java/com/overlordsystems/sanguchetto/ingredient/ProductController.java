package com.overlordsystems.sanguchetto.ingredient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/sanguchetto/admin/product")
    public String goToProduct(Model model) {
        List<Product> allProducts = productService.getAllProducts();
        model.addAttribute("products", allProducts);
        ProductKeyword productKeyword = new ProductKeyword();
        model.addAttribute("productName", productKeyword);
        return "/admin/productView";
    }

    @GetMapping("/sanguchetto/admin/product/add")
    public String goToAddProduct(Model model) {
        Product emptyProduct = new Product(productService.productsSize()+1);
        model.addAttribute("product", emptyProduct);
        return "/admin/addProductView";
    }

    @PostMapping("/sanguchetto/admin/product/search")
    public String getProductsByName(@ModelAttribute ProductKeyword productName, Model model){
        List<Product> products = productService.getProductsByName(productName);
        model.addAttribute("products", products);
        model.addAttribute("productName", productName);
        return "/admin/productView";
    }

    @PostMapping(value = "/sanguchetto/admin/product/add")
    public String addProduct(@ModelAttribute Product newProduct){
        productService.addProduct(newProduct);
        return "redirect:/sanguchetto/admin/product";
    }

    @GetMapping("/sanguchetto/admin/product/edit/{id}")
    public String goToEditProduct(@PathVariable int id, Model model){
        Product editProduct = productService.getProductById(id);
        model.addAttribute("product", editProduct);
        return "/admin/editProductView";
    }

    @PutMapping(value = "/sanguchetto/admin/product/edit")
    public String updateProduct(@ModelAttribute Product updateProduct){
        productService.updateProduct(updateProduct);
        return "redirect:/sanguchetto/admin/product";
    }

    @DeleteMapping(value = "/sanguchetto/admin/product/delete/{id}")
    public String deleteProduct(@PathVariable int id){
        productService.deleteProduct(id);
        return "redirect:/sanguchetto/admin/product";
    }
}
