# 🚀 StackIt Backend

A scalable Q&A backend system inspired by StackOverflow, built using Spring Boot with a focus on reactive architecture, event-driven design, and high-performance search.

## 🛠️ Tech Stack
- Spring Boot (Reactive)
- MongoDB 🍃
- Elasticsearch 🔍
- Apache Kafka ⚡
- Docker 🐳

## ✨ Features
- Question & Answer REST APIs
- Reactive and non-blocking architecture
- Event-driven communication using Kafka
- Full-text search with Elasticsearch
- Clean layered architecture (Controller → Service → Repository)

## 📁 Project Structure
```text
src/main/java/com/stackit/app
│
├── adapter        # External integrations
├── config         # Configuration classes
├── consumers      # Kafka consumers
├── controllers    # REST APIs
├── dto            # Data Transfer Objects
├── events         # Event models
├── models         # Domain models
├── producers      # Kafka producers
├── repositories   # Database layer
├── services       # Business logic
└── utils          # Utility classes
```
## 🚀 Getting Started

### 1️⃣ Clone the repository
    git clone https://github.com/Soumyadeep081/stackit-backend.git
    cd stackit-backend

### 2️⃣ Start required services
Make sure the following are running:
- MongoDB (localhost:27017)
- Elasticsearch (localhost:9200)
- Kafka (localhost:9092)

### 3️⃣ Run the application
    ./gradlew bootRun

### 4️⃣ Access the API
    http://localhost:8080

Example endpoints:
- GET /api/answers/{id}
- POST /api/answers

## ⚠️ Notes
- Root URL (/) will show a Whitelabel Error Page (404) — this is expected
- Kafka must be running unless disabled in config

## 📌 Future Improvements
- 🔹 Add authentication (JWT / OAuth2)
- 🔹 API documentation using Swagger
- 🔹 Rate limiting & caching
- 🔹 Microservices separation

## 🤝 Contributing
Feel free to fork the repo and submit pull requests!
