🚀 Atelier7 — Angular + Spring Boot + MySQL + Docker

Projet web complet utilisant :

Angular (frontend)

Spring Boot (backend)

MySQL (base de données)

Docker Compose pour l’orchestration

📁 Structure du projet
atelier7JEE/
│
├─ atelier7-backend/      # Projet Spring Boot
├─ atelier7-frontend/     # Projet Angular
├─ docker-compose.yml     # Orchestration Docker
└─ README.md

✅ Prérequis

Java 17

Node.js & npm

Docker + Docker Compose

Maven

▶️ Lancer le projet avec Docker
1. Aller à la racine du projet
cd atelier7JEE

2. Construire et démarrer les conteneurs
docker-compose up --build

3. Accéder aux services
Service	URL / Port
🔵 Angular	http://localhost:4200

🟢 Spring Boot	http://localhost:8080

🗄️ MySQL	localhost:3306 (root/root, DB = atelier7)
⚙️ Backend — Spring Boot

Spring Boot 3.x

Java 17

Spring Data JPA / Hibernate

Configuration (application.properties) :

spring.datasource.url=jdbc:mysql://db:3306/atelier7
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect

💻 Frontend — Angular

Angular 16+

Serveur local :

cd atelier7-frontend
ng serve

🗄️ Base de données MySQL

MySQL 8.x

Volume persistant : db-data

🔧 Commandes utiles
# Lancer tous les conteneurs
docker-compose up --build

# Arrêter les conteneurs
docker-compose down

# Supprimer volumes + reset BDD
docker-compose down -v

# Accès au terminal du backend
docker exec -it springboot-app bash

# Accès MySQL
docker exec -it atelier7-db mysql -u root -p

🛡️ Bonnes pratiques

Vérifier que les ports 4200 et 8080 sont libres

Utiliser des variables d’environnement en production (pas root/root)

Développement possible sans Docker (Angular + Spring Boot lancés séparément)

📚 Références

Spring Boot

Angular

Docker / Docker Compose

MySQL
