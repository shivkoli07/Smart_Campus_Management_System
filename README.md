# 🎓 Smart Campus Management System

<div align="center">

![Java](https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-Framework-6DB33F?style=for-the-badge&logo=springboot)
![PostgreSQL](https://img.shields.io/badge/PostgreSQL-Database-336791?style=for-the-badge&logo=postgresql)
![HTML5](https://img.shields.io/badge/HTML5-Markup-E34F26?style=for-the-badge&logo=html5)
![CSS3](https://img.shields.io/badge/CSS3-Styling-1572B6?style=for-the-badge&logo=css3)
![JavaScript](https://img.shields.io/badge/JavaScript-ES6-F7DF1E?style=for-the-badge&logo=javascript)
![License](https://img.shields.io/badge/License-MIT-blue?style=for-the-badge)

### A Full-Stack Web Application for Modern Campus Administration

Streamlining campus operations through a centralized digital platform for **Students** and **Administrators**.

</div>

---

# 📖 Overview

The **Smart Campus Management System** is a full-stack web application designed to digitize and simplify everyday campus operations. Instead of relying on manual paperwork and disconnected systems, the platform provides a unified solution for managing attendance, complaints, leave requests, and student feedback.

The project follows a clean MVC architecture with secure backend APIs, making it scalable, maintainable, and suitable for real-world educational institutions.

---

# ✨ Key Features

## 👨‍🎓 Student Portal

- Secure Login
- View Attendance
- Submit Leave Requests
- Track Leave Status
- Submit Complaints
- Anonymous Complaint Option
- Track Complaint Progress
- Submit Feedback
- Responsive Dashboard

---

## 👨‍💼 Admin Portal

- Dashboard Overview
- Manage Student Attendance
- Review Complaints
- Resolve Complaints
- Approve / Reject Leave Requests
- View Student Feedback
- Manage Campus Records
- Centralized Administration

---

# 🚀 Project Objectives

- Eliminate paper-based campus processes
- Improve communication between students and administration
- Increase transparency in complaint handling
- Automate attendance and leave management
- Provide a modern and user-friendly campus experience

---

# 🏗️ System Modules

### 📌 Attendance Management

- View attendance
- Update attendance records
- Attendance tracking

---

### 📌 Complaint Management

- Lodge complaints
- Anonymous complaint submission
- Complaint status tracking
- Complaint resolution by admin

---

### 📌 Leave Management

- Apply for leave
- Admin approval/rejection
- Leave history

---

### 📌 Feedback Management

- Submit campus feedback
- Store responses securely
- Admin review panel

---

# 🛠️ Tech Stack

## Frontend

- HTML5
- CSS3
- JavaScript

---

## Backend

- Java
- Spring Boot
- Spring MVC
- REST APIs

---

## Database

- PostgreSQL
- pgAdmin

---

## Development Tools

- IntelliJ IDEA
- VS Code
- Git
- GitHub
- Maven

---

# 📂 Project Structure

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


---

# ⚙️ Installation

## 1. Clone Repository

```bash
git clone https://github.com/shivkoli07/Smart_Campus_Management_System.git
```

---

## 2. Navigate to Project

```bash
cd Smart_Campus_Management_System
```

---

## 3. Configure Database

Create a PostgreSQL database.

Example:

```
smart_campus_db
```

Update the database credentials inside:

```
application.properties
```

Example:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/smart_campus_db
spring.datasource.username=postgres
spring.datasource.password=your_password
```

---

## 4. Run Backend

```bash
mvn spring-boot:run
```

---

## 5. Launch Frontend

Open

```
index.html
```

or run using VS Code Live Server.

---

# 📸 Screenshots

> Add screenshots of your project here.

Example:

```
Screenshots/

Home.png
StudentDashboard.png
AdminDashboard.png
ComplaintModule.png
AttendanceModule.png
LeaveModule.png
FeedbackModule.png
```

---

# 🔒 Security Features

- Role-Based Access Control
- Input Validation
- Secure Database Integration
- Anonymous Complaint Support
- REST API Architecture

---

# 📈 Future Enhancements

- Email Notifications
- SMS Alerts
- AI-powered Complaint Classification
- QR Code Attendance
- Student ID Card Generation
- Mobile Application
- Analytics Dashboard
- Cloud Deployment
- Multi-College Support

---

# 🎯 Learning Outcomes

This project helped strengthen practical knowledge of:

- Full Stack Web Development
- Spring Boot Framework
- RESTful API Development
- MVC Architecture
- PostgreSQL Database Design
- Frontend & Backend Integration
- CRUD Operations
- Git & GitHub Workflow
- Project Structuring
- Real-world Software Development

---

# 🤝 Contributing

Contributions are welcome!

1. Fork the repository

2. Create a feature branch

```bash
git checkout -b feature-name
```

3. Commit changes

```bash
git commit -m "Added new feature"
```

4. Push changes

```bash
git push origin feature-name
```

5. Open a Pull Request

---

# 👨‍💻 Author

## Shiv Koli

**Information Technology Student**

Full Stack Java Developer • Data Analyst • AI Enthusiast

GitHub:
https://github.com/shivkoli07

LinkedIn:
(Add your LinkedIn URL)

---

# ⭐ Support

If you found this project useful,

⭐ Star this repository

🍴 Fork it

📢 Share it with others

---

## 📄 License

This project is licensed under the MIT License.

---

<div align="center">

### 🌟 Building Smarter Campuses Through Technology 🌟

Made with ❤️ by Shiv Koli

</div>


    

