public class Main {

    public static void main(String[] args) {

        double price = 980; // 商品の値段
        final double taxRate = 1.1; // 消費税率 10%

        double inTaxPrice = calcInTax(price, taxRate);

        printAllPrice(price, inTaxPrice);

    }

    public static double calcInTax(double price, double taxRate) {
        // TODO 自動生成されたメソッド・スタブ
        return price * taxRate;
    }

    public static void printAllPrice(double price, double inTaxPrice) {
        System.out.println("税抜き価格は " + price + "円です。");
        System.out.println("税込み価格は " + inTaxPrice + "円です。");
    }

}