class Products {
    int productId;
    String productName;
    String category;
    

    Products(int productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    void display(){
        System.out.println("Search Product is: "+productName);
    }
}

public class LinearSearchEx {
    public static void main(String[] args) {

        Products[] productsList = new Products[3];

        productsList[0] = new Products(1,"Fan","electronics");
        productsList[1] = new Products(2,"Carrot","Vegetable");
        productsList[2] = new Products(3,"Buds","electronics");

        int searchProduct = 2;
        boolean productFound = true;

        for(int i = 0; i<productsList.length ;i++){
            if (searchProduct == productsList[i].productId){
                productFound = false;
                productsList[i].display();
            }
        }
        if(productFound){
            System.out.println("Product Not Found");
        }
    }
}

