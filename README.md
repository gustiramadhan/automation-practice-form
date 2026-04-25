# 📘 Automation Practice Form (Katalon Guide)
## 📌 Deskripsi

Project ini berisi automation test untuk practice form (DemoQA / sejenisnya) yang dapat dijalankan menggunakan Katalon Studio.

Tujuan project:

 - Latihan automation web form
 - Memahami input field, dropdown, checkbox, upload file
 - Implementasi test case di Katalon

---

## ⚙️ Requirements

Pastikan sudah install:

Java JDK 8 / 11
 - Katalon Studio
 - Browser:
     - Google Chrome (disarankan)
 - Git

---

## 📥 Clone Repository
```bash
git clone https://github.com/gustiramadhan/automation-practice-form.git
cd automation-practice-form
```
---

## 📂 Import Project ke Katalon
 1. Buka Katalon Studio
 2. Klik File → Open Project
 3. Pilih folder hasil clone:
```
automation-practice-form
```
 4. Klik OK

---

## ⚙️ Konfigurasi Sebelum Run

1. Set Browser
   - Buka
```
Project → Settings → Execution
```
2. Pilih browser: Chrome

3. Set Execution Profile
   - Buka dan pastikan URL dan variable sudah sesuai
```
Profiles → default
```

4. Install WebDriver (Jika diminta)

Biasanya otomatis, tapi jika error:
   - Klik 
```
Tools → Update WebDrivers
```

---
   
## ▶️ Cara Menjalankan Test

   ### 🔹 Run Test Case
   1. Buka:
```
Test Cases/
```
   3. Klik kanan test case
   4. Klik:
```
Run → Chrome
```

  ### 🔹 Run Test Suite
   1. Buka:
```
Test Suites/
```
   3. Klik kanan test Suites
   4. Klik:
```
Run
```
