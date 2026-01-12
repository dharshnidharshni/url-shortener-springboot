🔗 URL Shortener Service 🚀

A simple and efficient **URL Shortener application** built using **Spring Boot** ☕.  
This project converts long URLs into short URLs and redirects users to the original website while tracking click counts 📊.

✨ Features

✅ Generate unique short URLs  
✅ Redirect to original long URLs  
✅ Track number of clicks 🔢  
✅ REST API based backend  
✅ Lightweight H2 in-memory database 🗄️  

🛠️ Tech Stack

- ☕ Java 21 
- 🌱 Spring Boot  
- 🗃️ Spring Data JPA  
- 💾 H2 Database  
- 📦 Maven  

📂 Project Structure
com.url.urlshortener
├── controller
├── service
├── repository
├── model
└── UrlshortenerApplication.java

🚀 How to Run the Project

1️⃣ Clone the repository  
2️⃣ Open the project in **IntelliJ IDEA**  
3️⃣ Run `UrlshortenerApplication.java` ▶️  
4️⃣ Server starts at:**localhost:8080/shorten?url=https://google.com**

🌐 API Endpoints

🔹 Create Short URL :**http://localhost:8080/8f0703**

➡️ Redirects to the original URL 🌍  
➡️ Click count is automatically updated 📈

📊 Output:
{
"id":4,
"originalUrl":"https://google.com",
"shortUrl":"8f0703",
"clicks":0
}

- Short URL generated instantly ⚡  
- Clicking short URL redirects correctly 🔄  
- Click tracking works as expected ✅  

🎯 Use Case

This project demonstrates:
- Backend REST API development  
- Database integration using JPA  
- URL redirection logic  
- Basic analytics (click tracking)  

👩‍💻 Author
Dharshni Raja
