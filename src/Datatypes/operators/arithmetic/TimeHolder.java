package Datatypes.operators.arithmetic;
    public class TimeHolder {
        public static void main (String[] args) {
            TimeHolder time = new
            TimeHolder(31600000);
            System.out.println(time.toString());
        }
    public static final int hours_in_a_day = 24;
    public static final int minutes_in_an_hour = 60;
    public static final int seconds_in_a_minute = 60;

    private final long days;
    private final long hours;
    private final long minutes;
    private final long seconds;
    private final long totalSeconds;

    public TimeHolder(long totalSeconds) {
        this.totalSeconds = totalSeconds;
        this.days = getDays(totalSeconds);
        this.hours = getHours(totalSeconds);
        this.minutes = getMinutes(totalSeconds);
        this.seconds = getSeconds(totalSeconds);
    }

    private long getDays(long seconds) {
        return seconds / (hours_in_a_day * minutes_in_an_hour * seconds_in_a_minute);
    }

    private long getHours(long seconds) {
        return (seconds % (hours_in_a_day * minutes_in_an_hour * seconds_in_a_minute)) / (minutes_in_an_hour * seconds_in_a_minute);
    }

    private long getMinutes(long seconds) {
        return (seconds % (hours_in_a_day * minutes_in_an_hour * seconds_in_a_minute)) % (minutes_in_an_hour * seconds_in_a_minute) / seconds_in_a_minute;
    }

    private long getSeconds(long seconds) {
        return (seconds % (hours_in_a_day * minutes_in_an_hour * seconds_in_a_minute)) % (minutes_in_an_hour * seconds_in_a_minute) % seconds_in_a_minute;
    }

    @Override
    public String toString() {
        return "TimeHolder{" +
                "days=" + days +
                ", hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds +
                ", totalSeconds=" + totalSeconds +
                '}';
    }
}
