DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
  empId VARCHAR(10) NOT NULL,
  empName VARCHAR(100) NOT NULL,
  empMob VARCHAR(255),
  empEmail VARCHAR(255),
  empJobPos VARCHAR(255)
);