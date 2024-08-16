INSERT INTO Requirement (name, description) VALUES 
('Login-Funktionalität', 'Stellen Sie sicher, dass sich Benutzer mit ihren Anmeldedaten einloggen können.'),
('Registrierungsfunktionalität', 'Stellen Sie sicher, dass neue Benutzer sich mit gültigen Informationen registrieren können.'),
('Passwort zurücksetzen', 'Ermöglicht den Benutzern, ihr Passwort zurückzusetzen, wenn sie es vergessen haben.');

INSERT INTO Testlauf (name, description, startDate, endDate) VALUES 
('Testlauf 1', 'Erstes Testen der Login- und Registrierungsfunktionen.', '2024-08-01', '2024-08-07'),
('Testlauf 2', 'Testen der Funktion zum Zurücksetzen des Passworts.', '2024-08-08', '2024-08-12');

INSERT INTO Testfall (name, description, requirementId) VALUES 
('Testfall 1', 'Überprüfen Sie den Login mit gültigen Anmeldedaten.', 1),
('Testfall 2', 'Überprüfen Sie den Login mit ungültigen Anmeldedaten.', 1),
('Testfall 3', 'Überprüfen Sie die Registrierung mit gültigen Details.', 2),
('Testfall 4', 'Überprüfen Sie die Registrierung mit einer bereits bestehenden E-Mail-Adresse.', 2),
('Testfall 5', 'Überprüfen Sie das Zurücksetzen des Passworts mit einer gültigen E-Mail-Adresse.', 3);

INSERT INTO Tester (name, email) VALUES 
('Philipp', 'philipp.sommer@beispielmail.com'),
('Sommer', 'manuel.sommer@beispielmail.com');

INSERT INTO Ergebnis (status, comment, testCaseId, testerId) VALUES 
('Bestanden', 'Login mit gültigen Anmeldedaten funktioniert wie erwartet!', 1, 1),
('Fehlgeschlagen', 'Login mit ungültigen Anmeldedaten zeigt keine passende Fehlermeldung an!', 2, 1),
('Bestanden', 'Registrierung mit gültigen Details ist erfolgreich!', 3, 2),
('Fehlgeschlagen', 'Registrierung mit bereits bestehender E-Mail-Adresse zeigt keine passende Fehlermeldung an!', 4, 2),
('Bestanden', 'Zurücksetzen des Passworts mit gültiger E-Mail-Adresse funktioniert!', 5, 1);

