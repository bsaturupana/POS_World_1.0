--  "possworld"."role_master"  --

INSERT INTO `posworld`.`role_master` (`rm_role_id`, `rm_role_name`) VALUES ('1', 'Super');
INSERT INTO `posworld`.`role_master` (`rm_role_id`, `rm_role_name`) VALUES ('2', 'Billing');
INSERT INTO `posworld`.`role_master` (`rm_role_id`, `rm_role_name`) VALUES ('3', 'Showroom');
INSERT INTO `posworld`.`role_master` (`rm_role_id`, `rm_role_name`) VALUES ('4', 'Stores');
INSERT INTO `posworld`.`role_master` (`rm_role_id`, `rm_role_name`) VALUES ('5', 'Accounts');


--  "posworld"."question_master"  --

INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('1', 'USER_QS1', 'What high school did you attend?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('2', 'USER_QS1', 'What was your high school nickname?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('3', 'USER_QS1', 'What is the name of your first school?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('4', 'USER_QS1', 'What is the name of your favorite pet?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('5', 'USER_QS1', 'What is the maiden name of your mother?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('6', 'USER_QS1', 'What is the middle name of your father?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('7', 'USER_QS1', 'What is the name of your first grade teacher?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('8', 'USER_QS1', 'What is the first name of your first boyfriend?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('9', 'USER_QS1', 'What is the first name of your first girlfriend?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('10', 'USER_QS1', 'What was your favorite place to visit as a child?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('11', 'USER_QS2', 'When is your anniversary?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('12', 'USER_QS2', 'Who is your favorite actor?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('13', 'USER_QS2', 'What is your favorite color?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('14', 'USER_QS2', 'Who is your favorite artist?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('15', 'USER_QS2', 'What is your favorite movie?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('16', 'USER_QS2', 'Who is your favorite musician?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('17', 'USER_QS2', 'What is the city you were born?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('18', 'USER_QS2', 'What street did you grow up on?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('19', 'USER_QS2', 'Which is your favorite web browser?');
INSERT INTO `posworld`.`question_master` (`qm_question_id`, `qm_question_type`, `qm_question_name`) VALUES ('20', 'USER_QS2', 'What was the make of your first car?');


--  "posworld"."province_master"  --

INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('1', 'Central Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('2', 'Eastern Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('3', 'Northern Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('4', 'Southern Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('5', 'Western Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('6', 'North Western Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('7', 'North Central Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('8', 'Uva Province');
INSERT INTO `posworld`.`province_master` (`pm_province_id`, `pm_province_name`) VALUES ('9', 'Sabaragamuwa Province');


--  "posworld"."district_master"  --

INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('1', 'Ampara', '2');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('2', 'Anuradhapura', '7');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('3', 'Badulla', '8');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('4', 'Batticaloa', '2');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('5', 'Colombo', '5');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('6', 'Galle', '4');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('7', 'Gampaha', '5');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('8', 'Hambantota', '4');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('9', 'Jaffna', '3');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('10', 'Kalutara', '5');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('11', 'Kandy', '1');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('12', 'Kegalle', '9');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('13', 'Kilinochchi', '3');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('14', 'Kurunegala', '6');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('15', 'Mannar', '3');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('16', 'Matale', '1');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('17', 'Matara', '4');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('18', 'Monaragala', '8');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('19', 'Mullaitivu', '3');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('20', 'Nuwara Eliya', '1');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('21', 'Polonnaruwa', '7');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('22', 'Puttalam', '6');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('23', 'Ratnapura', '9');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('24', 'Trincomalee', '2');
INSERT INTO `posworld`.`district_master` (`dm_district_id`, `dm_district_name`, `dm_district_province_id`) VALUES ('25', 'Vavuniya', '3');


--  "posworld"."city_master"  --

INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('1', 'Colombo 1 - Fort', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('2', 'Colombo 2 - Slave Island', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('3', 'Colombo 2 - Union Place', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('4', 'Colombo 3 - Kollupitiya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('5', 'Colombo 4 - Bambalapitiya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('6', 'Colombo 5 - Havelock Town', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('7', 'Colombo 5 - Kirulapana', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('8', 'Colombo 5 - Kirilapone North', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('9', 'Colombo 6 - Wellawatte', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('10', 'Colombo 6 - Pamankada', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('11', 'Colombo 7 - Cinnamon Gardens', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('12', 'Colombo 8 - Borella', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('13', 'Colombo 9 - Dematagoda', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('14', 'Colombo 10 - Maradana', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('15', 'Colombo 10 - Panchikawatte', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('16', 'Colombo 11 - Pettah', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('17', 'Colombo 12 - Hultsdorf', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('18', 'Colombo 13 - Kotahena', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('19', 'Colombo 13 - Bloemendhal', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('20', 'Colombo 14 - Grandpass', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('21', 'Colombo 15 - Mutwal', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('22', 'Colombo 15 - Modara', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('23', 'Colombo 15 - Mattakkuliya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('24', 'Colombo 15 - Madampitiya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('25', 'PitaKotte', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('26', 'EthulKotte', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('27', 'Nawala', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('28', 'Nugegoda', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('29', 'Rajagiriya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('30', 'Athurugiriya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('31', 'Battaramulla', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('32', 'Batuwatta', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('33', 'Boralesgamuwa', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('34', 'Dalugama', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('35', 'Dehiwala-Mount Lavinia', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('36', 'Ekala', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('37', 'Godagama', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('38', 'Homagama', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('39', 'Hokandara', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('40', 'Ja-Ela', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('41', 'Kadawatha', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('42', 'Kaduwela', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('43', 'Kalubowila', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('44', 'Kandana', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('45', 'Kiribathgoda', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('46', 'Kolonnawa', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('47', 'Koswatte', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('48', 'Kotikawatta', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('49', 'Kottawa', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('50', 'Maharagama', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('51', 'Malabe', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('52', 'Moratuwa', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('53', 'Pannipitiya', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('54', 'Peliyagoda', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('55', 'Piliyandala', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('56', 'Ragama', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('57', 'Ratmalana', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('58', 'Thalawathugoda', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('59', 'Wattala', '5');
INSERT INTO `posworld`.`city_master` (`cm_city_id`, `cm_city_name`, `cm_city_district_id`) VALUES ('60', 'Wickramasinhapura', '5');


--  "posworld"."user_master"  --

INSERT INTO `posworld`.`user_master` (`um_user_id`,`um_user_full_name`,`um_user_epf_no`,`um_user_email`,`um_user_nic_no`,`um_user_pp_no`,`um_user_mobile_no`,`um_user_resident_no`,`um_user_gender`,`um_user_religion`,`um_user_username`,`um_user_password`,`um_user_address`,`um_user_security_answer_1`,`um_user_security_answer_2`,`um_user_race`,`um_user_nationality`,`um_user_location`,`um_user_division`,`um_user_designation`,`um_user_status`,`um_user_update_date_time`,`um_user_image`,`um_user_role_id`,`um_user_security_question_1_id`,`um_user_security_question_2_id`,`um_user_city_id`) VALUES (1,'Sheshan Aturupana','1','sheshan.atu@gmail.com','802892195V','A802892195','0777844380','0717844380','Male','Christianity','sheshan','123','Kadawatha','NO IDEA AS I CANT REMEMBER','TOYOTA','Sinhala','Sri Lanken','Colombo','Management','Accountant','Active','2019-08-24 23:32:44','?',1,1,11,1);
INSERT INTO `posworld`.`user_master` (`um_user_id`,`um_user_full_name`,`um_user_epf_no`,`um_user_email`,`um_user_nic_no`,`um_user_pp_no`,`um_user_mobile_no`,`um_user_resident_no`,`um_user_gender`,`um_user_religion`,`um_user_username`,`um_user_password`,`um_user_address`,`um_user_security_answer_1`,`um_user_security_answer_2`,`um_user_race`,`um_user_nationality`,`um_user_location`,`um_user_division`,`um_user_designation`,`um_user_status`,`um_user_update_date_time`,`um_user_image`,`um_user_role_id`,`um_user_security_question_1_id`,`um_user_security_question_2_id`,`um_user_city_id`) VALUES (2,'Surangi Aturupana','2','surangi@gmail.com','852963789V','A852147456','0147258369','0258369147','Female','Buddhism','surangi','777','Mototuwa','NO PET','NO MOVIE','Sinhala','Sri Lanken','Colombo','Showroom','Billing Officer','Active','2019-08-24 23:35:03','?',1,2,12,1);


--  "posworld"."account_master"  --

INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('1', 'ASSET', 'Asset', 'ACCOUNTS', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('2', 'LIABILITY', 'Liability', 'ACCOUNTS', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('3', 'INCOME', 'Income', 'ACCOUNTS', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('4', 'EXPENSES', 'Expenses', 'ACCOUNTS', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('5', 'CUSTOMERS', 'Asset', 'ASSET', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`) VALUES ('6', 'SUPPLIERS', 'Liability', 'LIABILITY', 'PARENT');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('7', 'Amal Perera', 'Asset', 'ASSET', 'CHILD', 'Customer');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('8', 'vimal Disanayake', 'Asset', 'ASSET', 'CHILD', 'Customer');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('9', 'Lakmini De Silva', 'Asset', 'ASSET', 'CHILD', 'Customer');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('10', 'Lilian Almedha', 'Asset', 'ASSET', 'CHILD', 'Customer');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('11', 'Nestlé Lanka PLC', 'Liability', 'LIABILITY', 'CHILD', 'Supplier');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('12', 'Lanka Milk Foods (CWE) PLC', 'Liability', 'LIABILITY', 'CHILD', 'Supplier');
INSERT INTO `posworld`.`account_master` (`am_acc_id`, `am_acc_name`, `am_acc_category`, `am_acc_parent_name`, `am_acc_group`, `am_acc_type`) VALUES ('13', 'Atlas Lanka Pvt Ltd', 'Liability', 'SUPPLIERS', 'CHILD', 'Supplier');


--  "posworld"."product_master"  --

INSERT INTO `posworld`.`product_master` (`pm_product_id`, `pm_product_code`, `pm_product_batch_no`, `pm_product_name`, `pm_product_description`, `pm_product_supplier_id`, `pm_product_status`, `pm_product_running_stock`, `pm_product_reorder_level`) VALUES ('1', '1', '1', 'CR Book 40 pages', 'Atlas CR Book 40 pages', '13', 'ACTIVE', '0', '10');
INSERT INTO `posworld`.`product_master` (`pm_product_id`, `pm_product_code`, `pm_product_batch_no`, `pm_product_name`, `pm_product_description`, `pm_product_supplier_id`, `pm_product_status`, `pm_product_running_stock`, `pm_product_reorder_level`) VALUES ('2', '2', '2', 'CR Book 80 pages', 'Atlas CR Book 80 pages', '13, 'ACTIVE', '0', '10');





SELECT user,authentication_string,plugin,host,password FROM mysql.user;
