package Problem3;

public class Task implements Comparable{

    int taskNumber;
    int deadLine;
    int profit;

    public Task() {
    }

    public Task(int taskNumber, int deadLine, int profit) {
        this.taskNumber = taskNumber;
        this.deadLine = deadLine;
        this.profit = profit;
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskNumber=" + taskNumber +
                ", deadLine=" + deadLine +
                ", profit=" + profit +
                '}';
    }

    public int getTaskNumber() {
        return taskNumber;
    }

    public void setTaskNumber(int taskNumber) {
        this.taskNumber = taskNumber;
    }

    public int getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(int deadLine) {
        this.deadLine = deadLine;
    }

    public int getProfit() {
        return profit;
    }

    public void setProfit(int profit) {
        this.profit = profit;
    }

    @Override
    public int compareTo(Object o) {
        if(this.profit > ((Task)o).profit){
            return -1;
        }
        else if (this.profit<((Task)o).profit)
            return 1;
        else
            return 0;
    }
}
