package Module2.Generics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Daniel Solo on 09.06.2016.
 */
public class ExecutorImpl<T> implements Executor<T> {

    List<Task<? extends T>> allTasks=new ArrayList<>();
    List<T> validTasks = new ArrayList<>();
    List<T> inValidTasks = new ArrayList<>();

    @Override
    public void addTask(Task<? extends T> task) throws Exception {
        allTasks.add(task);
    }

    @Override
    public void addTask(Task<? extends T> task, Validator<? super T> validator) throws Exception {
        if (validator.isValid(task.getResult())){
            validTasks.add(task.getResult());
        }else {
            inValidTasks.add(task.getResult());
        }
    }

    @Override
    public void execute() throws Exception {
        for (Task<? extends T> task : allTasks){
            addTask(task, new DataValidator<T>());
        }

    }

    @Override
    public List<T> getInvalidResults() throws Exception {
        return null;
    }

    @Override
    public List<T> getValidResults() throws Exception {
        return null;
    }
}
