package votes;

import java.util.*;

public class  NewTest {
     public static void main(String[] args) {
        Voter voter1 = new Voter();
        voter1.name = "vijay";
        voter1.aadharNo = "1234";
        voter1.status = "yes";

        Voter voter2 = new Voter();
        voter2.name = "Naveen";
        voter2.aadharNo = "0987";
        voter2.status = "yes";

        Voter voter3 = new Voter();
        voter3.name = "Sai";
        voter3.aadharNo = "3454";
        voter3.status = "yes";

        Voter voter4 = new Voter();
        voter4.name = "Reddy";
        voter4.aadharNo = "5676";
        voter4.status = "yes";

        Voter voter5 = new Voter();
        voter5.name = "venkat";
        voter5.aadharNo = "2224";
        voter5.status = "No";

        List<Voter> voterList = new ArrayList<>();
        voterList.add(voter1);
        voterList.add(voter2);
        voterList.add(voter3);
        voterList.add(voter4);
        voterList.add(voter5);
        voterList.add(voter1);
        voterList.add(voter4);


        Iterator<Voter> iterator = voterList.iterator();

        List<String> seenAadharNo = new ArrayList<>();
           for (; iterator.hasNext(); ) {
            Voter voter = iterator.next();
             if (!seenAadharNo.contains(voter.aadharNo)) {
                seenAadharNo.add(voter.aadharNo);
                 if (voter.status.equals("Yes")) {
                    System.out.println(voter.name + " has casted his vote.");
                    } else {
                     System.out.println(voter.name + " has not casted his vote.");
                      }
                       } else {
                          System.out.println(voter.name + "is already in list .This is duplicate.");
                }
            }
       }
    }


