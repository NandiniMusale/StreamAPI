import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.*;

class Transaction{
    String Date;
    Double amount;
    public Transaction(String date, Double amount) {
        Date = date;
        this.amount = amount;
    }
    public String getDate() {
        return Date;
    }
    public void setDate(String date) {
        Date = date;
    }
    public Double getAmount() {
        return amount;
    }
    public void setAmount(Double amount) {
        this.amount = amount;
    }
    @Override
    public String toString() {
        return "Transaction [Date=" + Date + ", amount=" + amount + "]";
    }
    
}




public class problem21{
    public static void main(String[] args) {

        List<Transaction> t1 =List.of(
            new Transaction("31-08-2002",5000.0),
            new Transaction("31-08-2002",25000.0),
            new Transaction("01-01-2003",7000.0)
        );
        Map<String,Double> s1=t1.stream().collect(Collectors.groupingBy(Transaction::getDate,Collectors.summingDouble(Transaction::getAmount)));
        System.out.println(s1);
        
    }
}
