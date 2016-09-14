package brain.parsingtest3;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by Саня on 14.09.2016.
 */
public class Course {
    public enum kind {buy,sell};
    private BigDecimal price;
    public enum trend {up,dosn,non};
    private boolean best;
    private Date date;
    private Bank nameBank;

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setBest(boolean best) {
        this.best = best;
    }

    public boolean isBest() {
        return best;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setNameBank(Bank nameBank) {
        this.nameBank = nameBank;
    }

    public Bank getNameBank() {
        return nameBank;
    }

}
