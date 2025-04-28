# 📚 Java Recommendation System using Apache Mahout

---

## 📋 Project Description
This is a **Recommendation Engine** built in **Java** using the **Apache Mahout** library.  
It suggests **products or content** based on **user preferences**.

✅ User-Based Collaborative Filtering  
✅ Pearson Correlation Similarity  
✅ Sample Dataset provided (`ratings.csv`)  
✅ Built using Maven for easy dependency management

---

## 🏗️ Project Structure
```
RecommendationSystem/
├── ratings.csv
├── pom.xml
└── src/
    └── main/
        └── java/
            └── com/
                └── codtech/
                    └── recommendation/
                        └── RecommendationEngine.java
```

---

## 🔥 Features
- 🤝 Collaborative Filtering (User-Based)
- 📈 Pearson Correlation Similarity
- 📦 Efficient recommendation generation
- 📝 Sample dataset for demonstration
- ⚙️ Easy to run using Maven

---

## 🛠️ Technologies Used
- Java SE (Standard Edition)
- Apache Mahout 0.9
- Maven (Build and Dependency Management)

---

## 🚀 How to Run

### 1. Prerequisites
- Java JDK 8 or higher
- Maven installed

### 2. Steps
- Clone or download the project.
- Place the `ratings.csv` file in the root folder.
- Compile and run:
```bash
mvn clean install
mvn exec:java -Dexec.mainClass="com.codtech.recommendation.RecommendationEngine"
```

---



## 📸 Sample Output
```bash
Recommendations for User ID: 3
Item ID: 102 , Estimated Preference: 4.2
Item ID: 103 , Estimated Preference: 4.0
Item ID: 105 , Estimated Preference: 4.3
```

---

