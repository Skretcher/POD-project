/*
 * id;
	private String name;
	private String password;
	private Long mobile;
	private String mailId;
	private Date regDate;
 */

 
CREATE TABLE `app_user` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NOT NULL,
  `password` VARCHAR(45) NULL,
  `mobile` INT NULL,
  `mail_Id` VARCHAR(45) NULL,
  `reg_Date` DATE NULL,
  PRIMARY KEY (`id`));
  