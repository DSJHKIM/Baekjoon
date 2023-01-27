-- 코드를 입력하세요
SELECT B.CATEGORY AS CATEGORY, SUM(BI.SALES) AS TOTAL_SALES
FROM BOOK B
INNER JOIN (SELECT BOOK_ID, SUM(SALES) AS SALES
            FROM BOOK_SALES
            WHERE MONTH(SALES_DATE) = 01 AND YEAR(SALES_DATE) = 2022
            GROUP BY BOOK_ID) BI
ON B.BOOK_ID = BI.BOOK_ID
GROUP BY B.CATEGORY
ORDER BY B.CATEGORY