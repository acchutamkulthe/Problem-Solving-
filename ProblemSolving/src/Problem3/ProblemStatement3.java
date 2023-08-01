package Problem3;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

/*Given a list of tasks with deadlines and total profit earned on completing a task, find the maximum profit earned by executing the tasks within the specified deadlines. Assume that each task takes one unit of time to complete, and a task can’t execute beyond its deadline. Also, only a single task will be executed at a time.

        For example, consider the following set of tasks with a deadline and the profit associated with it. If we choose tasks 1, 3, 4, 5, 6, 7, 8, and 9, we can achieve a maximum profit of 109. Note that task 2 and task 10 are left out.
        Tasks	Deadlines	Profit
        1	9	15
        2	2	2
        3	5	18
        4	7	1
        5	4	25
        6	2	20
        7	5	8
        8	7	10
        9	4	12
        10	3	5*/
public class ProblemStatement3 {
    public static int maxProfit(List<Task>tasks){
        //sort descendingly according to profit
        Collections.sort(tasks);

       //to get the maximum days available to complete tasks
        int maxDeadLine= tasks.stream().collect(Collectors.maxBy(Comparator.comparingInt(Task::getDeadLine))).get().getDeadLine();
        int profit=0;

        int taskList[]=new int[maxDeadLine+1];

        for (Task task : tasks) {

                   if(task.getDeadLine()<=maxDeadLine && taskList[task.getDeadLine()]==0){
                       taskList[task.getDeadLine()]=task.getProfit();
                   }
                   else {
                       int i =task.getDeadLine();
                       while(i>0 && taskList[i]!=0){
                           i--;
                       }
                       if(i>0)
                           taskList[i]=task.getProfit();
                   }
        }

        for (int i = 1; i < taskList.length; i++) {
           profit+=taskList[i];
        }
        return profit;
    }
    public static void main(String[] args) {
        List<Task> tasks=Arrays.asList(new Task(1,	9	,15),
                new Task(2	,2	,2),
                new Task(3	,5	,18),
                new Task(4	,7	,1),
                new Task(5	,4	,25),
                new Task(6	,2	,20),
                new Task(7	,5	,8),
                new Task(8	,7	,10),
                new Task(9	,4	,12),
                new Task(10	,3	,5));

        System.out.println(maxProfit(tasks));
    }
}
