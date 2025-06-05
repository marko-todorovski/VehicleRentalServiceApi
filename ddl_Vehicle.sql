CREATE TABLE vehicle
(
    id    BIGINT AUTO_INCREMENT NOT NULL,
    brand VARCHAR(255)          NULL,
    model VARCHAR(255)          NULL,
    type  VARCHAR(255)          NULL,
    CONSTRAINT pk_vehicle PRIMARY KEY (id)
);
INSERT INTO vehicle (id, brand, model, type) VALUES
(1, 'Toyota', 'Corolla', 'Sedan'),
(2, 'Honda', 'Civic', 'Sedan'),
(3, 'Ford', 'Transit', 'Van');
SELECT * FROM vehicle;

CREATE TABLE maintenance (
id BIGINT PRIMARY KEY,
 vehicleId BIGINT,
description VARCHAR(255),
maintenanceDate DATE
);
INSERT INTO maintenance (id, vehicleId, description, maintenanceDate) VALUES
(1, 1, 'Oil change', '2025-06-01'),
(2, 2, 'Brake replacement', '2025-06-02'),
(3, 3, 'Tire rotation', '2025-06-03');
SELECT * FROM maintenance;

CREATE TABLE damage_report (
 id BIGINT PRIMARY KEY,
bookingId BIGINT,
description VARCHAR(255),
estimatedCost DOUBLE,
reportDate DATE
);
INSERT INTO damage_report (id, bookingId, description, estimatedCost, reportDate) VALUES
(1, 101, 'Broken side mirror', 150.0, '2025-06-01'),
(2, 102, 'Scratched door', 200.0, '2025-06-02'),
(3, 103, 'Cracked windshield', 400.0, '2025-06-03');
SELECT * FROM damage_report;

CREATE TABLE invoice (
id BIGINT PRIMARY KEY,
bookingid BIGINT,
amount DOUBLE,
invoiceDate DATE
);
INSERT INTO invoice (id, bookingid, amount, invoiceDate) VALUES
(1, 101, 1200.0, '2025-06-04'),
(2, 102, 850.0, '2025-06-04'),
(3, 103, 990.0, '2025-06-04');
SELECT * FROM invoice;



