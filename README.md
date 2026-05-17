# 🚀 Full-Stack Portfolio Admin Dashboard

An elegant and responsive Full-Stack Portfolio Website equipped with a powerful Admin Dashboard to dynamically manage and update portfolio content.

---

## 🛠️ Tech Stack

### Frontend
* **HTML5 & CSS3** - Structured layout and modern responsive styling.
* **JavaScript (Vanilla)** - Form validation, dynamic DOM manipulation, and API integration.

### Backend
* **Java (Spring Boot)** - Robust RESTful API architecture and secure business logic.
* **Maven** - Dependency management and project build tool.

### Database
* **MySQL** - Relational database management system.

---

## ✨ Features

* **Dynamic Data Sync:** Updates made in the Admin Dashboard instantly reflect on the main portfolio page.
* **Asynchronous Requests:** Uses JavaScript `fetch()` API for seamless, page-refresh-free data submissions.
* **Error Handling:** Built-in alert notifications for tracking successful network operations or Spring Boot server errors.
* **Responsive Layout:** Designed to work perfectly across laptops, tablets, and mobile screens.

---

## 🚀 How to Run the Project Locally

### 1. Database Setup
1. Open your MySQL Workbench or Command Line.
2. Create a new database:
```sql
CREATE DATABASE portfolio_db;

portfolio-project/
├── backend/
│   ├── src/main/java/      # Spring Boot Java Source Files
│   └── src/main/resources/ # Configuration & Application Properties
├── frontend/
│   ├── admin.html          # Admin Panel View
│   ├── index.html          # Main Portfolio View
│   ├── script.js           # Frontend Logic & API Fetching
│   └── style.css           # Styling Sheets
└── README.md
