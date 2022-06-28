jQuery(document).ready(function($) {

    /*
    My postJson function
     */
    /*
    $.postJSON = function(url, data, callback) {
        return jQuery.ajax({
            'type': 'POST',
            'url': url,
            'contentType': 'application/json',
            'data': JSON.stringify(data),
            'dataType': 'json',
            'success': callback
        });
    };

    $('#submitForm').click(function(){
       addIngredient(name,price,stock)
        alert("Send product")
    });

    /*
    Obtain values of form add ingredient
     */
    /*
    let name = $("#productName").val()
    let price = $("#productPrice").val()
    let stock = $("#productStock").val()
    let urlBase = "http://localhost:8080/sanguchetto/admin/product/ingredients";

    function addIngredient(name, price, stock){
        let urlBase = "http://localhost:8080/sanguchetto/admin/product/ingredients";
        let ingredient = {
            "name": name,
            "price": price,
            "stock": stock
        }
        $.postJSON(urlBase, ingredient, showAlert())
    }

    function showAlert(){
        alert("Paso")
    }

     */

});