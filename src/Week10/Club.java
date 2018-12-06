package Week10;

import java.util.ArrayList;

public class Club {
    private ArrayList <Member> members;

    public Club () {
        this.members = new ArrayList <> ();
    }

    public void addMember (Member newMember) {
        members.add (newMember);
    }

    public void printMembers () {
        System.out.println("Current members\n");
        for (Member m: members) {
            System.out.println (m);
        }
    }

    public int calculateTotal () {
        int total = 0;
        for (Member member: members) {
            total += member.getContribution();
        }
        return total;
    }

    public int calculateTurkeys (int total, int price) {
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
        System.out.println("\nTotal Contributions: £" + total);
        System.out.println("Turkeys Required: " + christmasClub.calculateTurkeys(total, turkeyPrice));

    }
}
