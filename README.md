# ADS_Assignment2_BankingSystem
# Assignment 2: Physical & Logical Data Structures
**Student:** Aben Aibar 
**Group:** IT-2504

## Introduction
This project simulates a banking system using various data structures in Java, such as LinkedList, Stack, Queue, and Arrays.

---

## Part 1: Logical Data Structures

### Task 1: Account Storage (LinkedList)
* **Description:** Implemented a `LinkedList` to store `BankAccount` objects and created a search function by username.
* **Code Screenshot:** <img width="1134" height="633" alt="image" src="https://github.com/user-attachments/assets/5a481438-666e-444b-84da-181fe2a8be1c" />
*  <img width="1022" height="627" alt="image" src="https://github.com/user-attachments/assets/da9067c8-9842-412a-99ae-e3b1fd08c864" />

* **Output Screenshot:**
    <img width="871" height="398" alt="image" src="https://github.com/user-attachments/assets/ac6c7cd9-b88b-46b7-a10f-ab7fcf842fd5" />

---

### Task 2: Banking Operations (Deposit & Withdraw)
* **Description:** In this task, I implemented the core banking logic for managing account balances. I added deposit and withdraw methods to the BankRegistry class. The system first uses the search functionality from Task 1 to locate the account in the LinkedList. It then performs validation: ensuring deposit amounts are positive and verifying that a user has sufficient funds before allowing a withdrawal. This demonstrates how logical structures can be manipulated to reflect real-world constraints.
* **Code Screenshot:** <img width="1281" height="928" alt="image" src="https://github.com/user-attachments/assets/536c9bb0-f97b-435f-8103-9b955e2dca48" />
*  <img width="1285" height="428" alt="image" src="https://github.com/user-attachments/assets/f0533816-0fe0-4e71-96eb-93873156305f" />

* **Output Screenshot:**
* <img width="685" height="383" alt="image" src="https://github.com/user-attachments/assets/387cc58b-590b-439e-add3-50bc7ab1ac81" />
    

---

### Task 3: Transaction History (Stack Implementation)
* **Description:** This task demonstrates the use of a Stack data structure to manage transaction history. I implemented a LIFO (Last-In, First-Out) mechanism where each significant action (account creation, deposit, or withdrawal) is pushed onto the stack as a string record. This allows for a "Undo" feature, where the undoLastAction() method pops the most recent transaction from the stack, and showLastAction() uses the peek() operation to view the latest entry without removing it.

* **Code Screenshot:** <img width="1283" height="930" alt="image" src="https://github.com/user-attachments/assets/cee813b9-7e2c-4101-95c2-6f76ac954555" />
<img width="1278" height="694" alt="image" src="https://github.com/user-attachments/assets/812a943d-8c93-4802-9bc0-6477ef95a657" />

* **Output Screenshot:**
* <img width="685" height="274" alt="image" src="https://github.com/user-attachments/assets/9c7d309f-5243-4072-8b86-6a194edcbb16" />

---

### Task 4: Bill Payment Processing (Queue Implementation)
* **Description:** In this task, I implemented a bill payment system using the Queue data structure. A LinkedList is utilized to function as a FIFO (First-In, First-Out) queue. This ensures that bills are processed in the exact order they were received. I added methods to add bills to the queue (addBillToQueue), process the next available bill (processNextBill), and display all pending payments. This demonstrates the practical application of linear logical structures in managing sequential tasks.

* **Code Screenshot:** <img width="1283" height="669" alt="image" src="https://github.com/user-attachments/assets/7aaa5c57-53c8-46ba-abd7-3f477b71bca0" />
* <img width="1285" height="478" alt="image" src="https://github.com/user-attachments/assets/5bf45bff-f505-4795-bfd0-10d1b375ce50" />

* **Output Screenshot:**
* <img width="886" height="277" alt="image" src="https://github.com/user-attachments/assets/b07c16c0-c6cf-477d-81c4-c61c0569e6ce" />



## Work Process Summary
In this assignment, I learned how to apply different logical structures to real-world scenarios. 
One challenge was [напишите здесь проблему, например: organizing the project into separate classes], 
which I solved by [creating a clear structure with BankAccount and BankRegistry classes].
