INSERT INTO `beauty_saloon`.`locale`
    (`id`, `name`, `description`)
VALUES
    ('1', 'som', 'somth is somth');

INSERT INTO `beauty_saloon`.`bot_message_type`
    (`id`, `type`, `description`)
VALUES
    ('1', 'smthtype', 'smsas sa ');

INSERT INTO `beauty_saloon`.`bot_message`
    (`id`, `message_key`, `message`, `message_type_id`, `locale_id`, `description`)
VALUES
    ('1', 'KEY', 'MESSAGE', '1', '1', 'somth');

INSERT INTO `beauty_saloon`.`discount`
    (`discount_text`, `active`, `start_date`, `end_date`, `sent`, `url`)
VALUES
    ('sdsd', '1', '2020-09-05 14:36:04', '2020-09-06 14:36:04', '1', '1');


INSERT INTO `beauty_saloon`.`client`
    (`id`, `telegram_user_id`, `telegram_chat_id`, `phone_number`, `telegram_username`, `telegram_name`, `name`, `surname`, `comment`, `default_saloon`, `last_visit`, `confirmed`, `active`, `mailing_on`, `blocked`)
VALUES
    ('1', '12', '12', '431', '412312', 'sadas', 'sada', 'sad', 'sada', '1', NOW(), '1', '1', '0', '0');

INSERT INTO `beauty_saloon`.`client`
(`id`, `telegram_user_id`, `telegram_chat_id`, `phone_number`, `telegram_username`, `telegram_name`, `name`, `surname`, `comment`, `default_saloon`, `last_visit`, `confirmed`, `active`, `mailing_on`, `blocked`)
VALUES
('2', '123', '123', '4313', '4123123', 'sadassad', 'sadasa', 'sahjd', 'sadhgja', '1', NOW(), '1', '1', '0', '0');
