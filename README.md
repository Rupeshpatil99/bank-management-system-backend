A full-stack Bank Management System built using HTML, CSS, JavaScript (Frontend) and Java + MySQL (Backend).
This project allows users to manage bank accounts with basic banking operations through a web interface.

🚀 Features

🔐 Login Page (UI)

🆕 Create Bank Account

💰 Deposit Money

💸 Withdraw Money

📊 Check Account Balance

🗄️ Data stored securely in MySQL

🌐 Frontend–Backend integration using JavaScript Fetch API

🛠️ Tech Stack
🔹 Frontend

HTML

CSS

JavaScript (Fetch API)

🔹 Backend

Java

JDBC

(Servlet / Core Java backend)

🔹 Database

MySQL

📂 Project Structure
Bank-Management-System/
│
├── frontend/
│   ├── index.html
│   ├── dashboard.html
│   ├── create.html
│   ├── deposit.html
│   ├── withdraw.html
│   ├── css/
│   │   └── style.css
│   └── js/
│       └── bank.js
│
├── backend/
│   ├── BankAccount.java
│   ├── BankService.java
│   ├── DBConnection.java
│   └── Main / Servlet files
│
├── database/
│   └── bankdb.sql
│
└── README.md

🧠 System Architecture
HTML + CSS + JavaScript
        ↓
   Java Backend (JDBC / Servlet)
        ↓
      MySQL Database

🗄️ Database Schema
CREATE DATABASE bankdb;
USE bankdb;

CREATE TABLE accounts (
    account_number INT PRIMARY KEY,
    name VARCHAR(50),
    balance DOUBLE
);

⚙️ How to Run the Project
1️⃣ Setup Database

Install MySQL

Run the SQL script from database/bankdb.sql

2️⃣ Backend Setup

Open backend folder in VS Code / Eclipse

Add MySQL JDBC Connector

Update DB username & password in DBConnection.java

Run Java backend (or deploy servlet on Tomcat)

3️⃣ Frontend Setup

Open index.html in browser

Make sure backend server is running on localhost:8080

📸 Screens (Optional)

Login Page

Dashboard

Create Account

Deposit / Withdraw Pages

(You can add screenshots here later)

🧾 Resume Description

Bank Management System | HTML, CSS, JavaScript, Java, MySQL
Developed a full-stack banking application with a responsive web interface and Java backend integrated with MySQL database to perform core banking operations.

🙋 Author

Rupesh Patil

GitHub: https://github.com/your-username

Skills: Java | MySQL | HTML | CSS | JavaScript

⭐ Acknowledgement

This project was built for learning full-stack development and understanding frontend–backend integration.

⭐ If you like this project, don’t forget to star the repo!
