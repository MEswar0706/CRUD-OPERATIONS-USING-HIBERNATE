# Hibernate CRUD Example

A simple Java project demonstrating basic **CRUD** operations (Create, Read, Update, Delete) using **Hibernate ORM** with **JPA annotations**.  
The project uses **MySQL** as the database.

---

## Features

- Hibernate setup with annotated entity class
- Basic CRUD operations on the `User` entity
- Shows usage of Hibernate `Session` and `Transaction`
- Modular methods for each CRUD operation
- MySQL table schema and sample data included

---



## 🛠 Getting Started

### ✅ Prerequisites

- Java JDK 8+
- Maven or Gradle (optional but recommended)
- MySQL Server (local or remote)
- IDE (Eclipse / IntelliJ IDEA / VS Code)

---

### 🗄 Database Setup

Run the following SQL script on your MySQL server:

CREATE TABLE user (
user_id INT AUTO_INCREMENT PRIMARY KEY,
name VARCHAR(30) NOT NULL,
username VARCHAR(30) NOT NULL UNIQUE,
password VARCHAR(30) NOT NULL,
email VARCHAR(30) NOT NULL UNIQUE,
phone VARCHAR(14),
address VARCHAR(30),
role VARCHAR(50),
created_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

---

### ⚙ Hibernate Configuration

Create `src/main/resources/hibernate.cfg.xml`:

<?xml version='1.0' encoding='UTF-8'?>  
<!DOCTYPE hibernate-configuration PUBLIC  
   "-//Hibernate/Hibernate Configuration DTD 5.3//EN"  
   "http://hibernate.org/dtd/hibernate-configuration-3.0.dtd">  

<hibernate-configuration>  
   <session-factory>  
      
      <property name="dialect">org.hibernate.dialect.MySQLDialect</property>  
      <property name="connection.url">jdbc:mysql://localhost:3306/database_name</property>  
      <property name="connection.username">db_username</property>  
      <property name="connection.password">db_password</property>  
      <property name="connection.driver_class">com.mysql.cj.jdbc.Driver</property>  
    
   </session-factory>
   </hibernate-configuration>

---

## 🚀 Running the Project

### 1️⃣ Clone the Repository

### 2️⃣ Configure the Database
- Open `hibernate.cfg.xml`
- Set your MySQL database details:
  - **JDBC URL**
  - **Username**
  - **Password**

### 3️⃣ Build & Run

#### Option 1 – Run in IDE
- Open the project in **Eclipse**, **IntelliJ**, or your preferred IDE
- Run `Launch.java`

#### Option 2 – Run from Terminal

### 4️⃣ Try CRUD Operations
- Open `Launch.java`
- Uncomment the method calls you want to test inside `main()`  


---


## 📧 Contact
For queries, please open an **issue** on GitHub:



