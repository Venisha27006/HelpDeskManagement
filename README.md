# HelpDeskManagementSystem

PROJECT DESCRIPTION
**HelpDeskManagementSystem** is a Java-based application that streamlines IT support processes in organizations. Employees can log support tickets, monitor ticket status, and IT staff can efficiently manage, assign, and resolve tickets. The system reduces downtime, improves communication, and ensures proper documentation of IT issues.

PROBLEM STATEMENT
Organizations often face delays in resolving technical issues due to unstructured reporting and lack of ticket tracking. Employees may struggle to report issues, and IT staff may find it difficult to prioritize and assign tasks, leading to operational inefficiency and delayed resolutions.

TARGET USERS
- **Employees:** Create tickets and track their status.  
- **IT Support Staff:** Assign, update, and resolve tickets.  
- **Managers/Admins:** Monitor tickets, analyze staff performance, and generate reports.

FEATURES
- User login and profile management  
- Create, assign, update, and resolve tickets  
- Status tracking: Open / In Progress / Resolved  
- Role-based access control (Employee, IT Staff, Admin)  
- Reports and analytics for performance and pending tickets  
- Search and filter tickets by ID, priority, status, or department  

TECHNOLOGIES USED
- **Language:** Java (JDK 17+)  
- **IDE:**  VS Code  
- **Database:** MySQL / SQLite (optional for persistence)  
- **Version Control:** Git, GitHub  

OPPS CONCEPT
- **Encapsulation:** Private attributes with public getter/setter methods  
- **Inheritance:** `Employee` and `ITSupportStaff` extend `User`  
- **Polymorphism:** Methods like `viewTicket()` behave differently based on user type  
- **Abstraction:** Simple methods (`createTicket()`, `resolveTicket()`) hide backend logic  

SAMPLE WORKFLOW
1. Employee logs in → creates a ticket → sets priority  
2. IT Staff logs in → views assigned tickets → updates status or resolves ticket  
3. Admin views reports → monitors ticket resolution times and staff performance  

## **Setup Instructions**
1. Clone the repository:
```bash
git clone https://github.com/<your-username>/HelpDeskManagementSystem.git
cd HelpDeskManagementSystem



