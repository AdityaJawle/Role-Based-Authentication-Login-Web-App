# Role-Based Authentication Login Web App

This is a simple **Role-Based Authentication Login Web App** that allows users to log in as either an **Admin** or a **User**. Based on their role, they are redirected to the appropriate dashboard. Unauthorized access to restricted pages is prevented, ensuring security. The project also includes JavaScript validation for password matching and **password encryption using BCrypt** for secure authentication.

## Features

- **Role-Based Access**: Users can log in as **Admin** or **User**, each having a different dashboard.
- **Secure Authentication**: Restricted access to protected pages until login.
- **Single Login Page**: One login form for both Admin and User.
- **Error Handling**: Unauthorized page access results in a `404 Error Page`.
- **JavaScript Validation**: Ensures password and confirm password match during registration.
- **Password Encryption**: Passwords are encrypted using **BCrypt Password Encoder** to enhance security.
- **Thymeleaf Integration**: Dynamic content rendering using Thymeleaf templates.

## Technologies Used

- **Backend**:
  - Java (Spring Boot)
  - Spring Security (for authentication & authorization)
  - Spring Data JPA (for database operations)
  - BCrypt Password Encoder (for password encryption)
  - MySQL (database storage)
  
- **Frontend**:
  - Thymeleaf (Template Engine)
  - JavaScript (for client-side validation)
  - Bootstrap (for styling)

- **Build Tool**:
  - Maven

## Dependencies

The following main dependencies are used in the project:

- **Spring Boot Starter Security**
- **Spring Boot Starter Data JPA**
- **Spring Boot Starter Thymeleaf**
- **Spring Boot Starter Web**
- **MySQL Connector**
- **Thymeleaf Extras Spring Security 6**
- **Lombok**

## Installation

Follow these steps to set up the project locally:

1. Clone the repository:
    ```bash
    git clone https://github.com/AdityaJawle/Role-Based-Authentication-Login-Web-App.git
    ```
2. Navigate to the project directory:
    ```bash
    cd Role-Based-Authentication-Login-Web-App
    cd role
    ```
3. Build and run the application using Maven:
    ```bash
    i. Windows:
        mvn spring-boot:run
    ii. Linux:
        ./mvn spring-boot:run
    ```
4. Open your browser and visit:
    ```url
    http://localhost:8080
    ```

## Pages Overview

- **Home Page**: Accessible to all users before login.
- **Login Page**: Single login form for both Admin and User.
- **Register Page**: Allows users to register and choose their role via a dropdown.
- **Admin Dashboard**: Accessible only after Admin login.
- **User Dashboard**: Accessible only after User login.
- **404 Error Page**: Shown when unauthorized access is attempted.
- **Database Password Encryption**: It show the Encrypted Password.

## Screenshots

### 1. Home Page

![Screenshot (149)](https://github.com/user-attachments/assets/b847b911-7425-4a69-8c19-e30f02e44412)

### 2. Login Page

![Screenshot (156)](https://github.com/user-attachments/assets/45860200-d7af-43a2-89c1-0509f723b2c5)
![Screenshot (158)](https://github.com/user-attachments/assets/54421720-cbf6-4fcd-ac04-453f613b2249)

### 3. Register Page

![Screenshot (154)](https://github.com/user-attachments/assets/0189544c-8409-4605-b8fc-68b7b2382939)
![Screenshot (155)](https://github.com/user-attachments/assets/f40d7ba4-1bef-4fc4-883e-b87b30381c90)

### 4. Dashboard Page (User & Admin)

![Screenshot (157)](https://github.com/user-attachments/assets/194b0e41-a00f-42f8-8072-4793f3f029ad)
![Screenshot (159)](https://github.com/user-attachments/assets/5132d3ee-0d22-4dbe-968b-77df04bb7b0c)

### 5. 404 Error Page

![Screenshot (160)](https://github.com/user-attachments/assets/6b3b2318-8ca5-4333-95fb-7f9fdbb45d99)

### 6. Database Password Encryption

![Screenshot (161)](https://github.com/user-attachments/assets/467dd033-cc19-47e5-a1f2-417b3a235b15)

## Contributing

If you'd like to contribute to this project, feel free to fork it and submit a pull request. Contributions are always welcome!

1. Fork the repository
2. Create your feature branch (`git checkout -b feature-name`)
3. Commit your changes (`git commit -am 'Add feature'`)
4. Push to the branch (`git push origin feature-name`)
5. Open a pull request
