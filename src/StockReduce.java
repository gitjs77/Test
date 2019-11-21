import java.util.ArrayList;
import java.util.List;

/**
 * https://stackoverflow.com/questions/57779002/generate-new-list-with-two-columns-filtered-and-summed-data/57779338#57779338
 * @Author Jack <jackkobec>
 */
public class StockReduce {
    public static void main(String[] args) {

        List<Stock> allStock = new ArrayList<>();
        List<Stock> result = new ArrayList<>();

        allStock.add(new Stock("l1", "CAIXA", 1, 4));
        allStock.add(new Stock("l1", "CABIDE", 1, 0));
        allStock.add(new Stock("l1", "CAIXA", 5, 5));
        allStock.add(new Stock("l1", "CABIDE", 1, 0));

        allStock.add(new Stock("l2", "CAIXA", 1, 4));
        allStock.add(new Stock("l2", "CABIDE", 1, 0));
        allStock.add(new Stock("l2", "CAIXA", 5, 5));
        allStock.add(new Stock("l2", "CABIDE", 1, 1));

        allStock.stream().map(stock -> stock.productType).distinct()
                .forEach(distinctProductType -> {
                    allStock.stream().filter(stock -> stock.productType.equals(distinctProductType))
                            .reduce((stock1, stock2) -> {
                                if (stock1.store.equals(stock2.store)) {
                                    result.add(
                                            new Stock(
                                                    stock1.store,
                                                    stock1.productType,
                                                    stock1.amount_1 + stock2.amount_1,
                                                    stock1.amount_ + stock2.amount_));
                                }

                                return stock2;
                    });

                });

        result.forEach(stock -> System.out.println(
                "store: " + stock.store + "\n"
                + "productType: " + stock.productType + "\n"
                + "amount_1: " + stock.amount_1 + "\n"
                + "amount_: " + stock.amount_ + "\n"
        ));
    }
}

class Stock {
    public String store;
    public String productType;
    public Integer amount_1;
    public Integer amount_;

    public Stock() {
    }

    public Stock(String store, String productType, Integer amount_1, Integer amount_) {
        this.store = store;
        this.productType = productType;
        this.amount_1 = amount_1;
        this.amount_ = amount_;
    }

    @Override
    public String toString() {
        return "Stock{" +
                "store='" + store + '\'' +
                ", productType='" + productType + '\'' +
                ", amount_1=" + amount_1 +
                ", amount_=" + amount_ +
                '}';
    }
}
