package Week12;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Diary {
    private ArrayList<Job> jobs;

    public Diary() {
        this.jobs = new ArrayList<>();
    }

    public void addJob(Job job){
        this.jobs.add(job);
    }

    public void printJobs(){
        System.out.println("All Jobs\n");
        for (Job job:this.jobs){
            job.printJob();
        }
        System.out.println("=================================");
    }

    public void filter(String filterString){
        System.out.println("All " + filterString + " Jobs\n");
        for (Job job:this.jobs) {
            if(job.getDescription().contains(filterString)){
                job.printJob();
            }
        }
        System.out.println("=================================");
    }

    public void sortJobs(){
        Collections.sort(this.jobs);
    }

    public void completeJob(Job job){
        job.setComplete(true);
    }

    public void removeCompleteJobs(){
        Iterator <Job> iterator = this.jobs.iterator();
        while(iterator.hasNext()){
            if (iterator.next().isComplete()){
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {
        Diary myDiary = new Diary();

        Job j1 = new Job("Clean Bathroom", 2, false);
        Job j2 = new Job("Complete Programming Assignment", 10, false);
        Job j3 = new Job("Go Shopping", 5, false);
        Job j4 = new Job("Buy Train Ticket", 6, false);
        Job j5 = new Job("Start Hardware Assignment", 8, false);

        myDiary.addJob(j1);
        myDiary.addJob(j2);
        myDiary.addJob(j3);
        myDiary.addJob(j4);
        myDiary.addJob(j5);

        myDiary.printJobs();

        myDiary.filter("Assignment");

        myDiary.sortJobs();
        myDiary.printJobs();

        myDiary.completeJob(j2);
        myDiary.removeCompleteJobs();
        myDiary.printJobs();
    }
}
