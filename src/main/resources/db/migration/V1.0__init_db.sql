-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS = @@UNIQUE_CHECKS, UNIQUE_CHECKS = 0;
SET @OLD_FOREIGN_KEY_CHECKS = @@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS = 0;
SET @OLD_SQL_MODE = @@SQL_MODE, SQL_MODE =
        'ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema beauty_saloon
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema beauty_saloon
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `beauty_saloon` DEFAULT CHARACTER SET latin1;
USE `beauty_saloon`;

-- -----------------------------------------------------
-- Table `beauty_saloon`.`client`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`client`
(
    `id`                INT          NOT NULL AUTO_INCREMENT,
    ` telegram_user_id` INT          NOT NULL,
    ` telegram_chat_id` INT          NOT NULL,
    `phone_number`      VARCHAR(15)  NOT NULL,
    `telegram_username` VARCHAR(128) NOT NULL,
    `telegram_name`     VARCHAR(128) NULL,
    `name`              VARCHAR(45)  NULL,
    `surname`           VARCHAR(45)  NULL,
    `comment`           VARCHAR(512) NULL,
    `default_saloon`    INT          NULL,
    `last_visit`        DATETIME     NULL,
    `confirmed`         TINYINT      NULL,
    `active`            TINYINT      NULL,
    `mailing_on`        TINYINT      NULL,
    `blocked`           TINYINT      NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`service_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`service_type`
(
    `id`           INT          NOT NULL AUTO_INCREMENT,
    `service_name` VARCHAR(128) NOT NULL,
    `price`        INT          NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`employee`
(
    `id`              INT         NOT NULL AUTO_INCREMENT,
    `name`            VARCHAR(45) NOT NULL,
    `surname`         VARCHAR(45) NULL,
    `nickname`        VARCHAR(45) NULL,
    `saloon_id`       INT         NOT NULL,
    `service_type_id` INT         NOT NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`calendar`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`calendar`
(
    `id`          INT      NOT NULL AUTO_INCREMENT,
    `day`         DATETIME NOT NULL,
    `employee_id` INT      NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `employee_id_idx` (`employee_id` ASC),
    CONSTRAINT `employee_id`
        FOREIGN KEY (`employee_id`)
            REFERENCES `beauty_saloon`.`employee` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`time_slot`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`time_slot`
(
    `id`          INT      NOT NULL AUTO_INCREMENT,
    `employee_id` INT      NOT NULL,
    `day_id`      INT      NOT NULL,
    `start_time`  DATETIME NOT NULL,
    `end_time`    DATETIME NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `employee_id_idx` (`employee_id` ASC),
    INDEX `day_id_idx` (`day_id` ASC),
    CONSTRAINT `time_slot_employee_id`
        FOREIGN KEY (`employee_id`)
            REFERENCES `beauty_saloon`.`employee` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `time_slot_day_id`
        FOREIGN KEY (`day_id`)
            REFERENCES `beauty_saloon`.`calendar` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`order`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`order`
(
    `id`           INT          NOT NULL AUTO_INCREMENT,
    `client_id`    INT          NOT NULL,
    `time_slot_id` INT          NOT NULL,
    `employee_id`  INT          NOT NULL,
    `service_id`   INT          NOT NULL,
    `comment`      VARCHAR(512) NULL,
    `executed`     TINYINT      NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `client_id_idx` (`client_id` ASC),
    INDEX `service_id_idx` (`service_id` ASC),
    INDEX `time_slot_id_idx` (`time_slot_id` ASC),
    INDEX `employee_id_idx` (`employee_id` ASC),
    CONSTRAINT `order_client_id`
        FOREIGN KEY (`client_id`)
            REFERENCES `beauty_saloon`.`client` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `order_service_id`
        FOREIGN KEY (`service_id`)
            REFERENCES `beauty_saloon`.`service_type` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `order_time_slot_id`
        FOREIGN KEY (`time_slot_id`)
            REFERENCES `beauty_saloon`.`time_slot` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `order_employee_id`
        FOREIGN KEY (`employee_id`)
            REFERENCES `beauty_saloon`.`employee` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`discount`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`discount`
(
    `id`            INT          NOT NULL AUTO_INCREMENT,
    `discount_text` VARCHAR(512) NULL,
    `active`        TINYINT      NULL,
    `start_date`    DATETIME     NULL,
    `end_date`      DATETIME     NULL,
    `sent`          TINYINT      NULL,
    `url`           VARCHAR(512) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`client_comment`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`client_comment`
(
    `id`               INT           NOT NULL AUTO_INCREMENT,
    `client_id`        INT           NOT NULL,
    `order_id`         INT           NOT NULL,
    `comment_text`     VARCHAR(1024) NOT NULL,
    `positive`         TINYINT       NULL,
    `stars`            INT           NULL,
    `sent_to_director` TINYINT       NULL,
    `reviewed`         TINYINT       NULL,
    `saloon_comment`   VARCHAR(1024) NULL,
    PRIMARY KEY (`id`),
    INDEX `client_id_idx` (`client_id` ASC),
    INDEX `order_id_idx` (`order_id` ASC),
    CONSTRAINT `client_id`
        FOREIGN KEY (`client_id`)
            REFERENCES `beauty_saloon`.`client` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `order_id`
        FOREIGN KEY (`order_id`)
            REFERENCES `beauty_saloon`.`order` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`price`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`price`
(
    `id`  INT          NOT NULL AUTO_INCREMENT,
    `url` VARCHAR(256) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`remainder`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`remainder`
(
    `id`              INT          NOT NULL AUTO_INCREMENT,
    `service_type_id` INT          NOT NULL,
    `remainder_text`  VARCHAR(512) NOT NULL,
    `delay_days`      INT          NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    CONSTRAINT `service_type_id`
        FOREIGN KEY (`id`)
            REFERENCES `beauty_saloon`.`service_type` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`saloon`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`saloon`
(
    `id`      INT          NOT NULL AUTO_INCREMENT,
    `name`    VARCHAR(128) NOT NULL,
    `address` VARCHAR(128) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`role`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`role`
(
    `id`   INT         NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`user`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`user`
(
    `id`       INT         NOT NULL AUTO_INCREMENT,
    `login`    VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    `role_id`  INT         NOT NULL,
    `email`    VARCHAR(45) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `role_id_idx` (`role_id` ASC),
    CONSTRAINT `role_id`
        FOREIGN KEY (`role_id`)
            REFERENCES `beauty_saloon`.`role` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`business_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`business_type`
(
    `id`  INT         NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`bot_message_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`bot_message_type`
(
    `id`          INT         NOT NULL AUTO_INCREMENT,
    `type`        VARCHAR(45) NOT NULL,
    `description` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`locale`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`locale`
(
    `id`          INT         NOT NULL AUTO_INCREMENT,
    `name`        VARCHAR(3)  NOT NULL,
    `description` VARCHAR(45) NULL,
    PRIMARY KEY (`id`)
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`bot_message`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`bot_message`
(
    `id`              INT          NOT NULL AUTO_INCREMENT,
    `message_key`     VARCHAR(45)  NOT NULL,
    `message`         VARCHAR(512) NOT NULL,
    `message_type_id` INT          NOT NULL,
    `locale_id`       INT          NOT NULL,
    `description`     VARCHAR(256) NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `message_type_id_idx` (`message_type_id` ASC),
    INDEX `locale_id_idx` (`locale_id` ASC),
    CONSTRAINT `message_type_id`
        FOREIGN KEY (`message_type_id`)
            REFERENCES `beauty_saloon`.`bot_message_type` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `locale_id`
        FOREIGN KEY (`locale_id`)
            REFERENCES `beauty_saloon`.`locale` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `beauty_saloon`.`saloon_service_type`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `beauty_saloon`.`saloon_service_type`
(
    `id`              INT          NOT NULL AUTO_INCREMENT,
    `saloon_id`       INT NOT NULL,
    `service_type_id` INT NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `id_UNIQUE` (`id` ASC),
    INDEX `saloon_id_idx` (`saloon_id` ASC),
    INDEX `service_type_id_idx` (`service_type_id` ASC),
    CONSTRAINT `saloon_service_type_saloon_id`
        FOREIGN KEY (`saloon_id`)
            REFERENCES `beauty_saloon`.`saloon` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `saloon_service_type_service_type_id`
        FOREIGN KEY (`service_type_id`)
            REFERENCES `beauty_saloon`.`service_type` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
)
    ENGINE = InnoDB;


SET SQL_MODE = @OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS = @OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS = @OLD_UNIQUE_CHECKS;
