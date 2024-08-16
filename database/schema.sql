CREATE TABLE Requirement (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT
);

CREATE TABLE Testlauf (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    startDate DATE,
    endDate DATE
);

CREATE TABLE Testfall (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    description TEXT,
    requirementId INT,
    FOREIGN KEY (requirementId) REFERENCES Requirement(id)
);

CREATE TABLE Tester (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL
);

CREATE TABLE Ergebnis (
    id INT AUTO_INCREMENT PRIMARY KEY,
    status VARCHAR(255) NOT NULL,
    comment TEXT,
    testCaseId INT,
    testerId INT,
    FOREIGN KEY (testCaseId) REFERENCES Testfall(id),
    FOREIGN KEY (testerId) REFERENCES Tester(id)
);

