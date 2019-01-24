package Week12;

public class Job implements Comparable <Job>{
    private String description;
    private int priority;
    private boolean complete;

    public int getPriority() {
        return priority;
    }

    public Job(String description, int priority, boolean complete) {
        this.description = description;
        this.priority = priority;
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {

        this.complete = complete;
    }

    public void printJob(){
        System.out.println("Job description: " + this.description);
        System.out.println("Priority: " + this.priority);
        if (this.complete){
            System.out.println("Job complete\n");
        }
        else{
            System.out.println("Job not complete\n");
        }
    }

    @Override
    public int compareTo (Job job) {
        if (job.getPriority() > this.priority) {
            return 1;
        }
        else if(job.getPriority() == this.priority){
            return 0;
        }
        else{
            return -1;
        }
    }
}
