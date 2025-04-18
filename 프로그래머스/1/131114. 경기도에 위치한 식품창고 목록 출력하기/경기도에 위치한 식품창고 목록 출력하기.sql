-- 코드를 입력하세요
SELECT 
	WAREHOUSE_ID, 
    WAREHOUSE_NAME, 
    ADDRESS, 
    IFNULL(FREEZER_YN, 'N') AS FREEZER_YN
from 
	FOOD_WAREHOUSE
where 
	address like '%경기%'
order by WAREHOUSE_ID;