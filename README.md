# 📘 Employee Management System

A Java Swing–based desktop application for managing employee records (Add, Update, View, Remove) with MySQL database integration.

## 📌 Features

- Add new employees
- Update existing employee details
- View employee records with ID selection
- Delete employees from the system
- Java Swing graphical interface
- MySQL database for permanent data storage

## 🛠️ Technologies Used

- Java (JDK 8+)
- Java Swing
- MySQL
- JDBC (MySQL Connector)
- IntelliJ / Eclipse / VS Code

## 🚀 Installation & Setup

### 1. Install MySQL  
Create the database and table:

```sql
CREATE DATABASE employee_management;

USE employee_management;

CREATE TABLE employee (
  empid VARCHAR(50) PRIMARY KEY,
  name VARCHAR(100),
  phone VARCHAR(50),
  email VARCHAR(100)
);
```

### 2. Clone the Repository

```bash
git clone https://github.com/goutamraj/Employee_Management.git
cd Employee_Management
```

### 3. Configure Database Connection  
Open `Conn.java` and update:

```java
String url = "jdbc:mysql://localhost:3306/employee_management";
String user = "YOUR_DB_USERNAME";
String password = "YOUR_DB_PASSWORD";
```

Replace with your local MySQL credentials.

### 4. Run the Application  
Run any of the GUI files:

- `AddEmployee.java`
- `UpdateEmployee.java`
- `ViewEmployee.java`
- `RemoveEmployee.java`

These launch separate windows for managing employees.

## 📁 Project Structure

```
Employee_Management/
├── src/
│   └── employee/management/system/
│       ├── Conn.java
│       ├── AddEmployee.java
│       ├── ViewEmployee.java
│       ├── UpdateEmployee.java
│       ├── RemoveEmployee.java
│       └── ...other files
├── README.md
└── Employee_Management.iml
```

## 🧭 How to Use

### Add Employee
Fill all fields → click **Add**

### Update Employee
Select employee → edit fields → click **Update**

### View Employee
Select employee ID → details load automatically

### Remove Employee
Select employee ID → click **Delete**

## 🤝 Contributing

1. Fork the repo  
2. Create a branch:  
```bash
git checkout -b feature/my-feature
```
3. Commit changes:  
```bash
git commit -m "Added new feature"
```
4. Push:  
```bash
git push origin feature/my-feature
```
5. Submit a pull request

## 📜 License

This project is free to use.  
If needed, apply an MIT License.

## ⭐ Support

If you like this project, consider starring the repository!
