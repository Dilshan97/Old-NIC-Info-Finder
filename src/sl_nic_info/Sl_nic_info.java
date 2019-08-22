
package sl_nic_info;

import java.util.Scanner;

public class Sl_nic_info {

    String id;
    int month[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Sl_nic_info() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your NIC Number \nLike : 000000000V");
        id = input.next();
    }
    
    // 972431796V
    // 0123456789
    
    public int getYear() {
        return (1900 + Integer.parseInt(id.substring(0, 2)));
    }

    public int getDays() {
        int d = Integer.parseInt(id.substring(2, 5));
        if (d > 500) {
            return (d - 500);
        } else {
            return d;
        }
    }

    public void setMonth() {
        int mo = 0, da = 0;
        int days = getDays();

        for (int i = 0; i < month.length; i++) {
            if (days < month[i]) {
                mo = i + 1;
                da = days;
                break;
            } else {
                days = days - month[i];
            }
        }
        System.out.println("Month : " + mo + "\nDate : " + da);

    }

    public String getSex() {
        String M = "Male", F = "Female";
        int d = Integer.parseInt(id.substring(2, 5));
        if (d > 500) {
            return F;
        } else {
            return M;
        }
    }

    public static void main(String[] args) {
        Sl_nic_info N = new Sl_nic_info();
        System.out.println("Your Deatials of Date of Birth from NIC Number");
        System.out.println("Year : " + N.getYear());
        N.setMonth();
        System.out.println("Sex : " + N.getSex());
    }
    
}
