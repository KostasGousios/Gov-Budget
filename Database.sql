CREATE DATABASE STATEBUDGET;
USE STATEBUDGET;
-- Υπουργεία
CREATE TABLE ypourgeia (
    ypoyrgeio_id INT PRIMARY KEY AUTO_INCREMENT,
    onoma VARCHAR(100) NOT NULL
);
-- Λογαριασμοί υπουργείων
CREATE TABLE logariasmoi (
    logariasmos_id INT PRIMARY KEY AUTO_INCREMENT,
    onoma VARCHAR(100) NOT NULL,
    trexon_poso DOUBLE DEFAULT 0,
    ypourgeio_id INT NOT NULL,
    FOREIGN KEY (ypoyrgeio_id) REFERENCES ypourgeia(ypoyrgeio_id)
);
-- Ποσοστό που δίνεται σε κάθε λογαριασμό
CREATE TABLE pososta_logariasmon (
    pososto_id INT PRIMARY KEY AUTO_INCREMENT,
    pososto DOUBLE NOT NULL, 
    logariasmos_id INT NOT NULL,
    FOREIGN KEY (logariasmos_id) REFERENCES logariasmoi(logariasmos_id)
);
-- Tα προβλεπόμενα έσοδα και έξοδα για κάθε υπουργείο
CREATE TABLE provlepomena (
    provlepomena_id INT PRIMARY KEY AUTO_INCREMENT,
    misthoi DOUBLE NOT NULL,
    syntakseis DOUBLE NOT NULL,
    loipa DOUBLE NOT NULL,
    exoda_ypourgeia DOUBLE NOT NULL,
    foroi DOUBLE NOT NULL,
    daneia DOUBLE NOT NULL,
    loipa_esoda DOUBLE NOT NULL,
    tameio_arxiko DOUBLE NOT NULL,
    ypoyrgeio_id INT,
    FOREIGN KEY (ypoyrgeio_id) REFERENCES ypourgeia(ypoyrgeio_id)
);
-- Tα πραγματικά έσοδα και έξοδα που συνέβησαν μέσα στη χρονιά ανά υπουργείο και λογαριασμό
CREATE TABLE pragmatika_posa (
    kinisi_id INT PRIMARY KEY AUTO_INCREMENT,
    poso DOUBLE NOT NULL,
    typos ENUM('ESODO','EXODO') NOT NULL,
    imerominia DATE,
    ypoyrgeio_id INT,
    logariasmos_id INT,
    FOREIGN KEY (ypoyrgeio_id) REFERENCES ypourgeia(ypoyrgeio_id),
    FOREIGN KEY (logariasmos_id) REFERENCES logariasmoi(logariasmos_id)
);
-- Ελέγχει αν τα Υπουργεία έχουν ήδη δηλώσει τον προϋπολογισμό τους
CREATE TABLE isYpourgeiaPrepared (
    id INT PRIMARY KEY,
    ypoyrgeia_prepared BOOLEAN DEFAULT FALSE
); 
-- Αρχικοποίηση ως false
INSERT INTO isYpourgeiaPrepared VALUES (1, false); 
-- Οι χρήστες της εφαρμογής
CREATE TABLE users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(100) NOT NULL,
    role ENUM('PROTHYPOURGOS', 'PAIDEIA', 'YGEIA') NOT NULL
);
