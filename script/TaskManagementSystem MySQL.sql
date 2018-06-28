DROP TABLE IF EXISTS `EMPLOYEE`;
CREATE TABLE `EMPLOYEE` (
  `EMPLOYEE_ID` INT(11) NOT NULL AUTO_INCREMENT,
  `FIRSTNAME` VARCHAR(50) NOT NULL,
  `LASTNAME` VARCHAR(50) NOT NULL,
  `DEPARTMENT` VARCHAR(50) NOT NULL,
  `HOLIDAY` VARCHAR(50) NOT NULL,
  `CONFIRM_HOLIDAY` VARCHAR(50),
  `SALARY` INT(10) NOT NULL,
  PRIMARY KEY (`EMPLOYEE_ID`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


INSERT INTO `EMPLOYEE` (`EMPLOYEE_ID`, `FIRSTNAME`, `LASTNAME`, `DEPARTMENT`, `HOLIDAY`, `CONFIRM_HOLIDAY`, `SALARY`)
VALUES
	(1, 'Sam', 'Disilva', 'design', 'choice', 'agree/disagree', 1000),
	(2, 'Kevin', 'Brayn', 'testing', 'choice', 'agree/disagree', 2000),
	(3, 'Nina', 'Conor', 'business', 'choice', 'agree/disagree', 3000),
	(4, 'Tito', 'Menz', 'development', 'choice', 'agree/disagree', 4000);

commit;
