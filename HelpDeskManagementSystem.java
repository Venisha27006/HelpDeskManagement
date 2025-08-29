import java.util.*;
class Ticket {
    int ticketId;
    String subject;
    String description;
    String status;

    Ticket(int id, String sub, String desc) {
        this.ticketId = id;
        this.subject = sub;
        this.description = desc;
        this.status = "Pending";
    }

    void updateStatus(String newStatus) {
        this.status = newStatus;
    }

    void displayTicket() {
        System.out.println("Ticket ID : " + ticketId);
        System.out.println("Subject   : " + subject);
        System.out.println("Details   : " + description);
        System.out.println("Status    : " + status);
        System.out.println("----------------------------------");
    }
}
class User {
    int userId;
    String name;
    List<Ticket> myTickets = new ArrayList<>();

    User(int id, String name) {
        this.userId = id;
        this.name = name;
    }
Ticket createTicket(int ticketId, String sub, String desc) {
        Ticket t = new Ticket(ticketId, sub, desc);
        myTickets.add(t);
        System.out.println("Ticket Created Successfully!");
        return t;
    }
void viewTickets() {
        if (myTickets.isEmpty()) {
            System.out.println("No tickets found.");
        }
        for (Ticket t : myTickets) {
            t.displayTicket();
        }
    }
}
class Admin {
    String name;

    Admin(String name) {
        this.name = name;
    }
void updateTicketStatus(Ticket t, String status) {
        t.updateStatus(status);
        System.out.println("Admin updated Ticket " + t.ticketId + " to " + status);
    }
}
public class HelpDeskManagementSystem { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        User user = new User(101, "Venisha");
        Admin admin = new Admin("FacultyAdmin");

        List<Ticket> allTickets = new ArrayList<>();
        int ticketCounter = 1;
        int choice;

        System.out.println("=== HelpDesk Management System ===");

        do {
            System.out.println("\n1. User Menu");
            System.out.println("2. Admin Menu");
            System.out.println("3. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.println("\n--- User Menu ---");
                    System.out.println("1. Create Ticket");
                    System.out.println("2. View My Tickets");
                    int uc = sc.nextInt();
                    sc.nextLine();
                    if (uc == 1) {
                        System.out.print("Enter Subject: ");
                        String sub = sc.nextLine();
                        System.out.print("Enter Description: ");
                        String desc = sc.nextLine();
                        Ticket t = user.createTicket(ticketCounter++, sub, desc);
                        allTickets.add(t);
                    } else if (uc == 2) {
                        user.viewTickets();
                    }
                    break;

                case 2:
                    System.out.println("\n--- Admin Menu ---");
                    if (allTickets.isEmpty()) {
                        System.out.println("No tickets available.");
                    } else {
                        for (Ticket t : allTickets) {
                            t.displayTicket();
                        }
                        System.out.print("Enter Ticket ID to update: ");
                        int tid = sc.nextInt();
                        sc.nextLine();
                        System.out.print("Enter new Status (In Progress/Resolved): ");
                        String status = sc.nextLine();
                        for (Ticket t : allTickets) {
                            if (t.ticketId == tid) {
                                admin.updateTicketStatus(t, status);
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Exiting... Thank you!");
                    break;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        } while(choice != 3);

        sc.close();
    }
}
