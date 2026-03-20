# Backend Microservices

This repository contains backend services developed in Java using the Spring Boot framework. The architecture is based on microservices, structured to handle different domains of a store application independently.

## Project Structure

The source code is organized into two main, independent services:

* **springboot-service-celulares**: A microservice dedicated to managing resources and operations related to mobile phones (inventory, product details, etc.).
* **springboot-service-store**: A microservice that acts as the central hub for the store, designed to handle business logic and interact with the mobile phone service.

## Technologies Used

* **Main Language:** Java
* **Framework:** Spring Boot
* **Architecture:** Microservices

## About the Project

This project illustrates the implementation of a decoupled backend architecture. Each folder in this repository represents a distinct Spring Boot project, with its own dependencies and business logic. This structure allows for the independent development, testing, and scaling of each individual service.
