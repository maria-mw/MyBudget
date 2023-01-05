INSERT INTO `mybudget`.`currency` (`id`, `title`, `comments`) VALUES ('1', 'RUB', 'рубль');
INSERT INTO `mybudget`.`currency` (`id`, `title`, `comments`) VALUES ('2', 'USD', 'доллар США');
INSERT INTO `mybudget`.`currency` (`id`, `title`, `comments`) VALUES ('3', 'EUR', 'евро');

INSERT INTO `mybudget`.`type` (`id`, `title`, `comments`) VALUES ('1', 'Зачисление', '');
INSERT INTO `mybudget`.`type` (`id`, `title`, `comments`) VALUES ('2', 'Списание', '');

INSERT INTO `mybudget`.`status` (`id`, `title`, `comments`) VALUES ('1', 'Проведен', '');
INSERT INTO `mybudget`.`status` (`id`, `title`, `comments`) VALUES ('2', 'Отменен', '');
INSERT INTO `mybudget`.`status` (`id`, `title`, `comments`) VALUES ('3', 'План', '');

INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('1', 'Питание','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('2', 'Автомобиль','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('3', 'Ком.платежи','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('4', 'Путешествия','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('5', 'Дом','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('6', 'Обучение','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('7', 'Развлечения','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('8', 'Медицина','2', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('9', 'Зарплата','1', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('10', 'Доход','1', '');
INSERT INTO `mybudget`.`category` (`id`, `title`, `type_id`, `comments`) VALUES ('11', 'Расход','2', '');


INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('1','Магазин', '1', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('2', 'Общепит', '1', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('3', 'Доставка', '1', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('4', 'Бензин', '2', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('5', 'КАСКО', '2', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('6', 'ОСАГО', '2', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('7','Техобслуживание', '2', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('8', 'Мойка', '2', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('9', 'Квартплата', '3', '');
INSERT INTO `mybudget`.`Subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('10', 'Электричество', '3', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('11', 'Интернет', '3', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('12', 'Тур', '4', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('13', 'Билеты', '4', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('14', 'Отель', '4', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('15', 'Экскурсии', '4', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('16', 'Доп расходы', '4', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('17', 'Мебель', '5', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('18', 'Ремонт', '5', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('19', 'Прочее', '5', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('20', 'Книги', '6', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('21', 'Курсы', '6', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('22', 'Кино', '7', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('23', 'Музей', '7', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('24', 'Театр', '7', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('25', 'Ресторан', '7', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('26', 'Прочее', '7', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('27','Страховка', '8', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('28', 'Аптека', '8', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('29', 'Больница', '8', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('30', 'Прочее', '8', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('31', 'Основная зп', '9', '');
INSERT INTO `mybudget`.`subcategory` (`id`, `title`, `category_id`, `comments`) VALUES ('32', 'Фриланс', '9', '');


# INSERT INTO `mybudget`.`Transaction` (`id`, `comments`, `title`) VALUES ('1','дебет','Зачисление');
# INSERT INTO `mybudget`.`Transaction` (`id`, `comments`, `title`) VALUES ('2','кредит','Списание');
# INSERT INTO `mybudget`.`Transaction` (`id`, `comments`, `title`) VALUES ('3','внутренние переводы','Между счетами');
#

# DROP PROCEDURE IF EXISTS `get_subcategories_by_catogory_id`;
# DELIMITER //
# CREATE PROCEDURE `get_subcategories_by_category_id`(IN category_id INT)
# BEGIN
#     SELECT `title` FROM `easybudget`.`transaction_category` WHERE `super_category_id` = `category_id`;
# END//
# DELIMITER ;