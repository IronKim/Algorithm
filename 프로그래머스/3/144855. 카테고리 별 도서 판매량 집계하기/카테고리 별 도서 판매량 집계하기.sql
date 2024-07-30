-- 코드를 입력하세요
SELECT B.CATEGORY, SUM(BS.SALES) AS TOTAL_SALES
FROM BOOK B INNER JOIN BOOK_SALES BS
ON B.BOOK_ID = BS.BOOK_ID
WHERE TO_CHAR(BS.SALES_DATE, 'YYYY-MM') = '2022-01'
GROUP BY CATEGORY
ORDER BY CATEGORY ASC;