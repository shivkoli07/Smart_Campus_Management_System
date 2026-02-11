# Smart Campus Management System

A smart web-based platform developed to manage campus activities efficiently.

## Features
- Student & Admin modules 
- Campus, Departments Detail Pages
- Complaint Management System
- Attendance Management System
- Feedback System
- Leave Application System
- About Developer Page for Details about the Developer
- About System Page for complete project details
- Secure backend integration
- Database-driven architecture

## Tech Stack
- Frontend: HTML, CSS, JavaScript, Bootstrap
- Backend: Java , Spring
- Database: PostgreSQL
- Tools: Git, GitHub

## Project Structure
SMART-CAMPUS-MANAGEMENT-SYSTEM

```text
│
├── frontend/
│   │
│   ├── html/
│   │   ├── index.html
│   │   ├── explore-campus.html
│   │   ├── departments.html
│   │   │
│   │   ├── complaints/
│   │   │   ├── complaint-role.html
│   │   │   ├── student-complaint-home.html
│   │   │   ├── file-complaint.html
│   │   │   ├── track-complaint.html
│   │   │   ├── faq.html
│   │   │   ├── admin-login.html
│   │   │   └── admin-complaint-panel.html
│   │   │
│   │   ├── attendance/
│   │   │   ├── attendance-role.html
│   │   │   ├── admin-login.html
│   │   │   ├── admin-attendance-panel.html
│   │   │   └── student-attendance.html
│   │   │
│   │   ├── leave/
│   │   │   ├── leave-role.html
│   │   │   ├── admin-login.html
│   │   │   ├── admin-leave-panel.html
│   │   │   ├── apply-leave.html
│   │   │   └── view-leave-status.html
│   │   │
│   │   ├── feedback.html
│   │   │
│   │   └── about/
│   │       ├── about-developer.html
│   │       └── about-system.html
│   │
│   ├── css/
│   │   └── main.css
│   │
│   ├── js/
│   │   └── app.js
│   │
│   └── assets/
│       └── images/
│
├── backend/   (Spring Boot Application)
│   │
│   ├── .mvn/
│   │   └── wrapper/
│   │       └── maven-wrapper.properties
│   │
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/
│   │   │   │   └── com/
│   │   │   │       └── smartcampus/
│   │   │   │
│   │   │   │           ├── controller/
│   │   │   │           │   ├── AttendanceController.java
│   │   │   │           │   ├── ComplaintController.java
│   │   │           │   ├── FeedbackController.java
│   │   │   │           │   └── LeaveController.java
│   │   │   │
│   │   │   │           ├── service/
│   │   │   │           │   ├── AttendanceService.java
│   │   │   │           │   ├── ComplaintService.java
│   │   │   │           │   ├── FeedbackService.java
│   │   │   │           │   └── LeaveService.java
│   │   │   │
│   │   │   │           ├── repository/
│   │   │   │           │   ├── AttendanceRepository.java
│   │   │   │           │   ├── ComplaintRepository.java
│   │   │   │           │   ├── FeedbackRepository.java
│   │   │   │           │   └── LeaveRepository.java
│   │   │   │
│   │   │   │           ├── entity/
│   │   │   │           │   ├── Attendance.java
│   │   │   │           │   ├── Complaint.java
│   │   │   │           │   ├── Feedback.java
│   │   │   │           │   └── LeaveApplication.java
│   │   │   │
│   │   │   │           ├── config/
│   │   │   │           │   ├── CorsConfig.java
│   │   │   │           │   └── SecurityConfig.java
│   │   │   │
│   │   │   │           └── SmartCampusBackendApplication.java
│   │   │   │
│   │   │   └── resources/
│   │   │       ├── application.properties
│   │   │       └── static/   (future use)
│   │   │
│   │   └── test/
│   │       └── java/
│   │           └── com/
│   │               └── smartcampus/
│   │                   └── SmartCampusBackendApplicationTests.java
│   │
│   ├── pom.xml
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── .gitignore
│   ├── .gitattributes
│   └── HELP.md
│
├── database/
│   │
│   ├── schema/
│   │   ├── attendance.sql
│   │   ├── complaints.sql
│   │   ├── feedback.sql
│   │   └── leave_application.sql
│   │
│   ├── sequences/
│   │   ├── attendance_id_seq.sql
│   │   ├── complaints_id_seq.sql
│   │   ├── feedback_id_seq.sql
│   │   └── leave_application_id_seq.sql
│   │
│   ├── constraints/
│   │   ├── primary_keys.sql
│   │   └── foreign_keys.sql
│   │
│   ├── indexes/
│   │   ├── attendance_indexes.sql
│   │   └── complaints_indexes.sql
│   │
│   ├── views/
│   │   ├── student_attendance_view.sql
│   │   └── complaint_status_view.sql
│   │
│   ├── data/
│   │   ├── sample_attendance_data.sql
│   │   ├── sample_complaints_data.sql
│   │   ├── sample_feedback_data.sql
│   │   └── sample_leave_data.sql
│   │
│   ├── dump/
│   │   └── smart_campus_full_dump.sql
│   │
│   └── README.md
│
└── README.md
```

## Developer
**Shiv Koli**  
B.E. Information Technology  
Smart Campus Management System



    

