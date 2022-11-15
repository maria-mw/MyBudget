INSERT INTO `easybudget`.`financial_institute` (`id`, `bic`, `comments`, `is_actual`, `title`) VALUES ('1', '1001', 'ВТБ', b'1', 'VTB');
INSERT INTO `easybudget`.`financial_institute` (`id`, `bic`, `comments`, `is_actual`, `title`) VALUES ('2', '2002', 'Сбер', b'1', 'Sber');
INSERT INTO `easybudget`.`financial_institute` (`id`, `bic`, `comments`, `is_actual`, `title`) VALUES ('3', '3003', 'Дом', b'1', 'Home');
INSERT INTO `easybudget`.`financial_institute` (`id`, `bic`, `comments`, `is_actual`, `title`) VALUES ('4', '4004', 'Санкт-Петербург', b'1', 'SPB');
INSERT INTO `easybudget`.`financial_institute` (`id`, `bic`, `comments`, `is_actual`, `title`) VALUES ('5', '5005', 'Юникредит', b'1', 'Unicredit');

INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('1','дебетовый',b'1','Расчетный');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('2','кредитный',b'1','Кредитный');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('3','вклады',b'1','Депозитный');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('4','для социальных выплат',b'1','Бюджетный');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('5','операции с наличными',b'1','Наличные');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('6','внешний источник',b'1','Внешний источник');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('7','зарплата',b'1','Зарплатный');
INSERT INTO `easybudget`.`account_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('8','основной счет',b'1','Основной');

INSERT INTO `easybudget`.`currency_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('1','рубль',b'1','RUB');
INSERT INTO `easybudget`.`currency_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('2','евро',b'1','EUR');
INSERT INTO `easybudget`.`currency_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('3','доллар США',b'1','USD');
INSERT INTO `easybudget`.`currency_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('4','турецкая лира ',b'1','TRY');
INSERT INTO `easybudget`.`currency_type` (`id`, `comments`, `is_actual`, `title`) VALUES ('5','тайский бат',b'1','THB');

INSERT INTO `easybudget`.`transaction_type` (`id`, `comments`, `title`) VALUES ('1','дебет','Зачисление');
INSERT INTO `easybudget`.`transaction_type` (`id`, `comments`, `title`) VALUES ('2','кредит','Списание');
INSERT INTO `easybudget`.`transaction_type` (`id`, `comments`, `title`) VALUES ('3','внутренние переводы','Между счетами');

INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('1', '', b'1', 'Питание', '2', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('2', '', b'1', 'Продукты', '2', '1');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('3', '', b'1', 'Общепит', '2', '1');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('4', '', b'1', 'Доставки', '2', '1');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('5', '', b'1', 'Развлечения', '2', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('6', '', b'1', 'Кино', '2', '5');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('7', '', b'1', 'Театр', '2', '5');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('8', '', b'1', 'Музеи', '2', '5');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('9', '', b'1', 'Ресторан', '2', '5');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`,`transaction_type_id`, `super_category_id`) VALUES ('10', '', b'1', 'Другое', '2', '5');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('11', '', b'1', 'Здоровье', '2', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('12', '', b'1', 'Лекарства', '2', '11');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`,`transaction_type_id`, `super_category_id`) VALUES ('13', '', b'1', 'Мед.услуги', '2', '11');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('14', '', b'1', 'Дом', '2', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('15', '', b'1', 'Квартплата', '2', '14');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('16', '', b'1', 'Интернет', '2', '14');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('17', '', b'1', 'Автомобиль', '2', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('18', '', b'1', 'Заправка', '2', '17');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('19', '', b'1', 'Старховка', '2', '17');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('20', '', b'1', 'Техобслуживание', '2', '17');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('21', '', b'1', 'От юрлиц', '1', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('22', '', b'1', 'Основная работа', '1', '21');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('23', '', b'1', 'Дополнительная работа', '1', '21');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('24', '', b'1', 'Фриланс', '1', '21');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('25', '', b'1', 'Прочее', '1', '21');
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('26', '', b'1', 'От физлиц', '1', null);
INSERT INTO `easybudget`.`transaction_category` (`id`, `comments`, `is_actual`, `title`, `transaction_type_id`, `super_category_id`) VALUES ('27', '', b'1', 'Внутренние переводы', '3', null);

# DROP PROCEDURE IF EXISTS `get_subcategories_by_catogory_id`;
# DELIMITER //
# CREATE PROCEDURE `get_subcategories_by_category_id`(IN category_id INT)
# BEGIN
#     SELECT `title` FROM `easybudget`.`transaction_category` WHERE `super_category_id` = `category_id`;
# END//
# DELIMITER ;