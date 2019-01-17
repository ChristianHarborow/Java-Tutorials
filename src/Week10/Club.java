package Week10;

import java.util.ArrayList;

public class Club {
    private ArrayList <Member> members;

    public Club () {
        this.members = new ArrayList <> ();
    }

    public void addMember (Member newMember) {
        //adds members to the club array list
        members.add (newMember);
    }

    public void printMembers () {
        /*prints out all members in the club
        along with their contributions*/
        System.out.println("Current members:");
        for (Member m: members) {
            System.out.println (m);
        }
    }

    public int calculateTotal () {
        //returns the sum of all the members contributions
        int total = 0;
        for (Member m: members) {
            total += m.getContribution();
        }
        return total;
    }

    public int calculateTurkeys (int total, int price) {
        // returns the number of turkeys that can be bought
        return total / price;
    }

    public static void main (String[] args) {
        Club christmasClub = new Club();
        int turkeyPrice = 20;

        christmasClub.addMember(new Member("Gary", 27));
        christmasClub.addMember(new Member("Tony", 21));
        christmasClub.addMember(new Member("Rubiya", 20));
        christmasClub.addMember(new Member("Steve", 28));

        christmasClub.printMembers();
        int total = christmasClub.calculateTotal();
        int turkeys = christmasClub.calculateTurkeys(total, turkeyPrice);
        System.out.println("\nTotal Contributions: £" + total);
        System.out.println("Turkeys Required: " + turkeys);
    }
}