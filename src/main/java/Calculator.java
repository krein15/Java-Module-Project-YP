public  class Calculator{
    String addedProducts = "Добаленные продукты: ";
    double sum = 0;
    void counting( String addedProduct, double priceOfProduct){
        addedProducts = addedProducts + "\n"+ addedProduct;
        sum += priceOfProduct;
    }
}

