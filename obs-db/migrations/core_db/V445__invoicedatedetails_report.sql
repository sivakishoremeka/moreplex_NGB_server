
SET SQL_SAFE_UPDATES = 0;

UPDATE `obstenant-default`.`stretchy_report` SET `report_sql`='SELECT\n clnt.account_no as `CUST.NO`,\n	cast(clnt.display_name as char charset utf8) as `CUST.NAME`,   \n DATE_FORMAT(inv.invoice_date, \'%d-%m-%Y\') as `INVOICE DATE`,\n (CASE WHEN charge.priceline_id = 0 AND charge.charge_type = \'NRC\' THEN \n btm.item_description ELSE pm.plan_description END) as \'PLAN/ITEM\',\n charge.charge_type as `CHARGE TYPE`,      \n  cast(TRUNCATE(sum(charge.charge_amount),2) as char charset utf8) as `CHARGE AMOUNT`,\n cast(TRUNCATE(sum(charge.discount_amount),2) as char charset utf8) as `DISCOUNT AMOUNT`,\n cast(TRUNCATE(sum(ctx.tax_amount),2) as char charset utf8) as `TAX AMOUNT`,\n cast(inv.invoice_amount as char charset utf8) as `INVOICE AMOUNT`\n \nFROM \n  m_office off\n   JOIN\n  m_client clnt ON off.id = clnt.office_id\n JOIN\n b_bill_item inv  ON clnt.id = inv.client_id\n JOIN\n b_charge charge ON inv.id = charge.billitem_id AND charge.client_id = inv.client_id\n LEFT JOIN\n b_charge_tax ctx ON charge.billitem_id = ctx.billitem_id\n LEFT JOIN \n b_onetime_sale bos  ON charge.order_id = bos.id\n LEFT JOIN \n b_item_master btm  ON btm.id = bos.item_id\n LEFT JOIN \n      b_orders o ON o.id=charge.order_id and charge.client_id=clnt.id\n LEFT JOIN \n b_plan_master pm ON  o.plan_id = pm.id \n WHERE (off.id = \'${officeId}\' OR -1 = \'${officeId}\')  AND inv.invoice_date  BETWEEN \'${startDate}\' AND \'${endDate}\'\n GROUP BY charge.billitem_id,inv.invoice_date,ctx.billitem_id order by clnt.id,inv.invoice_date\n' WHERE report_name='Invoice Date Wise Details';;

SET SQL_SAFE_UPDATES = 1;
