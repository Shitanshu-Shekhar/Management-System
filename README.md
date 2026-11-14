# Bank Management System

A Java Swing bank management application.

## Download for Windows

Download `BankManagementSystem-Windows-x64.zip` from the [GitHub Releases](https://github.com/Shitanshu-Shekhar/Management-System/releases) page. Extract it and run `BankManagementSystem.exe`. The package includes a Java runtime.

The application uses a local MySQL database named `bankSystem`. Before starting it, set these Windows environment variables for your account:

- `BANK_DB_URL` (optional; defaults to `jdbc:mysql://localhost:3306/bankSystem`)
- `BANK_DB_USER` (optional; defaults to `root`)
- `BANK_DB_PASSWORD` (required)

Create/configure the database and schema before using sign-in and banking features.

## Build

Run `mvn clean package` with JDK 17 and Maven. The GitHub Actions workflow builds a Windows package on pushes to `main`; pushing a `v*` tag also publishes a GitHub Release.
