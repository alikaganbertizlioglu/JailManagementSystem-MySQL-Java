# Jail Management System

## Name – Surname: Ali Kağan Bertizlioğlu  
## Student ID: 19070001027

## Name of the Suggested Project: Jail Management System

### 1. Introduction
The Jail Management System is designed to be usable in any correctional facility. Given the extensive number of administrators, guards, staff, and prisoners, the associated data management becomes significantly complex. This system aims to streamline and simplify data management for all individuals involved, thereby enhancing operational efficiency.

### 2. Objectives
The primary objective of this database system is to define the structure, design, and implementation of a jail management system. The design ensures data maintenance, stability, cataloguing, and ease of access. Additionally, it facilitates the creation of meaningful and helpful statistics through basic queries, contributing to more straightforward administration. A desktop application using Java will also be developed as part of the project.

### 3. Scope of the Design
The database system will include the following entities:

- **People**: `peopleID`, Name, Surname, Birthdate, Gender, Address, phoneNumber
- **Guards**: `peopleID`, salary, height, weight
- **Prisoners**: `peopleID`, height, weight, hairColor, specificAppearance, `CellID`
- **Staff**: `peopleID`, Position, dateStarted, dateQuit, WorkingLength, `positionID`
- **StaffPositions**: `positionID`, salary, jobTitle, dutyExplanation
- **PrisonerStaff**: `peopleID`, workingReason, StartWorkDate, QuitWorkDate, `prisonerPositionID`
- **PrisonerPositions**: `prisonerPositionID`, jobTitle, DutyExplanation, hourlyFee
- **Cells**: `cellID`, cellName, cellCapacity
- **CriminalCases**: `caseID`, reasonOfCase, DangerLevel, punishmentStartDate, punishmentEndDate, `prisonerID`
- **OldPrisoners**: `peopleID`, ReasonRelease, ReleaseDate
- **Visitors**: `peopleID`, totalNumberOfVisits
- **Visits**: `visitID`, `peopleID`, VisitingReason, visitingDate
- **PrisonerProblems**: `problemID`, problemType, problemDescription, `peopleID`


#### Entity-Relationship Diagram (ERD)
![Entity Relationship Diagram](https://github.com/alikaganbertizlioglu/JailManagementSystem-MySQL-Java/assets/93092438/73f01eee-c6a3-4dfc-99a5-065d9351f973)


