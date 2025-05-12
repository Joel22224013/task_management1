
## 📋 Task Management Backend Application

A **Spring Boot RESTful API** for managing users, tasks, and authentication with role-based access and **email capabilities**. The app is structured with best practices in mind: clean architecture, security via JWT, exception handling, and interactive documentation using Swagger UI.

---

### 🚀 Features

* ✅ User Registration & Login (with JWT Authentication)
* ✅ Role-Based Authorization (e.g., `USER`, `ADMIN`)
* ✅ Task CRUD (Create, Read, Update, Delete)
* ✅ Each user sees only their own tasks
* ✅ Exception Handling & Validation
* ✅ **Email Sending Functionality** (e.g., on registration or actions)
* ✅ RESTful API with clear endpoints
* ✅ Swagger UI for API Testing & Docs

---

### 🛠️ Tech Stack

| Layer           | Technology            |
| --------------- | --------------------- |
| Language        | Java 17               |
| Framework       | Spring Boot           |
| Build Tool      | Maven                 |
| Database        | H2 (in-memory DB)     |
| Security        | Spring Security + JWT |
| JPA             | Spring Data JPA       |
| API Docs        | Swagger / OpenAPI     |
| Email           | Spring Mail (SMTP)    |
| Testing         | Postman               |
| Version Control | Git & GitHub          |

---

### 📁 Project Structure

```
task-management/
├── controller/
├── dto/
├── entity/
├── repository/
├── service/
├── security/
├── config/
├── exception/
└── util/  <-- May include email utility classes
```

---

### ✅ How to Run Locally

1. **Clone the repository**

```bash
git clone https://github.com/Joel22224013/task_management1.git
cd task-management
```

2. **Configure SMTP for email**
   Update the following in `application.properties`:

```properties
spring.mail.host=smtp.example.com
spring.mail.port=587
spring.mail.username=your_email@example.com
spring.mail.password=your_password
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
```

3. **Build & Run**

```bash
./mvnw clean install
./mvnw spring-boot:run
```

4. **Access the App:**

* Swagger UI: `http://localhost:8080/swagger-ui/index.html`
* Base API URL: `http://localhost:8080/api`

---

### 📮 API Endpoints (Examples)

| Method | Endpoint             | Description                       | Auth Required |
| ------ | -------------------- | --------------------------------- | ------------- |
| POST   | `/api/auth/register` | Register a new user (sends email) | ❌             |
| POST   | `/api/auth/login`    | Authenticate user & get token     | ❌             |
| GET    | `/api/tasks`         | Get all tasks for user            | ✅             |
| POST   | `/api/tasks`         | Create a new task                 | ✅             |
| PUT    | `/api/tasks/{id}`    | Update a task                     | ✅             |
| DELETE | `/api/tasks/{id}`    | Delete a task                     | ✅             |

---

### 📧 Email Feature

* Automatically sends email on registration or confirmation (or as defined in your service).
* Configurable using **Spring Boot Mail**.
* Can be extended to send:

  * Welcome messages
  * Password reset links
  * Task reminders

---

### 🔐 JWT Authentication

* All secured endpoints require a token in the header:

```
Authorization: Bearer <your-token>
```

---

### 📘 Sample Task JSON

```json
{
  "title": "Write deployment docs",
  "description": "Write instructions for Render deployment",
  "completed": false
}
```

---

### 🧠 Future Enhancements

* [ ] Deploy to **Render**, **Firebase**, or **Railway**
* [ ] Dockerize for consistent environments
* [ ] Move to persistent database like **MySQL**
* [ ] Add email verification + reset password flow
* [ ] Pagination, sorting, and filtering

---

### 🙋 Contributing

We welcome all PRs and issues!

```bash
# Fork the repo
# Create a branch
git checkout -b feature/new-feature
# Commit and push changes
# Submit a PR
```



### 📄 License

Licensed under the [MIT License](LICENSE)



### 👨‍💻 Author

**Joel22224013**
Passionate about building impactful backend services 🚀
