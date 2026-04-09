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

---

### Task 5: Account Request Management (Queue & Admin Processing)
* **Description:** This task simulates an administrative workflow using a Queue for account applications. Instead of adding accounts directly to the main storage, they are placed in a registrationRequests queue. The administrator processes these requests using the approveNextRequest() method, which transfers the BankAccount object from the Queue (logical structure) to the LinkedList (main storage). This highlights the interaction between different data structures to maintain a controlled data flow.

* **Code Screenshot:** <img width="1292" height="476" alt="image" src="https://github.com/user-attachments/assets/0d661d70-db67-4870-8f97-484f23d6a4dd" />
* <img width="1285" height="613" alt="image" src="https://github.com/user-attachments/assets/37bd10cf-c189-40bf-a017-f745236f0534" />

* **Output Screenshot:**
* <img width="869" height="230" alt="image" src="https://github.com/user-attachments/assets/4bfee51a-977a-444f-bf06-4b549a9dde98" />

---

### Task 6: Frozen Accounts Archive (Physical Structure Implementation)
* **Description:** In the final task, I demonstrated the use of a physical data structure by implementing a fixed-size Array to store frozen accounts.

* **Code Screenshot:**<img width="1281" height="797" alt="image" src="https://github.com/user-attachments/assets/3529cb63-e69f-4db5-abe1-bbb9828e2191" />
* <img width="1284" height="556" alt="image" src="https://github.com/user-attachments/assets/17a87821-acae-47e5-90a7-dd93e88ca586" />

* **Output Screenshot:**
* <img width="629" height="345" alt="image" src="https://github.com/user-attachments/assets/b2faf7b0-c81c-4dc9-8fe0-cf6c71d27b56" />

---

## Part 3: Final Integration & User Interface
* **Description:** I combined all functionalities into a console-based interactive menu. This interface allows users to navigate between different data structure operations (e.g., managing the registration queue, processing transactions, or archiving accounts in the physical array). The use of a `switch-case` structure ensures clean control flow and demonstrates the practical integration of all assignment tasks into a single cohesive application.
* **UI Screenshot:** <img width="1280" height="822" alt="image" src="https://github.com/user-attachments/assets/1f801ea4-9013-49be-826e-8d172f425de7" />
* <img width="1280" height="388" alt="image" src="https://github.com/user-attachments/assets/1db5f3cd-c9ad-4f91-87d5-4f71c9a8fd20" />
* <img width="787" height="469" alt="image" src="https://github.com/user-attachments/assets/1d36e1b7-5864-46f6-9e92-725cc7e392de" />

---

## Work Process Summary
Work Process Summary
During the development of this Banking System, I focused on bridging the gap between Physical and Logical data structures. My work process followed these key stages:

Logical Organization: I started by implementing a LinkedList for account storage. This choice was deliberate because a bank needs a dynamic structure where accounts can be added or searched efficiently without pre-defining the total number of clients.

Behavioral Implementation: I integrated a Stack to handle transaction history. This allowed me to implement a LIFO (Last-In, First-Out) "Undo" feature, mimicking real-world software behavior where the most recent action is the first to be reverted.

Flow Management: I utilized Queue structures (FIFO) for two distinct purposes: managing pending account applications and a bill payment system. This demonstrated how data structures can control the "fairness" and order of operations in a system.

Physical Memory Constraints: Finally, I implemented a fixed-size Array to archive frozen accounts. This highlighted the limitations of physical structures, such as fixed capacity and the need for manual index management, providing a clear contrast to the flexible LinkedList.

Challenges Faced:
One significant challenge was managing the transition of data between different structures (e.g., moving an object from a Queue to a LinkedList upon approval). I solved this by ensuring consistent object references and implementing validation checks to prevent data loss.

Conclusion:
This project enhanced my understanding of how choosing the right data structure directly impacts the functionality and reliability of an application. The final integration into a console-based menu confirmed that these abstract concepts are essential for building cohesive, user-driven software.
