package pkg1;

public class ShopKeeper {

    private MobileShop iphone = new Iphone();
    private MobileShop samsung = new Samsung();

    public void iphoneSale() {
        iphone.modelNo();
        iphone.price();
    }

    public void samsungSale() {
        samsung.modelNo();
        samsung.price();
    }

}
