package Lesson4;

import java.util.List;
import java.util.Scanner;
import java.io.*;

// Azam
//05/11
//Main function of reading and writing club members
public class Main {
    public static void main(String[] args) {

        Member mem=new Member();
        FileHandling fileHandling = new FileHandling();
        List<Member> members = fileHandling.readFile();

        double maxDistance = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        mem.setName(input.next());
        System.out.println("Enter Surname:");
        mem.setSurname(input.next());
        System.out.println("Enter Miles:");
        mem.setMiles(input.nextDouble());


        // Save member to file
        fileHandling.writeFile(mem);
        members.add(mem);


        // Load and display members from file
        Member maxDistanceMember = null;
        for (Member member : members) {


            if (member.getMiles()>maxDistance) {
                maxDistance = member.getMiles();
                maxDistanceMember = member;
            }
        }


        System.out.println("Member who walked the maximum distance:");
        System.out.println("Name: " + maxDistanceMember.getName());
        System.out.println("Surname: " + maxDistanceMember.getSurname());
        System.out.println("Miles: " + maxDistanceMember.getMiles());

        fileHandling.writeWinners(members, maxDistance);
        fileHandling.readFile();






    }
}