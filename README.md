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

![Overview](https://img.shields.io/badge/Overview-Project%20Summary-blue)

The **Smart Campus Management System** is a full-stack web application designed to digitize and simplify everyday campus operations. Instead of relying on manual paperwork and disconnected systems, the platform provides a unified solution for managing attendance, complaints, leave requests, and student feedback.

The project follows a clean MVC architecture with secure backend APIs, making it scalable, maintainable, and suitable for real-world educational institutions.

---

# ✨ Key Features

![Features](https://img.shields.io/badge/Features-Portal%20Capabilities-blue)

## 👨‍🎓 Student Portal

![Module](https://img.shields.io/badge/Module-Student%20Portal-9cf)

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

![Module](https://img.shields.io/badge/Module-Admin%20Portal-orange)

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

![Objectives](https://img.shields.io/badge/Objectives-Project%20Goals-blueviolet)

- Eliminate paper-based campus processes
- Improve communication between students and administration
- Increase transparency in complaint handling
- Automate attendance and leave management
- Provide a modern and user-friendly campus experience

---

# 🏗️ System Modules

![System Modules](https://img.shields.io/badge/System-Modules%20Overview-informational)

### 📌 Attendance Management

![Module](https://img.shields.io/badge/Module-Attendance%20Management-green)

- View attendance
- Update attendance records
- Attendance tracking

---

### 📌 Complaint Management

![Module](https://img.shields.io/badge/Module-Complaint%20Management-red)

- Lodge complaints
- Anonymous complaint submission
- Complaint status tracking
- Complaint resolution by admin

---

### 📌 Leave Management

![Module](https://img.shields.io/badge/Module-Leave%20Management-yellow)

- Apply for leave
- Admin approval/rejection
- Leave history

---

### 📌 Feedback Management

![Module](https://img.shields.io/badge/Module-Feedback%20Management-purple)

- Submit campus feedback
- Store responses securely
- Admin review panel

---

# 🛠️ Tech Stack

![Tech Stack](https://img.shields.io/badge/Tech%20Stack-Full%20Stack-blue)

## Frontend

![Layer](https://img.shields.io/badge/Layer-Frontend-E34F26)

- HTML5
- CSS3
- JavaScript

---

## Backend

![Layer](https://img.shields.io/badge/Layer-Backend-6DB33F)

- Java
- Spring Boot
- Spring MVC
- REST APIs

---

## Database

![Layer](https://img.shields.io/badge/Layer-Database-336791)

- PostgreSQL
- pgAdmin

---

## Development Tools

![Layer](https://img.shields.io/badge/Layer-Dev%20Tools-lightgrey)

- IntelliJ IDEA
- VS Code
- Git
- GitHub
- Maven

---

# 📂 Project Structure

![Structure](https://img.shields.io/badge/Structure-Modular%20Architecture-blue)

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

# 🔒 Security Features

![Security](https://img.shields.io/badge/Security-Protected%20Access-critical)

- Role-Based Access Control
- Input Validation
- Secure Database Integration
- Anonymous Complaint Support
- REST API Architecture

---

# 📈 Future Enhancements

![Roadmap](https://img.shields.io/badge/Roadmap-Planned%20Features-yellow)

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

![Learning](https://img.shields.io/badge/Learning-Outcome%20Driven-yellow)

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

![Contributing](https://img.shields.io/badge/Contributions-Welcome-brightgreen)

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

![Author](https://img.shields.io/badge/Author-Shiv%20Koli-blue)
![Role](https://img.shields.io/badge/Role-Full%20Stack%20Java%20Developer-orange)

## Shiv Koli

**Information Technology Student**

Full Stack Java Developer • Data Analyst • AI Enthusiast

GitHub:
https://github.com/shivkoli07

LinkedIn:
www.linkedin.com/in/shiv-koli07

---

# ⭐ Support

![Support](https://img.shields.io/badge/Support-Star%20%7C%20Fork%20%7C%20Share-brightgreen)

If you found this project useful,

⭐ Star this repository

🍴 Fork it

📢 Share it with others

---

## 📄 License

![License](https://img.shields.io/badge/License-MIT-blue)

This project is licensed under the MIT License.

---

----------------------------------
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
www.linkedin.com/in/shiv-koli07

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



    

