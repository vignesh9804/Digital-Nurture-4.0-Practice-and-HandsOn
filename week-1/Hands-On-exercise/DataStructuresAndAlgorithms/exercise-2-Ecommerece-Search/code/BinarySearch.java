
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

class SearchProduct{
     boolean searchFun(Products a[],int targetValue, int n){
        int low = 0;
        int high = n - 1;
        int mid;

        while(high>=low){
            mid = (low+high)/2;
            if(a[mid].productId==targetValue){
                return true;
            }
            else if (a[mid].productId < targetValue){
                low = mid + 1;
            }
            else{
                high = mid - 1;
            }
        }
        return false;
    }
}

public class BinarySearch {

    public static void main(String[] args) {
        Products[] productsList = new Products[5];
        productsList[0] = new Products(1, "Light", "ele");
        productsList[1] = new Products(2, "Fan", "ele");
        productsList[2] = new Products(3, "TV", "ele");
        productsList[3] = new Products(4, "Carrot", "veg");
        productsList[4] = new Products(5, "Buds", "ele");

        SearchProduct searchItem = new SearchProduct();

        boolean ans = searchItem.searchFun(productsList,7,5);

        if(ans){
            System.out.println("Found");
        }
        else{
            System.out.println("Not Found");
        }

    }
}
