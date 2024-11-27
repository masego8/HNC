package Lesson4;

import java.io.*;
import java.util.*;

public class FileHandling {
    Member maxDistanceMember = null;

    // Method to add member to clubread file
    public void writeFile(Member member) {
        try (FileWriter file = new FileWriter("clubread.txt",true)) {
            String data ="\n" + member.getName() + "," + member.getSurname() + "," + member.getMiles();
            file.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // method to print winners in new text file
    public void writeWinners(List<Member> members, double maxDistance) {
        double prizeDistance = maxDistance * 0.7;

        try (FileWriter file = new FileWriter("winners.txt")) {
            file.write("Winners: \n");
            for (Member member : members) {
                if (member.getMiles() > prizeDistance) {
                    String winner = member.getName() + " " + member.getSurname() + "\n";
                    file.write(winner);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    // Method to read members from clubread file
    public List<Member> readFile() {
        List<Member> members = new ArrayList<>();

        try (Scanner fread = new Scanner(new FileReader("clubread.txt"))) {
            String line;

            while (fread.hasNextLine()) {
                line = fread.nextLine().trim();
                String[] items = line.split(",");

                Member member = new Member();
                member.setName(items[0]);
                member.setSurname(items[1]);
                member.setMiles(Double.parseDouble(items[2]));

                members.add(member);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        return members;


    }
}
