# 🧼 Cleaner App – Cleaning Business Platform

This is the **Cleaner App** for the multi-platform cleaning business solution. It's built with **JetBrains Compose Multiplatform** to run on **Android, iOS, Desktop, and Web**, and connects to a **FastAPI backend** for authentication, job management, and scheduling.

---

## 📱 App Overview

The Cleaner App is used by cleaning staff to:

- View upcoming jobs
- Mark jobs as completed
- Update their availability
- Receive real-time updates and notifications

---

## 🧰 Tech Stack

| Layer      | Tech                          |
|------------|-------------------------------|
| UI         | JetBrains Compose Multiplatform |
| Networking | Ktor Client                   |
| State      | Kotlinx Coroutines, Flow      |
| Storage    | Encrypted Shared Preferences (Android), SecureStorage (iOS) |
| Backend    | FastAPI                       |
| Auth       | JWT                           |

---

## 🚀 Features

- 🔐 Secure login and token-based authentication
- 📆 View assigned bookings with details
- ✅ Mark jobs as "in progress" or "complete"
- 🕒 Update personal availability
- 🔔 Push notification integration (optional/future)
- 🔄 Syncs data in real-time with backend

---

## 🏗️ Project Structure

