package beginnerHomeworks.homework13_2;

public class MonthUtils {

    static final Month january = new Month("January", 31, 17);
    static final Month february = new Month("February", 28, 18);
    static final Month match = new Month("Match", 31, 22);
    static final Month april = new Month("April", 30, 20);
    static final Month may = new Month("May", 31, 20);
    static final Month june = new Month("June", 30, 21);
    static final Month july = new Month("July", 31, 21);
    static final Month august = new Month("August", 31, 23);
    static final Month september = new Month("September", 30, 21);
    static final Month october = new Month("October", 31, 22);
    static final Month november = new Month("November", 30, 21);
    static final Month december = new Month("December", 31, 21);

    public static Month[] getFirstQuarter() {
        return new Month[] {january, february, match};
    }

    public static Month[] getSecondQuarter() {
        return new Month[] {april, may, june};
    }

    public static Month[] getThirdQuarter() {
        return new Month[] {july, august, september};
    }

    public static Month[] getFourthQuarter() {
        return new Month[] {october, november, december};
    }

    public static Month[] getFirstHalfYear() {
        return new Month[] {january, february, match, april, may, june};
    }

    public static Month[] getSecondHalfYear() {
        return new Month[] {july, august, september, october, november, december};
    }

    public static Month[] getYear() {
        return new Month[] {january, february, match, april, may, june, july, august, september, october, november, december};
    }

}


